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

public class ScopedAliases_process_840655313107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62800;
     Object term62892;
     Object term63740;
     Object term63741;

    public ScopedAliases_process_840655313107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62800 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term62800, term62800.getClass(), "compiler", null);
        term62892 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term62984 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term62892, term62892.getClass(), "type", 0);
        setIntField(term62984, term62984.getClass(), "type", 0);
        setField(term62984, term62984.getClass(), "parent", null);
        setField(term62892, term62892.getClass(), "parent", term62984);
        setField(term62892, term62892.getClass(), "first", null);
        term63740 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term63740, term63740.getClass(), "compiler", null);
        setField(term63740, term63740.getClass(), "preprocessorSymbolTable", null);
        setField(term63740, term63740.getClass(), "transformationHandler", null);
        term63741 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term63742 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term63741, term63741.getClass(), "number", 0.0);
        setIntField(term63741, term63741.getClass(), "type", 0);
        setField(term63741, term63741.getClass(), "next", null);
        setField(term63741, term63741.getClass(), "first", null);
        setField(term63741, term63741.getClass(), "last", null);
        setField(term63741, term63741.getClass(), "propListHead", null);
        setIntField(term63741, term63741.getClass(), "sourcePosition", 0);
        setField(term63741, term63741.getClass(), "jsType", null);
        setDoubleField(term63742, term63742.getClass(), "number", 0.0);
        setIntField(term63742, term63742.getClass(), "type", 0);
        setField(term63742, term63742.getClass(), "next", null);
        setField(term63742, term63742.getClass(), "first", null);
        setField(term63742, term63742.getClass(), "last", null);
        setField(term63742, term63742.getClass(), "propListHead", null);
        setIntField(term63742, term63742.getClass(), "sourcePosition", 0);
        setField(term63742, term63742.getClass(), "jsType", null);
        setField(term63742, term63742.getClass(), "parent", null);
        setField(term63741, term63741.getClass(), "parent", term63742);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term62892;
        callMethod(klass, "process", argTypes, term62800, args);
        assertTrue(recursiveEquals(term62800, term63740));
        assertTrue(recursiveEquals(term62892, null));
    }

};


