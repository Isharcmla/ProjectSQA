package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Object;

public class IR_eq_543743324849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133088;
     Object term133533;
     Object term133535;
     Object term133352;

    public IR_eq_543743324849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term133088, term133088.getClass(), "type", 98);
        term133533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term133534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term133533, term133533.getClass(), "type", 98);
        setField(term133533, term133533.getClass(), "next", null);
        setField(term133533, term133533.getClass(), "first", null);
        setField(term133533, term133533.getClass(), "last", null);
        setField(term133533, term133533.getClass(), "propListHead", null);
        setIntField(term133533, term133533.getClass(), "sourcePosition", 0);
        setField(term133533, term133533.getClass(), "jsType", null);
        setIntField(term133534, term133534.getClass(), "type", 12);
        setField(term133534, term133534.getClass(), "next", null);
        setField(term133534, term133534.getClass(), "first", term133533);
        setField(term133534, term133534.getClass(), "last", term133533);
        setField(term133534, term133534.getClass(), "propListHead", null);
        setIntField(term133534, term133534.getClass(), "sourcePosition", -1);
        setField(term133534, term133534.getClass(), "jsType", null);
        setField(term133534, term133534.getClass(), "parent", null);
        setField(term133533, term133533.getClass(), "parent", term133534);
        term133535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term133536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term133535, term133535.getClass(), "type", 98);
        setField(term133535, term133535.getClass(), "next", null);
        setField(term133535, term133535.getClass(), "first", null);
        setField(term133535, term133535.getClass(), "last", null);
        setField(term133535, term133535.getClass(), "propListHead", null);
        setIntField(term133535, term133535.getClass(), "sourcePosition", 0);
        setField(term133535, term133535.getClass(), "jsType", null);
        setIntField(term133536, term133536.getClass(), "type", 12);
        setField(term133536, term133536.getClass(), "next", null);
        setField(term133536, term133536.getClass(), "first", term133535);
        setField(term133536, term133536.getClass(), "last", term133535);
        setField(term133536, term133536.getClass(), "propListHead", null);
        setIntField(term133536, term133536.getClass(), "sourcePosition", -1);
        setField(term133536, term133536.getClass(), "jsType", null);
        setField(term133536, term133536.getClass(), "parent", null);
        setField(term133535, term133535.getClass(), "parent", term133536);
        term133352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term133349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term133352, term133352.getClass(), "type", 12);
        setField(term133352, term133352.getClass(), "next", null);
        setIntField(term133349, term133349.getClass(), "type", 98);
        setField(term133349, term133349.getClass(), "next", null);
        setField(term133349, term133349.getClass(), "first", null);
        setField(term133349, term133349.getClass(), "last", null);
        setField(term133349, term133349.getClass(), "propListHead", null);
        setIntField(term133349, term133349.getClass(), "sourcePosition", 0);
        setField(term133349, term133349.getClass(), "jsType", null);
        setField(term133349, term133349.getClass(), "parent", term133352);
        setField(term133352, term133352.getClass(), "first", term133349);
        setField(term133352, term133352.getClass(), "last", term133349);
        setField(term133352, term133352.getClass(), "propListHead", null);
        setIntField(term133352, term133352.getClass(), "sourcePosition", -1);
        setField(term133352, term133352.getClass(), "jsType", null);
        setField(term133352, term133352.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term133088;
        args[1] = term133088;
        Object retValue = callMethod(klass, "eq", argTypes, null, args);
        assertTrue(recursiveEquals(term133088, term133533));
        assertTrue(recursiveEquals(term133088, term133535));
        assertTrue(recursiveEquals(retValue, term133352));
    }

};


