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

public class POJOPropertiesCollector_init_1286093710131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63147;

    public POJOPropertiesCollector_init_1286093710131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term62931 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term63037 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term62931, term62931.getClass(), "_config", term63037);
        setBooleanField(term62931, term62931.getClass(), "_stdBeanNaming", false);
        setBooleanField(term62931, term62931.getClass(), "_forSerialization", false);
        setField(term62931, term62931.getClass(), "_type", null);
        setField(term62931, term62931.getClass(), "_classDef", null);
        setField(term62931, term62931.getClass(), "_mutatorPrefix", null);
        setField(term62931, term62931.getClass(), "_annotationIntrospector", null);
        term63147 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term63247 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term63395 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setIntField(term63147, term63147.getClass(), "_mapperFeatures", -1);
        setField(term63247, term63247.getClass(), "_annotationIntrospector", term63395);
        setField(term63247, term63247.getClass(), "_visibilityChecker", null);
        setField(term63147, term63147.getClass(), "_base", term63247);
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
        args[0] = term63147;
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


