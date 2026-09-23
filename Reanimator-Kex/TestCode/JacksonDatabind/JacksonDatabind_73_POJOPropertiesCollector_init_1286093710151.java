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

public class POJOPropertiesCollector_init_1286093710151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85354;

    public POJOPropertiesCollector_init_1286093710151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term84990 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term85096 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term85244 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term84990, term84990.getClass(), "_config", term85096);
        setBooleanField(term84990, term84990.getClass(), "_stdBeanNaming", false);
        setBooleanField(term84990, term84990.getClass(), "_forSerialization", false);
        setField(term84990, term84990.getClass(), "_type", null);
        setField(term84990, term84990.getClass(), "_classDef", null);
        setField(term84990, term84990.getClass(), "_mutatorPrefix", null);
        setField(term84990, term84990.getClass(), "_annotationIntrospector", term85244);
        term85354 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term85454 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term85602 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term85734 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std"));
        setIntField(term85354, term85354.getClass(), "_mapperFeatures", -1);
        setField(term85454, term85454.getClass(), "_annotationIntrospector", term85602);
        setField(term85454, term85454.getClass(), "_visibilityChecker", term85734);
        setField(term85354, term85354.getClass(), "_base", term85454);
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
        args[0] = term85354;
        args[1] = true;
        args[2] = null;
        args[3] = null;
        args[4] = "";
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


