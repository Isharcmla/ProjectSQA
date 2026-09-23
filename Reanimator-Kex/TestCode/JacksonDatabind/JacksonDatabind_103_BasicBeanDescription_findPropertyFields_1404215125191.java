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

public class BasicBeanDescription_findPropertyFields_1404215125191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65131;

    public BasicBeanDescription_findPropertyFields_1404215125191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65131 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term65267 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term65377 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term65131, term65131.getClass(), "_properties", null);
        setBooleanField(term65267, term65267.getClass(), "_collected", false);
        setField(term65267, term65267.getClass(), "_annotationIntrospector", null);
        setBooleanField(term65267, term65267.getClass(), "_forSerialization", false);
        setIntField(term65377, term65377.getClass(), "_mapperFeatures", -1);
        setField(term65267, term65267.getClass(), "_config", term65377);
        setField(term65131, term65131.getClass(), "_propCollector", term65267);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Collection");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = false;
        try {
            callMethod(klass, "_findPropertyFields", argTypes, term65131, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


