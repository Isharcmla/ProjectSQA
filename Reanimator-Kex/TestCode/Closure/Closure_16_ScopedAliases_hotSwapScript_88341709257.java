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

public class ScopedAliases_hotSwapScript_88341709257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163128;
     Object term163220;
     Object term163488;
     Object term163489;

    public ScopedAliases_hotSwapScript_88341709257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163128 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term163128, term163128.getClass(), "compiler", null);
        term163220 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term163220, term163220.getClass(), "type", 105);
        setField(term163220, term163220.getClass(), "parent", null);
        term163488 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term163488, term163488.getClass(), "compiler", null);
        setField(term163488, term163488.getClass(), "preprocessorSymbolTable", null);
        setField(term163488, term163488.getClass(), "transformationHandler", null);
        term163489 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term163489, term163489.getClass(), "number", 0.0);
        setIntField(term163489, term163489.getClass(), "type", 105);
        setField(term163489, term163489.getClass(), "next", null);
        setField(term163489, term163489.getClass(), "first", null);
        setField(term163489, term163489.getClass(), "last", null);
        setField(term163489, term163489.getClass(), "propListHead", null);
        setIntField(term163489, term163489.getClass(), "sourcePosition", 0);
        setField(term163489, term163489.getClass(), "jsType", null);
        setField(term163489, term163489.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term163220;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term163128, args);
        assertTrue(recursiveEquals(term163128, term163488));
        assertTrue(recursiveEquals(term163220, term163489));
    }

};


