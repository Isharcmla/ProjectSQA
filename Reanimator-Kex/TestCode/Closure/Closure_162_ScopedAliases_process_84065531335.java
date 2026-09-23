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

public class ScopedAliases_process_84065531335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17001;
     Object term17071;
     Object term17468;
     Object term17469;

    public ScopedAliases_process_84065531335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17001 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term17001, term17001.getClass(), "compiler", null);
        term17071 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17141 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17071, term17071.getClass(), "type", 37);
        setField(term17071, term17071.getClass(), "parent", null);
        setField(term17141, term17141.getClass(), "next", null);
        setIntField(term17141, term17141.getClass(), "type", 0);
        setField(term17141, term17141.getClass(), "first", null);
        setField(term17071, term17071.getClass(), "first", term17141);
        term17468 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term17468, term17468.getClass(), "compiler", null);
        setField(term17468, term17468.getClass(), "preprocessorSymbolTable", null);
        setField(term17468, term17468.getClass(), "transformationHandler", null);
        term17469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17470 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17469, term17469.getClass(), "type", 37);
        setField(term17469, term17469.getClass(), "next", null);
        setIntField(term17470, term17470.getClass(), "type", 0);
        setField(term17470, term17470.getClass(), "next", null);
        setField(term17470, term17470.getClass(), "first", null);
        setField(term17470, term17470.getClass(), "last", null);
        setField(term17470, term17470.getClass(), "propListHead", null);
        setIntField(term17470, term17470.getClass(), "sourcePosition", 0);
        setField(term17470, term17470.getClass(), "jsType", null);
        setField(term17470, term17470.getClass(), "parent", null);
        setField(term17469, term17469.getClass(), "first", term17470);
        setField(term17469, term17469.getClass(), "last", null);
        setField(term17469, term17469.getClass(), "propListHead", null);
        setIntField(term17469, term17469.getClass(), "sourcePosition", 0);
        setField(term17469, term17469.getClass(), "jsType", null);
        setField(term17469, term17469.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term17071;
        callMethod(klass, "process", argTypes, term17001, args);
        assertTrue(recursiveEquals(term17001, term17468));
        assertTrue(recursiveEquals(term17071, null));
    }

};


