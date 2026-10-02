package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;

public class StdSubtypeResolverTest {

    private StdSubtypeResolver resolver;
    private ObjectMapper mapper;
    private DeserializationConfig deserConfig;
    private SerializationConfig serConfig;

    static abstract class AbstractRoot {
    }

    static class ConcreteRoot {
    }

    @JsonTypeName("namedSub1")
    static class NamedSub1 extends AbstractRoot {
    }

    static class UnnamedSub2 extends AbstractRoot {
    }

    @JsonSubTypes({
            @JsonSubTypes.Type(value = AnnotatedChildA.class, name = "childA"),
            @JsonSubTypes.Type(value = AnnotatedChildB.class)
    })
    static class AnnotatedBase {
    }

    static class AnnotatedChildA extends AnnotatedBase {
    }

    @JsonSubTypes({
            @JsonSubTypes.Type(value = DeepChild.class, name = "deep")
    })
    @JsonTypeName("childB")
    static class AnnotatedChildB extends AnnotatedBase {
    }

    static class DeepChild extends AnnotatedChildB {
    }

    static class UnrelatedType {
    }

    static class PropertyContainer {
        @JsonSubTypes({
                @JsonSubTypes.Type(value = NamedSub1.class, name = "propSub1"),
                @JsonSubTypes.Type(value = UnnamedSub2.class)
        })
        public AbstractRoot prop;

        public ConcreteRoot concreteProp;
    }

    @Before
    public void setUp() {
        resolver = new StdSubtypeResolver();
        mapper = new ObjectMapper();
        deserConfig = mapper.getDeserializationConfig();
        serConfig = mapper.getSerializationConfig();
    }

    private AnnotatedMember getMember(Class<?> containerClass, String propName) {
        JavaType type = mapper.constructType(containerClass);
        BeanDescription desc = deserConfig.introspect(type);
        for (BeanPropertyDefinition prop : desc.findProperties()) {
            if (prop.getName().equals(propName)) {
                return prop.getPrimaryMember();
            }
        }
        return null;
    }

    @Test
    public void testRegisterSubtypes_withNamedTypes_success() {
        NamedType nt1 = new NamedType(NamedSub1.class, "sub1");
        NamedType nt2 = new NamedType(UnnamedSub2.class);

        resolver.registerSubtypes(nt1, nt2);
        Assert.assertNotNull(resolver._registeredSubtypes);
        Assert.assertEquals(2, resolver._registeredSubtypes.size());

        resolver.registerSubtypes(new NamedType[0]);
        Assert.assertEquals(2, resolver._registeredSubtypes.size());
    }

    @Test
    public void testRegisterSubtypes_withClasses_success() {
        resolver.registerSubtypes(NamedSub1.class, UnnamedSub2.class);
        Assert.assertNotNull(resolver._registeredSubtypes);
        Assert.assertEquals(2, resolver._registeredSubtypes.size());

        resolver.registerSubtypes(new Class<?>[0]);
        Assert.assertEquals(2, resolver._registeredSubtypes.size());
    }

    @Test
    public void testCollectAndResolveSubtypesByClass_withAnnotatedClass_noRegisteredSubtypes() {
        AnnotatedClass ac = AnnotatedClassResolver.resolveWithoutSuperTypes(deserConfig, AnnotatedBase.class);
        Collection<NamedType> result = resolver.collectAndResolveSubtypesByClass(deserConfig, ac);

        Assert.assertNotNull(result);
        Assert.assertEquals(4, result.size());
    }

    @Test
    public void testCollectAndResolveSubtypesByClass_withAnnotatedClass_withRegisteredSubtypes() {
        resolver.registerSubtypes(new NamedType(NamedSub1.class, "registeredName"), new NamedType(UnrelatedType.class));

        AnnotatedClass ac = AnnotatedClassResolver.resolveWithoutSuperTypes(deserConfig, AbstractRoot.class);
        Collection<NamedType> result = resolver.collectAndResolveSubtypesByClass(deserConfig, ac);

        Assert.assertNotNull(result);
        boolean foundRegistered = false;
        boolean foundUnrelated = false;
        for (NamedType nt : result) {
            if (nt.getType() == NamedSub1.class && "registeredName".equals(nt.getName())) {
                foundRegistered = true;
            }
            if (nt.getType() == UnrelatedType.class) {
                foundUnrelated = true;
            }
        }
        Assert.assertTrue(foundRegistered);
        Assert.assertFalse(foundUnrelated);
    }

    @Test
    public void testCollectAndResolveSubtypesByClass_withPropertyAndBaseType_nullBaseTypeUsesPropertyRawType() {
        AnnotatedMember member = getMember(PropertyContainer.class, "prop");
        Assert.assertNotNull(member);

        Collection<NamedType> result = resolver.collectAndResolveSubtypesByClass(deserConfig, member, (JavaType) null);

        Assert.assertNotNull(result);
        Assert.assertTrue(result.size() >= 3);
    }

    @Test
    public void testCollectAndResolveSubtypesByClass_withPropertyAndBaseType_withRegisteredTypes() {
        resolver.registerSubtypes(new NamedType(NamedSub1.class, "overrideName"), new NamedType(UnrelatedType.class));
        AnnotatedMember member = getMember(PropertyContainer.class, "prop");
        JavaType baseType = mapper.constructType(AbstractRoot.class);

        Collection<NamedType> result = resolver.collectAndResolveSubtypesByClass(serConfig, member, baseType);

        Assert.assertNotNull(result);
        boolean foundOverride = false;
        for (NamedType nt : result) {
            if (nt.getType() == NamedSub1.class) {
                foundOverride = true;
            }
        }
        Assert.assertTrue(foundOverride);
    }

    @Test
    public void testCollectAndResolveSubtypesByClass_updateNameWhenPreviouslyUnnamed() {
        resolver.registerSubtypes(new NamedType(NamedSub1.class, null));
        AnnotatedClass ac = AnnotatedClassResolver.resolveWithoutSuperTypes(deserConfig, AbstractRoot.class);

        Collection<NamedType> result = resolver.collectAndResolveSubtypesByClass(deserConfig, ac);
        boolean foundNamed = false;
        for (NamedType nt : result) {
            if (nt.getType() == NamedSub1.class && "namedSub1".equals(nt.getName())) {
                foundNamed = true;
            }
        }
        Assert.assertTrue(foundNamed);
    }

    @Test
    public void testCollectAndResolveSubtypesByTypeId_withAnnotatedClass_abstractVsConcreteBase() {
        AnnotatedClass abstractAc = AnnotatedClassResolver.resolveWithoutSuperTypes(deserConfig, AbstractRoot.class);
        Collection<NamedType> abstractResult = resolver.collectAndResolveSubtypesByTypeId(deserConfig, abstractAc);
        for (NamedType nt : abstractResult) {
            Assert.assertNotEquals(AbstractRoot.class, nt.getType());
        }

        AnnotatedClass concreteAc = AnnotatedClassResolver.resolveWithoutSuperTypes(deserConfig, ConcreteRoot.class);
        Collection<NamedType> concreteResult = resolver.collectAndResolveSubtypesByTypeId(deserConfig, concreteAc);
        boolean foundConcrete = false;
        for (NamedType nt : concreteResult) {
            if (nt.getType() == ConcreteRoot.class) {
                foundConcrete = true;
            }
        }
        Assert.assertTrue(foundConcrete);
    }

    @Test
    public void testCollectAndResolveSubtypesByTypeId_withAnnotatedClass_withRegisteredTypes() {
        resolver.registerSubtypes(new NamedType(NamedSub1.class, "customId"), new NamedType(UnrelatedType.class));
        AnnotatedClass ac = AnnotatedClassResolver.resolveWithoutSuperTypes(deserConfig, AbstractRoot.class);

        Collection<NamedType> result = resolver.collectAndResolveSubtypesByTypeId(deserConfig, ac);
        boolean foundCustomId = false;
        boolean foundUnrelated = false;
        for (NamedType nt : result) {
            if (nt.getType() == NamedSub1.class && "customId".equals(nt.getName())) {
                foundCustomId = true;
            }
            if (nt.getType() == UnrelatedType.class) {
                foundUnrelated = true;
            }
        }
        Assert.assertTrue(foundCustomId);
        Assert.assertFalse(foundUnrelated);
    }

    @Test
    public void testCollectAndResolveSubtypesByTypeId_withPropertyAndBaseType() {
        resolver.registerSubtypes(new NamedType(NamedSub1.class, "customPropId"), new NamedType(UnrelatedType.class));
        AnnotatedMember member = getMember(PropertyContainer.class, "prop");
        JavaType baseType = mapper.constructType(AbstractRoot.class);

        Collection<NamedType> result = resolver.collectAndResolveSubtypesByTypeId(deserConfig, member, baseType);

        Assert.assertNotNull(result);
        boolean foundCustomPropId = false;
        for (NamedType nt : result) {
            if ("customPropId".equals(nt.getName())) {
                foundCustomPropId = true;
            }
        }
        Assert.assertTrue(foundCustomPropId);
    }

    @Test
    public void testCollectAndResolveSubtypesByTypeId_withPropertyNoSubtypesAnnotation() {
        AnnotatedMember member = getMember(PropertyContainer.class, "concreteProp");
        JavaType baseType = mapper.constructType(ConcreteRoot.class);

        Collection<NamedType> result = resolver.collectAndResolveSubtypesByTypeId(deserConfig, member, baseType);

        Assert.assertNotNull(result);
        Assert.assertEquals(1, result.size());
        Assert.assertEquals(ConcreteRoot.class, result.iterator().next().getType());
    }

    @Test
    public void testCollectAndResolveByTypeId_recursiveAnnotationSubtypes() {
        AnnotatedClass ac = AnnotatedClassResolver.resolveWithoutSuperTypes(deserConfig, AnnotatedBase.class);
        Collection<NamedType> result = resolver.collectAndResolveSubtypesByTypeId(deserConfig, ac);

        Assert.assertNotNull(result);
        boolean foundDeep = false;
        for (NamedType nt : result) {
            if (nt.getType() == DeepChild.class && "deep".equals(nt.getName())) {
                foundDeep = true;
            }
        }
        Assert.assertTrue(foundDeep);
    }

    @Test
    public void testSerialization() throws Exception {
        resolver.registerSubtypes(NamedSub1.class);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(resolver);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object deserialized = ois.readObject();
        ois.close();

        Assert.assertTrue(deserialized instanceof StdSubtypeResolver);
        StdSubtypeResolver deserializedResolver = (StdSubtypeResolver) deserialized;
        Assert.assertNotNull(deserializedResolver._registeredSubtypes);
        Assert.assertEquals(1, deserializedResolver._registeredSubtypes.size());
    }
}
