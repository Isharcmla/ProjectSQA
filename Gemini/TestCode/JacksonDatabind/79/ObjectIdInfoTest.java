package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.fasterxml.jackson.databind.PropertyName;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class ObjectIdInfoTest {

    // Dummy resolver to test custom resolver classes
    private static class CustomObjectIdResolver implements ObjectIdResolver {
        @Override
        public void bindItem(ObjectIdGenerator.IdKey id, Object pojo) {}

        @Override
        public Object resolveId(ObjectIdGenerator.IdKey id) {
            return null;
        }

        @Override
        public ObjectIdResolver newForDeserialization(Object context) {
            return this;
        }

        @Override
        public boolean canUseFor(ObjectIdResolver resolverType) {
            return false;
        }
    }

    @Test
    public void testConstructor_fourArgWithCustomResolver_setsAllFields() {
        PropertyName propName = new PropertyName("id");
        Class<?> scope = String.class;
        Class<? extends ObjectIdGenerator<?>> gen = ObjectIdGenerators.IntSequenceGenerator.class;
        Class<? extends ObjectIdResolver> resolver = CustomObjectIdResolver.class;

        ObjectIdInfo info = new ObjectIdInfo(propName, scope, gen, resolver);

        assertEquals(propName, info.getPropertyName());
        assertEquals(scope, info.getScope());
        assertEquals(gen, info.getGeneratorType());
        assertEquals(resolver, info.getResolverType());
        assertFalse(info.getAlwaysAsId());
    }

    @Test
    public void testConstructor_fourArgWithNullResolver_defaultsToSimpleObjectIdResolver() {
        PropertyName propName = new PropertyName("id");
        Class<?> scope = Object.class;
        Class<? extends ObjectIdGenerator<?>> gen = ObjectIdGenerators.PropertyGenerator.class;

        ObjectIdInfo info = new ObjectIdInfo(propName, scope, gen, null);

        assertEquals(propName, info.getPropertyName());
        assertEquals(scope, info.getScope());
        assertEquals(gen, info.getGeneratorType());
        assertEquals(SimpleObjectIdResolver.class, info.getResolverType());
        assertFalse(info.getAlwaysAsId());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testConstructor_threeArgPropertyName_defaultsToSimpleResolverAndFalseAlwaysAsId() {
        PropertyName propName = new PropertyName("userId");
        Class<?> scope = Integer.class;
        Class<? extends ObjectIdGenerator<?>> gen = ObjectIdGenerators.IntSequenceGenerator.class;

        ObjectIdInfo info = new ObjectIdInfo(propName, scope, gen);

        assertEquals(propName, info.getPropertyName());
        assertEquals(scope, info.getScope());
        assertEquals(gen, info.getGeneratorType());
        assertEquals(SimpleObjectIdResolver.class, info.getResolverType());
        assertFalse(info.getAlwaysAsId());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testConstructor_threeArgString_createsPropertyNameCorrectly() {
        String name = "customId";
        Class<?> scope = Long.class;
        Class<? extends ObjectIdGenerator<?>> gen = ObjectIdGenerators.UUIDGenerator.class;

        ObjectIdInfo info = new ObjectIdInfo(name, scope, gen);

        assertNotNull(info.getPropertyName());
        assertEquals(name, info.getPropertyName().getSimpleName());
        assertEquals(scope, info.getScope());
        assertEquals(gen, info.getGeneratorType());
        assertEquals(SimpleObjectIdResolver.class, info.getResolverType());
        assertFalse(info.getAlwaysAsId());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testConstructor_threeArgStringNullOrEmpty_createsEmptyPropertyName() {
        ObjectIdInfo infoNull = new ObjectIdInfo((String) null, null, null);
        assertNotNull(infoNull.getPropertyName());
        assertEquals("", infoNull.getPropertyName().getSimpleName());
        assertNull(infoNull.getScope());
        assertNull(infoNull.getGeneratorType());

        ObjectIdInfo infoEmpty = new ObjectIdInfo("", null, null);
        assertNotNull(infoEmpty.getPropertyName());
        assertEquals("", infoEmpty.getPropertyName().getSimpleName());
    }

    @Test
    public void testWithAlwaysAsId_sameState_returnsSameInstance() {
        ObjectIdInfo info = new ObjectIdInfo(new PropertyName("id"), Object.class, ObjectIdGenerators.IntSequenceGenerator.class);
        
        ObjectIdInfo same = info.withAlwaysAsId(false);
        assertSame(info, same);

        ObjectIdInfo infoTrue = info.withAlwaysAsId(true);
        ObjectIdInfo sameTrue = infoTrue.withAlwaysAsId(true);
        assertSame(infoTrue, sameTrue);
    }

    @Test
    public void testWithAlwaysAsId_differentState_returnsNewInstanceWithUpdatedState() {
        PropertyName propName = new PropertyName("id");
        Class<?> scope = String.class;
        Class<? extends ObjectIdGenerator<?>> gen = ObjectIdGenerators.IntSequenceGenerator.class;
        Class<? extends ObjectIdResolver> resolver = CustomObjectIdResolver.class;

        ObjectIdInfo info = new ObjectIdInfo(propName, scope, gen, resolver);
        assertFalse(info.getAlwaysAsId());

        ObjectIdInfo updated = info.withAlwaysAsId(true);
        assertTrue(updated.getAlwaysAsId());
        assertEquals(propName, updated.getPropertyName());
        assertEquals(scope, updated.getScope());
        assertEquals(gen, updated.getGeneratorType());
        assertEquals(resolver, updated.getResolverType());

        ObjectIdInfo reverted = updated.withAlwaysAsId(false);
        assertFalse(reverted.getAlwaysAsId());
        assertEquals(propName, reverted.getPropertyName());
        assertEquals(scope, reverted.getScope());
        assertEquals(gen, reverted.getGeneratorType());
        assertEquals(resolver, reverted.getResolverType());
    }

    @Test
    public void testToString_withNonNullScopeAndGenerator_formatsCorrectly() {
        PropertyName propName = new PropertyName("myId");
        Class<?> scope = String.class;
        Class<? extends ObjectIdGenerator<?>> gen = ObjectIdGenerators.IntSequenceGenerator.class;

        ObjectIdInfo info = new ObjectIdInfo(propName, scope, gen, CustomObjectIdResolver.class);
        String str = info.toString();

        assertEquals("ObjectIdInfo: propName=myId, scope=java.lang.String, "
                + "generatorType=com.fasterxml.jackson.annotation.ObjectIdGenerators$IntSequenceGenerator, "
                + "alwaysAsId=false", str);
    }

    @Test
    public void testToString_withNullScopeAndGenerator_formatsWithNullStrings() {
        ObjectIdInfo info = new ObjectIdInfo((PropertyName) null, null, null, null);
        String str = info.toString();

        assertEquals("ObjectIdInfo: propName=null, scope=null, generatorType=null, alwaysAsId=false", str);
    }
}
