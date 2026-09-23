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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17999;
     Object term18069;
     Object term18607;
     Object term18608;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17999 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term18069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18069, term18069.getClass(), "type", 115);
        setIntField(term18139, term18139.getClass(), "type", 2);
        setIntField(term18209, term18209.getClass(), "type", 1);
        setField(term18209, term18209.getClass(), "first", null);
        setField(term18209, term18209.getClass(), "next", null);
        setField(term18139, term18139.getClass(), "first", term18209);
        setIntField(term18279, term18279.getClass(), "type", 0);
        setField(term18279, term18279.getClass(), "first", null);
        setField(term18279, term18279.getClass(), "next", null);
        setField(term18139, term18139.getClass(), "next", term18279);
        setField(term18069, term18069.getClass(), "first", term18139);
        term18607 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term18607, term18607.getClass(), "late", false);
        setIntField(term18607, term18607.getClass(), "STRING_SPLIT_OVERHEAD", 0);
        setField(term18607, term18607.getClass(), "compiler", null);
        term18608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18610 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18611 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18608, term18608.getClass(), "type", 115);
        setField(term18608, term18608.getClass(), "next", null);
        setIntField(term18609, term18609.getClass(), "type", 2);
        setIntField(term18610, term18610.getClass(), "type", 0);
        setField(term18610, term18610.getClass(), "next", null);
        setField(term18610, term18610.getClass(), "first", null);
        setField(term18610, term18610.getClass(), "last", null);
        setField(term18610, term18610.getClass(), "propListHead", null);
        setIntField(term18610, term18610.getClass(), "sourcePosition", 0);
        setField(term18610, term18610.getClass(), "jsType", null);
        setField(term18610, term18610.getClass(), "parent", null);
        setField(term18609, term18609.getClass(), "next", term18610);
        setIntField(term18611, term18611.getClass(), "type", 1);
        setField(term18611, term18611.getClass(), "next", null);
        setField(term18611, term18611.getClass(), "first", null);
        setField(term18611, term18611.getClass(), "last", null);
        setField(term18611, term18611.getClass(), "propListHead", null);
        setIntField(term18611, term18611.getClass(), "sourcePosition", 0);
        setField(term18611, term18611.getClass(), "jsType", null);
        setField(term18611, term18611.getClass(), "parent", null);
        setField(term18609, term18609.getClass(), "first", term18611);
        setField(term18609, term18609.getClass(), "last", null);
        setField(term18609, term18609.getClass(), "propListHead", null);
        setIntField(term18609, term18609.getClass(), "sourcePosition", 0);
        setField(term18609, term18609.getClass(), "jsType", null);
        setField(term18609, term18609.getClass(), "parent", null);
        setField(term18608, term18608.getClass(), "first", term18609);
        setField(term18608, term18608.getClass(), "last", null);
        setField(term18608, term18608.getClass(), "propListHead", null);
        setIntField(term18608, term18608.getClass(), "sourcePosition", 0);
        setField(term18608, term18608.getClass(), "jsType", null);
        setField(term18608, term18608.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term18069;
        Object retValue = callMethod(klass, "isPure", argTypes, term17999, args);
        assertTrue(recursiveEquals(term17999, term18607));
        assertTrue(recursiveEquals(term18069, term18608));
        assertTrue(recursiveEquals(retValue, false));
    }

};


