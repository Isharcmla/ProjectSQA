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

public class ScopedAliases_process_84065531323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9891;
     Object term9961;
     Object term10358;
     Object term10359;

    public ScopedAliases_process_84065531323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9891 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term9891, term9891.getClass(), "compiler", null);
        term9961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9961, term9961.getClass(), "type", 37);
        setField(term9961, term9961.getClass(), "parent", null);
        setField(term10031, term10031.getClass(), "next", null);
        setIntField(term10031, term10031.getClass(), "type", 0);
        setField(term10031, term10031.getClass(), "first", null);
        setField(term9961, term9961.getClass(), "first", term10031);
        term10358 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term10358, term10358.getClass(), "compiler", null);
        setField(term10358, term10358.getClass(), "preprocessorSymbolTable", null);
        setField(term10358, term10358.getClass(), "transformationHandler", null);
        term10359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10360 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10359, term10359.getClass(), "type", 37);
        setField(term10359, term10359.getClass(), "next", null);
        setIntField(term10360, term10360.getClass(), "type", 0);
        setField(term10360, term10360.getClass(), "next", null);
        setField(term10360, term10360.getClass(), "first", null);
        setField(term10360, term10360.getClass(), "last", null);
        setField(term10360, term10360.getClass(), "propListHead", null);
        setIntField(term10360, term10360.getClass(), "sourcePosition", 0);
        setField(term10360, term10360.getClass(), "jsType", null);
        setField(term10360, term10360.getClass(), "parent", null);
        setField(term10359, term10359.getClass(), "first", term10360);
        setField(term10359, term10359.getClass(), "last", null);
        setField(term10359, term10359.getClass(), "propListHead", null);
        setIntField(term10359, term10359.getClass(), "sourcePosition", 0);
        setField(term10359, term10359.getClass(), "jsType", null);
        setField(term10359, term10359.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term9961;
        callMethod(klass, "process", argTypes, term9891, args);
        assertTrue(recursiveEquals(term9891, term10358));
        assertTrue(recursiveEquals(term9961, null));
    }

};


