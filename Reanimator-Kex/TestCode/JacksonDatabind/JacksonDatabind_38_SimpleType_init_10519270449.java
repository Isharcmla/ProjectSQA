package com.fasterxml.jackson.databind.type;

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
import static com.fasterxml.jackson.databind.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.type.EqualityUtils.*;
import java.lang.Object;

public class SimpleType_init_10519270449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7862;
     Object term10010;
     Object term10011;

    public SimpleType_init_10519270449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7764 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term7862 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term10010 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term10010, term10010.getClass(), "_superClass", null);
        setField(term10010, term10010.getClass(), "_superInterfaces", null);
        setField(term10010, term10010.getClass(), "_bindings", null);
        setField(term10010, term10010.getClass(), "_canonicalName", null);
        setField(term10010, term10010.getClass(), "_class", null);
        setIntField(term10010, term10010.getClass(), "_hash", 0);
        setField(term10010, term10010.getClass(), "_valueHandler", null);
        setField(term10010, term10010.getClass(), "_typeHandler", null);
        setBooleanField(term10010, term10010.getClass(), "_asStatic", false);
        term10011 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term10011, term10011.getClass(), "_superClass", null);
        setField(term10011, term10011.getClass(), "_superInterfaces", null);
        setField(term10011, term10011.getClass(), "_bindings", null);
        setField(term10011, term10011.getClass(), "_canonicalName", null);
        setField(term10011, term10011.getClass(), "_class", null);
        setIntField(term10011, term10011.getClass(), "_hash", 0);
        setField(term10011, term10011.getClass(), "_valueHandler", null);
        setField(term10011, term10011.getClass(), "_typeHandler", null);
        setBooleanField(term10011, term10011.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.SimpleType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        Object[] args = new Object[1];
        args[0] = term7862;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term10010));
        assertTrue(recursiveEquals(term7862, term10011));
    }

};


