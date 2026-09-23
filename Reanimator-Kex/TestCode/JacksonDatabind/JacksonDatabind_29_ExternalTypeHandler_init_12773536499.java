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

public class ExternalTypeHandler_init_12773536499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term25;
     Object term26;
     Object term136;
     Object term141;
     Object term142;
     Object term143;
     Object term144;

    public ExternalTypeHandler_init_12773536499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = (Object[]) newArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 5);
        term2 = new LinkedHashMap();
        term25 = (Object[]) newArray("java.lang.String", 0);
        term26 = (Object[]) newArray("com.fasterxml.jackson.databind.util.TokenBuffer", 4);
        LinkedHashMap term138 = new LinkedHashMap();
        term136 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        Object[] term137 = (Object[]) newArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 5);
        Object[] term139 = (Object[]) newArray("java.lang.String", 0);
        Object[] term140 = (Object[]) newArray("com.fasterxml.jackson.databind.util.TokenBuffer", 4);
        setField(term136, term136.getClass(), "_properties", term137);
        setField(term136, term136.getClass(), "_nameToPropertyIndex", term138);
        setField(term136, term136.getClass(), "_typeIds", term139);
        setField(term136, term136.getClass(), "_tokens", term140);
        term141 = (Object[]) newArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 5);
        term142 = new LinkedHashMap();
        term143 = (Object[]) newArray("java.lang.String", 0);
        term144 = (Object[]) newArray("com.fasterxml.jackson.databind.util.TokenBuffer", 4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty"), 0).getClass();
        argTypes[1] = Class.forName("java.util.HashMap");
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"), 0).getClass();
        Object[] args = new Object[4];
        args[0] = term1;
        args[1] = term2;
        args[2] = term25;
        args[3] = term26;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term136));
        assertTrue(recursiveEquals(term1, term141));
        assertTrue(recursiveEquals(term2, term142));
        assertTrue(recursiveEquals(term25, term143));
        assertTrue(recursiveEquals(term26, term144));
    }

};


