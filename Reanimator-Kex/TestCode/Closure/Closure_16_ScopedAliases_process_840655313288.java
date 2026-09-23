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

public class ScopedAliases_process_840655313288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185343;
     Object term185435;
     Object term186713;
     Object term186714;

    public ScopedAliases_process_840655313288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185343 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term185343, term185343.getClass(), "compiler", null);
        term185435 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term185527 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term185435, term185435.getClass(), "type", 0);
        setIntField(term185527, term185527.getClass(), "type", 132);
        setField(term185435, term185435.getClass(), "parent", term185527);
        term186713 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term186713, term186713.getClass(), "compiler", null);
        setField(term186713, term186713.getClass(), "preprocessorSymbolTable", null);
        setField(term186713, term186713.getClass(), "transformationHandler", null);
        term186714 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term186715 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term186714, term186714.getClass(), "number", 0.0);
        setIntField(term186714, term186714.getClass(), "type", 0);
        setField(term186714, term186714.getClass(), "next", null);
        setField(term186714, term186714.getClass(), "first", null);
        setField(term186714, term186714.getClass(), "last", null);
        setField(term186714, term186714.getClass(), "propListHead", null);
        setIntField(term186714, term186714.getClass(), "sourcePosition", 0);
        setField(term186714, term186714.getClass(), "jsType", null);
        setDoubleField(term186715, term186715.getClass(), "number", 0.0);
        setIntField(term186715, term186715.getClass(), "type", 132);
        setField(term186715, term186715.getClass(), "next", null);
        setField(term186715, term186715.getClass(), "first", null);
        setField(term186715, term186715.getClass(), "last", null);
        setField(term186715, term186715.getClass(), "propListHead", null);
        setIntField(term186715, term186715.getClass(), "sourcePosition", 0);
        setField(term186715, term186715.getClass(), "jsType", null);
        setField(term186715, term186715.getClass(), "parent", null);
        setField(term186714, term186714.getClass(), "parent", term186715);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term185435;
        callMethod(klass, "process", argTypes, term185343, args);
        assertTrue(recursiveEquals(term185343, term186713));
        assertTrue(recursiveEquals(term185435, null));
    }

};


