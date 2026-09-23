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

public class ScopedAliases_hotSwapScript_8834170987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51466;
     Object term51536;
     Object term52708;
     Object term52709;

    public ScopedAliases_hotSwapScript_8834170987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51466 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term51466, term51466.getClass(), "compiler", null);
        term51536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51676 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51816 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51886 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term51536, term51536.getClass(), "type", 0);
        setField(term51536, term51536.getClass(), "parent", null);
        setField(term51676, term51676.getClass(), "next", null);
        setIntField(term51676, term51676.getClass(), "type", 0);
        setField(term51676, term51676.getClass(), "first", null);
        setField(term51606, term51606.getClass(), "next", term51676);
        setIntField(term51606, term51606.getClass(), "type", 0);
        setField(term51816, term51816.getClass(), "next", null);
        setIntField(term51816, term51816.getClass(), "type", 0);
        setField(term51816, term51816.getClass(), "first", null);
        setField(term51746, term51746.getClass(), "next", term51816);
        setIntField(term51746, term51746.getClass(), "type", 0);
        setField(term51886, term51886.getClass(), "next", null);
        setIntField(term51886, term51886.getClass(), "type", 0);
        setField(term51886, term51886.getClass(), "first", null);
        setField(term51746, term51746.getClass(), "first", term51886);
        setField(term51606, term51606.getClass(), "first", term51746);
        setField(term51536, term51536.getClass(), "first", term51606);
        term52708 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term52708, term52708.getClass(), "compiler", null);
        setField(term52708, term52708.getClass(), "preprocessorSymbolTable", null);
        setField(term52708, term52708.getClass(), "transformationHandler", null);
        term52709 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term52709, term52709.getClass(), "type", 0);
        setField(term52709, term52709.getClass(), "next", null);
        setIntField(term52710, term52710.getClass(), "type", 0);
        setIntField(term52711, term52711.getClass(), "type", 0);
        setField(term52711, term52711.getClass(), "next", null);
        setField(term52711, term52711.getClass(), "first", null);
        setField(term52711, term52711.getClass(), "last", null);
        setField(term52711, term52711.getClass(), "propListHead", null);
        setIntField(term52711, term52711.getClass(), "sourcePosition", 0);
        setField(term52711, term52711.getClass(), "jsType", null);
        setField(term52711, term52711.getClass(), "parent", null);
        setField(term52710, term52710.getClass(), "next", term52711);
        setIntField(term52712, term52712.getClass(), "type", 0);
        setIntField(term52713, term52713.getClass(), "type", 0);
        setField(term52713, term52713.getClass(), "next", null);
        setField(term52713, term52713.getClass(), "first", null);
        setField(term52713, term52713.getClass(), "last", null);
        setField(term52713, term52713.getClass(), "propListHead", null);
        setIntField(term52713, term52713.getClass(), "sourcePosition", 0);
        setField(term52713, term52713.getClass(), "jsType", null);
        setField(term52713, term52713.getClass(), "parent", null);
        setField(term52712, term52712.getClass(), "next", term52713);
        setIntField(term52714, term52714.getClass(), "type", 0);
        setField(term52714, term52714.getClass(), "next", null);
        setField(term52714, term52714.getClass(), "first", null);
        setField(term52714, term52714.getClass(), "last", null);
        setField(term52714, term52714.getClass(), "propListHead", null);
        setIntField(term52714, term52714.getClass(), "sourcePosition", 0);
        setField(term52714, term52714.getClass(), "jsType", null);
        setField(term52714, term52714.getClass(), "parent", null);
        setField(term52712, term52712.getClass(), "first", term52714);
        setField(term52712, term52712.getClass(), "last", null);
        setField(term52712, term52712.getClass(), "propListHead", null);
        setIntField(term52712, term52712.getClass(), "sourcePosition", 0);
        setField(term52712, term52712.getClass(), "jsType", null);
        setField(term52712, term52712.getClass(), "parent", null);
        setField(term52710, term52710.getClass(), "first", term52712);
        setField(term52710, term52710.getClass(), "last", null);
        setField(term52710, term52710.getClass(), "propListHead", null);
        setIntField(term52710, term52710.getClass(), "sourcePosition", 0);
        setField(term52710, term52710.getClass(), "jsType", null);
        setField(term52710, term52710.getClass(), "parent", null);
        setField(term52709, term52709.getClass(), "first", term52710);
        setField(term52709, term52709.getClass(), "last", null);
        setField(term52709, term52709.getClass(), "propListHead", null);
        setIntField(term52709, term52709.getClass(), "sourcePosition", 0);
        setField(term52709, term52709.getClass(), "jsType", null);
        setField(term52709, term52709.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term51536;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term51466, args);
        assertTrue(recursiveEquals(term51466, term52708));
        assertTrue(recursiveEquals(term51536, term52709));
    }

};


