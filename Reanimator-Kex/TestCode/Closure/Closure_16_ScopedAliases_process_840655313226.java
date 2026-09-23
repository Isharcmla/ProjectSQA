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

public class ScopedAliases_process_840655313226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140601;
     Object term140693;
     Object term142182;
     Object term142183;

    public ScopedAliases_process_840655313226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140601 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term140601, term140601.getClass(), "compiler", null);
        term140693 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term140785 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term140877 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term140969 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term140693, term140693.getClass(), "type", 37);
        setField(term140693, term140693.getClass(), "parent", null);
        setField(term140877, term140877.getClass(), "next", null);
        setIntField(term140877, term140877.getClass(), "type", 0);
        setField(term140877, term140877.getClass(), "first", null);
        setField(term140785, term140785.getClass(), "next", term140877);
        setIntField(term140785, term140785.getClass(), "type", 0);
        setField(term140969, term140969.getClass(), "next", null);
        setIntField(term140969, term140969.getClass(), "type", 0);
        setField(term140969, term140969.getClass(), "first", null);
        setField(term140785, term140785.getClass(), "first", term140969);
        setField(term140693, term140693.getClass(), "first", term140785);
        term142182 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term142182, term142182.getClass(), "compiler", null);
        setField(term142182, term142182.getClass(), "preprocessorSymbolTable", null);
        setField(term142182, term142182.getClass(), "transformationHandler", null);
        term142183 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term142184 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term142185 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term142186 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term142183, term142183.getClass(), "number", 0.0);
        setIntField(term142183, term142183.getClass(), "type", 37);
        setField(term142183, term142183.getClass(), "next", null);
        setDoubleField(term142184, term142184.getClass(), "number", 0.0);
        setIntField(term142184, term142184.getClass(), "type", 0);
        setDoubleField(term142185, term142185.getClass(), "number", 0.0);
        setIntField(term142185, term142185.getClass(), "type", 0);
        setField(term142185, term142185.getClass(), "next", null);
        setField(term142185, term142185.getClass(), "first", null);
        setField(term142185, term142185.getClass(), "last", null);
        setField(term142185, term142185.getClass(), "propListHead", null);
        setIntField(term142185, term142185.getClass(), "sourcePosition", 0);
        setField(term142185, term142185.getClass(), "jsType", null);
        setField(term142185, term142185.getClass(), "parent", null);
        setField(term142184, term142184.getClass(), "next", term142185);
        setDoubleField(term142186, term142186.getClass(), "number", 0.0);
        setIntField(term142186, term142186.getClass(), "type", 0);
        setField(term142186, term142186.getClass(), "next", null);
        setField(term142186, term142186.getClass(), "first", null);
        setField(term142186, term142186.getClass(), "last", null);
        setField(term142186, term142186.getClass(), "propListHead", null);
        setIntField(term142186, term142186.getClass(), "sourcePosition", 0);
        setField(term142186, term142186.getClass(), "jsType", null);
        setField(term142186, term142186.getClass(), "parent", null);
        setField(term142184, term142184.getClass(), "first", term142186);
        setField(term142184, term142184.getClass(), "last", null);
        setField(term142184, term142184.getClass(), "propListHead", null);
        setIntField(term142184, term142184.getClass(), "sourcePosition", 0);
        setField(term142184, term142184.getClass(), "jsType", null);
        setField(term142184, term142184.getClass(), "parent", null);
        setField(term142183, term142183.getClass(), "first", term142184);
        setField(term142183, term142183.getClass(), "last", null);
        setField(term142183, term142183.getClass(), "propListHead", null);
        setIntField(term142183, term142183.getClass(), "sourcePosition", 0);
        setField(term142183, term142183.getClass(), "jsType", null);
        setField(term142183, term142183.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term140693;
        callMethod(klass, "process", argTypes, term140601, args);
        assertTrue(recursiveEquals(term140601, term142182));
        assertTrue(recursiveEquals(term140693, null));
    }

};


