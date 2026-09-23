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

public class PropertyBuilder_init_125729300989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84579;
     Object term85073;
     Object term85381;
     Object term85389;
     Object term85391;

    public PropertyBuilder_init_125729300989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term84343 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term84473 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term84343, term84343.getClass(), "_config", null);
        setField(term84343, term84343.getClass(), "_beanDesc", term84473);
        HashMap term84733 = new HashMap();
        term84579 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term84685 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term84943 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        setField(term84685, term84685.getClass(), "_overrides", term84733);
        setField(term84579, term84579.getClass(), "_configOverrides", term84685);
        setField(term84579, term84579.getClass(), "_serializationInclusion", term84943);
        term85073 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term85177 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term85073, term85073.getClass(), "_annotationIntrospector", null);
        setField(term85177, term85177.getClass(), "_class", null);
        setField(term85073, term85073.getClass(), "_type", term85177);
        HashMap term85385 = new HashMap();
        term85381 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term85382 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term85383 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term85384 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term85386 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term85387 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term85388 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term85382, term85382.getClass(), "_filterProvider", null);
        setField(term85382, term85382.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term85382, term85382.getClass(), "_serFeatures", 0);
        setIntField(term85382, term85382.getClass(), "_generatorFeatures", 0);
        setIntField(term85382, term85382.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term85382, term85382.getClass(), "_formatWriteFeatures", 0);
        setIntField(term85382, term85382.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term85383, term85383.getClass(), "_valueInclusion", null);
        setField(term85383, term85383.getClass(), "_contentInclusion", null);
        setField(term85382, term85382.getClass(), "_serializationInclusion", term85383);
        setField(term85382, term85382.getClass(), "_mixIns", null);
        setField(term85382, term85382.getClass(), "_subtypeResolver", null);
        setField(term85382, term85382.getClass(), "_rootName", null);
        setField(term85382, term85382.getClass(), "_view", null);
        setField(term85382, term85382.getClass(), "_attributes", null);
        setField(term85382, term85382.getClass(), "_rootNames", null);
        setField(term85384, term85384.getClass(), "_overrides", term85385);
        setField(term85382, term85382.getClass(), "_configOverrides", term85384);
        setIntField(term85382, term85382.getClass(), "_mapperFeatures", 0);
        setField(term85382, term85382.getClass(), "_base", null);
        setField(term85381, term85381.getClass(), "_config", term85382);
        setField(term85386, term85386.getClass(), "_propCollector", null);
        setField(term85386, term85386.getClass(), "_config", null);
        setField(term85386, term85386.getClass(), "_annotationIntrospector", null);
        setField(term85386, term85386.getClass(), "_classInfo", null);
        setField(term85386, term85386.getClass(), "_properties", null);
        setField(term85386, term85386.getClass(), "_objectIdInfo", null);
        setField(term85387, term85387.getClass(), "_referencedType", null);
        setField(term85387, term85387.getClass(), "_anchorType", null);
        setField(term85387, term85387.getClass(), "_superClass", null);
        setField(term85387, term85387.getClass(), "_superInterfaces", null);
        setField(term85387, term85387.getClass(), "_bindings", null);
        setField(term85387, term85387.getClass(), "_canonicalName", null);
        setField(term85387, term85387.getClass(), "_class", null);
        setIntField(term85387, term85387.getClass(), "_hash", 0);
        setField(term85387, term85387.getClass(), "_valueHandler", null);
        setField(term85387, term85387.getClass(), "_typeHandler", null);
        setBooleanField(term85387, term85387.getClass(), "_asStatic", false);
        setField(term85386, term85386.getClass(), "_type", term85387);
        setField(term85381, term85381.getClass(), "_beanDesc", term85386);
        setField(term85381, term85381.getClass(), "_annotationIntrospector", term85388);
        setField(term85381, term85381.getClass(), "_defaultBean", null);
        setField(term85381, term85381.getClass(), "_defaultInclusion", term85383);
        setBooleanField(term85381, term85381.getClass(), "_useRealPropertyDefaults", false);
        term85389 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term85390 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term85389, term85389.getClass(), "_propCollector", null);
        setField(term85389, term85389.getClass(), "_config", null);
        setField(term85389, term85389.getClass(), "_annotationIntrospector", null);
        setField(term85389, term85389.getClass(), "_classInfo", null);
        setField(term85389, term85389.getClass(), "_properties", null);
        setField(term85389, term85389.getClass(), "_objectIdInfo", null);
        setField(term85390, term85390.getClass(), "_referencedType", null);
        setField(term85390, term85390.getClass(), "_anchorType", null);
        setField(term85390, term85390.getClass(), "_superClass", null);
        setField(term85390, term85390.getClass(), "_superInterfaces", null);
        setField(term85390, term85390.getClass(), "_bindings", null);
        setField(term85390, term85390.getClass(), "_canonicalName", null);
        setField(term85390, term85390.getClass(), "_class", null);
        setIntField(term85390, term85390.getClass(), "_hash", 0);
        setField(term85390, term85390.getClass(), "_valueHandler", null);
        setField(term85390, term85390.getClass(), "_typeHandler", null);
        setBooleanField(term85390, term85390.getClass(), "_asStatic", false);
        setField(term85389, term85389.getClass(), "_type", term85390);
        HashMap term85394 = new HashMap();
        term85391 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term85392 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        Object term85393 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term85391, term85391.getClass(), "_filterProvider", null);
        setField(term85391, term85391.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term85391, term85391.getClass(), "_serFeatures", 0);
        setIntField(term85391, term85391.getClass(), "_generatorFeatures", 0);
        setIntField(term85391, term85391.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term85391, term85391.getClass(), "_formatWriteFeatures", 0);
        setIntField(term85391, term85391.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term85392, term85392.getClass(), "_valueInclusion", null);
        setField(term85392, term85392.getClass(), "_contentInclusion", null);
        setField(term85391, term85391.getClass(), "_serializationInclusion", term85392);
        setField(term85391, term85391.getClass(), "_mixIns", null);
        setField(term85391, term85391.getClass(), "_subtypeResolver", null);
        setField(term85391, term85391.getClass(), "_rootName", null);
        setField(term85391, term85391.getClass(), "_view", null);
        setField(term85391, term85391.getClass(), "_attributes", null);
        setField(term85391, term85391.getClass(), "_rootNames", null);
        setField(term85393, term85393.getClass(), "_overrides", term85394);
        setField(term85391, term85391.getClass(), "_configOverrides", term85393);
        setIntField(term85391, term85391.getClass(), "_mapperFeatures", 0);
        setField(term85391, term85391.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term84579;
        args[1] = term85073;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term85381));
        assertTrue(recursiveEquals(term84579, term85389));
        assertTrue(recursiveEquals(term85073, term85391));
    }

};


