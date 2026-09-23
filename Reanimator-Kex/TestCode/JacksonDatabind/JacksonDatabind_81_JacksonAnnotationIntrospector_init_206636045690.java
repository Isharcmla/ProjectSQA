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

public class JacksonAnnotationIntrospector_init_206636045690 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182;

    public JacksonAnnotationIntrospector_init_206636045690() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term183 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        Object term184 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term183, term183.getClass(), "_maxEntries", 48);
        setField(term184, term184.getClass(), "table", null);
        setField(term184, term184.getClass(), "nextTable", null);
        setLongField(term184, term184.getClass(), "baseCount", 0L);
        setIntField(term184, term184.getClass(), "sizeCtl", 64);
        setIntField(term184, term184.getClass(), "transferIndex", 0);
        setIntField(term184, term184.getClass(), "cellsBusy", 0);
        setField(term184, term184.getClass(), "counterCells", null);
        setField(term184, term184.getClass(), "keySet", null);
        setField(term184, term184.getClass(), "values", null);
        setField(term184, term184.getClass(), "entrySet", null);
        setField(term184, term184.getClass(), "keySet", null);
        setField(term184, term184.getClass(), "values", null);
        setField(term183, term183.getClass(), "_map", term184);
        setIntField(term183, term183.getClass(), "_jdkSerializeMaxEntries", 0);
        setField(term182, term182.getClass(), "_annotationsInside", term183);
        setBooleanField(term182, term182.getClass(), "_cfgConstructorPropertiesImpliesCreator", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term182));
    }

};


