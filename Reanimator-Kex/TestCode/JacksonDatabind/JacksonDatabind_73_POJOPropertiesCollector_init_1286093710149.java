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

public class POJOPropertiesCollector_init_1286093710149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83491;
     Object term83709;
     Object term83977;
     Object term83983;
     Object term83985;

    public POJOPropertiesCollector_init_1286093710149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term82971 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term83081 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term83199 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term83381 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term82971, term82971.getClass(), "_config", term83081);
        setBooleanField(term82971, term82971.getClass(), "_stdBeanNaming", false);
        setBooleanField(term82971, term82971.getClass(), "_forSerialization", false);
        setField(term82971, term82971.getClass(), "_type", null);
        setField(term82971, term82971.getClass(), "_classDef", term83199);
        setField(term82971, term82971.getClass(), "_mutatorPrefix", "");
        setField(term82971, term82971.getClass(), "_annotationIntrospector", term83381);
        term83491 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term83591 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setIntField(term83491, term83491.getClass(), "_mapperFeatures", -1);
        setField(term83591, term83591.getClass(), "_visibilityChecker", null);
        setField(term83491, term83491.getClass(), "_base", term83591);
        term83709 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        term83977 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term83978 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term83979 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term83980 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term83978, term83978.getClass(), "_problemHandlers", null);
        setField(term83978, term83978.getClass(), "_nodeFactory", null);
        setIntField(term83978, term83978.getClass(), "_deserFeatures", 0);
        setIntField(term83978, term83978.getClass(), "_parserFeatures", 0);
        setIntField(term83978, term83978.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term83978, term83978.getClass(), "_formatReadFeatures", 0);
        setIntField(term83978, term83978.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term83978, term83978.getClass(), "_mixIns", null);
        setField(term83978, term83978.getClass(), "_subtypeResolver", null);
        setField(term83978, term83978.getClass(), "_rootName", null);
        setField(term83978, term83978.getClass(), "_view", null);
        setField(term83978, term83978.getClass(), "_attributes", null);
        setField(term83978, term83978.getClass(), "_rootNames", null);
        setField(term83978, term83978.getClass(), "_configOverrides", null);
        setIntField(term83978, term83978.getClass(), "_mapperFeatures", -1);
        setField(term83979, term83979.getClass(), "_classIntrospector", null);
        setField(term83979, term83979.getClass(), "_annotationIntrospector", null);
        setField(term83979, term83979.getClass(), "_visibilityChecker", null);
        setField(term83979, term83979.getClass(), "_propertyNamingStrategy", null);
        setField(term83979, term83979.getClass(), "_typeFactory", null);
        setField(term83979, term83979.getClass(), "_typeResolverBuilder", null);
        setField(term83979, term83979.getClass(), "_dateFormat", null);
        setField(term83979, term83979.getClass(), "_handlerInstantiator", null);
        setField(term83979, term83979.getClass(), "_locale", null);
        setField(term83979, term83979.getClass(), "_timeZone", null);
        setField(term83979, term83979.getClass(), "_defaultBase64", null);
        setField(term83978, term83978.getClass(), "_base", term83979);
        setField(term83977, term83977.getClass(), "_config", term83978);
        setBooleanField(term83977, term83977.getClass(), "_forSerialization", true);
        setBooleanField(term83977, term83977.getClass(), "_stdBeanNaming", true);
        setField(term83977, term83977.getClass(), "_type", null);
        setField(term83980, term83980.getClass(), "_type", null);
        setField(term83980, term83980.getClass(), "_class", null);
        setField(term83980, term83980.getClass(), "_bindings", null);
        setField(term83980, term83980.getClass(), "_superTypes", null);
        setField(term83980, term83980.getClass(), "_annotationIntrospector", null);
        setField(term83980, term83980.getClass(), "_typeFactory", null);
        setField(term83980, term83980.getClass(), "_mixInResolver", null);
        setField(term83980, term83980.getClass(), "_primaryMixIn", null);
        setField(term83980, term83980.getClass(), "_classAnnotations", null);
        setBooleanField(term83980, term83980.getClass(), "_creatorsResolved", false);
        setField(term83980, term83980.getClass(), "_defaultConstructor", null);
        setField(term83980, term83980.getClass(), "_constructors", null);
        setField(term83980, term83980.getClass(), "_creatorMethods", null);
        setField(term83980, term83980.getClass(), "_memberMethods", null);
        setField(term83980, term83980.getClass(), "_fields", null);
        setField(term83980, term83980.getClass(), "_nonStaticInnerClass", null);
        setField(term83977, term83977.getClass(), "_classDef", term83980);
        setField(term83977, term83977.getClass(), "_visibilityChecker", null);
        setField(term83977, term83977.getClass(), "_annotationIntrospector", null);
        setField(term83977, term83977.getClass(), "_mutatorPrefix", "set");
        setBooleanField(term83977, term83977.getClass(), "_collected", false);
        setField(term83977, term83977.getClass(), "_properties", null);
        setField(term83977, term83977.getClass(), "_creatorProperties", null);
        setField(term83977, term83977.getClass(), "_anyGetters", null);
        setField(term83977, term83977.getClass(), "_anySetters", null);
        setField(term83977, term83977.getClass(), "_anySetterField", null);
        setField(term83977, term83977.getClass(), "_jsonValueGetters", null);
        setField(term83977, term83977.getClass(), "_ignoredPropertyNames", null);
        setField(term83977, term83977.getClass(), "_injectables", null);
        term83983 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term83984 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term83983, term83983.getClass(), "_problemHandlers", null);
        setField(term83983, term83983.getClass(), "_nodeFactory", null);
        setIntField(term83983, term83983.getClass(), "_deserFeatures", 0);
        setIntField(term83983, term83983.getClass(), "_parserFeatures", 0);
        setIntField(term83983, term83983.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term83983, term83983.getClass(), "_formatReadFeatures", 0);
        setIntField(term83983, term83983.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term83983, term83983.getClass(), "_mixIns", null);
        setField(term83983, term83983.getClass(), "_subtypeResolver", null);
        setField(term83983, term83983.getClass(), "_rootName", null);
        setField(term83983, term83983.getClass(), "_view", null);
        setField(term83983, term83983.getClass(), "_attributes", null);
        setField(term83983, term83983.getClass(), "_rootNames", null);
        setField(term83983, term83983.getClass(), "_configOverrides", null);
        setIntField(term83983, term83983.getClass(), "_mapperFeatures", -1);
        setField(term83984, term83984.getClass(), "_classIntrospector", null);
        setField(term83984, term83984.getClass(), "_annotationIntrospector", null);
        setField(term83984, term83984.getClass(), "_visibilityChecker", null);
        setField(term83984, term83984.getClass(), "_propertyNamingStrategy", null);
        setField(term83984, term83984.getClass(), "_typeFactory", null);
        setField(term83984, term83984.getClass(), "_typeResolverBuilder", null);
        setField(term83984, term83984.getClass(), "_dateFormat", null);
        setField(term83984, term83984.getClass(), "_handlerInstantiator", null);
        setField(term83984, term83984.getClass(), "_locale", null);
        setField(term83984, term83984.getClass(), "_timeZone", null);
        setField(term83984, term83984.getClass(), "_defaultBase64", null);
        setField(term83983, term83983.getClass(), "_base", term83984);
        term83985 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term83985, term83985.getClass(), "_type", null);
        setField(term83985, term83985.getClass(), "_class", null);
        setField(term83985, term83985.getClass(), "_bindings", null);
        setField(term83985, term83985.getClass(), "_superTypes", null);
        setField(term83985, term83985.getClass(), "_annotationIntrospector", null);
        setField(term83985, term83985.getClass(), "_typeFactory", null);
        setField(term83985, term83985.getClass(), "_mixInResolver", null);
        setField(term83985, term83985.getClass(), "_primaryMixIn", null);
        setField(term83985, term83985.getClass(), "_classAnnotations", null);
        setBooleanField(term83985, term83985.getClass(), "_creatorsResolved", false);
        setField(term83985, term83985.getClass(), "_defaultConstructor", null);
        setField(term83985, term83985.getClass(), "_constructors", null);
        setField(term83985, term83985.getClass(), "_creatorMethods", null);
        setField(term83985, term83985.getClass(), "_memberMethods", null);
        setField(term83985, term83985.getClass(), "_fields", null);
        setField(term83985, term83985.getClass(), "_nonStaticInnerClass", null);
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
        args[0] = term83491;
        args[1] = true;
        args[2] = null;
        args[3] = term83709;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term83977));
        assertTrue(recursiveEquals(term83491, term83983));
        assertTrue(recursiveEquals(term83709, term83985));
    }

};


