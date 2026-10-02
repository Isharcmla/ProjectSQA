package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.*;

public class CreatorCollectorTest {

    private ObjectMapper _mapper;
    private DeserializationConfig _deserConfig;

    static class TargetBean {
        String stringVal;
        int intVal;
        long longVal;
        double doubleVal;
        boolean boolVal;

        public TargetBean() { }
        public TargetBean(String s) { this.stringVal = s; }
        public TargetBean(int i) { this.intVal = i; }
        public TargetBean(long l) { this.longVal = l; }
        public TargetBean(double d) { this.doubleVal = d; }
        public TargetBean(boolean b) { this.boolVal = b; }
        public TargetBean(List<String> list) { }
        public TargetBean(Object o) { }
        public TargetBean(Number n) { }
        public TargetBean(Integer i) { }
        public TargetBean(@JsonProperty("a") String a, @JsonProperty("b") int b) { }

        public static TargetBean create(String s) { return new TargetBean(s); }
        public static TargetBean create(int i) { return new TargetBean(i); }
        public static TargetBean create(long l) { return new TargetBean(l); }
        public static TargetBean create(double d) { return new TargetBean(d); }
        public static TargetBean create(boolean b) { return new TargetBean(b); }
    }

    @Before
    public void setUp() {
        _mapper = new ObjectMapper();
        _deserConfig = _mapper.getDeserializationConfig();
    }

    private CreatorCollector createCollector(Class<?> cls) {
        JavaType type = _mapper.constructType(cls);
        BeanDescription beanDesc = _deserConfig.introspect(type);
        return new CreatorCollector(beanDesc, _deserConfig);
    }

    private AnnotatedConstructor findConstructor(Class<?> cls, Class<?>... paramTypes) {
        try {
            Constructor<?> ctor = cls.getDeclaredConstructor(paramTypes);
            JavaType type = _mapper.constructType(cls);
            AnnotatedClass ac = AnnotatedClass.constructWithoutSuperTypes(cls, _deserConfig);
            return new AnnotatedConstructor(new AnnotatedClass.Constructor(ctor), null, null);
        } catch (Exception e) {
            JavaType type = _mapper.constructType(cls);
            BeanDescription beanDesc = _deserConfig.introspect(type);
            for (AnnotatedConstructor ctor : beanDesc.getConstructors()) {
                if (ctor.getParameterCount() == paramTypes.length) {
                    boolean match = true;
                    for (int i = 0; i < paramTypes.length; i++) {
                        if (!ctor.getRawParameterType(i).equals(paramTypes[i])) {
                            match = false;
                            break;
                        }
                    }
                    if (match) return ctor;
                }
            }
            throw new RuntimeException("Constructor not found: " + Arrays.toString(paramTypes));
        }
    }

    private AnnotatedMethod findFactoryMethod(Class<?> cls, String name, Class<?>... paramTypes) {
        try {
            Method m = cls.getDeclaredMethod(name, paramTypes);
            return new AnnotatedMethod(m, null, null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private CreatorProperty createCreatorProp(String name, Class<?> type, int index, Object injectId) {
        PropertyName propName = new PropertyName(name);
        JavaType jType = TypeFactory.defaultInstance().constructType(type);
        return new CreatorProperty(propName, jType, null, null, null, null, index, injectId, PropertyMetadata.STD_REQUIRED);
    }

    @Test
    public void testVanillaInstantiators_collectionAndMapTypes() throws IOException {
        CreatorCollector collList = createCollector(List.class);
        ValueInstantiator viList = collList.constructValueInstantiator(_deserConfig);
        Assert.assertTrue(viList instanceof CreatorCollector.Vanilla);
        Assert.assertTrue(viList.canInstantiate());
        Assert.assertTrue(viList.canCreateUsingDefault());
        Assert.assertEquals(ArrayList.class.getName(), viList.getValueTypeDesc());
        Object listObj = viList.createUsingDefault(null);
        Assert.assertTrue(listObj instanceof ArrayList);

        CreatorCollector collCollection = createCollector(Collection.class);
        ValueInstantiator viCollection = collCollection.constructValueInstantiator(_deserConfig);
        Assert.assertTrue(viCollection instanceof CreatorCollector.Vanilla);

        CreatorCollector collArrayList = createCollector(ArrayList.class);
        ValueInstantiator viArrayList = collArrayList.constructValueInstantiator(_deserConfig);
        Assert.assertTrue(viArrayList instanceof CreatorCollector.Vanilla);

        CreatorCollector collMap = createCollector(Map.class);
        ValueInstantiator viMap = collMap.constructValueInstantiator(_deserConfig);
        Assert.assertTrue(viMap instanceof CreatorCollector.Vanilla);
        Assert.assertEquals(LinkedHashMap.class.getName(), viMap.getValueTypeDesc());
        Object mapObj = viMap.createUsingDefault(null);
        Assert.assertTrue(mapObj instanceof LinkedHashMap);

        CreatorCollector collLHM = createCollector(LinkedHashMap.class);
        ValueInstantiator viLHM = collLHM.constructValueInstantiator(_deserConfig);
        Assert.assertTrue(viLHM instanceof CreatorCollector.Vanilla);

        CreatorCollector collHashMap = createCollector(HashMap.class);
        ValueInstantiator viHashMap = collHashMap.constructValueInstantiator(_deserConfig);
        Assert.assertTrue(viHashMap instanceof CreatorCollector.Vanilla);
        Assert.assertEquals(HashMap.class.getName(), viHashMap.getValueTypeDesc());
        Object hashMapObj = viHashMap.createUsingDefault(null);
        Assert.assertTrue(hashMapObj instanceof HashMap);
    }

    @Test
    public void testVanilla_unknownTypeBranches() {
        CreatorCollector.Vanilla vanillaUnknown = new CreatorCollector.Vanilla(999);
        Assert.assertEquals(Object.class.getName(), vanillaUnknown.getValueTypeDesc());
        try {
            vanillaUnknown.createUsingDefault(null);
            Assert.fail("Should throw IllegalStateException");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().contains("Unknown type 999"));
        } catch (IOException e) {
            Assert.fail("Unexpected IOException: " + e);
        }
    }

    @Test
    public void testDefaultCreator_success() {
        CreatorCollector coll = createCollector(TargetBean.class);
        Assert.assertFalse(coll.hasDefaultCreator());

        AnnotatedConstructor ctor = findConstructor(TargetBean.class);
        coll.setDefaultCreator(ctor);

        Assert.assertTrue(coll.hasDefaultCreator());
        ValueInstantiator vi = coll.constructValueInstantiator(_deserConfig);
        Assert.assertNotNull(vi);
        Assert.assertTrue(vi.canCreateUsingDefault());

        coll.setDefaultCreator(null);
        Assert.assertFalse(coll.hasDefaultCreator());
    }

    @Test
    public void testScalarCreators_explicitAndNonExplicit() {
        CreatorCollector coll = createCollector(TargetBean.class);

        AnnotatedConstructor ctorStr = findConstructor(TargetBean.class, String.class);
        AnnotatedConstructor ctorInt = findConstructor(TargetBean.class, int.class);
        AnnotatedConstructor ctorLong = findConstructor(TargetBean.class, long.class);
        AnnotatedConstructor ctorDouble = findConstructor(TargetBean.class, double.class);
        AnnotatedConstructor ctorBool = findConstructor(TargetBean.class, boolean.class);

        coll.addStringCreator(ctorStr, true);
        coll.addIntCreator(ctorInt, true);
        coll.addLongCreator(ctorLong, true);
        coll.addDoubleCreator(ctorDouble, true);
        coll.addBooleanCreator(ctorBool, true);

        ValueInstantiator vi = coll.constructValueInstantiator(_deserConfig);
        Assert.assertTrue(vi.canCreateFromString());
        Assert.assertTrue(vi.canCreateFromInt());
        Assert.assertTrue(vi.canCreateFromLong());
        Assert.assertTrue(vi.canCreateFromDouble());
        Assert.assertTrue(vi.canCreateFromBoolean());
    }

    @Test
    public void testDeprecatedAddMethods() {
        CreatorCollector coll = createCollector(TargetBean.class);

        AnnotatedConstructor ctorStr = findConstructor(TargetBean.class, String.class);
        AnnotatedConstructor ctorInt = findConstructor(TargetBean.class, int.class);
        AnnotatedConstructor ctorLong = findConstructor(TargetBean.class, long.class);
        AnnotatedConstructor ctorDouble = findConstructor(TargetBean.class, double.class);
        AnnotatedConstructor ctorBool = findConstructor(TargetBean.class, boolean.class);
        AnnotatedConstructor ctorObj = findConstructor(TargetBean.class, Object.class);

        coll.addStringCreator(ctorStr);
        coll.addIntCreator(ctorInt);
        coll.addLongCreator(ctorLong);
        coll.addDoubleCreator(ctorDouble);
        coll.addBooleanCreator(ctorBool);

        CreatorProperty[] props = new CreatorProperty[0];
        coll.addDelegatingCreator(ctorObj, props);
        coll.addPropertyCreator(ctorObj, props);

        Assert.assertTrue(coll.hasDelegatingCreator());
        Assert.assertTrue(coll.hasPropertyBasedCreator());
    }

    @Test
    public void testDelegatingCreators_arrayAndNonArray() {
        CreatorCollector coll = createCollector(TargetBean.class);
        Assert.assertFalse(coll.hasDelegatingCreator());

        AnnotatedConstructor ctorList = findConstructor(TargetBean.class, List.class);
        SettableBeanProperty[] arrayInjectables = new SettableBeanProperty[] {
                createCreatorProp("extra", String.class, 0, "injectExtra"),
                null // marker for delegate
        };
        coll.addDelegatingCreator(ctorList, true, arrayInjectables);

        AnnotatedConstructor ctorObj = findConstructor(TargetBean.class, Object.class);
        SettableBeanProperty[] delegateInjectables = new SettableBeanProperty[] {
                null // marker for delegate
        };
        coll.addDelegatingCreator(ctorObj, true, delegateInjectables);

        Assert.assertTrue(coll.hasDelegatingCreator());
        ValueInstantiator vi = coll.constructValueInstantiator(_deserConfig);
        Assert.assertTrue(vi.canCreateUsingDelegate());
        Assert.assertTrue(vi.canCreateUsingArrayDelegate());
        Assert.assertNotNull(vi.getDelegateType(_deserConfig));
        Assert.assertNotNull(vi.getArrayDelegateType(_deserConfig));
    }

    @Test
    public void testDelegatingCreator_noDelegateArgs() {
        CreatorCollector coll = createCollector(TargetBean.class);
        AnnotatedConstructor ctorObj = findConstructor(TargetBean.class, Object.class);
        coll.addDelegatingCreator(ctorObj, true, null);

        ValueInstantiator vi = coll.constructValueInstantiator(_deserConfig);
        Assert.assertTrue(vi.canCreateUsingDelegate());
        Assert.assertNotNull(vi.getDelegateType(_deserConfig));
    }

    @Test
    public void testPropertyCreator_success() {
        CreatorCollector coll = createCollector(TargetBean.class);
        Assert.assertFalse(coll.hasPropertyBasedCreator());

        AnnotatedConstructor ctor = findConstructor(TargetBean.class, String.class, int.class);
        SettableBeanProperty[] props = new SettableBeanProperty[] {
                createCreatorProp("propA", String.class, 0, null),
                createCreatorProp("propB", int.class, 1, null),
                createCreatorProp("", String.class, 2, "injectableId") // empty name with inject id
        };

        coll.addPropertyCreator(ctor, true, props);
        Assert.assertTrue(coll.hasPropertyBasedCreator());

        ValueInstantiator vi = coll.constructValueInstantiator(_deserConfig);
        Assert.assertTrue(vi.canCreateFromObjectWith());
        Assert.assertEquals(3, vi.getFromObjectArguments(_deserConfig).length);
    }

    @Test
    public void testPropertyCreator_duplicatePropertyNames_throwsException() {
        CreatorCollector coll = createCollector(TargetBean.class);
        AnnotatedConstructor ctor = findConstructor(TargetBean.class, String.class, int.class);
        SettableBeanProperty[] props = new SettableBeanProperty[] {
                createCreatorProp("duplicate", String.class, 0, null),
                createCreatorProp("duplicate", int.class, 1, null)
        };

        try {
            coll.addPropertyCreator(ctor, true, props);
            Assert.fail("Should throw IllegalArgumentException for duplicate creator property");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Duplicate creator property \"duplicate\" (index 0 vs 1)"));
        }
    }

    @Test
    public void testIncompleteParameter() {
        CreatorCollector coll = createCollector(TargetBean.class);
        AnnotatedConstructor ctor = findConstructor(TargetBean.class, String.class);
        AnnotatedParameter param = ctor.getParameter(0);

        coll.addIncompeteParameter(param);
        // Second call should not overwrite existing incomplete parameter
        AnnotatedConstructor ctorInt = findConstructor(TargetBean.class, int.class);
        coll.addIncompeteParameter(ctorInt.getParameter(0));

        ValueInstantiator vi = coll.constructValueInstantiator(_deserConfig);
        Assert.assertNotNull(vi.getIncompleteParameter());
        Assert.assertEquals(String.class, vi.getIncompleteParameter().getRawType());
    }

    @Test
    public void testVerifyNonDup_conflictSameTypeExplicit_throwsException() {
        CreatorCollector coll = createCollector(TargetBean.class);
        AnnotatedConstructor ctor1 = findConstructor(TargetBean.class, String.class);
        AnnotatedConstructor ctor2 = findConstructor(TargetBean.class, String.class);

        coll.addStringCreator(ctor1, true);
        try {
            coll.addStringCreator(ctor2, true);
            Assert.fail("Should throw IllegalArgumentException on conflicting explicit creators");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Conflicting String creators"));
        }
    }

    @Test
    public void testVerifyNonDup_explicitThenNonExplicit_ignoresNonExplicit() {
        CreatorCollector coll = createCollector(TargetBean.class);
        AnnotatedConstructor ctor1 = findConstructor(TargetBean.class, String.class);
        AnnotatedConstructor ctor2 = findConstructor(TargetBean.class, String.class);

        coll.addStringCreator(ctor1, true);
        coll.addStringCreator(ctor2, false); // should be skipped
    }

    @Test
    public void testVerifyNonDup_nonExplicitThenExplicit_overwrites() {
        CreatorCollector coll = createCollector(TargetBean.class);
        AnnotatedConstructor ctor1 = findConstructor(TargetBean.class, String.class);
        AnnotatedConstructor ctor2 = findConstructor(TargetBean.class, String.class);

        coll.addStringCreator(ctor1, false);
        coll.addStringCreator(ctor2, true); // should overwrite
    }

    @Test
    public void testVerifyNonDup_subTypeAndSuperTypeResolution() {
        CreatorCollector coll = createCollector(TargetBean.class);
        AnnotatedConstructor ctorNumber = findConstructor(TargetBean.class, Number.class);
        AnnotatedConstructor ctorInteger = findConstructor(TargetBean.class, Integer.class);

        // 1. Existing more specific (Integer), new more generic (Number) -> keep old (Number.isAssignableFrom(Integer) == true)
        coll.addDelegatingCreator(ctorInteger, true, null);
        coll.addDelegatingCreator(ctorNumber, true, null);

        // 2. Existing more generic (Number), new more specific (Integer) -> replace with new
        CreatorCollector coll2 = createCollector(TargetBean.class);
        coll2.addDelegatingCreator(ctorNumber, true, null);
        coll2.addDelegatingCreator(ctorInteger, true, null);
    }
}
