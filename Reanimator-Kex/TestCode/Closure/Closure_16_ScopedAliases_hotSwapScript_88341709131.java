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

public class ScopedAliases_hotSwapScript_88341709131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79556;
     Object term79626;
     Object term80781;
     Object term80782;

    public ScopedAliases_hotSwapScript_88341709131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79556 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term79556, term79556.getClass(), "compiler", null);
        term79626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term79626, term79626.getClass(), "type", 0);
        setField(term79626, term79626.getClass(), "parent", null);
        setField(term79836, term79836.getClass(), "next", null);
        setIntField(term79836, term79836.getClass(), "type", 0);
        setField(term79836, term79836.getClass(), "first", null);
        setField(term79766, term79766.getClass(), "next", term79836);
        setIntField(term79766, term79766.getClass(), "type", 37);
        setField(term79906, term79906.getClass(), "next", null);
        setIntField(term79906, term79906.getClass(), "type", 0);
        setField(term79906, term79906.getClass(), "first", null);
        setField(term79766, term79766.getClass(), "first", term79906);
        setField(term79696, term79696.getClass(), "next", term79766);
        setIntField(term79696, term79696.getClass(), "type", 0);
        setField(term79976, term79976.getClass(), "next", null);
        setIntField(term79976, term79976.getClass(), "type", 0);
        setField(term79976, term79976.getClass(), "first", null);
        setField(term79696, term79696.getClass(), "first", term79976);
        setField(term79626, term79626.getClass(), "first", term79696);
        term80781 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term80781, term80781.getClass(), "compiler", null);
        setField(term80781, term80781.getClass(), "preprocessorSymbolTable", null);
        setField(term80781, term80781.getClass(), "transformationHandler", null);
        term80782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80786 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term80782, term80782.getClass(), "type", 0);
        setField(term80782, term80782.getClass(), "next", null);
        setIntField(term80783, term80783.getClass(), "type", 0);
        setIntField(term80784, term80784.getClass(), "type", 37);
        setIntField(term80785, term80785.getClass(), "type", 0);
        setField(term80785, term80785.getClass(), "next", null);
        setField(term80785, term80785.getClass(), "first", null);
        setField(term80785, term80785.getClass(), "last", null);
        setField(term80785, term80785.getClass(), "propListHead", null);
        setIntField(term80785, term80785.getClass(), "sourcePosition", 0);
        setField(term80785, term80785.getClass(), "jsType", null);
        setField(term80785, term80785.getClass(), "parent", null);
        setField(term80784, term80784.getClass(), "next", term80785);
        setIntField(term80786, term80786.getClass(), "type", 0);
        setField(term80786, term80786.getClass(), "next", null);
        setField(term80786, term80786.getClass(), "first", null);
        setField(term80786, term80786.getClass(), "last", null);
        setField(term80786, term80786.getClass(), "propListHead", null);
        setIntField(term80786, term80786.getClass(), "sourcePosition", 0);
        setField(term80786, term80786.getClass(), "jsType", null);
        setField(term80786, term80786.getClass(), "parent", null);
        setField(term80784, term80784.getClass(), "first", term80786);
        setField(term80784, term80784.getClass(), "last", null);
        setField(term80784, term80784.getClass(), "propListHead", null);
        setIntField(term80784, term80784.getClass(), "sourcePosition", 0);
        setField(term80784, term80784.getClass(), "jsType", null);
        setField(term80784, term80784.getClass(), "parent", null);
        setField(term80783, term80783.getClass(), "next", term80784);
        setIntField(term80787, term80787.getClass(), "type", 0);
        setField(term80787, term80787.getClass(), "next", null);
        setField(term80787, term80787.getClass(), "first", null);
        setField(term80787, term80787.getClass(), "last", null);
        setField(term80787, term80787.getClass(), "propListHead", null);
        setIntField(term80787, term80787.getClass(), "sourcePosition", 0);
        setField(term80787, term80787.getClass(), "jsType", null);
        setField(term80787, term80787.getClass(), "parent", null);
        setField(term80783, term80783.getClass(), "first", term80787);
        setField(term80783, term80783.getClass(), "last", null);
        setField(term80783, term80783.getClass(), "propListHead", null);
        setIntField(term80783, term80783.getClass(), "sourcePosition", 0);
        setField(term80783, term80783.getClass(), "jsType", null);
        setField(term80783, term80783.getClass(), "parent", null);
        setField(term80782, term80782.getClass(), "first", term80783);
        setField(term80782, term80782.getClass(), "last", null);
        setField(term80782, term80782.getClass(), "propListHead", null);
        setIntField(term80782, term80782.getClass(), "sourcePosition", 0);
        setField(term80782, term80782.getClass(), "jsType", null);
        setField(term80782, term80782.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term79626;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term79556, args);
        assertTrue(recursiveEquals(term79556, term80781));
        assertTrue(recursiveEquals(term79626, term80782));
    }

};


