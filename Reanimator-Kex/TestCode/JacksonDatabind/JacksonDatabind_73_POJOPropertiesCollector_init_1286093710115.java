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

public class POJOPropertiesCollector_init_1286093710115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45455;
     Object term45821;
     Object term45826;

    public POJOPropertiesCollector_init_1286093710115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term45307 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        setField(term45307, term45307.getClass(), "_config", null);
        setBooleanField(term45307, term45307.getClass(), "_stdBeanNaming", false);
        setBooleanField(term45307, term45307.getClass(), "_forSerialization", false);
        setField(term45307, term45307.getClass(), "_type", null);
        setField(term45307, term45307.getClass(), "_classDef", null);
        setField(term45307, term45307.getClass(), "_mutatorPrefix", "");
        setField(term45307, term45307.getClass(), "_annotationIntrospector", null);
        term45455 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term45555 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setIntField(term45455, term45455.getClass(), "_mapperFeatures", -8388609);
        setField(term45555, term45555.getClass(), "_annotationIntrospector", null);
        setField(term45555, term45555.getClass(), "_visibilityChecker", null);
        setField(term45455, term45455.getClass(), "_base", term45555);
        term45821 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term45822 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term45823 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term45822, term45822.getClass(), "_problemHandlers", null);
        setField(term45822, term45822.getClass(), "_nodeFactory", null);
        setIntField(term45822, term45822.getClass(), "_deserFeatures", 0);
        setIntField(term45822, term45822.getClass(), "_parserFeatures", 0);
        setIntField(term45822, term45822.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term45822, term45822.getClass(), "_formatReadFeatures", 0);
        setIntField(term45822, term45822.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term45822, term45822.getClass(), "_mixIns", null);
        setField(term45822, term45822.getClass(), "_subtypeResolver", null);
        setField(term45822, term45822.getClass(), "_rootName", null);
        setField(term45822, term45822.getClass(), "_view", null);
        setField(term45822, term45822.getClass(), "_attributes", null);
        setField(term45822, term45822.getClass(), "_rootNames", null);
        setField(term45822, term45822.getClass(), "_configOverrides", null);
        setIntField(term45822, term45822.getClass(), "_mapperFeatures", -8388609);
        setField(term45823, term45823.getClass(), "_classIntrospector", null);
        setField(term45823, term45823.getClass(), "_annotationIntrospector", null);
        setField(term45823, term45823.getClass(), "_visibilityChecker", null);
        setField(term45823, term45823.getClass(), "_propertyNamingStrategy", null);
        setField(term45823, term45823.getClass(), "_typeFactory", null);
        setField(term45823, term45823.getClass(), "_typeResolverBuilder", null);
        setField(term45823, term45823.getClass(), "_dateFormat", null);
        setField(term45823, term45823.getClass(), "_handlerInstantiator", null);
        setField(term45823, term45823.getClass(), "_locale", null);
        setField(term45823, term45823.getClass(), "_timeZone", null);
        setField(term45823, term45823.getClass(), "_defaultBase64", null);
        setField(term45822, term45822.getClass(), "_base", term45823);
        setField(term45821, term45821.getClass(), "_config", term45822);
        setBooleanField(term45821, term45821.getClass(), "_forSerialization", true);
        setBooleanField(term45821, term45821.getClass(), "_stdBeanNaming", true);
        setField(term45821, term45821.getClass(), "_type", null);
        setField(term45821, term45821.getClass(), "_classDef", null);
        setField(term45821, term45821.getClass(), "_visibilityChecker", null);
        setField(term45821, term45821.getClass(), "_annotationIntrospector", null);
        setField(term45821, term45821.getClass(), "_mutatorPrefix", "set");
        setBooleanField(term45821, term45821.getClass(), "_collected", false);
        setField(term45821, term45821.getClass(), "_properties", null);
        setField(term45821, term45821.getClass(), "_creatorProperties", null);
        setField(term45821, term45821.getClass(), "_anyGetters", null);
        setField(term45821, term45821.getClass(), "_anySetters", null);
        setField(term45821, term45821.getClass(), "_anySetterField", null);
        setField(term45821, term45821.getClass(), "_jsonValueGetters", null);
        setField(term45821, term45821.getClass(), "_ignoredPropertyNames", null);
        setField(term45821, term45821.getClass(), "_injectables", null);
        term45826 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term45827 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term45826, term45826.getClass(), "_problemHandlers", null);
        setField(term45826, term45826.getClass(), "_nodeFactory", null);
        setIntField(term45826, term45826.getClass(), "_deserFeatures", 0);
        setIntField(term45826, term45826.getClass(), "_parserFeatures", 0);
        setIntField(term45826, term45826.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term45826, term45826.getClass(), "_formatReadFeatures", 0);
        setIntField(term45826, term45826.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term45826, term45826.getClass(), "_mixIns", null);
        setField(term45826, term45826.getClass(), "_subtypeResolver", null);
        setField(term45826, term45826.getClass(), "_rootName", null);
        setField(term45826, term45826.getClass(), "_view", null);
        setField(term45826, term45826.getClass(), "_attributes", null);
        setField(term45826, term45826.getClass(), "_rootNames", null);
        setField(term45826, term45826.getClass(), "_configOverrides", null);
        setIntField(term45826, term45826.getClass(), "_mapperFeatures", -8388609);
        setField(term45827, term45827.getClass(), "_classIntrospector", null);
        setField(term45827, term45827.getClass(), "_annotationIntrospector", null);
        setField(term45827, term45827.getClass(), "_visibilityChecker", null);
        setField(term45827, term45827.getClass(), "_propertyNamingStrategy", null);
        setField(term45827, term45827.getClass(), "_typeFactory", null);
        setField(term45827, term45827.getClass(), "_typeResolverBuilder", null);
        setField(term45827, term45827.getClass(), "_dateFormat", null);
        setField(term45827, term45827.getClass(), "_handlerInstantiator", null);
        setField(term45827, term45827.getClass(), "_locale", null);
        setField(term45827, term45827.getClass(), "_timeZone", null);
        setField(term45827, term45827.getClass(), "_defaultBase64", null);
        setField(term45826, term45826.getClass(), "_base", term45827);
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
        args[0] = term45455;
        args[1] = true;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term45821));
        assertTrue(recursiveEquals(term45455, term45826));
    }

};


