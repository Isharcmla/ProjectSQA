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

public class PropertyBuilder_init_125729300945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31053;
     Object term31337;
     Object term31523;
     Object term31530;
     Object term31532;

    public PropertyBuilder_init_125729300945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term30947 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        setField(term30947, term30947.getClass(), "_config", null);
        setField(term30947, term30947.getClass(), "_beanDesc", null);
        HashMap term31207 = new HashMap();
        term31053 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term31159 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term31159, term31159.getClass(), "_overrides", term31207);
        setField(term31053, term31053.getClass(), "_configOverrides", term31159);
        term31337 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term31451 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term31451, term31451.getClass(), "_class", null);
        setField(term31337, term31337.getClass(), "_type", term31451);
        HashMap term31526 = new HashMap();
        term31523 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term31524 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term31525 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term31527 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term31528 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term31529 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term31524, term31524.getClass(), "_filterProvider", null);
        setField(term31524, term31524.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term31524, term31524.getClass(), "_serFeatures", 0);
        setIntField(term31524, term31524.getClass(), "_generatorFeatures", 0);
        setIntField(term31524, term31524.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term31524, term31524.getClass(), "_formatWriteFeatures", 0);
        setIntField(term31524, term31524.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term31524, term31524.getClass(), "_serializationInclusion", null);
        setField(term31524, term31524.getClass(), "_mixIns", null);
        setField(term31524, term31524.getClass(), "_subtypeResolver", null);
        setField(term31524, term31524.getClass(), "_rootName", null);
        setField(term31524, term31524.getClass(), "_view", null);
        setField(term31524, term31524.getClass(), "_attributes", null);
        setField(term31524, term31524.getClass(), "_rootNames", null);
        setField(term31525, term31525.getClass(), "_overrides", term31526);
        setField(term31524, term31524.getClass(), "_configOverrides", term31525);
        setIntField(term31524, term31524.getClass(), "_mapperFeatures", 0);
        setField(term31524, term31524.getClass(), "_base", null);
        setField(term31523, term31523.getClass(), "_config", term31524);
        setField(term31527, term31527.getClass(), "_propCollector", null);
        setField(term31527, term31527.getClass(), "_config", null);
        setField(term31527, term31527.getClass(), "_annotationIntrospector", null);
        setField(term31527, term31527.getClass(), "_classInfo", null);
        setField(term31527, term31527.getClass(), "_properties", null);
        setField(term31527, term31527.getClass(), "_objectIdInfo", null);
        setField(term31528, term31528.getClass(), "_elementType", null);
        setField(term31528, term31528.getClass(), "_superClass", null);
        setField(term31528, term31528.getClass(), "_superInterfaces", null);
        setField(term31528, term31528.getClass(), "_bindings", null);
        setField(term31528, term31528.getClass(), "_canonicalName", null);
        setField(term31528, term31528.getClass(), "_class", null);
        setIntField(term31528, term31528.getClass(), "_hash", 0);
        setField(term31528, term31528.getClass(), "_valueHandler", null);
        setField(term31528, term31528.getClass(), "_typeHandler", null);
        setBooleanField(term31528, term31528.getClass(), "_asStatic", false);
        setField(term31527, term31527.getClass(), "_type", term31528);
        setField(term31523, term31523.getClass(), "_beanDesc", term31527);
        setField(term31523, term31523.getClass(), "_defaultInclusion", null);
        setField(term31523, term31523.getClass(), "_annotationIntrospector", term31529);
        setField(term31523, term31523.getClass(), "_defaultBean", null);
        term31530 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term31531 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term31530, term31530.getClass(), "_propCollector", null);
        setField(term31530, term31530.getClass(), "_config", null);
        setField(term31530, term31530.getClass(), "_annotationIntrospector", null);
        setField(term31530, term31530.getClass(), "_classInfo", null);
        setField(term31530, term31530.getClass(), "_properties", null);
        setField(term31530, term31530.getClass(), "_objectIdInfo", null);
        setField(term31531, term31531.getClass(), "_elementType", null);
        setField(term31531, term31531.getClass(), "_superClass", null);
        setField(term31531, term31531.getClass(), "_superInterfaces", null);
        setField(term31531, term31531.getClass(), "_bindings", null);
        setField(term31531, term31531.getClass(), "_canonicalName", null);
        setField(term31531, term31531.getClass(), "_class", null);
        setIntField(term31531, term31531.getClass(), "_hash", 0);
        setField(term31531, term31531.getClass(), "_valueHandler", null);
        setField(term31531, term31531.getClass(), "_typeHandler", null);
        setBooleanField(term31531, term31531.getClass(), "_asStatic", false);
        setField(term31530, term31530.getClass(), "_type", term31531);
        HashMap term31534 = new HashMap();
        term31532 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term31533 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term31532, term31532.getClass(), "_filterProvider", null);
        setField(term31532, term31532.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term31532, term31532.getClass(), "_serFeatures", 0);
        setIntField(term31532, term31532.getClass(), "_generatorFeatures", 0);
        setIntField(term31532, term31532.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term31532, term31532.getClass(), "_formatWriteFeatures", 0);
        setIntField(term31532, term31532.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term31532, term31532.getClass(), "_serializationInclusion", null);
        setField(term31532, term31532.getClass(), "_mixIns", null);
        setField(term31532, term31532.getClass(), "_subtypeResolver", null);
        setField(term31532, term31532.getClass(), "_rootName", null);
        setField(term31532, term31532.getClass(), "_view", null);
        setField(term31532, term31532.getClass(), "_attributes", null);
        setField(term31532, term31532.getClass(), "_rootNames", null);
        setField(term31533, term31533.getClass(), "_overrides", term31534);
        setField(term31532, term31532.getClass(), "_configOverrides", term31533);
        setIntField(term31532, term31532.getClass(), "_mapperFeatures", 0);
        setField(term31532, term31532.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term31053;
        args[1] = term31337;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term31523));
        assertTrue(recursiveEquals(term31053, term31530));
        assertTrue(recursiveEquals(term31337, term31532));
    }

};


