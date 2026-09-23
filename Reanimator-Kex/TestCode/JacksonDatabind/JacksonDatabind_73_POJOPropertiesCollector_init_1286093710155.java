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
import java.lang.StackOverflowError;
import static com.fasterxml.jackson.databind.introspect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class POJOPropertiesCollector_init_1286093710155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90512;

    public POJOPropertiesCollector_init_1286093710155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term90292 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term90402 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term90292, term90292.getClass(), "_config", term90402);
        setBooleanField(term90292, term90292.getClass(), "_stdBeanNaming", false);
        setBooleanField(term90292, term90292.getClass(), "_forSerialization", false);
        setField(term90292, term90292.getClass(), "_type", null);
        setField(term90292, term90292.getClass(), "_classDef", null);
        setField(term90292, term90292.getClass(), "_mutatorPrefix", null);
        setField(term90292, term90292.getClass(), "_annotationIntrospector", null);
        term90512 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term90612 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term90754 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setIntField(term90512, term90512.getClass(), "_mapperFeatures", -1);
        setField(term90754, term90754.getClass(), "_secondary", term90754);
        setField(term90612, term90612.getClass(), "_annotationIntrospector", term90754);
        setField(term90612, term90612.getClass(), "_visibilityChecker", null);
        setField(term90512, term90512.getClass(), "_base", term90612);
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
        args[0] = term90512;
        args[1] = true;
        args[2] = null;
        args[3] = null;
        args[4] = "";
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


