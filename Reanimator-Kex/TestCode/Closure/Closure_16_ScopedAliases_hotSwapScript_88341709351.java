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

public class ScopedAliases_hotSwapScript_88341709351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238931;
     Object term239001;
     Object term240190;
     Object term240191;

    public ScopedAliases_hotSwapScript_88341709351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238931 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term238931, term238931.getClass(), "compiler", null);
        term239001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term239071 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term239141 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term239211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term239281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term239351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term239001, term239001.getClass(), "type", 37);
        setField(term239001, term239001.getClass(), "parent", null);
        setField(term239211, term239211.getClass(), "next", null);
        setIntField(term239211, term239211.getClass(), "type", 0);
        setField(term239211, term239211.getClass(), "first", null);
        setField(term239141, term239141.getClass(), "next", term239211);
        setIntField(term239141, term239141.getClass(), "type", 37);
        setField(term239281, term239281.getClass(), "next", null);
        setIntField(term239281, term239281.getClass(), "type", 0);
        setField(term239281, term239281.getClass(), "first", null);
        setField(term239141, term239141.getClass(), "first", term239281);
        setField(term239071, term239071.getClass(), "next", term239141);
        setIntField(term239071, term239071.getClass(), "type", 0);
        setField(term239351, term239351.getClass(), "next", null);
        setIntField(term239351, term239351.getClass(), "type", 0);
        setField(term239351, term239351.getClass(), "first", null);
        setField(term239071, term239071.getClass(), "first", term239351);
        setField(term239001, term239001.getClass(), "first", term239071);
        term240190 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term240190, term240190.getClass(), "compiler", null);
        setField(term240190, term240190.getClass(), "preprocessorSymbolTable", null);
        setField(term240190, term240190.getClass(), "transformationHandler", null);
        term240191 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term240192 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term240193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term240194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term240195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term240196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term240191, term240191.getClass(), "type", 37);
        setField(term240191, term240191.getClass(), "next", null);
        setIntField(term240192, term240192.getClass(), "type", 0);
        setIntField(term240193, term240193.getClass(), "type", 37);
        setIntField(term240194, term240194.getClass(), "type", 0);
        setField(term240194, term240194.getClass(), "next", null);
        setField(term240194, term240194.getClass(), "first", null);
        setField(term240194, term240194.getClass(), "last", null);
        setField(term240194, term240194.getClass(), "propListHead", null);
        setIntField(term240194, term240194.getClass(), "sourcePosition", 0);
        setField(term240194, term240194.getClass(), "jsType", null);
        setField(term240194, term240194.getClass(), "parent", null);
        setField(term240193, term240193.getClass(), "next", term240194);
        setIntField(term240195, term240195.getClass(), "type", 0);
        setField(term240195, term240195.getClass(), "next", null);
        setField(term240195, term240195.getClass(), "first", null);
        setField(term240195, term240195.getClass(), "last", null);
        setField(term240195, term240195.getClass(), "propListHead", null);
        setIntField(term240195, term240195.getClass(), "sourcePosition", 0);
        setField(term240195, term240195.getClass(), "jsType", null);
        setField(term240195, term240195.getClass(), "parent", null);
        setField(term240193, term240193.getClass(), "first", term240195);
        setField(term240193, term240193.getClass(), "last", null);
        setField(term240193, term240193.getClass(), "propListHead", null);
        setIntField(term240193, term240193.getClass(), "sourcePosition", 0);
        setField(term240193, term240193.getClass(), "jsType", null);
        setField(term240193, term240193.getClass(), "parent", null);
        setField(term240192, term240192.getClass(), "next", term240193);
        setIntField(term240196, term240196.getClass(), "type", 0);
        setField(term240196, term240196.getClass(), "next", null);
        setField(term240196, term240196.getClass(), "first", null);
        setField(term240196, term240196.getClass(), "last", null);
        setField(term240196, term240196.getClass(), "propListHead", null);
        setIntField(term240196, term240196.getClass(), "sourcePosition", 0);
        setField(term240196, term240196.getClass(), "jsType", null);
        setField(term240196, term240196.getClass(), "parent", null);
        setField(term240192, term240192.getClass(), "first", term240196);
        setField(term240192, term240192.getClass(), "last", null);
        setField(term240192, term240192.getClass(), "propListHead", null);
        setIntField(term240192, term240192.getClass(), "sourcePosition", 0);
        setField(term240192, term240192.getClass(), "jsType", null);
        setField(term240192, term240192.getClass(), "parent", null);
        setField(term240191, term240191.getClass(), "first", term240192);
        setField(term240191, term240191.getClass(), "last", null);
        setField(term240191, term240191.getClass(), "propListHead", null);
        setIntField(term240191, term240191.getClass(), "sourcePosition", 0);
        setField(term240191, term240191.getClass(), "jsType", null);
        setField(term240191, term240191.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term239001;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term238931, args);
        assertTrue(recursiveEquals(term238931, term240190));
        assertTrue(recursiveEquals(term239001, term240191));
    }

};


