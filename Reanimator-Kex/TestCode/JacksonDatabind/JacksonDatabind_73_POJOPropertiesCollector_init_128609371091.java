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

public class POJOPropertiesCollector_init_128609371091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23737;

    public POJOPropertiesCollector_init_128609371091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term23413 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term23523 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term23627 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term23413, term23413.getClass(), "_config", term23523);
        setBooleanField(term23413, term23413.getClass(), "_stdBeanNaming", false);
        setBooleanField(term23413, term23413.getClass(), "_forSerialization", false);
        setField(term23413, term23413.getClass(), "_type", term23627);
        setField(term23413, term23413.getClass(), "_classDef", null);
        setField(term23413, term23413.getClass(), "_mutatorPrefix", null);
        setField(term23413, term23413.getClass(), "_annotationIntrospector", null);
        term23737 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term23837 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term23979 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setIntField(term23737, term23737.getClass(), "_mapperFeatures", -1);
        setField(term23837, term23837.getClass(), "_annotationIntrospector", term23979);
        setField(term23737, term23737.getClass(), "_base", term23837);
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
        args[0] = term23737;
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


