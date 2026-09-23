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

public class POJOPropertiesCollector_init_128609371097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29675;
     Object term30229;
     Object term30235;

    public POJOPropertiesCollector_init_128609371097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29359 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term29465 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term29565 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term29359, term29359.getClass(), "_config", term29465);
        setBooleanField(term29359, term29359.getClass(), "_stdBeanNaming", false);
        setBooleanField(term29359, term29359.getClass(), "_forSerialization", false);
        setField(term29359, term29359.getClass(), "_type", term29565);
        setField(term29359, term29359.getClass(), "_classDef", null);
        setField(term29359, term29359.getClass(), "_mutatorPrefix", null);
        setField(term29359, term29359.getClass(), "_annotationIntrospector", null);
        term29675 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term29775 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term29919 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setIntField(term29675, term29675.getClass(), "_mapperFeatures", -1);
        setField(term29775, term29775.getClass(), "_annotationIntrospector", term29919);
        setField(term29775, term29775.getClass(), "_visibilityChecker", null);
        setField(term29675, term29675.getClass(), "_base", term29775);
        term30229 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term30230 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term30231 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term30232 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term30230, term30230.getClass(), "_problemHandlers", null);
        setField(term30230, term30230.getClass(), "_nodeFactory", null);
        setIntField(term30230, term30230.getClass(), "_deserFeatures", 0);
        setIntField(term30230, term30230.getClass(), "_parserFeatures", 0);
        setIntField(term30230, term30230.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term30230, term30230.getClass(), "_formatReadFeatures", 0);
        setIntField(term30230, term30230.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term30230, term30230.getClass(), "_mixIns", null);
        setField(term30230, term30230.getClass(), "_subtypeResolver", null);
        setField(term30230, term30230.getClass(), "_rootName", null);
        setField(term30230, term30230.getClass(), "_view", null);
        setField(term30230, term30230.getClass(), "_attributes", null);
        setField(term30230, term30230.getClass(), "_rootNames", null);
        setField(term30230, term30230.getClass(), "_configOverrides", null);
        setIntField(term30230, term30230.getClass(), "_mapperFeatures", -1);
        setField(term30231, term30231.getClass(), "_classIntrospector", null);
        setField(term30231, term30231.getClass(), "_annotationIntrospector", term30232);
        setField(term30231, term30231.getClass(), "_visibilityChecker", null);
        setField(term30231, term30231.getClass(), "_propertyNamingStrategy", null);
        setField(term30231, term30231.getClass(), "_typeFactory", null);
        setField(term30231, term30231.getClass(), "_typeResolverBuilder", null);
        setField(term30231, term30231.getClass(), "_dateFormat", null);
        setField(term30231, term30231.getClass(), "_handlerInstantiator", null);
        setField(term30231, term30231.getClass(), "_locale", null);
        setField(term30231, term30231.getClass(), "_timeZone", null);
        setField(term30231, term30231.getClass(), "_defaultBase64", null);
        setField(term30230, term30230.getClass(), "_base", term30231);
        setField(term30229, term30229.getClass(), "_config", term30230);
        setBooleanField(term30229, term30229.getClass(), "_forSerialization", true);
        setBooleanField(term30229, term30229.getClass(), "_stdBeanNaming", true);
        setField(term30229, term30229.getClass(), "_type", null);
        setField(term30229, term30229.getClass(), "_classDef", null);
        setField(term30229, term30229.getClass(), "_visibilityChecker", null);
        setField(term30229, term30229.getClass(), "_annotationIntrospector", term30232);
        setField(term30229, term30229.getClass(), "_mutatorPrefix", "");
        setBooleanField(term30229, term30229.getClass(), "_collected", false);
        setField(term30229, term30229.getClass(), "_properties", null);
        setField(term30229, term30229.getClass(), "_creatorProperties", null);
        setField(term30229, term30229.getClass(), "_anyGetters", null);
        setField(term30229, term30229.getClass(), "_anySetters", null);
        setField(term30229, term30229.getClass(), "_anySetterField", null);
        setField(term30229, term30229.getClass(), "_jsonValueGetters", null);
        setField(term30229, term30229.getClass(), "_ignoredPropertyNames", null);
        setField(term30229, term30229.getClass(), "_injectables", null);
        term30235 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term30236 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term30237 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term30235, term30235.getClass(), "_problemHandlers", null);
        setField(term30235, term30235.getClass(), "_nodeFactory", null);
        setIntField(term30235, term30235.getClass(), "_deserFeatures", 0);
        setIntField(term30235, term30235.getClass(), "_parserFeatures", 0);
        setIntField(term30235, term30235.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term30235, term30235.getClass(), "_formatReadFeatures", 0);
        setIntField(term30235, term30235.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term30235, term30235.getClass(), "_mixIns", null);
        setField(term30235, term30235.getClass(), "_subtypeResolver", null);
        setField(term30235, term30235.getClass(), "_rootName", null);
        setField(term30235, term30235.getClass(), "_view", null);
        setField(term30235, term30235.getClass(), "_attributes", null);
        setField(term30235, term30235.getClass(), "_rootNames", null);
        setField(term30235, term30235.getClass(), "_configOverrides", null);
        setIntField(term30235, term30235.getClass(), "_mapperFeatures", -1);
        setField(term30236, term30236.getClass(), "_classIntrospector", null);
        setField(term30236, term30236.getClass(), "_annotationIntrospector", term30237);
        setField(term30236, term30236.getClass(), "_visibilityChecker", null);
        setField(term30236, term30236.getClass(), "_propertyNamingStrategy", null);
        setField(term30236, term30236.getClass(), "_typeFactory", null);
        setField(term30236, term30236.getClass(), "_typeResolverBuilder", null);
        setField(term30236, term30236.getClass(), "_dateFormat", null);
        setField(term30236, term30236.getClass(), "_handlerInstantiator", null);
        setField(term30236, term30236.getClass(), "_locale", null);
        setField(term30236, term30236.getClass(), "_timeZone", null);
        setField(term30236, term30236.getClass(), "_defaultBase64", null);
        setField(term30235, term30235.getClass(), "_base", term30236);
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
        args[0] = term29675;
        args[1] = true;
        args[2] = null;
        args[3] = null;
        args[4] = "";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term30229));
        assertTrue(recursiveEquals(term29675, term30235));
    }

};


