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

public class ScopedAliases_process_840655313329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220408;
     Object term220500;
     Object term221294;
     Object term221295;

    public ScopedAliases_process_840655313329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term220408 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term220408, term220408.getClass(), "compiler", null);
        term220500 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term220592 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term220684 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term220776 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term220500, term220500.getClass(), "type", 0);
        setIntField(term220592, term220592.getClass(), "type", 0);
        setField(term220592, term220592.getClass(), "parent", null);
        setField(term220500, term220500.getClass(), "parent", term220592);
        setField(term220684, term220684.getClass(), "next", null);
        setIntField(term220684, term220684.getClass(), "type", 0);
        setField(term220776, term220776.getClass(), "next", null);
        setIntField(term220776, term220776.getClass(), "type", 0);
        setField(term220776, term220776.getClass(), "first", null);
        setField(term220684, term220684.getClass(), "first", term220776);
        setField(term220500, term220500.getClass(), "first", term220684);
        term221294 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term221294, term221294.getClass(), "compiler", null);
        setField(term221294, term221294.getClass(), "preprocessorSymbolTable", null);
        setField(term221294, term221294.getClass(), "transformationHandler", null);
        term221295 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term221296 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term221297 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term221298 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term221295, term221295.getClass(), "str", null);
        setIntField(term221295, term221295.getClass(), "type", 0);
        setField(term221295, term221295.getClass(), "next", null);
        setField(term221296, term221296.getClass(), "str", null);
        setIntField(term221296, term221296.getClass(), "type", 0);
        setField(term221296, term221296.getClass(), "next", null);
        setField(term221297, term221297.getClass(), "str", null);
        setIntField(term221297, term221297.getClass(), "type", 0);
        setField(term221297, term221297.getClass(), "next", null);
        setField(term221297, term221297.getClass(), "first", null);
        setField(term221297, term221297.getClass(), "last", null);
        setField(term221297, term221297.getClass(), "propListHead", null);
        setIntField(term221297, term221297.getClass(), "sourcePosition", 0);
        setField(term221297, term221297.getClass(), "jsType", null);
        setField(term221297, term221297.getClass(), "parent", null);
        setField(term221296, term221296.getClass(), "first", term221297);
        setField(term221296, term221296.getClass(), "last", null);
        setField(term221296, term221296.getClass(), "propListHead", null);
        setIntField(term221296, term221296.getClass(), "sourcePosition", 0);
        setField(term221296, term221296.getClass(), "jsType", null);
        setField(term221296, term221296.getClass(), "parent", null);
        setField(term221295, term221295.getClass(), "first", term221296);
        setField(term221295, term221295.getClass(), "last", null);
        setField(term221295, term221295.getClass(), "propListHead", null);
        setIntField(term221295, term221295.getClass(), "sourcePosition", 0);
        setField(term221295, term221295.getClass(), "jsType", null);
        setField(term221298, term221298.getClass(), "str", null);
        setIntField(term221298, term221298.getClass(), "type", 0);
        setField(term221298, term221298.getClass(), "next", null);
        setField(term221298, term221298.getClass(), "first", null);
        setField(term221298, term221298.getClass(), "last", null);
        setField(term221298, term221298.getClass(), "propListHead", null);
        setIntField(term221298, term221298.getClass(), "sourcePosition", 0);
        setField(term221298, term221298.getClass(), "jsType", null);
        setField(term221298, term221298.getClass(), "parent", null);
        setField(term221295, term221295.getClass(), "parent", term221298);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term220500;
        callMethod(klass, "process", argTypes, term220408, args);
        assertTrue(recursiveEquals(term220408, term221294));
        assertTrue(recursiveEquals(term220500, null));
    }

};


