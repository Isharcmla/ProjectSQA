package com.fasterxml.jackson.databind.introspect;

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
import static com.fasterxml.jackson.databind.introspect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.introspect.EqualityUtils.*;
import java.lang.Object;

public class POJOPropertiesCollector_init_1286093710103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34978;
     Object term35344;
     Object term35349;

    public POJOPropertiesCollector_init_1286093710103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term34688 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term34868 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(term34688, term34688.getClass(), "_config", null);
        setBooleanField(term34688, term34688.getClass(), "_stdBeanNaming", false);
        setBooleanField(term34688, term34688.getClass(), "_forSerialization", false);
        setField(term34688, term34688.getClass(), "_type", null);
        setField(term34688, term34688.getClass(), "_classDef", null);
        setField(term34688, term34688.getClass(), "_mutatorPrefix", "");
        setField(term34688, term34688.getClass(), "_annotationIntrospector", term34868);
        term34978 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term35078 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setIntField(term34978, term34978.getClass(), "_mapperFeatures", -1);
        setField(term35078, term35078.getClass(), "_annotationIntrospector", null);
        setField(term35078, term35078.getClass(), "_visibilityChecker", null);
        setField(term34978, term34978.getClass(), "_base", term35078);
        term35344 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term35345 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term35346 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term35345, term35345.getClass(), "_problemHandlers", null);
        setField(term35345, term35345.getClass(), "_nodeFactory", null);
        setIntField(term35345, term35345.getClass(), "_deserFeatures", 0);
        setIntField(term35345, term35345.getClass(), "_parserFeatures", 0);
        setIntField(term35345, term35345.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term35345, term35345.getClass(), "_formatReadFeatures", 0);
        setIntField(term35345, term35345.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term35345, term35345.getClass(), "_mixIns", null);
        setField(term35345, term35345.getClass(), "_subtypeResolver", null);
        setField(term35345, term35345.getClass(), "_rootName", null);
        setField(term35345, term35345.getClass(), "_view", null);
        setField(term35345, term35345.getClass(), "_attributes", null);
        setField(term35345, term35345.getClass(), "_rootNames", null);
        setField(term35345, term35345.getClass(), "_configOverrides", null);
        setIntField(term35345, term35345.getClass(), "_mapperFeatures", -1);
        setField(term35346, term35346.getClass(), "_classIntrospector", null);
        setField(term35346, term35346.getClass(), "_annotationIntrospector", null);
        setField(term35346, term35346.getClass(), "_visibilityChecker", null);
        setField(term35346, term35346.getClass(), "_propertyNamingStrategy", null);
        setField(term35346, term35346.getClass(), "_typeFactory", null);
        setField(term35346, term35346.getClass(), "_typeResolverBuilder", null);
        setField(term35346, term35346.getClass(), "_dateFormat", null);
        setField(term35346, term35346.getClass(), "_handlerInstantiator", null);
        setField(term35346, term35346.getClass(), "_locale", null);
        setField(term35346, term35346.getClass(), "_timeZone", null);
        setField(term35346, term35346.getClass(), "_defaultBase64", null);
        setField(term35345, term35345.getClass(), "_base", term35346);
        setField(term35344, term35344.getClass(), "_config", term35345);
        setBooleanField(term35344, term35344.getClass(), "_forSerialization", true);
        setBooleanField(term35344, term35344.getClass(), "_stdBeanNaming", true);
        setField(term35344, term35344.getClass(), "_type", null);
        setField(term35344, term35344.getClass(), "_classDef", null);
        setField(term35344, term35344.getClass(), "_visibilityChecker", null);
        setField(term35344, term35344.getClass(), "_annotationIntrospector", null);
        setField(term35344, term35344.getClass(), "_mutatorPrefix", "set");
        setBooleanField(term35344, term35344.getClass(), "_collected", false);
        setField(term35344, term35344.getClass(), "_properties", null);
        setField(term35344, term35344.getClass(), "_creatorProperties", null);
        setField(term35344, term35344.getClass(), "_anyGetters", null);
        setField(term35344, term35344.getClass(), "_anySetters", null);
        setField(term35344, term35344.getClass(), "_anySetterField", null);
        setField(term35344, term35344.getClass(), "_jsonValueGetters", null);
        setField(term35344, term35344.getClass(), "_ignoredPropertyNames", null);
        setField(term35344, term35344.getClass(), "_injectables", null);
        term35349 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term35350 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term35349, term35349.getClass(), "_problemHandlers", null);
        setField(term35349, term35349.getClass(), "_nodeFactory", null);
        setIntField(term35349, term35349.getClass(), "_deserFeatures", 0);
        setIntField(term35349, term35349.getClass(), "_parserFeatures", 0);
        setIntField(term35349, term35349.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term35349, term35349.getClass(), "_formatReadFeatures", 0);
        setIntField(term35349, term35349.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term35349, term35349.getClass(), "_mixIns", null);
        setField(term35349, term35349.getClass(), "_subtypeResolver", null);
        setField(term35349, term35349.getClass(), "_rootName", null);
        setField(term35349, term35349.getClass(), "_view", null);
        setField(term35349, term35349.getClass(), "_attributes", null);
        setField(term35349, term35349.getClass(), "_rootNames", null);
        setField(term35349, term35349.getClass(), "_configOverrides", null);
        setIntField(term35349, term35349.getClass(), "_mapperFeatures", -1);
        setField(term35350, term35350.getClass(), "_classIntrospector", null);
        setField(term35350, term35350.getClass(), "_annotationIntrospector", null);
        setField(term35350, term35350.getClass(), "_visibilityChecker", null);
        setField(term35350, term35350.getClass(), "_propertyNamingStrategy", null);
        setField(term35350, term35350.getClass(), "_typeFactory", null);
        setField(term35350, term35350.getClass(), "_typeResolverBuilder", null);
        setField(term35350, term35350.getClass(), "_dateFormat", null);
        setField(term35350, term35350.getClass(), "_handlerInstantiator", null);
        setField(term35350, term35350.getClass(), "_locale", null);
        setField(term35350, term35350.getClass(), "_timeZone", null);
        setField(term35350, term35350.getClass(), "_defaultBase64", null);
        setField(term35349, term35349.getClass(), "_base", term35350);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.cfg.MapperConfig");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term34978;
        args[1] = true;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term35344));
        assertTrue(recursiveEquals(term34978, term35349));
    }

};


