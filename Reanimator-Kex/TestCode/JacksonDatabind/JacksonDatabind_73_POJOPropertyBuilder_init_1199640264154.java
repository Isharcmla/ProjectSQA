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

public class POJOPropertyBuilder_init_1199640264154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18167;
     Object term18451;
     Object term18452;

    public POJOPropertyBuilder_init_1199640264154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18167 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        term18451 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setBooleanField(term18451, term18451.getClass(), "_forSerialization", false);
        setField(term18451, term18451.getClass(), "_config", null);
        setField(term18451, term18451.getClass(), "_annotationIntrospector", null);
        setField(term18451, term18451.getClass(), "_name", null);
        setField(term18451, term18451.getClass(), "_internalName", null);
        setField(term18451, term18451.getClass(), "_fields", null);
        setField(term18451, term18451.getClass(), "_ctorParameters", null);
        setField(term18451, term18451.getClass(), "_getters", null);
        setField(term18451, term18451.getClass(), "_setters", null);
        term18452 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setBooleanField(term18452, term18452.getClass(), "_forSerialization", false);
        setField(term18452, term18452.getClass(), "_config", null);
        setField(term18452, term18452.getClass(), "_annotationIntrospector", null);
        setField(term18452, term18452.getClass(), "_name", null);
        setField(term18452, term18452.getClass(), "_internalName", null);
        setField(term18452, term18452.getClass(), "_fields", null);
        setField(term18452, term18452.getClass(), "_ctorParameters", null);
        setField(term18452, term18452.getClass(), "_getters", null);
        setField(term18452, term18452.getClass(), "_setters", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyName");
        Object[] args = new Object[2];
        args[0] = term18167;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term18451));
        assertTrue(recursiveEquals(term18167, term18452));
    }

};


