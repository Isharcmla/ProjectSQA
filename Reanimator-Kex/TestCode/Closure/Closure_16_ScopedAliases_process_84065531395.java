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

public class ScopedAliases_process_84065531395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57027;
     Object term57119;
     Object term57577;
     Object term57578;

    public ScopedAliases_process_84065531395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57027 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term57027, term57027.getClass(), "compiler", null);
        term57119 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term57211 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term57119, term57119.getClass(), "type", 0);
        setIntField(term57211, term57211.getClass(), "type", 0);
        setField(term57211, term57211.getClass(), "parent", null);
        setField(term57119, term57119.getClass(), "parent", term57211);
        setField(term57119, term57119.getClass(), "first", null);
        term57577 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term57577, term57577.getClass(), "compiler", null);
        setField(term57577, term57577.getClass(), "preprocessorSymbolTable", null);
        setField(term57577, term57577.getClass(), "transformationHandler", null);
        term57578 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term57579 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term57578, term57578.getClass(), "number", 0.0);
        setIntField(term57578, term57578.getClass(), "type", 0);
        setField(term57578, term57578.getClass(), "next", null);
        setField(term57578, term57578.getClass(), "first", null);
        setField(term57578, term57578.getClass(), "last", null);
        setField(term57578, term57578.getClass(), "propListHead", null);
        setIntField(term57578, term57578.getClass(), "sourcePosition", 0);
        setField(term57578, term57578.getClass(), "jsType", null);
        setDoubleField(term57579, term57579.getClass(), "number", 0.0);
        setIntField(term57579, term57579.getClass(), "type", 0);
        setField(term57579, term57579.getClass(), "next", null);
        setField(term57579, term57579.getClass(), "first", null);
        setField(term57579, term57579.getClass(), "last", null);
        setField(term57579, term57579.getClass(), "propListHead", null);
        setIntField(term57579, term57579.getClass(), "sourcePosition", 0);
        setField(term57579, term57579.getClass(), "jsType", null);
        setField(term57579, term57579.getClass(), "parent", null);
        setField(term57578, term57578.getClass(), "parent", term57579);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term57119;
        callMethod(klass, "process", argTypes, term57027, args);
        assertTrue(recursiveEquals(term57027, term57577));
        assertTrue(recursiveEquals(term57119, null));
    }

};


