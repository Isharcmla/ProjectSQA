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

public class POJOPropertiesCollector_init_1286093710107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38316;
     Object term38534;
     Object term38802;
     Object term38808;
     Object term38810;

    public POJOPropertiesCollector_init_1286093710107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37902 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term38020 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term38206 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term37902, term37902.getClass(), "_config", null);
        setBooleanField(term37902, term37902.getClass(), "_stdBeanNaming", false);
        setBooleanField(term37902, term37902.getClass(), "_forSerialization", false);
        setField(term37902, term37902.getClass(), "_type", null);
        setField(term37902, term37902.getClass(), "_classDef", term38020);
        setField(term37902, term37902.getClass(), "_mutatorPrefix", "");
        setField(term37902, term37902.getClass(), "_annotationIntrospector", term38206);
        term38316 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term38416 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setIntField(term38316, term38316.getClass(), "_mapperFeatures", -1);
        setField(term38416, term38416.getClass(), "_annotationIntrospector", null);
        setField(term38416, term38416.getClass(), "_visibilityChecker", null);
        setField(term38316, term38316.getClass(), "_base", term38416);
        term38534 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        term38802 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term38803 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term38804 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term38805 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term38803, term38803.getClass(), "_problemHandlers", null);
        setField(term38803, term38803.getClass(), "_nodeFactory", null);
        setIntField(term38803, term38803.getClass(), "_deserFeatures", 0);
        setIntField(term38803, term38803.getClass(), "_parserFeatures", 0);
        setIntField(term38803, term38803.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term38803, term38803.getClass(), "_formatReadFeatures", 0);
        setIntField(term38803, term38803.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term38803, term38803.getClass(), "_mixIns", null);
        setField(term38803, term38803.getClass(), "_subtypeResolver", null);
        setField(term38803, term38803.getClass(), "_rootName", null);
        setField(term38803, term38803.getClass(), "_view", null);
        setField(term38803, term38803.getClass(), "_attributes", null);
        setField(term38803, term38803.getClass(), "_rootNames", null);
        setField(term38803, term38803.getClass(), "_configOverrides", null);
        setIntField(term38803, term38803.getClass(), "_mapperFeatures", -1);
        setField(term38804, term38804.getClass(), "_classIntrospector", null);
        setField(term38804, term38804.getClass(), "_annotationIntrospector", null);
        setField(term38804, term38804.getClass(), "_visibilityChecker", null);
        setField(term38804, term38804.getClass(), "_propertyNamingStrategy", null);
        setField(term38804, term38804.getClass(), "_typeFactory", null);
        setField(term38804, term38804.getClass(), "_typeResolverBuilder", null);
        setField(term38804, term38804.getClass(), "_dateFormat", null);
        setField(term38804, term38804.getClass(), "_handlerInstantiator", null);
        setField(term38804, term38804.getClass(), "_locale", null);
        setField(term38804, term38804.getClass(), "_timeZone", null);
        setField(term38804, term38804.getClass(), "_defaultBase64", null);
        setField(term38803, term38803.getClass(), "_base", term38804);
        setField(term38802, term38802.getClass(), "_config", term38803);
        setBooleanField(term38802, term38802.getClass(), "_forSerialization", true);
        setBooleanField(term38802, term38802.getClass(), "_stdBeanNaming", true);
        setField(term38802, term38802.getClass(), "_type", null);
        setField(term38805, term38805.getClass(), "_type", null);
        setField(term38805, term38805.getClass(), "_class", null);
        setField(term38805, term38805.getClass(), "_bindings", null);
        setField(term38805, term38805.getClass(), "_superTypes", null);
        setField(term38805, term38805.getClass(), "_annotationIntrospector", null);
        setField(term38805, term38805.getClass(), "_typeFactory", null);
        setField(term38805, term38805.getClass(), "_mixInResolver", null);
        setField(term38805, term38805.getClass(), "_primaryMixIn", null);
        setField(term38805, term38805.getClass(), "_classAnnotations", null);
        setBooleanField(term38805, term38805.getClass(), "_creatorsResolved", false);
        setField(term38805, term38805.getClass(), "_defaultConstructor", null);
        setField(term38805, term38805.getClass(), "_constructors", null);
        setField(term38805, term38805.getClass(), "_creatorMethods", null);
        setField(term38805, term38805.getClass(), "_memberMethods", null);
        setField(term38805, term38805.getClass(), "_fields", null);
        setField(term38805, term38805.getClass(), "_nonStaticInnerClass", null);
        setField(term38802, term38802.getClass(), "_classDef", term38805);
        setField(term38802, term38802.getClass(), "_visibilityChecker", null);
        setField(term38802, term38802.getClass(), "_annotationIntrospector", null);
        setField(term38802, term38802.getClass(), "_mutatorPrefix", "set");
        setBooleanField(term38802, term38802.getClass(), "_collected", false);
        setField(term38802, term38802.getClass(), "_properties", null);
        setField(term38802, term38802.getClass(), "_creatorProperties", null);
        setField(term38802, term38802.getClass(), "_anyGetters", null);
        setField(term38802, term38802.getClass(), "_anySetters", null);
        setField(term38802, term38802.getClass(), "_anySetterField", null);
        setField(term38802, term38802.getClass(), "_jsonValueGetters", null);
        setField(term38802, term38802.getClass(), "_ignoredPropertyNames", null);
        setField(term38802, term38802.getClass(), "_injectables", null);
        term38808 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term38809 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term38808, term38808.getClass(), "_problemHandlers", null);
        setField(term38808, term38808.getClass(), "_nodeFactory", null);
        setIntField(term38808, term38808.getClass(), "_deserFeatures", 0);
        setIntField(term38808, term38808.getClass(), "_parserFeatures", 0);
        setIntField(term38808, term38808.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term38808, term38808.getClass(), "_formatReadFeatures", 0);
        setIntField(term38808, term38808.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term38808, term38808.getClass(), "_mixIns", null);
        setField(term38808, term38808.getClass(), "_subtypeResolver", null);
        setField(term38808, term38808.getClass(), "_rootName", null);
        setField(term38808, term38808.getClass(), "_view", null);
        setField(term38808, term38808.getClass(), "_attributes", null);
        setField(term38808, term38808.getClass(), "_rootNames", null);
        setField(term38808, term38808.getClass(), "_configOverrides", null);
        setIntField(term38808, term38808.getClass(), "_mapperFeatures", -1);
        setField(term38809, term38809.getClass(), "_classIntrospector", null);
        setField(term38809, term38809.getClass(), "_annotationIntrospector", null);
        setField(term38809, term38809.getClass(), "_visibilityChecker", null);
        setField(term38809, term38809.getClass(), "_propertyNamingStrategy", null);
        setField(term38809, term38809.getClass(), "_typeFactory", null);
        setField(term38809, term38809.getClass(), "_typeResolverBuilder", null);
        setField(term38809, term38809.getClass(), "_dateFormat", null);
        setField(term38809, term38809.getClass(), "_handlerInstantiator", null);
        setField(term38809, term38809.getClass(), "_locale", null);
        setField(term38809, term38809.getClass(), "_timeZone", null);
        setField(term38809, term38809.getClass(), "_defaultBase64", null);
        setField(term38808, term38808.getClass(), "_base", term38809);
        term38810 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term38810, term38810.getClass(), "_type", null);
        setField(term38810, term38810.getClass(), "_class", null);
        setField(term38810, term38810.getClass(), "_bindings", null);
        setField(term38810, term38810.getClass(), "_superTypes", null);
        setField(term38810, term38810.getClass(), "_annotationIntrospector", null);
        setField(term38810, term38810.getClass(), "_typeFactory", null);
        setField(term38810, term38810.getClass(), "_mixInResolver", null);
        setField(term38810, term38810.getClass(), "_primaryMixIn", null);
        setField(term38810, term38810.getClass(), "_classAnnotations", null);
        setBooleanField(term38810, term38810.getClass(), "_creatorsResolved", false);
        setField(term38810, term38810.getClass(), "_defaultConstructor", null);
        setField(term38810, term38810.getClass(), "_constructors", null);
        setField(term38810, term38810.getClass(), "_creatorMethods", null);
        setField(term38810, term38810.getClass(), "_memberMethods", null);
        setField(term38810, term38810.getClass(), "_fields", null);
        setField(term38810, term38810.getClass(), "_nonStaticInnerClass", null);
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
        args[0] = term38316;
        args[1] = true;
        args[2] = null;
        args[3] = term38534;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term38802));
        assertTrue(recursiveEquals(term38316, term38808));
        assertTrue(recursiveEquals(term38534, term38810));
    }

};


