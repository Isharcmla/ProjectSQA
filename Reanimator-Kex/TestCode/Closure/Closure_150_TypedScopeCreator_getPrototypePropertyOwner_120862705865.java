package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class TypedScopeCreator_getPrototypePropertyOwner_120862705865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34361;
     Object term34448;

    public TypedScopeCreator_getPrototypePropertyOwner_120862705865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34361, term34361.getClass(), "type", 33);
        setField(term34361, term34361.getClass(), "first", term34431);
        term34448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34448, term34448.getClass(), "type", 33);
        setField(term34448, term34448.getClass(), "next", null);
        setIntField(term34449, term34449.getClass(), "type", 0);
        setField(term34449, term34449.getClass(), "next", null);
        setField(term34449, term34449.getClass(), "first", null);
        setField(term34449, term34449.getClass(), "last", null);
        setField(term34449, term34449.getClass(), "propListHead", null);
        setIntField(term34449, term34449.getClass(), "sourcePosition", 0);
        setField(term34449, term34449.getClass(), "jsType", null);
        setField(term34449, term34449.getClass(), "parent", null);
        setField(term34448, term34448.getClass(), "first", term34449);
        setField(term34448, term34448.getClass(), "last", null);
        setField(term34448, term34448.getClass(), "propListHead", null);
        setIntField(term34448, term34448.getClass(), "sourcePosition", 0);
        setField(term34448, term34448.getClass(), "jsType", null);
        setField(term34448, term34448.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term34361;
        Object retValue = callMethod(klass, "getPrototypePropertyOwner", argTypes, null, args);
        assertTrue(recursiveEquals(term34361, term34448));
        assertTrue(recursiveEquals(retValue, null));
    }

};


