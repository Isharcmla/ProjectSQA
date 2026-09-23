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

public class ScopedAliases_process_84065531361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34991;
     Object term35061;
     Object term35486;
     Object term35487;

    public ScopedAliases_process_84065531361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34991 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term34991, term34991.getClass(), "compiler", null);
        term35061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35153 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term35061, term35061.getClass(), "type", 0);
        setIntField(term35153, term35153.getClass(), "type", 0);
        setField(term35153, term35153.getClass(), "parent", null);
        setField(term35061, term35061.getClass(), "parent", term35153);
        term35486 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term35486, term35486.getClass(), "compiler", null);
        setField(term35486, term35486.getClass(), "preprocessorSymbolTable", null);
        setField(term35486, term35486.getClass(), "transformationHandler", null);
        term35487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35488 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term35487, term35487.getClass(), "type", 0);
        setField(term35487, term35487.getClass(), "next", null);
        setField(term35487, term35487.getClass(), "first", null);
        setField(term35487, term35487.getClass(), "last", null);
        setField(term35487, term35487.getClass(), "propListHead", null);
        setIntField(term35487, term35487.getClass(), "sourcePosition", 0);
        setField(term35487, term35487.getClass(), "jsType", null);
        setDoubleField(term35488, term35488.getClass(), "number", 0.0);
        setIntField(term35488, term35488.getClass(), "type", 0);
        setField(term35488, term35488.getClass(), "next", null);
        setField(term35488, term35488.getClass(), "first", null);
        setField(term35488, term35488.getClass(), "last", null);
        setField(term35488, term35488.getClass(), "propListHead", null);
        setIntField(term35488, term35488.getClass(), "sourcePosition", 0);
        setField(term35488, term35488.getClass(), "jsType", null);
        setField(term35488, term35488.getClass(), "parent", null);
        setField(term35487, term35487.getClass(), "parent", term35488);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term35061;
        callMethod(klass, "process", argTypes, term34991, args);
        assertTrue(recursiveEquals(term34991, term35486));
        assertTrue(recursiveEquals(term35061, null));
    }

};


