package com.fasterxml.jackson.databind.ser;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.fasterxml.jackson.databind.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.ser.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class PropertyBuilder_init_125729300933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18052;
     Object term18288;
     Object term18803;
     Object term18814;
     Object term18817;

    public PropertyBuilder_init_125729300933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17710 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term17816 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term17946 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term17710, term17710.getClass(), "_config", term17816);
        setField(term17710, term17710.getClass(), "_beanDesc", term17946);
        term18052 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term18158 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term18052, term18052.getClass(), "_configOverrides", term18158);
        term18288 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term18432 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term18530 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term18288, term18288.getClass(), "_annotationIntrospector", term18432);
        setField(term18288, term18288.getClass(), "_classInfo", null);
        setField(term18530, term18530.getClass(), "_class", null);
        setField(term18288, term18288.getClass(), "_type", term18530);
        Class<? extends Object> term18900 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term18899 = ((Class) term18900).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term18899).setAccessible(true);
        Object enum0 = ((Field) term18899).get((Object) null);
        term18803 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term18804 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term18805 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term18806 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term18807 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term18808 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term18809 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term18810 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        setField(term18804, term18804.getClass(), "_filterProvider", null);
        setField(term18804, term18804.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term18804, term18804.getClass(), "_serFeatures", 0);
        setIntField(term18804, term18804.getClass(), "_generatorFeatures", 0);
        setIntField(term18804, term18804.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term18804, term18804.getClass(), "_formatWriteFeatures", 0);
        setIntField(term18804, term18804.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term18804, term18804.getClass(), "_serializationInclusion", null);
        setField(term18804, term18804.getClass(), "_mixIns", null);
        setField(term18804, term18804.getClass(), "_subtypeResolver", null);
        setField(term18804, term18804.getClass(), "_rootName", null);
        setField(term18804, term18804.getClass(), "_view", null);
        setField(term18804, term18804.getClass(), "_attributes", null);
        setField(term18804, term18804.getClass(), "_rootNames", null);
        setField(term18805, term18805.getClass(), "_overrides", null);
        setField(term18804, term18804.getClass(), "_configOverrides", term18805);
        setIntField(term18804, term18804.getClass(), "_mapperFeatures", 0);
        setField(term18804, term18804.getClass(), "_base", null);
        setField(term18803, term18803.getClass(), "_config", term18804);
        setField(term18806, term18806.getClass(), "_propCollector", null);
        setField(term18806, term18806.getClass(), "_config", null);
        setField(term18806, term18806.getClass(), "_annotationIntrospector", term18807);
        setField(term18806, term18806.getClass(), "_classInfo", null);
        setField(term18806, term18806.getClass(), "_properties", null);
        setField(term18806, term18806.getClass(), "_objectIdInfo", null);
        setField(term18808, term18808.getClass(), "_superClass", null);
        setField(term18808, term18808.getClass(), "_superInterfaces", null);
        setField(term18808, term18808.getClass(), "_bindings", null);
        setField(term18808, term18808.getClass(), "_canonicalName", null);
        setField(term18808, term18808.getClass(), "_class", null);
        setIntField(term18808, term18808.getClass(), "_hash", 0);
        setField(term18808, term18808.getClass(), "_valueHandler", null);
        setField(term18808, term18808.getClass(), "_typeHandler", null);
        setBooleanField(term18808, term18808.getClass(), "_asStatic", false);
        setField(term18806, term18806.getClass(), "_type", term18808);
        setField(term18803, term18803.getClass(), "_beanDesc", term18806);
        setField(term18803, term18803.getClass(), "_annotationIntrospector", term18809);
        setField(term18803, term18803.getClass(), "_defaultBean", null);
        setField(term18810, term18810.getClass(), "_valueInclusion", enum0);
        setField(term18810, term18810.getClass(), "_contentInclusion", enum0);
        setField(term18803, term18803.getClass(), "_defaultInclusion", term18810);
        setBooleanField(term18803, term18803.getClass(), "_useRealPropertyDefaults", false);
        term18814 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term18815 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term18816 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term18814, term18814.getClass(), "_propCollector", null);
        setField(term18814, term18814.getClass(), "_config", null);
        setField(term18814, term18814.getClass(), "_annotationIntrospector", term18815);
        setField(term18814, term18814.getClass(), "_classInfo", null);
        setField(term18814, term18814.getClass(), "_properties", null);
        setField(term18814, term18814.getClass(), "_objectIdInfo", null);
        setField(term18816, term18816.getClass(), "_superClass", null);
        setField(term18816, term18816.getClass(), "_superInterfaces", null);
        setField(term18816, term18816.getClass(), "_bindings", null);
        setField(term18816, term18816.getClass(), "_canonicalName", null);
        setField(term18816, term18816.getClass(), "_class", null);
        setIntField(term18816, term18816.getClass(), "_hash", 0);
        setField(term18816, term18816.getClass(), "_valueHandler", null);
        setField(term18816, term18816.getClass(), "_typeHandler", null);
        setBooleanField(term18816, term18816.getClass(), "_asStatic", false);
        setField(term18814, term18814.getClass(), "_type", term18816);
        term18817 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term18818 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term18817, term18817.getClass(), "_filterProvider", null);
        setField(term18817, term18817.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term18817, term18817.getClass(), "_serFeatures", 0);
        setIntField(term18817, term18817.getClass(), "_generatorFeatures", 0);
        setIntField(term18817, term18817.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term18817, term18817.getClass(), "_formatWriteFeatures", 0);
        setIntField(term18817, term18817.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term18817, term18817.getClass(), "_serializationInclusion", null);
        setField(term18817, term18817.getClass(), "_mixIns", null);
        setField(term18817, term18817.getClass(), "_subtypeResolver", null);
        setField(term18817, term18817.getClass(), "_rootName", null);
        setField(term18817, term18817.getClass(), "_view", null);
        setField(term18817, term18817.getClass(), "_attributes", null);
        setField(term18817, term18817.getClass(), "_rootNames", null);
        setField(term18818, term18818.getClass(), "_overrides", null);
        setField(term18817, term18817.getClass(), "_configOverrides", term18818);
        setIntField(term18817, term18817.getClass(), "_mapperFeatures", 0);
        setField(term18817, term18817.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term18052;
        args[1] = term18288;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term18803));
        assertTrue(recursiveEquals(term18052, term18814));
        assertTrue(recursiveEquals(term18288, term18817));
    }

};


