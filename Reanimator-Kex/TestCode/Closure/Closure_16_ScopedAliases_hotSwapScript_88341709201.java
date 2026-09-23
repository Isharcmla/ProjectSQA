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

public class ScopedAliases_hotSwapScript_88341709201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121901;
     Object term121993;
     Object term122918;
     Object term122919;

    public ScopedAliases_hotSwapScript_88341709201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121901 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term121901, term121901.getClass(), "compiler", null);
        term121993 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term121993, term121993.getClass(), "type", -133);
        setField(term121993, term121993.getClass(), "parent", null);
        term122918 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term122918, term122918.getClass(), "compiler", null);
        setField(term122918, term122918.getClass(), "preprocessorSymbolTable", null);
        setField(term122918, term122918.getClass(), "transformationHandler", null);
        term122919 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term122919, term122919.getClass(), "number", 0.0);
        setIntField(term122919, term122919.getClass(), "type", -133);
        setField(term122919, term122919.getClass(), "next", null);
        setField(term122919, term122919.getClass(), "first", null);
        setField(term122919, term122919.getClass(), "last", null);
        setField(term122919, term122919.getClass(), "propListHead", null);
        setIntField(term122919, term122919.getClass(), "sourcePosition", 0);
        setField(term122919, term122919.getClass(), "jsType", null);
        setField(term122919, term122919.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term121993;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term121901, args);
        assertTrue(recursiveEquals(term121901, term122918));
        assertTrue(recursiveEquals(term121993, term122919));
    }

};


