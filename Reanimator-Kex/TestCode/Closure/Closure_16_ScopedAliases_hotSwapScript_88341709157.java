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

public class ScopedAliases_hotSwapScript_88341709157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95238;
     Object term95330;
     Object term96031;
     Object term96032;

    public ScopedAliases_hotSwapScript_88341709157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95238 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term95238, term95238.getClass(), "compiler", null);
        term95330 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term95330, term95330.getClass(), "type", 0);
        setField(term95330, term95330.getClass(), "parent", null);
        setField(term95330, term95330.getClass(), "first", null);
        term96031 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term96031, term96031.getClass(), "compiler", null);
        setField(term96031, term96031.getClass(), "preprocessorSymbolTable", null);
        setField(term96031, term96031.getClass(), "transformationHandler", null);
        term96032 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term96032, term96032.getClass(), "number", 0.0);
        setIntField(term96032, term96032.getClass(), "type", 0);
        setField(term96032, term96032.getClass(), "next", null);
        setField(term96032, term96032.getClass(), "first", null);
        setField(term96032, term96032.getClass(), "last", null);
        setField(term96032, term96032.getClass(), "propListHead", null);
        setIntField(term96032, term96032.getClass(), "sourcePosition", 0);
        setField(term96032, term96032.getClass(), "jsType", null);
        setField(term96032, term96032.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term95330;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term95238, args);
        assertTrue(recursiveEquals(term95238, term96031));
        assertTrue(recursiveEquals(term95330, term96032));
    }

};


