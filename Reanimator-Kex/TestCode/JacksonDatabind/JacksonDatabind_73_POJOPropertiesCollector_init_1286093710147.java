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

public class POJOPropertiesCollector_init_1286093710147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81438;
     Object term81656;
     Object term81924;
     Object term81930;
     Object term81932;

    public POJOPropertiesCollector_init_1286093710147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term81218 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term81328 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term81218, term81218.getClass(), "_config", term81328);
        setBooleanField(term81218, term81218.getClass(), "_stdBeanNaming", false);
        setBooleanField(term81218, term81218.getClass(), "_forSerialization", false);
        setField(term81218, term81218.getClass(), "_type", null);
        setField(term81218, term81218.getClass(), "_classDef", null);
        setField(term81218, term81218.getClass(), "_mutatorPrefix", null);
        term81438 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term81538 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setIntField(term81438, term81438.getClass(), "_mapperFeatures", -1);
        setField(term81438, term81438.getClass(), "_base", term81538);
        term81656 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        term81924 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term81925 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term81926 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term81927 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term81925, term81925.getClass(), "_problemHandlers", null);
        setField(term81925, term81925.getClass(), "_nodeFactory", null);
        setIntField(term81925, term81925.getClass(), "_deserFeatures", 0);
        setIntField(term81925, term81925.getClass(), "_parserFeatures", 0);
        setIntField(term81925, term81925.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term81925, term81925.getClass(), "_formatReadFeatures", 0);
        setIntField(term81925, term81925.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term81925, term81925.getClass(), "_mixIns", null);
        setField(term81925, term81925.getClass(), "_subtypeResolver", null);
        setField(term81925, term81925.getClass(), "_rootName", null);
        setField(term81925, term81925.getClass(), "_view", null);
        setField(term81925, term81925.getClass(), "_attributes", null);
        setField(term81925, term81925.getClass(), "_rootNames", null);
        setField(term81925, term81925.getClass(), "_configOverrides", null);
        setIntField(term81925, term81925.getClass(), "_mapperFeatures", -1);
        setField(term81926, term81926.getClass(), "_classIntrospector", null);
        setField(term81926, term81926.getClass(), "_annotationIntrospector", null);
        setField(term81926, term81926.getClass(), "_visibilityChecker", null);
        setField(term81926, term81926.getClass(), "_propertyNamingStrategy", null);
        setField(term81926, term81926.getClass(), "_typeFactory", null);
        setField(term81926, term81926.getClass(), "_typeResolverBuilder", null);
        setField(term81926, term81926.getClass(), "_dateFormat", null);
        setField(term81926, term81926.getClass(), "_handlerInstantiator", null);
        setField(term81926, term81926.getClass(), "_locale", null);
        setField(term81926, term81926.getClass(), "_timeZone", null);
        setField(term81926, term81926.getClass(), "_defaultBase64", null);
        setField(term81925, term81925.getClass(), "_base", term81926);
        setField(term81924, term81924.getClass(), "_config", term81925);
        setBooleanField(term81924, term81924.getClass(), "_forSerialization", true);
        setBooleanField(term81924, term81924.getClass(), "_stdBeanNaming", true);
        setField(term81924, term81924.getClass(), "_type", null);
        setField(term81927, term81927.getClass(), "_type", null);
        setField(term81927, term81927.getClass(), "_class", null);
        setField(term81927, term81927.getClass(), "_bindings", null);
        setField(term81927, term81927.getClass(), "_superTypes", null);
        setField(term81927, term81927.getClass(), "_annotationIntrospector", null);
        setField(term81927, term81927.getClass(), "_typeFactory", null);
        setField(term81927, term81927.getClass(), "_mixInResolver", null);
        setField(term81927, term81927.getClass(), "_primaryMixIn", null);
        setField(term81927, term81927.getClass(), "_classAnnotations", null);
        setBooleanField(term81927, term81927.getClass(), "_creatorsResolved", false);
        setField(term81927, term81927.getClass(), "_defaultConstructor", null);
        setField(term81927, term81927.getClass(), "_constructors", null);
        setField(term81927, term81927.getClass(), "_creatorMethods", null);
        setField(term81927, term81927.getClass(), "_memberMethods", null);
        setField(term81927, term81927.getClass(), "_fields", null);
        setField(term81927, term81927.getClass(), "_nonStaticInnerClass", null);
        setField(term81924, term81924.getClass(), "_classDef", term81927);
        setField(term81924, term81924.getClass(), "_visibilityChecker", null);
        setField(term81924, term81924.getClass(), "_annotationIntrospector", null);
        setField(term81924, term81924.getClass(), "_mutatorPrefix", "set");
        setBooleanField(term81924, term81924.getClass(), "_collected", false);
        setField(term81924, term81924.getClass(), "_properties", null);
        setField(term81924, term81924.getClass(), "_creatorProperties", null);
        setField(term81924, term81924.getClass(), "_anyGetters", null);
        setField(term81924, term81924.getClass(), "_anySetters", null);
        setField(term81924, term81924.getClass(), "_anySetterField", null);
        setField(term81924, term81924.getClass(), "_jsonValueGetters", null);
        setField(term81924, term81924.getClass(), "_ignoredPropertyNames", null);
        setField(term81924, term81924.getClass(), "_injectables", null);
        term81930 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term81931 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term81930, term81930.getClass(), "_problemHandlers", null);
        setField(term81930, term81930.getClass(), "_nodeFactory", null);
        setIntField(term81930, term81930.getClass(), "_deserFeatures", 0);
        setIntField(term81930, term81930.getClass(), "_parserFeatures", 0);
        setIntField(term81930, term81930.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term81930, term81930.getClass(), "_formatReadFeatures", 0);
        setIntField(term81930, term81930.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term81930, term81930.getClass(), "_mixIns", null);
        setField(term81930, term81930.getClass(), "_subtypeResolver", null);
        setField(term81930, term81930.getClass(), "_rootName", null);
        setField(term81930, term81930.getClass(), "_view", null);
        setField(term81930, term81930.getClass(), "_attributes", null);
        setField(term81930, term81930.getClass(), "_rootNames", null);
        setField(term81930, term81930.getClass(), "_configOverrides", null);
        setIntField(term81930, term81930.getClass(), "_mapperFeatures", -1);
        setField(term81931, term81931.getClass(), "_classIntrospector", null);
        setField(term81931, term81931.getClass(), "_annotationIntrospector", null);
        setField(term81931, term81931.getClass(), "_visibilityChecker", null);
        setField(term81931, term81931.getClass(), "_propertyNamingStrategy", null);
        setField(term81931, term81931.getClass(), "_typeFactory", null);
        setField(term81931, term81931.getClass(), "_typeResolverBuilder", null);
        setField(term81931, term81931.getClass(), "_dateFormat", null);
        setField(term81931, term81931.getClass(), "_handlerInstantiator", null);
        setField(term81931, term81931.getClass(), "_locale", null);
        setField(term81931, term81931.getClass(), "_timeZone", null);
        setField(term81931, term81931.getClass(), "_defaultBase64", null);
        setField(term81930, term81930.getClass(), "_base", term81931);
        term81932 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term81932, term81932.getClass(), "_type", null);
        setField(term81932, term81932.getClass(), "_class", null);
        setField(term81932, term81932.getClass(), "_bindings", null);
        setField(term81932, term81932.getClass(), "_superTypes", null);
        setField(term81932, term81932.getClass(), "_annotationIntrospector", null);
        setField(term81932, term81932.getClass(), "_typeFactory", null);
        setField(term81932, term81932.getClass(), "_mixInResolver", null);
        setField(term81932, term81932.getClass(), "_primaryMixIn", null);
        setField(term81932, term81932.getClass(), "_classAnnotations", null);
        setBooleanField(term81932, term81932.getClass(), "_creatorsResolved", false);
        setField(term81932, term81932.getClass(), "_defaultConstructor", null);
        setField(term81932, term81932.getClass(), "_constructors", null);
        setField(term81932, term81932.getClass(), "_creatorMethods", null);
        setField(term81932, term81932.getClass(), "_memberMethods", null);
        setField(term81932, term81932.getClass(), "_fields", null);
        setField(term81932, term81932.getClass(), "_nonStaticInnerClass", null);
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
        args[0] = term81438;
        args[1] = true;
        args[2] = null;
        args[3] = term81656;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term81924));
        assertTrue(recursiveEquals(term81438, term81930));
        assertTrue(recursiveEquals(term81656, term81932));
    }

};


