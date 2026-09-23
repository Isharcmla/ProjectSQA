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

public class PropertyBuilder_init_125729300939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23900;
     Object term24136;
     Object term24289;
     Object term24295;
     Object term24297;

    public PropertyBuilder_init_125729300939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term23688 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term23794 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term23688, term23688.getClass(), "_config", term23794);
        setField(term23688, term23688.getClass(), "_beanDesc", null);
        term23900 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term24006 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term23900, term23900.getClass(), "_configOverrides", term24006);
        term24136 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term24232 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term24232, term24232.getClass(), "_class", null);
        setField(term24136, term24136.getClass(), "_type", term24232);
        term24289 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term24290 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term24291 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term24292 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term24293 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term24294 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term24290, term24290.getClass(), "_filterProvider", null);
        setField(term24290, term24290.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term24290, term24290.getClass(), "_serFeatures", 0);
        setIntField(term24290, term24290.getClass(), "_generatorFeatures", 0);
        setIntField(term24290, term24290.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term24290, term24290.getClass(), "_formatWriteFeatures", 0);
        setIntField(term24290, term24290.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term24290, term24290.getClass(), "_serializationInclusion", null);
        setField(term24290, term24290.getClass(), "_mixIns", null);
        setField(term24290, term24290.getClass(), "_subtypeResolver", null);
        setField(term24290, term24290.getClass(), "_rootName", null);
        setField(term24290, term24290.getClass(), "_view", null);
        setField(term24290, term24290.getClass(), "_attributes", null);
        setField(term24290, term24290.getClass(), "_rootNames", null);
        setField(term24291, term24291.getClass(), "_overrides", null);
        setField(term24290, term24290.getClass(), "_configOverrides", term24291);
        setIntField(term24290, term24290.getClass(), "_mapperFeatures", 0);
        setField(term24290, term24290.getClass(), "_base", null);
        setField(term24289, term24289.getClass(), "_config", term24290);
        setField(term24292, term24292.getClass(), "_propCollector", null);
        setField(term24292, term24292.getClass(), "_config", null);
        setField(term24292, term24292.getClass(), "_annotationIntrospector", null);
        setField(term24292, term24292.getClass(), "_classInfo", null);
        setField(term24292, term24292.getClass(), "_properties", null);
        setField(term24292, term24292.getClass(), "_objectIdInfo", null);
        setField(term24293, term24293.getClass(), "_componentType", null);
        setField(term24293, term24293.getClass(), "_emptyArray", null);
        setField(term24293, term24293.getClass(), "_superClass", null);
        setField(term24293, term24293.getClass(), "_superInterfaces", null);
        setField(term24293, term24293.getClass(), "_bindings", null);
        setField(term24293, term24293.getClass(), "_canonicalName", null);
        setField(term24293, term24293.getClass(), "_class", null);
        setIntField(term24293, term24293.getClass(), "_hash", 0);
        setField(term24293, term24293.getClass(), "_valueHandler", null);
        setField(term24293, term24293.getClass(), "_typeHandler", null);
        setBooleanField(term24293, term24293.getClass(), "_asStatic", false);
        setField(term24292, term24292.getClass(), "_type", term24293);
        setField(term24289, term24289.getClass(), "_beanDesc", term24292);
        setField(term24289, term24289.getClass(), "_defaultInclusion", null);
        setField(term24289, term24289.getClass(), "_annotationIntrospector", term24294);
        setField(term24289, term24289.getClass(), "_defaultBean", null);
        term24295 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term24296 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term24295, term24295.getClass(), "_propCollector", null);
        setField(term24295, term24295.getClass(), "_config", null);
        setField(term24295, term24295.getClass(), "_annotationIntrospector", null);
        setField(term24295, term24295.getClass(), "_classInfo", null);
        setField(term24295, term24295.getClass(), "_properties", null);
        setField(term24295, term24295.getClass(), "_objectIdInfo", null);
        setField(term24296, term24296.getClass(), "_componentType", null);
        setField(term24296, term24296.getClass(), "_emptyArray", null);
        setField(term24296, term24296.getClass(), "_superClass", null);
        setField(term24296, term24296.getClass(), "_superInterfaces", null);
        setField(term24296, term24296.getClass(), "_bindings", null);
        setField(term24296, term24296.getClass(), "_canonicalName", null);
        setField(term24296, term24296.getClass(), "_class", null);
        setIntField(term24296, term24296.getClass(), "_hash", 0);
        setField(term24296, term24296.getClass(), "_valueHandler", null);
        setField(term24296, term24296.getClass(), "_typeHandler", null);
        setBooleanField(term24296, term24296.getClass(), "_asStatic", false);
        setField(term24295, term24295.getClass(), "_type", term24296);
        term24297 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term24298 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term24297, term24297.getClass(), "_filterProvider", null);
        setField(term24297, term24297.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term24297, term24297.getClass(), "_serFeatures", 0);
        setIntField(term24297, term24297.getClass(), "_generatorFeatures", 0);
        setIntField(term24297, term24297.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term24297, term24297.getClass(), "_formatWriteFeatures", 0);
        setIntField(term24297, term24297.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term24297, term24297.getClass(), "_serializationInclusion", null);
        setField(term24297, term24297.getClass(), "_mixIns", null);
        setField(term24297, term24297.getClass(), "_subtypeResolver", null);
        setField(term24297, term24297.getClass(), "_rootName", null);
        setField(term24297, term24297.getClass(), "_view", null);
        setField(term24297, term24297.getClass(), "_attributes", null);
        setField(term24297, term24297.getClass(), "_rootNames", null);
        setField(term24298, term24298.getClass(), "_overrides", null);
        setField(term24297, term24297.getClass(), "_configOverrides", term24298);
        setIntField(term24297, term24297.getClass(), "_mapperFeatures", 0);
        setField(term24297, term24297.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term23900;
        args[1] = term24136;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term24289));
        assertTrue(recursiveEquals(term23900, term24295));
        assertTrue(recursiveEquals(term24136, term24297));
    }

};


