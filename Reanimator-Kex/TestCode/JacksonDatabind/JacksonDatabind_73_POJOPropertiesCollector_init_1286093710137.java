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

public class POJOPropertiesCollector_init_1286093710137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70611;
     Object term70977;
     Object term70982;

    public POJOPropertiesCollector_init_1286093710137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term70403 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term70501 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term70403, term70403.getClass(), "_config", null);
        setBooleanField(term70403, term70403.getClass(), "_stdBeanNaming", false);
        setBooleanField(term70403, term70403.getClass(), "_forSerialization", false);
        setField(term70403, term70403.getClass(), "_type", term70501);
        setField(term70403, term70403.getClass(), "_classDef", null);
        setField(term70403, term70403.getClass(), "_mutatorPrefix", null);
        setField(term70403, term70403.getClass(), "_annotationIntrospector", null);
        term70611 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term70711 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setIntField(term70611, term70611.getClass(), "_mapperFeatures", -1);
        setField(term70711, term70711.getClass(), "_visibilityChecker", null);
        setField(term70611, term70611.getClass(), "_base", term70711);
        term70977 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term70978 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term70979 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term70978, term70978.getClass(), "_problemHandlers", null);
        setField(term70978, term70978.getClass(), "_nodeFactory", null);
        setIntField(term70978, term70978.getClass(), "_deserFeatures", 0);
        setIntField(term70978, term70978.getClass(), "_parserFeatures", 0);
        setIntField(term70978, term70978.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term70978, term70978.getClass(), "_formatReadFeatures", 0);
        setIntField(term70978, term70978.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term70978, term70978.getClass(), "_mixIns", null);
        setField(term70978, term70978.getClass(), "_subtypeResolver", null);
        setField(term70978, term70978.getClass(), "_rootName", null);
        setField(term70978, term70978.getClass(), "_view", null);
        setField(term70978, term70978.getClass(), "_attributes", null);
        setField(term70978, term70978.getClass(), "_rootNames", null);
        setField(term70978, term70978.getClass(), "_configOverrides", null);
        setIntField(term70978, term70978.getClass(), "_mapperFeatures", -1);
        setField(term70979, term70979.getClass(), "_classIntrospector", null);
        setField(term70979, term70979.getClass(), "_annotationIntrospector", null);
        setField(term70979, term70979.getClass(), "_visibilityChecker", null);
        setField(term70979, term70979.getClass(), "_propertyNamingStrategy", null);
        setField(term70979, term70979.getClass(), "_typeFactory", null);
        setField(term70979, term70979.getClass(), "_typeResolverBuilder", null);
        setField(term70979, term70979.getClass(), "_dateFormat", null);
        setField(term70979, term70979.getClass(), "_handlerInstantiator", null);
        setField(term70979, term70979.getClass(), "_locale", null);
        setField(term70979, term70979.getClass(), "_timeZone", null);
        setField(term70979, term70979.getClass(), "_defaultBase64", null);
        setField(term70978, term70978.getClass(), "_base", term70979);
        setField(term70977, term70977.getClass(), "_config", term70978);
        setBooleanField(term70977, term70977.getClass(), "_forSerialization", true);
        setBooleanField(term70977, term70977.getClass(), "_stdBeanNaming", true);
        setField(term70977, term70977.getClass(), "_type", null);
        setField(term70977, term70977.getClass(), "_classDef", null);
        setField(term70977, term70977.getClass(), "_visibilityChecker", null);
        setField(term70977, term70977.getClass(), "_annotationIntrospector", null);
        setField(term70977, term70977.getClass(), "_mutatorPrefix", "set");
        setBooleanField(term70977, term70977.getClass(), "_collected", false);
        setField(term70977, term70977.getClass(), "_properties", null);
        setField(term70977, term70977.getClass(), "_creatorProperties", null);
        setField(term70977, term70977.getClass(), "_anyGetters", null);
        setField(term70977, term70977.getClass(), "_anySetters", null);
        setField(term70977, term70977.getClass(), "_anySetterField", null);
        setField(term70977, term70977.getClass(), "_jsonValueGetters", null);
        setField(term70977, term70977.getClass(), "_ignoredPropertyNames", null);
        setField(term70977, term70977.getClass(), "_injectables", null);
        term70982 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term70983 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term70982, term70982.getClass(), "_problemHandlers", null);
        setField(term70982, term70982.getClass(), "_nodeFactory", null);
        setIntField(term70982, term70982.getClass(), "_deserFeatures", 0);
        setIntField(term70982, term70982.getClass(), "_parserFeatures", 0);
        setIntField(term70982, term70982.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term70982, term70982.getClass(), "_formatReadFeatures", 0);
        setIntField(term70982, term70982.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term70982, term70982.getClass(), "_mixIns", null);
        setField(term70982, term70982.getClass(), "_subtypeResolver", null);
        setField(term70982, term70982.getClass(), "_rootName", null);
        setField(term70982, term70982.getClass(), "_view", null);
        setField(term70982, term70982.getClass(), "_attributes", null);
        setField(term70982, term70982.getClass(), "_rootNames", null);
        setField(term70982, term70982.getClass(), "_configOverrides", null);
        setIntField(term70982, term70982.getClass(), "_mapperFeatures", -1);
        setField(term70983, term70983.getClass(), "_classIntrospector", null);
        setField(term70983, term70983.getClass(), "_annotationIntrospector", null);
        setField(term70983, term70983.getClass(), "_visibilityChecker", null);
        setField(term70983, term70983.getClass(), "_propertyNamingStrategy", null);
        setField(term70983, term70983.getClass(), "_typeFactory", null);
        setField(term70983, term70983.getClass(), "_typeResolverBuilder", null);
        setField(term70983, term70983.getClass(), "_dateFormat", null);
        setField(term70983, term70983.getClass(), "_handlerInstantiator", null);
        setField(term70983, term70983.getClass(), "_locale", null);
        setField(term70983, term70983.getClass(), "_timeZone", null);
        setField(term70983, term70983.getClass(), "_defaultBase64", null);
        setField(term70982, term70982.getClass(), "_base", term70983);
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
        args[0] = term70611;
        args[1] = true;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term70977));
        assertTrue(recursiveEquals(term70611, term70982));
    }

};


