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

public class ScopedAliases_hotSwapScript_88341709117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61637;
     Object term61729;
     Object term63353;
     Object term63354;

    public ScopedAliases_hotSwapScript_88341709117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61637 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term61637, term61637.getClass(), "compiler", null);
        term61729 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term61821 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term61913 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term62005 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term62097 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term61729, term61729.getClass(), "type", 0);
        setField(term61729, term61729.getClass(), "parent", null);
        setField(term62005, term62005.getClass(), "next", null);
        setIntField(term62005, term62005.getClass(), "type", 0);
        setField(term62005, term62005.getClass(), "first", null);
        setField(term61913, term61913.getClass(), "next", term62005);
        setIntField(term61913, term61913.getClass(), "type", 0);
        setField(term61913, term61913.getClass(), "first", null);
        setField(term61821, term61821.getClass(), "next", term61913);
        setIntField(term61821, term61821.getClass(), "type", 0);
        setField(term62097, term62097.getClass(), "next", null);
        setIntField(term62097, term62097.getClass(), "type", 0);
        setField(term62097, term62097.getClass(), "first", null);
        setField(term61821, term61821.getClass(), "first", term62097);
        setField(term61729, term61729.getClass(), "first", term61821);
        term63353 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term63353, term63353.getClass(), "compiler", null);
        setField(term63353, term63353.getClass(), "preprocessorSymbolTable", null);
        setField(term63353, term63353.getClass(), "transformationHandler", null);
        term63354 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term63355 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term63356 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term63357 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term63358 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term63354, term63354.getClass(), "number", 0.0);
        setIntField(term63354, term63354.getClass(), "type", 0);
        setField(term63354, term63354.getClass(), "next", null);
        setDoubleField(term63355, term63355.getClass(), "number", 0.0);
        setIntField(term63355, term63355.getClass(), "type", 0);
        setDoubleField(term63356, term63356.getClass(), "number", 0.0);
        setIntField(term63356, term63356.getClass(), "type", 0);
        setDoubleField(term63357, term63357.getClass(), "number", 0.0);
        setIntField(term63357, term63357.getClass(), "type", 0);
        setField(term63357, term63357.getClass(), "next", null);
        setField(term63357, term63357.getClass(), "first", null);
        setField(term63357, term63357.getClass(), "last", null);
        setField(term63357, term63357.getClass(), "propListHead", null);
        setIntField(term63357, term63357.getClass(), "sourcePosition", 0);
        setField(term63357, term63357.getClass(), "jsType", null);
        setField(term63357, term63357.getClass(), "parent", null);
        setField(term63356, term63356.getClass(), "next", term63357);
        setField(term63356, term63356.getClass(), "first", null);
        setField(term63356, term63356.getClass(), "last", null);
        setField(term63356, term63356.getClass(), "propListHead", null);
        setIntField(term63356, term63356.getClass(), "sourcePosition", 0);
        setField(term63356, term63356.getClass(), "jsType", null);
        setField(term63356, term63356.getClass(), "parent", null);
        setField(term63355, term63355.getClass(), "next", term63356);
        setDoubleField(term63358, term63358.getClass(), "number", 0.0);
        setIntField(term63358, term63358.getClass(), "type", 0);
        setField(term63358, term63358.getClass(), "next", null);
        setField(term63358, term63358.getClass(), "first", null);
        setField(term63358, term63358.getClass(), "last", null);
        setField(term63358, term63358.getClass(), "propListHead", null);
        setIntField(term63358, term63358.getClass(), "sourcePosition", 0);
        setField(term63358, term63358.getClass(), "jsType", null);
        setField(term63358, term63358.getClass(), "parent", null);
        setField(term63355, term63355.getClass(), "first", term63358);
        setField(term63355, term63355.getClass(), "last", null);
        setField(term63355, term63355.getClass(), "propListHead", null);
        setIntField(term63355, term63355.getClass(), "sourcePosition", 0);
        setField(term63355, term63355.getClass(), "jsType", null);
        setField(term63355, term63355.getClass(), "parent", null);
        setField(term63354, term63354.getClass(), "first", term63355);
        setField(term63354, term63354.getClass(), "last", null);
        setField(term63354, term63354.getClass(), "propListHead", null);
        setIntField(term63354, term63354.getClass(), "sourcePosition", 0);
        setField(term63354, term63354.getClass(), "jsType", null);
        setField(term63354, term63354.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term61729;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term61637, args);
        assertTrue(recursiveEquals(term61637, term63353));
        assertTrue(recursiveEquals(term61729, term63354));
    }

};


