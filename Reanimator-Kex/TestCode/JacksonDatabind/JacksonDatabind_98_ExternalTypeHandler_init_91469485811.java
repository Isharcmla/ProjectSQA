package com.fasterxml.jackson.databind.deser.impl;

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
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.impl.EqualityUtils.*;
import java.lang.Object;
import java.util.LinkedHashMap;

public class ExternalTypeHandler_init_91469485811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term24;
     Object term25;
     Object term182;
     Object term187;
     Object term188;
     Object term189;
     Object term190;

    public ExternalTypeHandler_init_91469485811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = (Object[]) newArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 5);
        term2 = new LinkedHashMap();
        term24 = (Object[]) newArray("java.lang.String", 0);
        term25 = (Object[]) newArray("com.fasterxml.jackson.databind.util.TokenBuffer", 4);
        LinkedHashMap term184 = new LinkedHashMap();
        term182 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        Object[] term183 = (Object[]) newArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 5);
        Object[] term185 = (Object[]) newArray("java.lang.String", 0);
        Object[] term186 = (Object[]) newArray("com.fasterxml.jackson.databind.util.TokenBuffer", 4);
        setField(term182, term182.getClass(), "_beanType", null);
        setField(term182, term182.getClass(), "_properties", term183);
        setField(term182, term182.getClass(), "_nameToPropertyIndex", term184);
        setField(term182, term182.getClass(), "_typeIds", term185);
        setField(term182, term182.getClass(), "_tokens", term186);
        term187 = (Object[]) newArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 5);
        term188 = new LinkedHashMap();
        term189 = (Object[]) newArray("java.lang.String", 0);
        term190 = (Object[]) newArray("com.fasterxml.jackson.databind.util.TokenBuffer", 4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty"), 0).getClass();
        argTypes[2] = Class.forName("java.util.Map");
        argTypes[3] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[4] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"), 0).getClass();
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = term1;
        args[2] = term2;
        args[3] = term24;
        args[4] = term25;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term182));
        assertTrue(recursiveEquals(term1, term187));
        assertTrue(recursiveEquals(term2, term188));
        assertTrue(recursiveEquals(term24, term189));
        assertTrue(recursiveEquals(term25, term190));
    }

};


