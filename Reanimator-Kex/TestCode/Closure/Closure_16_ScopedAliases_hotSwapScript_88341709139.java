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

public class ScopedAliases_hotSwapScript_88341709139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85034;
     Object term85104;
     Object term86259;
     Object term86260;

    public ScopedAliases_hotSwapScript_88341709139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85034 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term85034, term85034.getClass(), "compiler", null);
        term85104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85314 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term85104, term85104.getClass(), "type", 0);
        setField(term85104, term85104.getClass(), "parent", null);
        setField(term85314, term85314.getClass(), "next", null);
        setIntField(term85314, term85314.getClass(), "type", 0);
        setField(term85314, term85314.getClass(), "first", null);
        setField(term85244, term85244.getClass(), "next", term85314);
        setIntField(term85244, term85244.getClass(), "type", 37);
        setField(term85384, term85384.getClass(), "next", null);
        setIntField(term85384, term85384.getClass(), "type", 0);
        setField(term85384, term85384.getClass(), "first", null);
        setField(term85244, term85244.getClass(), "first", term85384);
        setField(term85174, term85174.getClass(), "next", term85244);
        setIntField(term85174, term85174.getClass(), "type", 0);
        setField(term85454, term85454.getClass(), "next", null);
        setIntField(term85454, term85454.getClass(), "type", 0);
        setField(term85454, term85454.getClass(), "first", null);
        setField(term85174, term85174.getClass(), "first", term85454);
        setField(term85104, term85104.getClass(), "first", term85174);
        term86259 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term86259, term86259.getClass(), "compiler", null);
        setField(term86259, term86259.getClass(), "preprocessorSymbolTable", null);
        setField(term86259, term86259.getClass(), "transformationHandler", null);
        term86260 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86261 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term86260, term86260.getClass(), "type", 0);
        setField(term86260, term86260.getClass(), "next", null);
        setIntField(term86261, term86261.getClass(), "type", 0);
        setIntField(term86262, term86262.getClass(), "type", 37);
        setIntField(term86263, term86263.getClass(), "type", 0);
        setField(term86263, term86263.getClass(), "next", null);
        setField(term86263, term86263.getClass(), "first", null);
        setField(term86263, term86263.getClass(), "last", null);
        setField(term86263, term86263.getClass(), "propListHead", null);
        setIntField(term86263, term86263.getClass(), "sourcePosition", 0);
        setField(term86263, term86263.getClass(), "jsType", null);
        setField(term86263, term86263.getClass(), "parent", null);
        setField(term86262, term86262.getClass(), "next", term86263);
        setIntField(term86264, term86264.getClass(), "type", 0);
        setField(term86264, term86264.getClass(), "next", null);
        setField(term86264, term86264.getClass(), "first", null);
        setField(term86264, term86264.getClass(), "last", null);
        setField(term86264, term86264.getClass(), "propListHead", null);
        setIntField(term86264, term86264.getClass(), "sourcePosition", 0);
        setField(term86264, term86264.getClass(), "jsType", null);
        setField(term86264, term86264.getClass(), "parent", null);
        setField(term86262, term86262.getClass(), "first", term86264);
        setField(term86262, term86262.getClass(), "last", null);
        setField(term86262, term86262.getClass(), "propListHead", null);
        setIntField(term86262, term86262.getClass(), "sourcePosition", 0);
        setField(term86262, term86262.getClass(), "jsType", null);
        setField(term86262, term86262.getClass(), "parent", null);
        setField(term86261, term86261.getClass(), "next", term86262);
        setIntField(term86265, term86265.getClass(), "type", 0);
        setField(term86265, term86265.getClass(), "next", null);
        setField(term86265, term86265.getClass(), "first", null);
        setField(term86265, term86265.getClass(), "last", null);
        setField(term86265, term86265.getClass(), "propListHead", null);
        setIntField(term86265, term86265.getClass(), "sourcePosition", 0);
        setField(term86265, term86265.getClass(), "jsType", null);
        setField(term86265, term86265.getClass(), "parent", null);
        setField(term86261, term86261.getClass(), "first", term86265);
        setField(term86261, term86261.getClass(), "last", null);
        setField(term86261, term86261.getClass(), "propListHead", null);
        setIntField(term86261, term86261.getClass(), "sourcePosition", 0);
        setField(term86261, term86261.getClass(), "jsType", null);
        setField(term86261, term86261.getClass(), "parent", null);
        setField(term86260, term86260.getClass(), "first", term86261);
        setField(term86260, term86260.getClass(), "last", null);
        setField(term86260, term86260.getClass(), "propListHead", null);
        setIntField(term86260, term86260.getClass(), "sourcePosition", 0);
        setField(term86260, term86260.getClass(), "jsType", null);
        setField(term86260, term86260.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term85104;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term85034, args);
        assertTrue(recursiveEquals(term85034, term86259));
        assertTrue(recursiveEquals(term85104, term86260));
    }

};


