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

public class POJOPropertiesCollector_init_1286093710117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46966;
     Object term47298;
     Object term47303;

    public POJOPropertiesCollector_init_1286093710117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term46856 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        setField(term46856, term46856.getClass(), "_config", null);
        setBooleanField(term46856, term46856.getClass(), "_stdBeanNaming", false);
        setBooleanField(term46856, term46856.getClass(), "_forSerialization", false);
        setField(term46856, term46856.getClass(), "_type", null);
        setField(term46856, term46856.getClass(), "_classDef", null);
        setField(term46856, term46856.getClass(), "_mutatorPrefix", null);
        setField(term46856, term46856.getClass(), "_annotationIntrospector", null);
        term46966 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term47066 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setIntField(term46966, term46966.getClass(), "_mapperFeatures", -2);
        setField(term47066, term47066.getClass(), "_annotationIntrospector", null);
        setField(term47066, term47066.getClass(), "_visibilityChecker", null);
        setField(term46966, term46966.getClass(), "_base", term47066);
        term47298 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term47299 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term47300 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term47299, term47299.getClass(), "_problemHandlers", null);
        setField(term47299, term47299.getClass(), "_nodeFactory", null);
        setIntField(term47299, term47299.getClass(), "_deserFeatures", 0);
        setIntField(term47299, term47299.getClass(), "_parserFeatures", 0);
        setIntField(term47299, term47299.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term47299, term47299.getClass(), "_formatReadFeatures", 0);
        setIntField(term47299, term47299.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term47299, term47299.getClass(), "_mixIns", null);
        setField(term47299, term47299.getClass(), "_subtypeResolver", null);
        setField(term47299, term47299.getClass(), "_rootName", null);
        setField(term47299, term47299.getClass(), "_view", null);
        setField(term47299, term47299.getClass(), "_attributes", null);
        setField(term47299, term47299.getClass(), "_rootNames", null);
        setField(term47299, term47299.getClass(), "_configOverrides", null);
        setIntField(term47299, term47299.getClass(), "_mapperFeatures", -2);
        setField(term47300, term47300.getClass(), "_classIntrospector", null);
        setField(term47300, term47300.getClass(), "_annotationIntrospector", null);
        setField(term47300, term47300.getClass(), "_visibilityChecker", null);
        setField(term47300, term47300.getClass(), "_propertyNamingStrategy", null);
        setField(term47300, term47300.getClass(), "_typeFactory", null);
        setField(term47300, term47300.getClass(), "_typeResolverBuilder", null);
        setField(term47300, term47300.getClass(), "_dateFormat", null);
        setField(term47300, term47300.getClass(), "_handlerInstantiator", null);
        setField(term47300, term47300.getClass(), "_locale", null);
        setField(term47300, term47300.getClass(), "_timeZone", null);
        setField(term47300, term47300.getClass(), "_defaultBase64", null);
        setField(term47299, term47299.getClass(), "_base", term47300);
        setField(term47298, term47298.getClass(), "_config", term47299);
        setBooleanField(term47298, term47298.getClass(), "_forSerialization", true);
        setBooleanField(term47298, term47298.getClass(), "_stdBeanNaming", true);
        setField(term47298, term47298.getClass(), "_type", null);
        setField(term47298, term47298.getClass(), "_classDef", null);
        setField(term47298, term47298.getClass(), "_visibilityChecker", null);
        setField(term47298, term47298.getClass(), "_annotationIntrospector", null);
        setField(term47298, term47298.getClass(), "_mutatorPrefix", "set");
        setBooleanField(term47298, term47298.getClass(), "_collected", false);
        setField(term47298, term47298.getClass(), "_properties", null);
        setField(term47298, term47298.getClass(), "_creatorProperties", null);
        setField(term47298, term47298.getClass(), "_anyGetters", null);
        setField(term47298, term47298.getClass(), "_anySetters", null);
        setField(term47298, term47298.getClass(), "_anySetterField", null);
        setField(term47298, term47298.getClass(), "_jsonValueGetters", null);
        setField(term47298, term47298.getClass(), "_ignoredPropertyNames", null);
        setField(term47298, term47298.getClass(), "_injectables", null);
        term47303 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term47304 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term47303, term47303.getClass(), "_problemHandlers", null);
        setField(term47303, term47303.getClass(), "_nodeFactory", null);
        setIntField(term47303, term47303.getClass(), "_deserFeatures", 0);
        setIntField(term47303, term47303.getClass(), "_parserFeatures", 0);
        setIntField(term47303, term47303.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term47303, term47303.getClass(), "_formatReadFeatures", 0);
        setIntField(term47303, term47303.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term47303, term47303.getClass(), "_mixIns", null);
        setField(term47303, term47303.getClass(), "_subtypeResolver", null);
        setField(term47303, term47303.getClass(), "_rootName", null);
        setField(term47303, term47303.getClass(), "_view", null);
        setField(term47303, term47303.getClass(), "_attributes", null);
        setField(term47303, term47303.getClass(), "_rootNames", null);
        setField(term47303, term47303.getClass(), "_configOverrides", null);
        setIntField(term47303, term47303.getClass(), "_mapperFeatures", -2);
        setField(term47304, term47304.getClass(), "_classIntrospector", null);
        setField(term47304, term47304.getClass(), "_annotationIntrospector", null);
        setField(term47304, term47304.getClass(), "_visibilityChecker", null);
        setField(term47304, term47304.getClass(), "_propertyNamingStrategy", null);
        setField(term47304, term47304.getClass(), "_typeFactory", null);
        setField(term47304, term47304.getClass(), "_typeResolverBuilder", null);
        setField(term47304, term47304.getClass(), "_dateFormat", null);
        setField(term47304, term47304.getClass(), "_handlerInstantiator", null);
        setField(term47304, term47304.getClass(), "_locale", null);
        setField(term47304, term47304.getClass(), "_timeZone", null);
        setField(term47304, term47304.getClass(), "_defaultBase64", null);
        setField(term47303, term47303.getClass(), "_base", term47304);
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
        args[0] = term46966;
        args[1] = true;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term47298));
        assertTrue(recursiveEquals(term46966, term47303));
    }

};


