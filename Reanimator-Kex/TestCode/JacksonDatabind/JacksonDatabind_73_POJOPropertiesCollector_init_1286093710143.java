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

public class POJOPropertiesCollector_init_1286093710143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76951;
     Object term77317;

    public POJOPropertiesCollector_init_1286093710143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term76655 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term76841 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term76655, term76655.getClass(), "_config", null);
        setBooleanField(term76655, term76655.getClass(), "_stdBeanNaming", false);
        setBooleanField(term76655, term76655.getClass(), "_forSerialization", false);
        setField(term76655, term76655.getClass(), "_type", null);
        setField(term76655, term76655.getClass(), "_classDef", null);
        setField(term76655, term76655.getClass(), "_mutatorPrefix", "");
        setField(term76655, term76655.getClass(), "_annotationIntrospector", term76841);
        term76951 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term77051 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term77199 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setIntField(term76951, term76951.getClass(), "_mapperFeatures", -1);
        setField(term77051, term77051.getClass(), "_annotationIntrospector", term77199);
        setField(term77051, term77051.getClass(), "_visibilityChecker", null);
        setField(term76951, term76951.getClass(), "_base", term77051);
        term77317 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term77461 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term77317, term77317.getClass(), "_classAnnotations", null);
        setField(term77317, term77317.getClass(), "_annotationIntrospector", term77461);
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
        args[0] = term76951;
        args[1] = true;
        args[2] = null;
        args[3] = term77317;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


