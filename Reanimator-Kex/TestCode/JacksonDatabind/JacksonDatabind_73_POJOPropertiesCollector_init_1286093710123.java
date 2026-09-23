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

public class POJOPropertiesCollector_init_1286093710123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53838;

    public POJOPropertiesCollector_init_1286093710123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term53468 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term53586 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term53728 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(term53468, term53468.getClass(), "_config", null);
        setBooleanField(term53468, term53468.getClass(), "_stdBeanNaming", false);
        setBooleanField(term53468, term53468.getClass(), "_forSerialization", false);
        setField(term53468, term53468.getClass(), "_type", null);
        setField(term53468, term53468.getClass(), "_classDef", term53586);
        setField(term53468, term53468.getClass(), "_mutatorPrefix", null);
        setField(term53468, term53468.getClass(), "_annotationIntrospector", term53728);
        term53838 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term53938 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term54086 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setIntField(term53838, term53838.getClass(), "_mapperFeatures", -1);
        setField(term53938, term53938.getClass(), "_annotationIntrospector", term54086);
        setField(term53938, term53938.getClass(), "_visibilityChecker", null);
        setField(term53838, term53838.getClass(), "_base", term53938);
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
        args[0] = term53838;
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


