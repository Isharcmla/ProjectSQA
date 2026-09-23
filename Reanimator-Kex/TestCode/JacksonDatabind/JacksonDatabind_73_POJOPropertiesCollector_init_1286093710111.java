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

public class POJOPropertiesCollector_init_1286093710111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41866;
     Object term42070;
     Object term42339;
     Object term42345;
     Object term42347;

    public POJOPropertiesCollector_init_1286093710111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term41638 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term41756 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term41638, term41638.getClass(), "_config", null);
        setBooleanField(term41638, term41638.getClass(), "_stdBeanNaming", false);
        setBooleanField(term41638, term41638.getClass(), "_forSerialization", false);
        setField(term41638, term41638.getClass(), "_type", null);
        setField(term41638, term41638.getClass(), "_classDef", term41756);
        setField(term41638, term41638.getClass(), "_mutatorPrefix", null);
        setField(term41638, term41638.getClass(), "_annotationIntrospector", null);
        term41866 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term41966 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setIntField(term41866, term41866.getClass(), "_mapperFeatures", -1);
        setField(term41966, term41966.getClass(), "_annotationIntrospector", null);
        setField(term41966, term41966.getClass(), "_visibilityChecker", null);
        setField(term41866, term41866.getClass(), "_base", term41966);
        term42070 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term42339 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term42340 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term42341 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term42342 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term42340, term42340.getClass(), "_problemHandlers", null);
        setField(term42340, term42340.getClass(), "_nodeFactory", null);
        setIntField(term42340, term42340.getClass(), "_deserFeatures", 0);
        setIntField(term42340, term42340.getClass(), "_parserFeatures", 0);
        setIntField(term42340, term42340.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term42340, term42340.getClass(), "_formatReadFeatures", 0);
        setIntField(term42340, term42340.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term42340, term42340.getClass(), "_mixIns", null);
        setField(term42340, term42340.getClass(), "_subtypeResolver", null);
        setField(term42340, term42340.getClass(), "_rootName", null);
        setField(term42340, term42340.getClass(), "_view", null);
        setField(term42340, term42340.getClass(), "_attributes", null);
        setField(term42340, term42340.getClass(), "_rootNames", null);
        setField(term42340, term42340.getClass(), "_configOverrides", null);
        setIntField(term42340, term42340.getClass(), "_mapperFeatures", -1);
        setField(term42341, term42341.getClass(), "_classIntrospector", null);
        setField(term42341, term42341.getClass(), "_annotationIntrospector", null);
        setField(term42341, term42341.getClass(), "_visibilityChecker", null);
        setField(term42341, term42341.getClass(), "_propertyNamingStrategy", null);
        setField(term42341, term42341.getClass(), "_typeFactory", null);
        setField(term42341, term42341.getClass(), "_typeResolverBuilder", null);
        setField(term42341, term42341.getClass(), "_dateFormat", null);
        setField(term42341, term42341.getClass(), "_handlerInstantiator", null);
        setField(term42341, term42341.getClass(), "_locale", null);
        setField(term42341, term42341.getClass(), "_timeZone", null);
        setField(term42341, term42341.getClass(), "_defaultBase64", null);
        setField(term42340, term42340.getClass(), "_base", term42341);
        setField(term42339, term42339.getClass(), "_config", term42340);
        setBooleanField(term42339, term42339.getClass(), "_forSerialization", true);
        setBooleanField(term42339, term42339.getClass(), "_stdBeanNaming", true);
        setField(term42342, term42342.getClass(), "_referencedType", null);
        setField(term42342, term42342.getClass(), "_anchorType", null);
        setField(term42342, term42342.getClass(), "_superClass", null);
        setField(term42342, term42342.getClass(), "_superInterfaces", null);
        setField(term42342, term42342.getClass(), "_bindings", null);
        setField(term42342, term42342.getClass(), "_canonicalName", null);
        setField(term42342, term42342.getClass(), "_class", null);
        setIntField(term42342, term42342.getClass(), "_hash", 0);
        setField(term42342, term42342.getClass(), "_valueHandler", null);
        setField(term42342, term42342.getClass(), "_typeHandler", null);
        setBooleanField(term42342, term42342.getClass(), "_asStatic", false);
        setField(term42339, term42339.getClass(), "_type", term42342);
        setField(term42339, term42339.getClass(), "_classDef", null);
        setField(term42339, term42339.getClass(), "_visibilityChecker", null);
        setField(term42339, term42339.getClass(), "_annotationIntrospector", null);
        setField(term42339, term42339.getClass(), "_mutatorPrefix", "set");
        setBooleanField(term42339, term42339.getClass(), "_collected", false);
        setField(term42339, term42339.getClass(), "_properties", null);
        setField(term42339, term42339.getClass(), "_creatorProperties", null);
        setField(term42339, term42339.getClass(), "_anyGetters", null);
        setField(term42339, term42339.getClass(), "_anySetters", null);
        setField(term42339, term42339.getClass(), "_anySetterField", null);
        setField(term42339, term42339.getClass(), "_jsonValueGetters", null);
        setField(term42339, term42339.getClass(), "_ignoredPropertyNames", null);
        setField(term42339, term42339.getClass(), "_injectables", null);
        term42345 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term42346 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term42345, term42345.getClass(), "_problemHandlers", null);
        setField(term42345, term42345.getClass(), "_nodeFactory", null);
        setIntField(term42345, term42345.getClass(), "_deserFeatures", 0);
        setIntField(term42345, term42345.getClass(), "_parserFeatures", 0);
        setIntField(term42345, term42345.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term42345, term42345.getClass(), "_formatReadFeatures", 0);
        setIntField(term42345, term42345.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term42345, term42345.getClass(), "_mixIns", null);
        setField(term42345, term42345.getClass(), "_subtypeResolver", null);
        setField(term42345, term42345.getClass(), "_rootName", null);
        setField(term42345, term42345.getClass(), "_view", null);
        setField(term42345, term42345.getClass(), "_attributes", null);
        setField(term42345, term42345.getClass(), "_rootNames", null);
        setField(term42345, term42345.getClass(), "_configOverrides", null);
        setIntField(term42345, term42345.getClass(), "_mapperFeatures", -1);
        setField(term42346, term42346.getClass(), "_classIntrospector", null);
        setField(term42346, term42346.getClass(), "_annotationIntrospector", null);
        setField(term42346, term42346.getClass(), "_visibilityChecker", null);
        setField(term42346, term42346.getClass(), "_propertyNamingStrategy", null);
        setField(term42346, term42346.getClass(), "_typeFactory", null);
        setField(term42346, term42346.getClass(), "_typeResolverBuilder", null);
        setField(term42346, term42346.getClass(), "_dateFormat", null);
        setField(term42346, term42346.getClass(), "_handlerInstantiator", null);
        setField(term42346, term42346.getClass(), "_locale", null);
        setField(term42346, term42346.getClass(), "_timeZone", null);
        setField(term42346, term42346.getClass(), "_defaultBase64", null);
        setField(term42345, term42345.getClass(), "_base", term42346);
        term42347 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term42347, term42347.getClass(), "_referencedType", null);
        setField(term42347, term42347.getClass(), "_anchorType", null);
        setField(term42347, term42347.getClass(), "_superClass", null);
        setField(term42347, term42347.getClass(), "_superInterfaces", null);
        setField(term42347, term42347.getClass(), "_bindings", null);
        setField(term42347, term42347.getClass(), "_canonicalName", null);
        setField(term42347, term42347.getClass(), "_class", null);
        setIntField(term42347, term42347.getClass(), "_hash", 0);
        setField(term42347, term42347.getClass(), "_valueHandler", null);
        setField(term42347, term42347.getClass(), "_typeHandler", null);
        setBooleanField(term42347, term42347.getClass(), "_asStatic", false);
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
        args[0] = term41866;
        args[1] = true;
        args[2] = term42070;
        args[3] = null;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term42339));
        assertTrue(recursiveEquals(term41866, term42345));
        assertTrue(recursiveEquals(term42070, term42347));
    }

};


