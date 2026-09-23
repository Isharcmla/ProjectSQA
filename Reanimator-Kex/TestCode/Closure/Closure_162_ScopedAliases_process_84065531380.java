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

public class ScopedAliases_process_84065531380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40431;
     Object term40501;
     Object term41041;
     Object term41042;

    public ScopedAliases_process_84065531380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40431 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term40431, term40431.getClass(), "compiler", null);
        term40501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40501, term40501.getClass(), "type", 0);
        setField(term40501, term40501.getClass(), "parent", null);
        setField(term40571, term40571.getClass(), "next", term40641);
        setIntField(term40571, term40571.getClass(), "type", 0);
        setField(term40571, term40571.getClass(), "first", null);
        setField(term40501, term40501.getClass(), "first", term40571);
        term41041 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term41041, term41041.getClass(), "compiler", null);
        setField(term41041, term41041.getClass(), "preprocessorSymbolTable", null);
        setField(term41041, term41041.getClass(), "transformationHandler", null);
        term41042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41042, term41042.getClass(), "type", 0);
        setField(term41042, term41042.getClass(), "next", null);
        setIntField(term41043, term41043.getClass(), "type", 0);
        setIntField(term41044, term41044.getClass(), "type", 0);
        setField(term41044, term41044.getClass(), "next", null);
        setField(term41044, term41044.getClass(), "first", null);
        setField(term41044, term41044.getClass(), "last", null);
        setField(term41044, term41044.getClass(), "propListHead", null);
        setIntField(term41044, term41044.getClass(), "sourcePosition", 0);
        setField(term41044, term41044.getClass(), "jsType", null);
        setField(term41044, term41044.getClass(), "parent", null);
        setField(term41043, term41043.getClass(), "next", term41044);
        setField(term41043, term41043.getClass(), "first", null);
        setField(term41043, term41043.getClass(), "last", null);
        setField(term41043, term41043.getClass(), "propListHead", null);
        setIntField(term41043, term41043.getClass(), "sourcePosition", 0);
        setField(term41043, term41043.getClass(), "jsType", null);
        setField(term41043, term41043.getClass(), "parent", null);
        setField(term41042, term41042.getClass(), "first", term41043);
        setField(term41042, term41042.getClass(), "last", null);
        setField(term41042, term41042.getClass(), "propListHead", null);
        setIntField(term41042, term41042.getClass(), "sourcePosition", 0);
        setField(term41042, term41042.getClass(), "jsType", null);
        setField(term41042, term41042.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term40501;
        callMethod(klass, "process", argTypes, term40431, args);
        assertTrue(recursiveEquals(term40431, term41041));
        assertTrue(recursiveEquals(term40501, null));
    }

};


