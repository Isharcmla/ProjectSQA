package com.fasterxml.jackson.databind.deser.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class CreatorCollectorTest {

    static class SampleBean {
        public SampleBean() {}
        public SampleBean(String s) {}
        public SampleBean(int i) {}
        public SampleBean(long l) {}
        public SampleBean(double d) {}
        public SampleBean(boolean b) {}
        public SampleBean(List<?> list) {}
        public SampleBean(String a, String b) {}
        public static SampleBean create(String s) { return new SampleBean(s); }
        public static SampleBean createFactory(int i) { return new SampleBean(i); }
    }

    private ObjectMapper _mapper;
    private DeserializationConfig _config;
    private BeanDescription _beanDesc;
    private List<AnnotatedConstructor> _constructors;
    private List<AnnotatedMethod> _factoryMethods;

    @Before
    public void setUp() {
        _mapper = new ObjectMapper();
        _config = _mapper.getDeserializationConfig();
        JavaType type = _mapper.constructType(SampleBean.class);
        _beanDesc = _config.introspect(type);
        _constructors = _beanDesc.getConstructors();
        _factoryMethods = _beanDesc.getFactoryMethods();
    }

    private AnnotatedConstructor findConstructorWithParamCount(int count) {
        for (AnnotatedConstructor ctor : _constructors) {
            if (ctor.getParameterCount() == count) {
                return ctor;
            }
        }
        return null;
    }

    private AnnotatedConstructor findConstructorWithParamType(Class<?> paramType) {
        for (AnnotatedConstructor ctor : _constructors) {
            if (ctor.getParameterCount() == 1 && ctor.getRawParameterType(0) == paramType) {
                return ctor;
            }
        }
        return null;
    }

    private CreatorProperty createCreatorProp(String name, Class<?> type, int index, Object injectId) {
        return new CreatorProperty(
                PropertyName.construct(name),
                TypeFactory.defaultInstance().constructType(type),
                null,
                null,
                new AnnotationMap(),
                null,
                index,
                injectId,
                PropertyMetadata.STD_REQUIRED
        );
    }

    @Test
    public void testDefaultCreator_success() {
        CreatorCollector collector = new CreatorCollector(_beanDesc, true);
        Assert.assertFalse(collector.hasDefaultCreator());

        AnnotatedConstructor defaultCtor = findConstructorWithParamCount(0);
        collector.setDefaultCreator(defaultCtor);

        Assert.assertTrue(collector.hasDefaultCreator());
        ValueInstantiator inst = collector.constructValueInstantiator(_config);
        Assert.assertTrue(inst instanceof StdValueInstantiator);
        Assert.assertTrue(inst.canCreateUsingDefault());
    }

    @Test
    public void testVanillaCollection() {
        BeanDescription desc = _config.introspect(_mapper.constructType(ArrayList.class));
        CreatorCollector collector = new CreatorCollector(desc, false);
        ValueInstantiator inst = collector.constructValueInstantiator(_config);

        Assert.assertTrue(inst instanceof CreatorCollector.Vanilla);
        Assert.assertTrue(inst.canInstantiate());
        Assert.assertTrue(inst.canCreateUsingDefault());
        Assert.assertEquals(ArrayList.class.getName(), inst.getValueTypeDesc());

        try {
            Object obj = inst.createUsingDefault(null);
            Assert.assertTrue(obj instanceof ArrayList);
        } catch (IOException e) {
            Assert.fail("Unexpected IOException: " + e.getMessage());
        }
    }

    @Test
    public void testVanillaMap() {
        BeanDescription descList = _config.introspect(_mapper.constructType(List.class));
        ValueInstantiator instList = new CreatorCollector(descList, false).constructValueInstantiator(_config);
        Assert.assertTrue(instList instanceof CreatorCollector.Vanilla);

        BeanDescription descColl = _config.introspect(_mapper.constructType(Collection.class));
        ValueInstantiator instColl = new CreatorCollector(descColl, false).constructValueInstantiator(_config);
        Assert.assertTrue(instColl instanceof CreatorCollector.Vanilla);

        BeanDescription descMap = _config.introspect(_mapper.constructType(Map.class));
        ValueInstantiator instMap = new CreatorCollector(descMap, false).constructValueInstantiator(_config);
        Assert.assertTrue(instMap instanceof CreatorCollector.Vanilla);
        Assert.assertEquals(LinkedHashMap.class.getName(), instMap.getValueTypeDesc());

        BeanDescription descLinkedMap = _config.introspect(_mapper.constructType(LinkedHashMap.class));
        ValueInstantiator instLinkedMap = new CreatorCollector(descLinkedMap, false).constructValueInstantiator(_config);
        Assert.assertTrue(instLinkedMap instanceof CreatorCollector.Vanilla);

        BeanDescription descHashMap = _config.introspect(_mapper.constructType(HashMap.class));
        ValueInstantiator instHashMap = new CreatorCollector(descHashMap, false).constructValueInstantiator(_config);
        Assert.assertTrue(instHashMap instanceof CreatorCollector.Vanilla);
        Assert.assertEquals(HashMap.class.getName(), instHashMap.getValueTypeDesc());

        try {
            Object mapObj = instMap.createUsingDefault(null);
            Assert.assertTrue(mapObj instanceof LinkedHashMap);

            Object hashObj = instHashMap.createUsingDefault(null);
            Assert.assertTrue(hashObj instanceof HashMap);
        } catch (IOException e) {
            Assert.fail("Unexpected IOException: " + e.getMessage());
        }
    }

    @Test
    public void testVanillaCustomTypes() throws IOException {
        CreatorCollector.Vanilla vanillaColl = new CreatorCollector.Vanilla(CreatorCollector.Vanilla.TYPE_COLLECTION);
        CreatorCollector.Vanilla vanillaMap = new CreatorCollector.Vanilla(CreatorCollector.Vanilla.TYPE_MAP);
        CreatorCollector.Vanilla vanillaHashMap = new CreatorCollector.Vanilla(CreatorCollector.Vanilla.TYPE_HASH_MAP);
        CreatorCollector.Vanilla vanillaOther = new CreatorCollector.Vanilla(99);

        Assert.assertEquals(ArrayList.class.getName(), vanillaColl.getValueTypeDesc());
        Assert.assertEquals(LinkedHashMap.class.getName(), vanillaMap.getValueTypeDesc());
        Assert.assertEquals(HashMap.class.getName(), vanillaHashMap.getValueTypeDesc());
        Assert.assertEquals(Object.class.getName(), vanillaOther.getValueTypeDesc());

        Assert.assertTrue(vanillaColl.createUsingDefault(null) instanceof ArrayList);
        Assert.assertTrue(vanillaMap.createUsingDefault(null) instanceof LinkedHashMap);
        Assert.assertTrue(vanillaHashMap.createUsingDefault(null) instanceof HashMap);

        try {
            vanillaOther.createUsingDefault(null);
            Assert.fail("Expected IllegalStateException for unknown type");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().contains("Unknown type"));
        }
    }

    @Test
    public void testAddScalarCreators_explicitAndNonExplicit() {
        CreatorCollector collector = new CreatorCollector(_beanDesc, true);

        AnnotatedConstructor stringCtor = findConstructorWithParamType(String.class);
        AnnotatedConstructor intCtor = findConstructorWithParamType(int.class);
        AnnotatedConstructor longCtor = findConstructorWithParamType(long.class);
        AnnotatedConstructor doubleCtor = findConstructorWithParamType(double.class);
        AnnotatedConstructor boolCtor = findConstructorWithParamType(boolean.class);

        collector.addStringCreator(stringCtor, true);
        collector.addIntCreator(intCtor, false);
        collector.addLongCreator(longCtor, true);
        collector.addDoubleCreator(doubleCtor, false);
        collector.addBooleanCreator(boolCtor, true);

        ValueInstantiator inst = collector.constructValueInstantiator(_config);
        Assert.assertTrue(inst.canCreateFromString());
        Assert.assertTrue(inst.canCreateFromInt());
        Assert.assertTrue(inst.canCreateFromLong());
        Assert.assertTrue(inst.canCreateFromDouble());
        Assert.assertTrue(inst.canCreateFromBoolean());
    }

    @Test
    public void testAddDelegatingCreator_withoutAndWithInjectables() {
        CreatorCollector collector = new CreatorCollector(_beanDesc, true);
        AnnotatedConstructor listCtor = findConstructorWithParamType(List.class);

        CreatorProperty[] injectables = new CreatorProperty[] {
                createCreatorProp("inject", String.class, 0, "injectId"),
                null
        };

        collector.addDelegatingCreator(listCtor, true, injectables);
        ValueInstantiator inst = collector.constructValueInstantiator(_config);

        Assert.assertTrue(inst.canCreateUsingDelegate());
        Assert.assertNotNull(inst.getDelegateType(_config));
    }

    @Test
    public void testAddDelegatingCreator_nullInjectables() {
        CreatorCollector collector = new CreatorCollector(_beanDesc, false);
        AnnotatedConstructor listCtor = findConstructorWithParamType(List.class);

        collector.addDelegatingCreator(listCtor, true, null);
        ValueInstantiator inst = collector.constructValueInstantiator(_config);

        Assert.assertTrue(inst.canCreateUsingDelegate());
        Assert.assertNotNull(inst.getDelegateType(_config));
    }

    @Test
    public void testAddPropertyCreator_valid() {
        CreatorCollector collector = new CreatorCollector(_beanDesc, true);
        AnnotatedConstructor twoArgCtor = findConstructorWithParamCount(2);

        CreatorProperty[] props = new CreatorProperty[] {
                createCreatorProp("prop1", String.class, 0, null),
                createCreatorProp("", String.class, 1, "injectId")
        };

        collector.addPropertyCreator(twoArgCtor, true, props);
        ValueInstantiator inst = collector.constructValueInstantiator(_config);

        Assert.assertTrue(inst.canCreateFromObjectWith());
        Assert.assertEquals(2, inst.getFromObjectArguments(_config).length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddPropertyCreator_duplicateProperties_throwsException() {
        CreatorCollector collector = new CreatorCollector(_beanDesc, true);
        AnnotatedConstructor twoArgCtor = findConstructorWithParamCount(2);

        CreatorProperty[] props = new CreatorProperty[] {
                createCreatorProp("duplicate", String.class, 0, null),
                createCreatorProp("duplicate", String.class, 1, null)
        };

        collector.addPropertyCreator(twoArgCtor, false, props);
    }

    @Test
    public void testAddIncompleteParameter() {
        CreatorCollector collector = new CreatorCollector(_beanDesc, true);
        AnnotatedConstructor stringCtor = findConstructorWithParamType(String.class);
        AnnotatedParameter param1 = stringCtor.getParameter(0);

        collector.addIncompeteParameter(param1);
        Assert.assertEquals(param1, collector._incompleteParameter);

        AnnotatedConstructor intCtor = findConstructorWithParamType(int.class);
        AnnotatedParameter param2 = intCtor.getParameter(0);
        collector.addIncompeteParameter(param2);
        Assert.assertEquals(param1, collector._incompleteParameter);

        ValueInstantiator inst = collector.constructValueInstantiator(_config);
        Assert.assertNotNull(inst.getIncompleteParameter());
    }

    @Test
    public void testDeprecatedMethods() {
        CreatorCollector collector = new CreatorCollector(_beanDesc, true);

        AnnotatedConstructor stringCtor = findConstructorWithParamType(String.class);
        AnnotatedConstructor intCtor = findConstructorWithParamType(int.class);
        AnnotatedConstructor longCtor = findConstructorWithParamType(long.class);
        AnnotatedConstructor doubleCtor = findConstructorWithParamType(double.class);
        AnnotatedConstructor boolCtor = findConstructorWithParamType(boolean.class);
        AnnotatedConstructor listCtor = findConstructorWithParamType(List.class);
        AnnotatedConstructor twoArgCtor = findConstructorWithParamCount(2);

        collector.addStringCreator(stringCtor);
        collector.addIntCreator(intCtor);
        collector.addLongCreator(longCtor);
        collector.addDoubleCreator(doubleCtor);
        collector.addBooleanCreator(boolCtor);

        CreatorProperty[] delProps = new CreatorProperty[0];
        collector.addDelegatingCreator(listCtor, delProps);

        CreatorProperty[] props = new CreatorProperty[] {
                createCreatorProp("p1", String.class, 0, null)
        };
        collector.addPropertyCreator(twoArgCtor, props);

        AnnotatedWithParams result = collector.verifyNonDup(stringCtor, CreatorCollector.C_STRING);
        Assert.assertEquals(stringCtor, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testVerifyNonDup_conflictSameClass_throwsException() {
        CreatorCollector collector = new CreatorCollector(_beanDesc, true);
        AnnotatedConstructor ctor1 = findConstructorWithParamType(String.class);
        AnnotatedConstructor ctor2 = findConstructorWithParamType(int.class);

        collector.addStringCreator(ctor1, true);
        collector.addStringCreator(ctor2, true);
    }

    @Test
    public void testVerifyNonDup_explicitThenNonExplicit_ignored() {
        CreatorCollector collector = new CreatorCollector(_beanDesc, true);
        AnnotatedConstructor ctor1 = findConstructorWithParamType(String.class);
        AnnotatedConstructor ctor2 = findConstructorWithParamType(int.class);

        collector.addStringCreator(ctor1, true);
        collector.addStringCreator(ctor2, false);

        Assert.assertEquals(ctor1, collector._creators[CreatorCollector.C_STRING]);
    }

    @Test
    public void testVerifyNonDup_differentAnnotatedClasses_overrideAllowed() {
        CreatorCollector collector = new CreatorCollector(_beanDesc, true);
        AnnotatedConstructor ctor = findConstructorWithParamType(String.class);
        AnnotatedMethod method = null;
        for (AnnotatedMethod m : _factoryMethods) {
            if ("create".equals(m.getName())) {
                method = m;
                break;
            }
        }
        Assert.assertNotNull(method);

        collector.addStringCreator(ctor, false);
        collector.addStringCreator(method, true);

        Assert.assertEquals(method, collector._creators[CreatorCollector.C_STRING]);
    }

    @Test
    public void testFixAccess_nullMember() {
        CreatorCollector collector = new CreatorCollector(_beanDesc, true);
        collector.setDefaultCreator(null);
        Assert.assertFalse(collector.hasDefaultCreator());
    }
}
