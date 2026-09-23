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

public class POJOPropertiesCollector_init_1286093710129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60893;
     Object term61259;
     Object term61929;
     Object term61937;
     Object term61940;

    public POJOPropertiesCollector_init_1286093710129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term60627 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term60745 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term60627, term60627.getClass(), "_config", null);
        setBooleanField(term60627, term60627.getClass(), "_stdBeanNaming", false);
        setBooleanField(term60627, term60627.getClass(), "_forSerialization", false);
        setField(term60627, term60627.getClass(), "_type", null);
        setField(term60627, term60627.getClass(), "_classDef", term60745);
        setField(term60627, term60627.getClass(), "_mutatorPrefix", "");
        setField(term60627, term60627.getClass(), "_annotationIntrospector", null);
        term60893 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term60993 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term61141 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setIntField(term60893, term60893.getClass(), "_mapperFeatures", -1);
        setField(term60993, term60993.getClass(), "_annotationIntrospector", term61141);
        setField(term60993, term60993.getClass(), "_visibilityChecker", null);
        setField(term60893, term60893.getClass(), "_base", term60993);
        term61259 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        term61929 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term61930 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term61931 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term61932 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term61933 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term61934 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term61930, term61930.getClass(), "_problemHandlers", null);
        setField(term61930, term61930.getClass(), "_nodeFactory", null);
        setIntField(term61930, term61930.getClass(), "_deserFeatures", 0);
        setIntField(term61930, term61930.getClass(), "_parserFeatures", 0);
        setIntField(term61930, term61930.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term61930, term61930.getClass(), "_formatReadFeatures", 0);
        setIntField(term61930, term61930.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term61930, term61930.getClass(), "_mixIns", null);
        setField(term61930, term61930.getClass(), "_subtypeResolver", null);
        setField(term61930, term61930.getClass(), "_rootName", null);
        setField(term61930, term61930.getClass(), "_view", null);
        setField(term61930, term61930.getClass(), "_attributes", null);
        setField(term61930, term61930.getClass(), "_rootNames", null);
        setField(term61930, term61930.getClass(), "_configOverrides", null);
        setIntField(term61930, term61930.getClass(), "_mapperFeatures", -1);
        setField(term61931, term61931.getClass(), "_classIntrospector", null);
        setField(term61932, term61932.getClass(), "_annotationsInside", null);
        setBooleanField(term61932, term61932.getClass(), "_cfgConstructorPropertiesImpliesCreator", false);
        setField(term61931, term61931.getClass(), "_annotationIntrospector", term61932);
        setField(term61931, term61931.getClass(), "_visibilityChecker", null);
        setField(term61931, term61931.getClass(), "_propertyNamingStrategy", null);
        setField(term61931, term61931.getClass(), "_typeFactory", null);
        setField(term61931, term61931.getClass(), "_typeResolverBuilder", null);
        setField(term61931, term61931.getClass(), "_dateFormat", null);
        setField(term61931, term61931.getClass(), "_handlerInstantiator", null);
        setField(term61931, term61931.getClass(), "_locale", null);
        setField(term61931, term61931.getClass(), "_timeZone", null);
        setField(term61931, term61931.getClass(), "_defaultBase64", null);
        setField(term61930, term61930.getClass(), "_base", term61931);
        setField(term61929, term61929.getClass(), "_config", term61930);
        setBooleanField(term61929, term61929.getClass(), "_forSerialization", true);
        setBooleanField(term61929, term61929.getClass(), "_stdBeanNaming", true);
        setField(term61929, term61929.getClass(), "_type", null);
        setField(term61933, term61933.getClass(), "_type", null);
        setField(term61933, term61933.getClass(), "_class", null);
        setField(term61933, term61933.getClass(), "_bindings", null);
        setField(term61933, term61933.getClass(), "_superTypes", null);
        setField(term61933, term61933.getClass(), "_annotationIntrospector", null);
        setField(term61933, term61933.getClass(), "_typeFactory", null);
        setField(term61933, term61933.getClass(), "_mixInResolver", null);
        setField(term61933, term61933.getClass(), "_primaryMixIn", null);
        setField(term61934, term61934.getClass(), "_annotations", null);
        setField(term61933, term61933.getClass(), "_classAnnotations", term61934);
        setBooleanField(term61933, term61933.getClass(), "_creatorsResolved", false);
        setField(term61933, term61933.getClass(), "_defaultConstructor", null);
        setField(term61933, term61933.getClass(), "_constructors", null);
        setField(term61933, term61933.getClass(), "_creatorMethods", null);
        setField(term61933, term61933.getClass(), "_memberMethods", null);
        setField(term61933, term61933.getClass(), "_fields", null);
        setField(term61933, term61933.getClass(), "_nonStaticInnerClass", null);
        setField(term61929, term61929.getClass(), "_classDef", term61933);
        setField(term61929, term61929.getClass(), "_visibilityChecker", null);
        setField(term61929, term61929.getClass(), "_annotationIntrospector", term61932);
        setField(term61929, term61929.getClass(), "_mutatorPrefix", "set");
        setBooleanField(term61929, term61929.getClass(), "_collected", false);
        setField(term61929, term61929.getClass(), "_properties", null);
        setField(term61929, term61929.getClass(), "_creatorProperties", null);
        setField(term61929, term61929.getClass(), "_anyGetters", null);
        setField(term61929, term61929.getClass(), "_anySetters", null);
        setField(term61929, term61929.getClass(), "_anySetterField", null);
        setField(term61929, term61929.getClass(), "_jsonValueGetters", null);
        setField(term61929, term61929.getClass(), "_ignoredPropertyNames", null);
        setField(term61929, term61929.getClass(), "_injectables", null);
        term61937 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term61938 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term61939 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term61937, term61937.getClass(), "_problemHandlers", null);
        setField(term61937, term61937.getClass(), "_nodeFactory", null);
        setIntField(term61937, term61937.getClass(), "_deserFeatures", 0);
        setIntField(term61937, term61937.getClass(), "_parserFeatures", 0);
        setIntField(term61937, term61937.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term61937, term61937.getClass(), "_formatReadFeatures", 0);
        setIntField(term61937, term61937.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term61937, term61937.getClass(), "_mixIns", null);
        setField(term61937, term61937.getClass(), "_subtypeResolver", null);
        setField(term61937, term61937.getClass(), "_rootName", null);
        setField(term61937, term61937.getClass(), "_view", null);
        setField(term61937, term61937.getClass(), "_attributes", null);
        setField(term61937, term61937.getClass(), "_rootNames", null);
        setField(term61937, term61937.getClass(), "_configOverrides", null);
        setIntField(term61937, term61937.getClass(), "_mapperFeatures", -1);
        setField(term61938, term61938.getClass(), "_classIntrospector", null);
        setField(term61939, term61939.getClass(), "_annotationsInside", null);
        setBooleanField(term61939, term61939.getClass(), "_cfgConstructorPropertiesImpliesCreator", false);
        setField(term61938, term61938.getClass(), "_annotationIntrospector", term61939);
        setField(term61938, term61938.getClass(), "_visibilityChecker", null);
        setField(term61938, term61938.getClass(), "_propertyNamingStrategy", null);
        setField(term61938, term61938.getClass(), "_typeFactory", null);
        setField(term61938, term61938.getClass(), "_typeResolverBuilder", null);
        setField(term61938, term61938.getClass(), "_dateFormat", null);
        setField(term61938, term61938.getClass(), "_handlerInstantiator", null);
        setField(term61938, term61938.getClass(), "_locale", null);
        setField(term61938, term61938.getClass(), "_timeZone", null);
        setField(term61938, term61938.getClass(), "_defaultBase64", null);
        setField(term61937, term61937.getClass(), "_base", term61938);
        term61940 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term61941 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term61940, term61940.getClass(), "_type", null);
        setField(term61940, term61940.getClass(), "_class", null);
        setField(term61940, term61940.getClass(), "_bindings", null);
        setField(term61940, term61940.getClass(), "_superTypes", null);
        setField(term61940, term61940.getClass(), "_annotationIntrospector", null);
        setField(term61940, term61940.getClass(), "_typeFactory", null);
        setField(term61940, term61940.getClass(), "_mixInResolver", null);
        setField(term61940, term61940.getClass(), "_primaryMixIn", null);
        setField(term61941, term61941.getClass(), "_annotations", null);
        setField(term61940, term61940.getClass(), "_classAnnotations", term61941);
        setBooleanField(term61940, term61940.getClass(), "_creatorsResolved", false);
        setField(term61940, term61940.getClass(), "_defaultConstructor", null);
        setField(term61940, term61940.getClass(), "_constructors", null);
        setField(term61940, term61940.getClass(), "_creatorMethods", null);
        setField(term61940, term61940.getClass(), "_memberMethods", null);
        setField(term61940, term61940.getClass(), "_fields", null);
        setField(term61940, term61940.getClass(), "_nonStaticInnerClass", null);
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
        args[0] = term60893;
        args[1] = true;
        args[2] = null;
        args[3] = term61259;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term61929));
        assertTrue(recursiveEquals(term60893, term61937));
        assertTrue(recursiveEquals(term61259, null));
    }

};


