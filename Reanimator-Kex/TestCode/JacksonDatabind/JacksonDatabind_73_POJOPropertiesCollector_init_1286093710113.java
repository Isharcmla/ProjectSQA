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

public class POJOPropertiesCollector_init_1286093710113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43737;
     Object term44278;
     Object term44284;

    public POJOPropertiesCollector_init_1286093710113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term43521 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term43627 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term43521, term43521.getClass(), "_config", term43627);
        setBooleanField(term43521, term43521.getClass(), "_stdBeanNaming", false);
        setBooleanField(term43521, term43521.getClass(), "_forSerialization", false);
        setField(term43521, term43521.getClass(), "_type", null);
        setField(term43521, term43521.getClass(), "_classDef", null);
        setField(term43521, term43521.getClass(), "_mutatorPrefix", null);
        setField(term43521, term43521.getClass(), "_annotationIntrospector", null);
        term43737 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term43837 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term43969 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std"));
        setIntField(term43737, term43737.getClass(), "_mapperFeatures", -1);
        setField(term43837, term43837.getClass(), "_annotationIntrospector", null);
        setField(term43837, term43837.getClass(), "_visibilityChecker", term43969);
        setField(term43737, term43737.getClass(), "_base", term43837);
        term44278 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term44279 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term44280 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term44281 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std"));
        setField(term44279, term44279.getClass(), "_problemHandlers", null);
        setField(term44279, term44279.getClass(), "_nodeFactory", null);
        setIntField(term44279, term44279.getClass(), "_deserFeatures", 0);
        setIntField(term44279, term44279.getClass(), "_parserFeatures", 0);
        setIntField(term44279, term44279.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term44279, term44279.getClass(), "_formatReadFeatures", 0);
        setIntField(term44279, term44279.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term44279, term44279.getClass(), "_mixIns", null);
        setField(term44279, term44279.getClass(), "_subtypeResolver", null);
        setField(term44279, term44279.getClass(), "_rootName", null);
        setField(term44279, term44279.getClass(), "_view", null);
        setField(term44279, term44279.getClass(), "_attributes", null);
        setField(term44279, term44279.getClass(), "_rootNames", null);
        setField(term44279, term44279.getClass(), "_configOverrides", null);
        setIntField(term44279, term44279.getClass(), "_mapperFeatures", -1);
        setField(term44280, term44280.getClass(), "_classIntrospector", null);
        setField(term44280, term44280.getClass(), "_annotationIntrospector", null);
        setField(term44281, term44281.getClass(), "_getterMinLevel", null);
        setField(term44281, term44281.getClass(), "_isGetterMinLevel", null);
        setField(term44281, term44281.getClass(), "_setterMinLevel", null);
        setField(term44281, term44281.getClass(), "_creatorMinLevel", null);
        setField(term44281, term44281.getClass(), "_fieldMinLevel", null);
        setField(term44280, term44280.getClass(), "_visibilityChecker", term44281);
        setField(term44280, term44280.getClass(), "_propertyNamingStrategy", null);
        setField(term44280, term44280.getClass(), "_typeFactory", null);
        setField(term44280, term44280.getClass(), "_typeResolverBuilder", null);
        setField(term44280, term44280.getClass(), "_dateFormat", null);
        setField(term44280, term44280.getClass(), "_handlerInstantiator", null);
        setField(term44280, term44280.getClass(), "_locale", null);
        setField(term44280, term44280.getClass(), "_timeZone", null);
        setField(term44280, term44280.getClass(), "_defaultBase64", null);
        setField(term44279, term44279.getClass(), "_base", term44280);
        setField(term44278, term44278.getClass(), "_config", term44279);
        setBooleanField(term44278, term44278.getClass(), "_forSerialization", true);
        setBooleanField(term44278, term44278.getClass(), "_stdBeanNaming", true);
        setField(term44278, term44278.getClass(), "_type", null);
        setField(term44278, term44278.getClass(), "_classDef", null);
        setField(term44278, term44278.getClass(), "_visibilityChecker", term44281);
        setField(term44278, term44278.getClass(), "_annotationIntrospector", null);
        setField(term44278, term44278.getClass(), "_mutatorPrefix", "");
        setBooleanField(term44278, term44278.getClass(), "_collected", false);
        setField(term44278, term44278.getClass(), "_properties", null);
        setField(term44278, term44278.getClass(), "_creatorProperties", null);
        setField(term44278, term44278.getClass(), "_anyGetters", null);
        setField(term44278, term44278.getClass(), "_anySetters", null);
        setField(term44278, term44278.getClass(), "_anySetterField", null);
        setField(term44278, term44278.getClass(), "_jsonValueGetters", null);
        setField(term44278, term44278.getClass(), "_ignoredPropertyNames", null);
        setField(term44278, term44278.getClass(), "_injectables", null);
        term44284 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term44285 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term44286 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std"));
        setField(term44284, term44284.getClass(), "_problemHandlers", null);
        setField(term44284, term44284.getClass(), "_nodeFactory", null);
        setIntField(term44284, term44284.getClass(), "_deserFeatures", 0);
        setIntField(term44284, term44284.getClass(), "_parserFeatures", 0);
        setIntField(term44284, term44284.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term44284, term44284.getClass(), "_formatReadFeatures", 0);
        setIntField(term44284, term44284.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term44284, term44284.getClass(), "_mixIns", null);
        setField(term44284, term44284.getClass(), "_subtypeResolver", null);
        setField(term44284, term44284.getClass(), "_rootName", null);
        setField(term44284, term44284.getClass(), "_view", null);
        setField(term44284, term44284.getClass(), "_attributes", null);
        setField(term44284, term44284.getClass(), "_rootNames", null);
        setField(term44284, term44284.getClass(), "_configOverrides", null);
        setIntField(term44284, term44284.getClass(), "_mapperFeatures", -1);
        setField(term44285, term44285.getClass(), "_classIntrospector", null);
        setField(term44285, term44285.getClass(), "_annotationIntrospector", null);
        setField(term44286, term44286.getClass(), "_getterMinLevel", null);
        setField(term44286, term44286.getClass(), "_isGetterMinLevel", null);
        setField(term44286, term44286.getClass(), "_setterMinLevel", null);
        setField(term44286, term44286.getClass(), "_creatorMinLevel", null);
        setField(term44286, term44286.getClass(), "_fieldMinLevel", null);
        setField(term44285, term44285.getClass(), "_visibilityChecker", term44286);
        setField(term44285, term44285.getClass(), "_propertyNamingStrategy", null);
        setField(term44285, term44285.getClass(), "_typeFactory", null);
        setField(term44285, term44285.getClass(), "_typeResolverBuilder", null);
        setField(term44285, term44285.getClass(), "_dateFormat", null);
        setField(term44285, term44285.getClass(), "_handlerInstantiator", null);
        setField(term44285, term44285.getClass(), "_locale", null);
        setField(term44285, term44285.getClass(), "_timeZone", null);
        setField(term44285, term44285.getClass(), "_defaultBase64", null);
        setField(term44284, term44284.getClass(), "_base", term44285);
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
        args[0] = term43737;
        args[1] = true;
        args[2] = null;
        args[3] = null;
        args[4] = "";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term44278));
        assertTrue(recursiveEquals(term43737, term44284));
    }

};


