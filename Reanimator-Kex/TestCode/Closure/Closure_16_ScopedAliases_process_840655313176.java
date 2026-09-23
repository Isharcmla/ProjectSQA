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

public class ScopedAliases_process_840655313176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106243;
     Object term106335;
     Object term107710;
     Object term107711;

    public ScopedAliases_process_840655313176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106243 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term106243, term106243.getClass(), "compiler", null);
        term106335 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term106427 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term106335, term106335.getClass(), "type", 0);
        setIntField(term106427, term106427.getClass(), "type", 0);
        setField(term106427, term106427.getClass(), "parent", null);
        setField(term106335, term106335.getClass(), "parent", term106427);
        setField(term106335, term106335.getClass(), "first", null);
        term107710 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term107710, term107710.getClass(), "compiler", null);
        setField(term107710, term107710.getClass(), "preprocessorSymbolTable", null);
        setField(term107710, term107710.getClass(), "transformationHandler", null);
        term107711 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term107712 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term107711, term107711.getClass(), "number", 0.0);
        setIntField(term107711, term107711.getClass(), "type", 0);
        setField(term107711, term107711.getClass(), "next", null);
        setField(term107711, term107711.getClass(), "first", null);
        setField(term107711, term107711.getClass(), "last", null);
        setField(term107711, term107711.getClass(), "propListHead", null);
        setIntField(term107711, term107711.getClass(), "sourcePosition", 0);
        setField(term107711, term107711.getClass(), "jsType", null);
        setDoubleField(term107712, term107712.getClass(), "number", 0.0);
        setIntField(term107712, term107712.getClass(), "type", 0);
        setField(term107712, term107712.getClass(), "next", null);
        setField(term107712, term107712.getClass(), "first", null);
        setField(term107712, term107712.getClass(), "last", null);
        setField(term107712, term107712.getClass(), "propListHead", null);
        setIntField(term107712, term107712.getClass(), "sourcePosition", 0);
        setField(term107712, term107712.getClass(), "jsType", null);
        setField(term107712, term107712.getClass(), "parent", null);
        setField(term107711, term107711.getClass(), "parent", term107712);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term106335;
        callMethod(klass, "process", argTypes, term106243, args);
        assertTrue(recursiveEquals(term106243, term107710));
        assertTrue(recursiveEquals(term106335, null));
    }

};


