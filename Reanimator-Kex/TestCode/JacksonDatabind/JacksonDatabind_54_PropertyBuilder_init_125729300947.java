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
import java.util.HashMap;
import java.lang.String;

public class PropertyBuilder_init_125729300947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32605;
     Object term32889;
     Object term34176;
     Object term34187;
     Object term34193;

    public PropertyBuilder_init_125729300947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term32393 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term32499 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term32393, term32393.getClass(), "_config", term32499);
        setField(term32393, term32393.getClass(), "_beanDesc", null);
        HashMap term32759 = new HashMap();
        term32605 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term32711 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term32711, term32711.getClass(), "_overrides", term32759);
        setField(term32605, term32605.getClass(), "_configOverrides", term32711);
        Class<? extends Object> term33017 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonRootName");
        term32889 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term32981 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term32981, term32981.getClass(), "_class", term33017);
        setField(term32889, term32889.getClass(), "_type", term32981);
        HashMap term34179 = new HashMap();
        Class<? extends Object> term34182 = Class.forName((String) "java.util.TreeMap$KeySpliterator");
        term34176 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term34177 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term34178 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term34180 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term34181 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term34186 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term34177, term34177.getClass(), "_filterProvider", null);
        setField(term34177, term34177.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term34177, term34177.getClass(), "_serFeatures", 0);
        setIntField(term34177, term34177.getClass(), "_generatorFeatures", 0);
        setIntField(term34177, term34177.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term34177, term34177.getClass(), "_formatWriteFeatures", 0);
        setIntField(term34177, term34177.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term34177, term34177.getClass(), "_serializationInclusion", null);
        setField(term34177, term34177.getClass(), "_mixIns", null);
        setField(term34177, term34177.getClass(), "_subtypeResolver", null);
        setField(term34177, term34177.getClass(), "_rootName", null);
        setField(term34177, term34177.getClass(), "_view", null);
        setField(term34177, term34177.getClass(), "_attributes", null);
        setField(term34177, term34177.getClass(), "_rootNames", null);
        setField(term34178, term34178.getClass(), "_overrides", term34179);
        setField(term34177, term34177.getClass(), "_configOverrides", term34178);
        setIntField(term34177, term34177.getClass(), "_mapperFeatures", 0);
        setField(term34177, term34177.getClass(), "_base", null);
        setField(term34176, term34176.getClass(), "_config", term34177);
        setField(term34180, term34180.getClass(), "_propCollector", null);
        setField(term34180, term34180.getClass(), "_config", null);
        setField(term34180, term34180.getClass(), "_annotationIntrospector", null);
        setField(term34180, term34180.getClass(), "_classInfo", null);
        setField(term34180, term34180.getClass(), "_properties", null);
        setField(term34180, term34180.getClass(), "_objectIdInfo", null);
        setField(term34181, term34181.getClass(), "_keyType", null);
        setField(term34181, term34181.getClass(), "_valueType", null);
        setField(term34181, term34181.getClass(), "_superClass", null);
        setField(term34181, term34181.getClass(), "_superInterfaces", null);
        setField(term34181, term34181.getClass(), "_bindings", null);
        setField(term34181, term34181.getClass(), "_canonicalName", null);
        setField(term34181, term34181.getClass(), "_class", term34182);
        setIntField(term34181, term34181.getClass(), "_hash", 0);
        setField(term34181, term34181.getClass(), "_valueHandler", null);
        setField(term34181, term34181.getClass(), "_typeHandler", null);
        setBooleanField(term34181, term34181.getClass(), "_asStatic", false);
        setField(term34180, term34180.getClass(), "_type", term34181);
        setField(term34176, term34176.getClass(), "_beanDesc", term34180);
        setField(term34176, term34176.getClass(), "_defaultInclusion", null);
        setField(term34176, term34176.getClass(), "_annotationIntrospector", term34186);
        setField(term34176, term34176.getClass(), "_defaultBean", null);
        Class<? extends Object> term34189 = Class.forName((String) "java.util.Collections$CheckedSet");
        term34187 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term34188 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term34187, term34187.getClass(), "_propCollector", null);
        setField(term34187, term34187.getClass(), "_config", null);
        setField(term34187, term34187.getClass(), "_annotationIntrospector", null);
        setField(term34187, term34187.getClass(), "_classInfo", null);
        setField(term34187, term34187.getClass(), "_properties", null);
        setField(term34187, term34187.getClass(), "_objectIdInfo", null);
        setField(term34188, term34188.getClass(), "_keyType", null);
        setField(term34188, term34188.getClass(), "_valueType", null);
        setField(term34188, term34188.getClass(), "_superClass", null);
        setField(term34188, term34188.getClass(), "_superInterfaces", null);
        setField(term34188, term34188.getClass(), "_bindings", null);
        setField(term34188, term34188.getClass(), "_canonicalName", null);
        setField(term34188, term34188.getClass(), "_class", term34189);
        setIntField(term34188, term34188.getClass(), "_hash", 0);
        setField(term34188, term34188.getClass(), "_valueHandler", null);
        setField(term34188, term34188.getClass(), "_typeHandler", null);
        setBooleanField(term34188, term34188.getClass(), "_asStatic", false);
        setField(term34187, term34187.getClass(), "_type", term34188);
        HashMap term34195 = new HashMap();
        term34193 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term34194 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term34193, term34193.getClass(), "_filterProvider", null);
        setField(term34193, term34193.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term34193, term34193.getClass(), "_serFeatures", 0);
        setIntField(term34193, term34193.getClass(), "_generatorFeatures", 0);
        setIntField(term34193, term34193.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term34193, term34193.getClass(), "_formatWriteFeatures", 0);
        setIntField(term34193, term34193.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term34193, term34193.getClass(), "_serializationInclusion", null);
        setField(term34193, term34193.getClass(), "_mixIns", null);
        setField(term34193, term34193.getClass(), "_subtypeResolver", null);
        setField(term34193, term34193.getClass(), "_rootName", null);
        setField(term34193, term34193.getClass(), "_view", null);
        setField(term34193, term34193.getClass(), "_attributes", null);
        setField(term34193, term34193.getClass(), "_rootNames", null);
        setField(term34194, term34194.getClass(), "_overrides", term34195);
        setField(term34193, term34193.getClass(), "_configOverrides", term34194);
        setIntField(term34193, term34193.getClass(), "_mapperFeatures", 0);
        setField(term34193, term34193.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term32605;
        args[1] = term32889;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term34176));
        assertTrue(recursiveEquals(term32605, term34187));
        assertTrue(recursiveEquals(term32889, term34193));
    }

};


