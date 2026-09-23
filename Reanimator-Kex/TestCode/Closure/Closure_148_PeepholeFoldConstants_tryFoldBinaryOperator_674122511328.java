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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64959;
     Object term65051;
     Object term65238;
     Object term65239;
     Object term65217;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64959 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term65051 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term65121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term65051, term65051.getClass(), "first", term65051);
        setField(term65051, term65051.getClass(), "next", term65121);
        setIntField(term65051, term65051.getClass(), "type", 23);
        term65238 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term65238, term65238.getClass(), "currentTraversal", null);
        term65239 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term65240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term65239, term65239.getClass(), "str", null);
        setIntField(term65239, term65239.getClass(), "type", 23);
        setIntField(term65240, term65240.getClass(), "type", 0);
        setField(term65240, term65240.getClass(), "next", null);
        setField(term65240, term65240.getClass(), "first", null);
        setField(term65240, term65240.getClass(), "last", null);
        setField(term65240, term65240.getClass(), "propListHead", null);
        setIntField(term65240, term65240.getClass(), "sourcePosition", 0);
        setField(term65240, term65240.getClass(), "jsType", null);
        setField(term65240, term65240.getClass(), "parent", null);
        setField(term65239, term65239.getClass(), "next", term65240);
        setField(term65239, term65239.getClass(), "first", term65239);
        setField(term65239, term65239.getClass(), "last", null);
        setField(term65239, term65239.getClass(), "propListHead", null);
        setIntField(term65239, term65239.getClass(), "sourcePosition", 0);
        setField(term65239, term65239.getClass(), "jsType", null);
        setField(term65239, term65239.getClass(), "parent", null);
        term65217 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term65219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term65217, term65217.getClass(), "str", null);
        setIntField(term65217, term65217.getClass(), "type", 23);
        setIntField(term65219, term65219.getClass(), "type", 0);
        setField(term65219, term65219.getClass(), "next", null);
        setField(term65219, term65219.getClass(), "first", null);
        setField(term65219, term65219.getClass(), "last", null);
        setField(term65219, term65219.getClass(), "propListHead", null);
        setIntField(term65219, term65219.getClass(), "sourcePosition", 0);
        setField(term65219, term65219.getClass(), "jsType", null);
        setField(term65219, term65219.getClass(), "parent", null);
        setField(term65217, term65217.getClass(), "next", term65219);
        setField(term65217, term65217.getClass(), "first", term65217);
        setField(term65217, term65217.getClass(), "last", null);
        setField(term65217, term65217.getClass(), "propListHead", null);
        setIntField(term65217, term65217.getClass(), "sourcePosition", 0);
        setField(term65217, term65217.getClass(), "jsType", null);
        setField(term65217, term65217.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term65051;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term64959, args);
        assertTrue(recursiveEquals(term64959, term65238));
        assertTrue(recursiveEquals(term65051, term65239));
        assertTrue(recursiveEquals(retValue, term65217));
    }

};


