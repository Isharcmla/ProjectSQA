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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.introspect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class POJOPropertiesCollector_init_1286093710127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58469;
     Object term58961;

    public POJOPropertiesCollector_init_1286093710127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term58215 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term58359 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term58215, term58215.getClass(), "_config", null);
        setBooleanField(term58215, term58215.getClass(), "_stdBeanNaming", false);
        setBooleanField(term58215, term58215.getClass(), "_forSerialization", false);
        setField(term58215, term58215.getClass(), "_type", null);
        setField(term58215, term58215.getClass(), "_classDef", null);
        setField(term58215, term58215.getClass(), "_mutatorPrefix", null);
        setField(term58215, term58215.getClass(), "_annotationIntrospector", term58359);
        term58469 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term58569 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term58711 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term58843 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std"));
        setIntField(term58469, term58469.getClass(), "_mapperFeatures", -1);
        setField(term58569, term58569.getClass(), "_annotationIntrospector", term58711);
        setField(term58569, term58569.getClass(), "_visibilityChecker", term58843);
        setField(term58469, term58469.getClass(), "_base", term58569);
        term58961 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
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
        args[0] = term58469;
        args[1] = true;
        args[2] = null;
        args[3] = term58961;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


