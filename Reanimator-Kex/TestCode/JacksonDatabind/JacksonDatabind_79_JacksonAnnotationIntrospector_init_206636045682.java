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

public class JacksonAnnotationIntrospector_init_206636045682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184;

    public JacksonAnnotationIntrospector_init_206636045682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term185 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        Object term186 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term185, term185.getClass(), "_maxEntries", 48);
        setField(term186, term186.getClass(), "table", null);
        setField(term186, term186.getClass(), "nextTable", null);
        setLongField(term186, term186.getClass(), "baseCount", 0L);
        setIntField(term186, term186.getClass(), "sizeCtl", 64);
        setIntField(term186, term186.getClass(), "transferIndex", 0);
        setIntField(term186, term186.getClass(), "cellsBusy", 0);
        setField(term186, term186.getClass(), "counterCells", null);
        setField(term186, term186.getClass(), "keySet", null);
        setField(term186, term186.getClass(), "values", null);
        setField(term186, term186.getClass(), "entrySet", null);
        setField(term186, term186.getClass(), "keySet", null);
        setField(term186, term186.getClass(), "values", null);
        setField(term185, term185.getClass(), "_map", term186);
        setIntField(term185, term185.getClass(), "_jdkSerializeMaxEntries", 0);
        setField(term184, term184.getClass(), "_annotationsInside", term185);
        setBooleanField(term184, term184.getClass(), "_cfgConstructorPropertiesImpliesCreator", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term184));
    }

};


