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

public class POJOPropertiesCollector_init_1286093710109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40118;
     Object term40635;
     Object term40641;

    public POJOPropertiesCollector_init_1286093710109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term39796 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term39902 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term40008 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term39796, term39796.getClass(), "_config", term39902);
        setBooleanField(term39796, term39796.getClass(), "_stdBeanNaming", false);
        setBooleanField(term39796, term39796.getClass(), "_forSerialization", false);
        setField(term39796, term39796.getClass(), "_type", term40008);
        setField(term39796, term39796.getClass(), "_classDef", null);
        setField(term39796, term39796.getClass(), "_mutatorPrefix", null);
        setField(term39796, term39796.getClass(), "_annotationIntrospector", null);
        term40118 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term40218 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term40362 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setIntField(term40118, term40118.getClass(), "_mapperFeatures", -1);
        setField(term40218, term40218.getClass(), "_annotationIntrospector", term40362);
        setField(term40118, term40118.getClass(), "_base", term40218);
        term40635 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term40636 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term40637 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term40638 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term40636, term40636.getClass(), "_problemHandlers", null);
        setField(term40636, term40636.getClass(), "_nodeFactory", null);
        setIntField(term40636, term40636.getClass(), "_deserFeatures", 0);
        setIntField(term40636, term40636.getClass(), "_parserFeatures", 0);
        setIntField(term40636, term40636.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term40636, term40636.getClass(), "_formatReadFeatures", 0);
        setIntField(term40636, term40636.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term40636, term40636.getClass(), "_mixIns", null);
        setField(term40636, term40636.getClass(), "_subtypeResolver", null);
        setField(term40636, term40636.getClass(), "_rootName", null);
        setField(term40636, term40636.getClass(), "_view", null);
        setField(term40636, term40636.getClass(), "_attributes", null);
        setField(term40636, term40636.getClass(), "_rootNames", null);
        setField(term40636, term40636.getClass(), "_configOverrides", null);
        setIntField(term40636, term40636.getClass(), "_mapperFeatures", -1);
        setField(term40637, term40637.getClass(), "_classIntrospector", null);
        setField(term40637, term40637.getClass(), "_annotationIntrospector", term40638);
        setField(term40637, term40637.getClass(), "_visibilityChecker", null);
        setField(term40637, term40637.getClass(), "_propertyNamingStrategy", null);
        setField(term40637, term40637.getClass(), "_typeFactory", null);
        setField(term40637, term40637.getClass(), "_typeResolverBuilder", null);
        setField(term40637, term40637.getClass(), "_dateFormat", null);
        setField(term40637, term40637.getClass(), "_handlerInstantiator", null);
        setField(term40637, term40637.getClass(), "_locale", null);
        setField(term40637, term40637.getClass(), "_timeZone", null);
        setField(term40637, term40637.getClass(), "_defaultBase64", null);
        setField(term40636, term40636.getClass(), "_base", term40637);
        setField(term40635, term40635.getClass(), "_config", term40636);
        setBooleanField(term40635, term40635.getClass(), "_forSerialization", true);
        setBooleanField(term40635, term40635.getClass(), "_stdBeanNaming", true);
        setField(term40635, term40635.getClass(), "_type", null);
        setField(term40635, term40635.getClass(), "_classDef", null);
        setField(term40635, term40635.getClass(), "_visibilityChecker", null);
        setField(term40635, term40635.getClass(), "_annotationIntrospector", term40638);
        setField(term40635, term40635.getClass(), "_mutatorPrefix", "set");
        setBooleanField(term40635, term40635.getClass(), "_collected", false);
        setField(term40635, term40635.getClass(), "_properties", null);
        setField(term40635, term40635.getClass(), "_creatorProperties", null);
        setField(term40635, term40635.getClass(), "_anyGetters", null);
        setField(term40635, term40635.getClass(), "_anySetters", null);
        setField(term40635, term40635.getClass(), "_anySetterField", null);
        setField(term40635, term40635.getClass(), "_jsonValueGetters", null);
        setField(term40635, term40635.getClass(), "_ignoredPropertyNames", null);
        setField(term40635, term40635.getClass(), "_injectables", null);
        term40641 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term40642 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term40643 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term40641, term40641.getClass(), "_problemHandlers", null);
        setField(term40641, term40641.getClass(), "_nodeFactory", null);
        setIntField(term40641, term40641.getClass(), "_deserFeatures", 0);
        setIntField(term40641, term40641.getClass(), "_parserFeatures", 0);
        setIntField(term40641, term40641.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term40641, term40641.getClass(), "_formatReadFeatures", 0);
        setIntField(term40641, term40641.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term40641, term40641.getClass(), "_mixIns", null);
        setField(term40641, term40641.getClass(), "_subtypeResolver", null);
        setField(term40641, term40641.getClass(), "_rootName", null);
        setField(term40641, term40641.getClass(), "_view", null);
        setField(term40641, term40641.getClass(), "_attributes", null);
        setField(term40641, term40641.getClass(), "_rootNames", null);
        setField(term40641, term40641.getClass(), "_configOverrides", null);
        setIntField(term40641, term40641.getClass(), "_mapperFeatures", -1);
        setField(term40642, term40642.getClass(), "_classIntrospector", null);
        setField(term40642, term40642.getClass(), "_annotationIntrospector", term40643);
        setField(term40642, term40642.getClass(), "_visibilityChecker", null);
        setField(term40642, term40642.getClass(), "_propertyNamingStrategy", null);
        setField(term40642, term40642.getClass(), "_typeFactory", null);
        setField(term40642, term40642.getClass(), "_typeResolverBuilder", null);
        setField(term40642, term40642.getClass(), "_dateFormat", null);
        setField(term40642, term40642.getClass(), "_handlerInstantiator", null);
        setField(term40642, term40642.getClass(), "_locale", null);
        setField(term40642, term40642.getClass(), "_timeZone", null);
        setField(term40642, term40642.getClass(), "_defaultBase64", null);
        setField(term40641, term40641.getClass(), "_base", term40642);
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
        args[0] = term40118;
        args[1] = true;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term40635));
        assertTrue(recursiveEquals(term40118, term40641));
    }

};


