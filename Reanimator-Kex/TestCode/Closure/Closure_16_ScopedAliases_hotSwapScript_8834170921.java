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

public class ScopedAliases_hotSwapScript_8834170921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12450;
     Object term12520;
     Object term13848;
     Object term13849;

    public ScopedAliases_hotSwapScript_8834170921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12450 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term12450, term12450.getClass(), "compiler", null);
        term12520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12800 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12520, term12520.getClass(), "type", 0);
        setField(term12520, term12520.getClass(), "parent", null);
        setField(term12660, term12660.getClass(), "next", null);
        setIntField(term12660, term12660.getClass(), "type", 0);
        setField(term12660, term12660.getClass(), "first", term12730);
        setField(term12590, term12590.getClass(), "next", term12660);
        setIntField(term12590, term12590.getClass(), "type", 0);
        setField(term12800, term12800.getClass(), "next", null);
        setIntField(term12800, term12800.getClass(), "type", 0);
        setField(term12800, term12800.getClass(), "first", null);
        setField(term12590, term12590.getClass(), "first", term12800);
        setField(term12520, term12520.getClass(), "first", term12590);
        term13848 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term13848, term13848.getClass(), "compiler", null);
        setField(term13848, term13848.getClass(), "preprocessorSymbolTable", null);
        setField(term13848, term13848.getClass(), "transformationHandler", null);
        term13849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13850 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13852 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13849, term13849.getClass(), "type", 0);
        setField(term13849, term13849.getClass(), "next", null);
        setIntField(term13850, term13850.getClass(), "type", 0);
        setIntField(term13851, term13851.getClass(), "type", 0);
        setField(term13851, term13851.getClass(), "next", null);
        setIntField(term13852, term13852.getClass(), "type", 0);
        setField(term13852, term13852.getClass(), "next", null);
        setField(term13852, term13852.getClass(), "first", null);
        setField(term13852, term13852.getClass(), "last", null);
        setField(term13852, term13852.getClass(), "propListHead", null);
        setIntField(term13852, term13852.getClass(), "sourcePosition", 0);
        setField(term13852, term13852.getClass(), "jsType", null);
        setField(term13852, term13852.getClass(), "parent", null);
        setField(term13851, term13851.getClass(), "first", term13852);
        setField(term13851, term13851.getClass(), "last", null);
        setField(term13851, term13851.getClass(), "propListHead", null);
        setIntField(term13851, term13851.getClass(), "sourcePosition", 0);
        setField(term13851, term13851.getClass(), "jsType", null);
        setField(term13851, term13851.getClass(), "parent", null);
        setField(term13850, term13850.getClass(), "next", term13851);
        setIntField(term13853, term13853.getClass(), "type", 0);
        setField(term13853, term13853.getClass(), "next", null);
        setField(term13853, term13853.getClass(), "first", null);
        setField(term13853, term13853.getClass(), "last", null);
        setField(term13853, term13853.getClass(), "propListHead", null);
        setIntField(term13853, term13853.getClass(), "sourcePosition", 0);
        setField(term13853, term13853.getClass(), "jsType", null);
        setField(term13853, term13853.getClass(), "parent", null);
        setField(term13850, term13850.getClass(), "first", term13853);
        setField(term13850, term13850.getClass(), "last", null);
        setField(term13850, term13850.getClass(), "propListHead", null);
        setIntField(term13850, term13850.getClass(), "sourcePosition", 0);
        setField(term13850, term13850.getClass(), "jsType", null);
        setField(term13850, term13850.getClass(), "parent", null);
        setField(term13849, term13849.getClass(), "first", term13850);
        setField(term13849, term13849.getClass(), "last", null);
        setField(term13849, term13849.getClass(), "propListHead", null);
        setIntField(term13849, term13849.getClass(), "sourcePosition", 0);
        setField(term13849, term13849.getClass(), "jsType", null);
        setField(term13849, term13849.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term12520;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term12450, args);
        assertTrue(recursiveEquals(term12450, term13848));
        assertTrue(recursiveEquals(term12520, term13849));
    }

};


