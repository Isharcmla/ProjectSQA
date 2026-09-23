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

public class ScopedAliases_process_840655313164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99289;
     Object term99381;
     Object term100469;
     Object term100470;

    public ScopedAliases_process_840655313164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99289 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term99289, term99289.getClass(), "compiler", null);
        term99381 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term99473 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term99381, term99381.getClass(), "type", 0);
        setIntField(term99473, term99473.getClass(), "type", 0);
        setField(term99473, term99473.getClass(), "parent", null);
        setField(term99381, term99381.getClass(), "parent", term99473);
        setField(term99381, term99381.getClass(), "first", null);
        term100469 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term100469, term100469.getClass(), "compiler", null);
        setField(term100469, term100469.getClass(), "preprocessorSymbolTable", null);
        setField(term100469, term100469.getClass(), "transformationHandler", null);
        term100470 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term100471 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term100470, term100470.getClass(), "number", 0.0);
        setIntField(term100470, term100470.getClass(), "type", 0);
        setField(term100470, term100470.getClass(), "next", null);
        setField(term100470, term100470.getClass(), "first", null);
        setField(term100470, term100470.getClass(), "last", null);
        setField(term100470, term100470.getClass(), "propListHead", null);
        setIntField(term100470, term100470.getClass(), "sourcePosition", 0);
        setField(term100470, term100470.getClass(), "jsType", null);
        setDoubleField(term100471, term100471.getClass(), "number", 0.0);
        setIntField(term100471, term100471.getClass(), "type", 0);
        setField(term100471, term100471.getClass(), "next", null);
        setField(term100471, term100471.getClass(), "first", null);
        setField(term100471, term100471.getClass(), "last", null);
        setField(term100471, term100471.getClass(), "propListHead", null);
        setIntField(term100471, term100471.getClass(), "sourcePosition", 0);
        setField(term100471, term100471.getClass(), "jsType", null);
        setField(term100471, term100471.getClass(), "parent", null);
        setField(term100470, term100470.getClass(), "parent", term100471);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term99381;
        callMethod(klass, "process", argTypes, term99289, args);
        assertTrue(recursiveEquals(term99289, term100469));
        assertTrue(recursiveEquals(term99381, null));
    }

};


