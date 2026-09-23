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

public class ScopedAliases_process_840655313359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245797;
     Object term245889;
     Object term246326;
     Object term246327;

    public ScopedAliases_process_840655313359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245797 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term245797, term245797.getClass(), "compiler", null);
        term245889 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term245981 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term245889, term245889.getClass(), "type", 0);
        setIntField(term245981, term245981.getClass(), "type", 132);
        setField(term245981, term245981.getClass(), "propListHead", null);
        setField(term245889, term245889.getClass(), "parent", term245981);
        setField(term245889, term245889.getClass(), "first", null);
        term246326 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term246326, term246326.getClass(), "compiler", null);
        setField(term246326, term246326.getClass(), "preprocessorSymbolTable", null);
        setField(term246326, term246326.getClass(), "transformationHandler", null);
        term246327 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term246328 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term246327, term246327.getClass(), "number", 0.0);
        setIntField(term246327, term246327.getClass(), "type", 0);
        setField(term246327, term246327.getClass(), "next", null);
        setField(term246327, term246327.getClass(), "first", null);
        setField(term246327, term246327.getClass(), "last", null);
        setField(term246327, term246327.getClass(), "propListHead", null);
        setIntField(term246327, term246327.getClass(), "sourcePosition", 0);
        setField(term246327, term246327.getClass(), "jsType", null);
        setDoubleField(term246328, term246328.getClass(), "number", 0.0);
        setIntField(term246328, term246328.getClass(), "type", 132);
        setField(term246328, term246328.getClass(), "next", null);
        setField(term246328, term246328.getClass(), "first", null);
        setField(term246328, term246328.getClass(), "last", null);
        setField(term246328, term246328.getClass(), "propListHead", null);
        setIntField(term246328, term246328.getClass(), "sourcePosition", 0);
        setField(term246328, term246328.getClass(), "jsType", null);
        setField(term246328, term246328.getClass(), "parent", null);
        setField(term246327, term246327.getClass(), "parent", term246328);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term245889;
        callMethod(klass, "process", argTypes, term245797, args);
        assertTrue(recursiveEquals(term245797, term246326));
        assertTrue(recursiveEquals(term245889, null));
    }

};


