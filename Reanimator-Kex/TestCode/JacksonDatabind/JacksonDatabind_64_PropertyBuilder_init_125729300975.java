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

public class PropertyBuilder_init_125729300975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67601;
     Object term67943;
     Object term68236;
     Object term68243;
     Object term68245;

    public PropertyBuilder_init_125729300975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term67283 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term67389 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term67495 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        setField(term67283, term67283.getClass(), "_config", term67389);
        setField(term67283, term67283.getClass(), "_beanDesc", null);
        setField(term67283, term67283.getClass(), "_defaultInclusion", term67495);
        term67601 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term67707 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term67813 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        setField(term67707, term67707.getClass(), "_overrides", null);
        setField(term67601, term67601.getClass(), "_configOverrides", term67707);
        setField(term67601, term67601.getClass(), "_serializationInclusion", term67813);
        term67943 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term68047 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term67943, term67943.getClass(), "_annotationIntrospector", null);
        setField(term68047, term68047.getClass(), "_class", null);
        setField(term67943, term67943.getClass(), "_type", term68047);
        term68236 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term68237 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term68238 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term68239 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term68240 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term68241 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term68242 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term68237, term68237.getClass(), "_filterProvider", null);
        setField(term68237, term68237.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term68237, term68237.getClass(), "_serFeatures", 0);
        setIntField(term68237, term68237.getClass(), "_generatorFeatures", 0);
        setIntField(term68237, term68237.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term68237, term68237.getClass(), "_formatWriteFeatures", 0);
        setIntField(term68237, term68237.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term68238, term68238.getClass(), "_valueInclusion", null);
        setField(term68238, term68238.getClass(), "_contentInclusion", null);
        setField(term68237, term68237.getClass(), "_serializationInclusion", term68238);
        setField(term68237, term68237.getClass(), "_mixIns", null);
        setField(term68237, term68237.getClass(), "_subtypeResolver", null);
        setField(term68237, term68237.getClass(), "_rootName", null);
        setField(term68237, term68237.getClass(), "_view", null);
        setField(term68237, term68237.getClass(), "_attributes", null);
        setField(term68237, term68237.getClass(), "_rootNames", null);
        setField(term68239, term68239.getClass(), "_overrides", null);
        setField(term68237, term68237.getClass(), "_configOverrides", term68239);
        setIntField(term68237, term68237.getClass(), "_mapperFeatures", 0);
        setField(term68237, term68237.getClass(), "_base", null);
        setField(term68236, term68236.getClass(), "_config", term68237);
        setField(term68240, term68240.getClass(), "_propCollector", null);
        setField(term68240, term68240.getClass(), "_config", null);
        setField(term68240, term68240.getClass(), "_annotationIntrospector", null);
        setField(term68240, term68240.getClass(), "_classInfo", null);
        setField(term68240, term68240.getClass(), "_properties", null);
        setField(term68240, term68240.getClass(), "_objectIdInfo", null);
        setField(term68241, term68241.getClass(), "_referencedType", null);
        setField(term68241, term68241.getClass(), "_anchorType", null);
        setField(term68241, term68241.getClass(), "_superClass", null);
        setField(term68241, term68241.getClass(), "_superInterfaces", null);
        setField(term68241, term68241.getClass(), "_bindings", null);
        setField(term68241, term68241.getClass(), "_canonicalName", null);
        setField(term68241, term68241.getClass(), "_class", null);
        setIntField(term68241, term68241.getClass(), "_hash", 0);
        setField(term68241, term68241.getClass(), "_valueHandler", null);
        setField(term68241, term68241.getClass(), "_typeHandler", null);
        setBooleanField(term68241, term68241.getClass(), "_asStatic", false);
        setField(term68240, term68240.getClass(), "_type", term68241);
        setField(term68236, term68236.getClass(), "_beanDesc", term68240);
        setField(term68236, term68236.getClass(), "_annotationIntrospector", term68242);
        setField(term68236, term68236.getClass(), "_defaultBean", null);
        setField(term68236, term68236.getClass(), "_defaultInclusion", term68238);
        setBooleanField(term68236, term68236.getClass(), "_useRealPropertyDefaults", false);
        term68243 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term68244 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term68243, term68243.getClass(), "_propCollector", null);
        setField(term68243, term68243.getClass(), "_config", null);
        setField(term68243, term68243.getClass(), "_annotationIntrospector", null);
        setField(term68243, term68243.getClass(), "_classInfo", null);
        setField(term68243, term68243.getClass(), "_properties", null);
        setField(term68243, term68243.getClass(), "_objectIdInfo", null);
        setField(term68244, term68244.getClass(), "_referencedType", null);
        setField(term68244, term68244.getClass(), "_anchorType", null);
        setField(term68244, term68244.getClass(), "_superClass", null);
        setField(term68244, term68244.getClass(), "_superInterfaces", null);
        setField(term68244, term68244.getClass(), "_bindings", null);
        setField(term68244, term68244.getClass(), "_canonicalName", null);
        setField(term68244, term68244.getClass(), "_class", null);
        setIntField(term68244, term68244.getClass(), "_hash", 0);
        setField(term68244, term68244.getClass(), "_valueHandler", null);
        setField(term68244, term68244.getClass(), "_typeHandler", null);
        setBooleanField(term68244, term68244.getClass(), "_asStatic", false);
        setField(term68243, term68243.getClass(), "_type", term68244);
        term68245 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term68246 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term68247 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term68245, term68245.getClass(), "_filterProvider", null);
        setField(term68245, term68245.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term68245, term68245.getClass(), "_serFeatures", 0);
        setIntField(term68245, term68245.getClass(), "_generatorFeatures", 0);
        setIntField(term68245, term68245.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term68245, term68245.getClass(), "_formatWriteFeatures", 0);
        setIntField(term68245, term68245.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term68246, term68246.getClass(), "_valueInclusion", null);
        setField(term68246, term68246.getClass(), "_contentInclusion", null);
        setField(term68245, term68245.getClass(), "_serializationInclusion", term68246);
        setField(term68245, term68245.getClass(), "_mixIns", null);
        setField(term68245, term68245.getClass(), "_subtypeResolver", null);
        setField(term68245, term68245.getClass(), "_rootName", null);
        setField(term68245, term68245.getClass(), "_view", null);
        setField(term68245, term68245.getClass(), "_attributes", null);
        setField(term68245, term68245.getClass(), "_rootNames", null);
        setField(term68247, term68247.getClass(), "_overrides", null);
        setField(term68245, term68245.getClass(), "_configOverrides", term68247);
        setIntField(term68245, term68245.getClass(), "_mapperFeatures", 0);
        setField(term68245, term68245.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term67601;
        args[1] = term67943;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term68236));
        assertTrue(recursiveEquals(term67601, term68243));
        assertTrue(recursiveEquals(term67943, term68245));
    }

};


