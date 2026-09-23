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

public class POJOPropertiesCollector_init_128609371081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15282;
     Object term15685;
     Object term15690;

    public POJOPropertiesCollector_init_128609371081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term14948 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term15058 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term15172 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term14948, term14948.getClass(), "_config", term15058);
        setBooleanField(term14948, term14948.getClass(), "_stdBeanNaming", false);
        setBooleanField(term14948, term14948.getClass(), "_forSerialization", false);
        setField(term14948, term14948.getClass(), "_type", term15172);
        setField(term14948, term14948.getClass(), "_classDef", null);
        setField(term14948, term14948.getClass(), "_mutatorPrefix", null);
        setField(term14948, term14948.getClass(), "_annotationIntrospector", null);
        term15282 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term15382 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setIntField(term15282, term15282.getClass(), "_mapperFeatures", -1);
        setField(term15282, term15282.getClass(), "_base", term15382);
        term15685 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term15686 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term15687 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term15686, term15686.getClass(), "_problemHandlers", null);
        setField(term15686, term15686.getClass(), "_nodeFactory", null);
        setIntField(term15686, term15686.getClass(), "_deserFeatures", 0);
        setIntField(term15686, term15686.getClass(), "_parserFeatures", 0);
        setIntField(term15686, term15686.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term15686, term15686.getClass(), "_formatReadFeatures", 0);
        setIntField(term15686, term15686.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term15686, term15686.getClass(), "_mixIns", null);
        setField(term15686, term15686.getClass(), "_subtypeResolver", null);
        setField(term15686, term15686.getClass(), "_rootName", null);
        setField(term15686, term15686.getClass(), "_view", null);
        setField(term15686, term15686.getClass(), "_attributes", null);
        setField(term15686, term15686.getClass(), "_rootNames", null);
        setField(term15686, term15686.getClass(), "_configOverrides", null);
        setIntField(term15686, term15686.getClass(), "_mapperFeatures", -1);
        setField(term15687, term15687.getClass(), "_classIntrospector", null);
        setField(term15687, term15687.getClass(), "_annotationIntrospector", null);
        setField(term15687, term15687.getClass(), "_visibilityChecker", null);
        setField(term15687, term15687.getClass(), "_propertyNamingStrategy", null);
        setField(term15687, term15687.getClass(), "_typeFactory", null);
        setField(term15687, term15687.getClass(), "_typeResolverBuilder", null);
        setField(term15687, term15687.getClass(), "_dateFormat", null);
        setField(term15687, term15687.getClass(), "_handlerInstantiator", null);
        setField(term15687, term15687.getClass(), "_locale", null);
        setField(term15687, term15687.getClass(), "_timeZone", null);
        setField(term15687, term15687.getClass(), "_defaultBase64", null);
        setField(term15686, term15686.getClass(), "_base", term15687);
        setField(term15685, term15685.getClass(), "_config", term15686);
        setBooleanField(term15685, term15685.getClass(), "_forSerialization", true);
        setBooleanField(term15685, term15685.getClass(), "_stdBeanNaming", true);
        setField(term15685, term15685.getClass(), "_type", null);
        setField(term15685, term15685.getClass(), "_classDef", null);
        setField(term15685, term15685.getClass(), "_visibilityChecker", null);
        setField(term15685, term15685.getClass(), "_annotationIntrospector", null);
        setField(term15685, term15685.getClass(), "_mutatorPrefix", "");
        setBooleanField(term15685, term15685.getClass(), "_collected", false);
        setField(term15685, term15685.getClass(), "_properties", null);
        setField(term15685, term15685.getClass(), "_creatorProperties", null);
        setField(term15685, term15685.getClass(), "_anyGetters", null);
        setField(term15685, term15685.getClass(), "_anySetters", null);
        setField(term15685, term15685.getClass(), "_anySetterField", null);
        setField(term15685, term15685.getClass(), "_jsonValueGetters", null);
        setField(term15685, term15685.getClass(), "_ignoredPropertyNames", null);
        setField(term15685, term15685.getClass(), "_injectables", null);
        term15690 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term15691 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term15690, term15690.getClass(), "_problemHandlers", null);
        setField(term15690, term15690.getClass(), "_nodeFactory", null);
        setIntField(term15690, term15690.getClass(), "_deserFeatures", 0);
        setIntField(term15690, term15690.getClass(), "_parserFeatures", 0);
        setIntField(term15690, term15690.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term15690, term15690.getClass(), "_formatReadFeatures", 0);
        setIntField(term15690, term15690.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term15690, term15690.getClass(), "_mixIns", null);
        setField(term15690, term15690.getClass(), "_subtypeResolver", null);
        setField(term15690, term15690.getClass(), "_rootName", null);
        setField(term15690, term15690.getClass(), "_view", null);
        setField(term15690, term15690.getClass(), "_attributes", null);
        setField(term15690, term15690.getClass(), "_rootNames", null);
        setField(term15690, term15690.getClass(), "_configOverrides", null);
        setIntField(term15690, term15690.getClass(), "_mapperFeatures", -1);
        setField(term15691, term15691.getClass(), "_classIntrospector", null);
        setField(term15691, term15691.getClass(), "_annotationIntrospector", null);
        setField(term15691, term15691.getClass(), "_visibilityChecker", null);
        setField(term15691, term15691.getClass(), "_propertyNamingStrategy", null);
        setField(term15691, term15691.getClass(), "_typeFactory", null);
        setField(term15691, term15691.getClass(), "_typeResolverBuilder", null);
        setField(term15691, term15691.getClass(), "_dateFormat", null);
        setField(term15691, term15691.getClass(), "_handlerInstantiator", null);
        setField(term15691, term15691.getClass(), "_locale", null);
        setField(term15691, term15691.getClass(), "_timeZone", null);
        setField(term15691, term15691.getClass(), "_defaultBase64", null);
        setField(term15690, term15690.getClass(), "_base", term15691);
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
        args[0] = term15282;
        args[1] = true;
        args[2] = null;
        args[3] = null;
        args[4] = "";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term15685));
        assertTrue(recursiveEquals(term15282, term15690));
    }

};


