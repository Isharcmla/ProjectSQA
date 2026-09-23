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

public class ScopedAliases_hotSwapScript_8834170919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9741;
     Object term9811;
     Object term10815;
     Object term10816;

    public ScopedAliases_hotSwapScript_8834170919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9741 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term9741, term9741.getClass(), "compiler", null);
        term9811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9881 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9951 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10021 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9811, term9811.getClass(), "type", 0);
        setField(term9811, term9811.getClass(), "parent", null);
        setField(term9951, term9951.getClass(), "next", null);
        setIntField(term9951, term9951.getClass(), "type", 0);
        setField(term9951, term9951.getClass(), "first", null);
        setField(term9881, term9881.getClass(), "next", term9951);
        setIntField(term9881, term9881.getClass(), "type", 0);
        setField(term10021, term10021.getClass(), "next", null);
        setIntField(term10021, term10021.getClass(), "type", 0);
        setField(term10021, term10021.getClass(), "first", null);
        setField(term9881, term9881.getClass(), "first", term10021);
        setField(term9811, term9811.getClass(), "first", term9881);
        term10815 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term10815, term10815.getClass(), "compiler", null);
        setField(term10815, term10815.getClass(), "preprocessorSymbolTable", null);
        setField(term10815, term10815.getClass(), "transformationHandler", null);
        term10816 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10816, term10816.getClass(), "type", 0);
        setField(term10816, term10816.getClass(), "next", null);
        setIntField(term10817, term10817.getClass(), "type", 0);
        setIntField(term10818, term10818.getClass(), "type", 0);
        setField(term10818, term10818.getClass(), "next", null);
        setField(term10818, term10818.getClass(), "first", null);
        setField(term10818, term10818.getClass(), "last", null);
        setField(term10818, term10818.getClass(), "propListHead", null);
        setIntField(term10818, term10818.getClass(), "sourcePosition", 0);
        setField(term10818, term10818.getClass(), "jsType", null);
        setField(term10818, term10818.getClass(), "parent", null);
        setField(term10817, term10817.getClass(), "next", term10818);
        setIntField(term10819, term10819.getClass(), "type", 0);
        setField(term10819, term10819.getClass(), "next", null);
        setField(term10819, term10819.getClass(), "first", null);
        setField(term10819, term10819.getClass(), "last", null);
        setField(term10819, term10819.getClass(), "propListHead", null);
        setIntField(term10819, term10819.getClass(), "sourcePosition", 0);
        setField(term10819, term10819.getClass(), "jsType", null);
        setField(term10819, term10819.getClass(), "parent", null);
        setField(term10817, term10817.getClass(), "first", term10819);
        setField(term10817, term10817.getClass(), "last", null);
        setField(term10817, term10817.getClass(), "propListHead", null);
        setIntField(term10817, term10817.getClass(), "sourcePosition", 0);
        setField(term10817, term10817.getClass(), "jsType", null);
        setField(term10817, term10817.getClass(), "parent", null);
        setField(term10816, term10816.getClass(), "first", term10817);
        setField(term10816, term10816.getClass(), "last", null);
        setField(term10816, term10816.getClass(), "propListHead", null);
        setIntField(term10816, term10816.getClass(), "sourcePosition", 0);
        setField(term10816, term10816.getClass(), "jsType", null);
        setField(term10816, term10816.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term9811;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term9741, args);
        assertTrue(recursiveEquals(term9741, term10815));
        assertTrue(recursiveEquals(term9811, term10816));
    }

};


