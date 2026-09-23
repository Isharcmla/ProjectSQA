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

public class ScopedAliases_process_840655313197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120216;
     Object term120308;
     Object term120911;
     Object term120912;

    public ScopedAliases_process_840655313197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120216 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term120216, term120216.getClass(), "compiler", null);
        term120308 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term120400 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term120492 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term120308, term120308.getClass(), "type", 0);
        setIntField(term120400, term120400.getClass(), "type", 0);
        setField(term120400, term120400.getClass(), "parent", null);
        setField(term120308, term120308.getClass(), "parent", term120400);
        setField(term120308, term120308.getClass(), "first", term120492);
        term120911 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term120911, term120911.getClass(), "compiler", null);
        setField(term120911, term120911.getClass(), "preprocessorSymbolTable", null);
        setField(term120911, term120911.getClass(), "transformationHandler", null);
        term120912 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term120913 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term120914 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term120912, term120912.getClass(), "str", null);
        setIntField(term120912, term120912.getClass(), "type", 0);
        setField(term120912, term120912.getClass(), "next", null);
        setField(term120913, term120913.getClass(), "str", null);
        setIntField(term120913, term120913.getClass(), "type", 0);
        setField(term120913, term120913.getClass(), "next", null);
        setField(term120913, term120913.getClass(), "first", null);
        setField(term120913, term120913.getClass(), "last", null);
        setField(term120913, term120913.getClass(), "propListHead", null);
        setIntField(term120913, term120913.getClass(), "sourcePosition", 0);
        setField(term120913, term120913.getClass(), "jsType", null);
        setField(term120913, term120913.getClass(), "parent", null);
        setField(term120912, term120912.getClass(), "first", term120913);
        setField(term120912, term120912.getClass(), "last", null);
        setField(term120912, term120912.getClass(), "propListHead", null);
        setIntField(term120912, term120912.getClass(), "sourcePosition", 0);
        setField(term120912, term120912.getClass(), "jsType", null);
        setField(term120914, term120914.getClass(), "str", null);
        setIntField(term120914, term120914.getClass(), "type", 0);
        setField(term120914, term120914.getClass(), "next", null);
        setField(term120914, term120914.getClass(), "first", null);
        setField(term120914, term120914.getClass(), "last", null);
        setField(term120914, term120914.getClass(), "propListHead", null);
        setIntField(term120914, term120914.getClass(), "sourcePosition", 0);
        setField(term120914, term120914.getClass(), "jsType", null);
        setField(term120914, term120914.getClass(), "parent", null);
        setField(term120912, term120912.getClass(), "parent", term120914);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term120308;
        callMethod(klass, "process", argTypes, term120216, args);
        assertTrue(recursiveEquals(term120216, term120911));
        assertTrue(recursiveEquals(term120308, null));
    }

};


