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

public class POJOPropertiesCollector_init_1286093710153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87740;
     Object term88108;
     Object term88226;

    public POJOPropertiesCollector_init_1286093710153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term87526 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term87630 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term87526, term87526.getClass(), "_config", null);
        setBooleanField(term87526, term87526.getClass(), "_stdBeanNaming", false);
        setBooleanField(term87526, term87526.getClass(), "_forSerialization", false);
        setField(term87526, term87526.getClass(), "_type", term87630);
        setField(term87526, term87526.getClass(), "_classDef", null);
        setField(term87526, term87526.getClass(), "_mutatorPrefix", null);
        setField(term87526, term87526.getClass(), "_annotationIntrospector", null);
        term87740 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term87840 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term87988 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setIntField(term87740, term87740.getClass(), "_mapperFeatures", -1);
        setField(term87840, term87840.getClass(), "_annotationIntrospector", term87988);
        setField(term87840, term87840.getClass(), "_visibilityChecker", null);
        setField(term87740, term87740.getClass(), "_base", term87840);
        term88108 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        term88226 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term88374 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term88226, term88226.getClass(), "_classAnnotations", null);
        setField(term88226, term88226.getClass(), "_annotationIntrospector", term88374);
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
        args[0] = term87740;
        args[1] = true;
        args[2] = term88108;
        args[3] = term88226;
        args[4] = "";
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


