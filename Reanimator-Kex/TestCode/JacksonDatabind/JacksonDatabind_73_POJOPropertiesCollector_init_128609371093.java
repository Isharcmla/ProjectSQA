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

public class POJOPropertiesCollector_init_128609371093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25888;
     Object term26291;
     Object term26296;

    public POJOPropertiesCollector_init_128609371093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term25672 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term25778 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term25672, term25672.getClass(), "_config", term25778);
        setBooleanField(term25672, term25672.getClass(), "_stdBeanNaming", false);
        setBooleanField(term25672, term25672.getClass(), "_forSerialization", false);
        setField(term25672, term25672.getClass(), "_type", null);
        setField(term25672, term25672.getClass(), "_classDef", null);
        setField(term25672, term25672.getClass(), "_mutatorPrefix", null);
        setField(term25672, term25672.getClass(), "_annotationIntrospector", null);
        term25888 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term25988 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setIntField(term25888, term25888.getClass(), "_mapperFeatures", -1);
        setField(term25988, term25988.getClass(), "_annotationIntrospector", null);
        setField(term25988, term25988.getClass(), "_visibilityChecker", null);
        setField(term25888, term25888.getClass(), "_base", term25988);
        term26291 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term26292 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term26293 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term26292, term26292.getClass(), "_problemHandlers", null);
        setField(term26292, term26292.getClass(), "_nodeFactory", null);
        setIntField(term26292, term26292.getClass(), "_deserFeatures", 0);
        setIntField(term26292, term26292.getClass(), "_parserFeatures", 0);
        setIntField(term26292, term26292.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term26292, term26292.getClass(), "_formatReadFeatures", 0);
        setIntField(term26292, term26292.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term26292, term26292.getClass(), "_mixIns", null);
        setField(term26292, term26292.getClass(), "_subtypeResolver", null);
        setField(term26292, term26292.getClass(), "_rootName", null);
        setField(term26292, term26292.getClass(), "_view", null);
        setField(term26292, term26292.getClass(), "_attributes", null);
        setField(term26292, term26292.getClass(), "_rootNames", null);
        setField(term26292, term26292.getClass(), "_configOverrides", null);
        setIntField(term26292, term26292.getClass(), "_mapperFeatures", -1);
        setField(term26293, term26293.getClass(), "_classIntrospector", null);
        setField(term26293, term26293.getClass(), "_annotationIntrospector", null);
        setField(term26293, term26293.getClass(), "_visibilityChecker", null);
        setField(term26293, term26293.getClass(), "_propertyNamingStrategy", null);
        setField(term26293, term26293.getClass(), "_typeFactory", null);
        setField(term26293, term26293.getClass(), "_typeResolverBuilder", null);
        setField(term26293, term26293.getClass(), "_dateFormat", null);
        setField(term26293, term26293.getClass(), "_handlerInstantiator", null);
        setField(term26293, term26293.getClass(), "_locale", null);
        setField(term26293, term26293.getClass(), "_timeZone", null);
        setField(term26293, term26293.getClass(), "_defaultBase64", null);
        setField(term26292, term26292.getClass(), "_base", term26293);
        setField(term26291, term26291.getClass(), "_config", term26292);
        setBooleanField(term26291, term26291.getClass(), "_forSerialization", true);
        setBooleanField(term26291, term26291.getClass(), "_stdBeanNaming", true);
        setField(term26291, term26291.getClass(), "_type", null);
        setField(term26291, term26291.getClass(), "_classDef", null);
        setField(term26291, term26291.getClass(), "_visibilityChecker", null);
        setField(term26291, term26291.getClass(), "_annotationIntrospector", null);
        setField(term26291, term26291.getClass(), "_mutatorPrefix", "");
        setBooleanField(term26291, term26291.getClass(), "_collected", false);
        setField(term26291, term26291.getClass(), "_properties", null);
        setField(term26291, term26291.getClass(), "_creatorProperties", null);
        setField(term26291, term26291.getClass(), "_anyGetters", null);
        setField(term26291, term26291.getClass(), "_anySetters", null);
        setField(term26291, term26291.getClass(), "_anySetterField", null);
        setField(term26291, term26291.getClass(), "_jsonValueGetters", null);
        setField(term26291, term26291.getClass(), "_ignoredPropertyNames", null);
        setField(term26291, term26291.getClass(), "_injectables", null);
        term26296 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term26297 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term26296, term26296.getClass(), "_problemHandlers", null);
        setField(term26296, term26296.getClass(), "_nodeFactory", null);
        setIntField(term26296, term26296.getClass(), "_deserFeatures", 0);
        setIntField(term26296, term26296.getClass(), "_parserFeatures", 0);
        setIntField(term26296, term26296.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term26296, term26296.getClass(), "_formatReadFeatures", 0);
        setIntField(term26296, term26296.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term26296, term26296.getClass(), "_mixIns", null);
        setField(term26296, term26296.getClass(), "_subtypeResolver", null);
        setField(term26296, term26296.getClass(), "_rootName", null);
        setField(term26296, term26296.getClass(), "_view", null);
        setField(term26296, term26296.getClass(), "_attributes", null);
        setField(term26296, term26296.getClass(), "_rootNames", null);
        setField(term26296, term26296.getClass(), "_configOverrides", null);
        setIntField(term26296, term26296.getClass(), "_mapperFeatures", -1);
        setField(term26297, term26297.getClass(), "_classIntrospector", null);
        setField(term26297, term26297.getClass(), "_annotationIntrospector", null);
        setField(term26297, term26297.getClass(), "_visibilityChecker", null);
        setField(term26297, term26297.getClass(), "_propertyNamingStrategy", null);
        setField(term26297, term26297.getClass(), "_typeFactory", null);
        setField(term26297, term26297.getClass(), "_typeResolverBuilder", null);
        setField(term26297, term26297.getClass(), "_dateFormat", null);
        setField(term26297, term26297.getClass(), "_handlerInstantiator", null);
        setField(term26297, term26297.getClass(), "_locale", null);
        setField(term26297, term26297.getClass(), "_timeZone", null);
        setField(term26297, term26297.getClass(), "_defaultBase64", null);
        setField(term26296, term26296.getClass(), "_base", term26297);
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
        args[0] = term25888;
        args[1] = true;
        args[2] = null;
        args[3] = null;
        args[4] = "";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term26291));
        assertTrue(recursiveEquals(term25888, term26296));
    }

};


