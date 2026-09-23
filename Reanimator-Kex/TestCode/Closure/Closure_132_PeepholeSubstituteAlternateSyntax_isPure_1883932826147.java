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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17023;
     Object term17093;
     Object term59058;
     Object term59059;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17023 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setField(term17023, term17023.getClass(), "compiler", null);
        term17093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17093, term17093.getClass(), "type", 96);
        setIntField(term17163, term17163.getClass(), "type", 2);
        setIntField(term17233, term17233.getClass(), "type", 1);
        setField(term17233, term17233.getClass(), "first", null);
        setField(term17233, term17233.getClass(), "next", null);
        setField(term17163, term17163.getClass(), "first", term17233);
        setIntField(term17303, term17303.getClass(), "type", 0);
        setField(term17303, term17303.getClass(), "first", null);
        setField(term17303, term17303.getClass(), "next", null);
        setField(term17163, term17163.getClass(), "next", term17303);
        setField(term17093, term17093.getClass(), "first", term17163);
        term59058 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term59058, term59058.getClass(), "late", false);
        setIntField(term59058, term59058.getClass(), "STRING_SPLIT_OVERHEAD", 0);
        setField(term59058, term59058.getClass(), "compiler", null);
        term59059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59060 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term59059, term59059.getClass(), "type", 96);
        setField(term59059, term59059.getClass(), "next", null);
        setIntField(term59060, term59060.getClass(), "type", 2);
        setIntField(term59061, term59061.getClass(), "type", 0);
        setField(term59061, term59061.getClass(), "next", null);
        setField(term59061, term59061.getClass(), "first", null);
        setField(term59061, term59061.getClass(), "last", null);
        setField(term59061, term59061.getClass(), "propListHead", null);
        setIntField(term59061, term59061.getClass(), "sourcePosition", 0);
        setField(term59061, term59061.getClass(), "jsType", null);
        setField(term59061, term59061.getClass(), "parent", null);
        setField(term59060, term59060.getClass(), "next", term59061);
        setIntField(term59062, term59062.getClass(), "type", 1);
        setField(term59062, term59062.getClass(), "next", null);
        setField(term59062, term59062.getClass(), "first", null);
        setField(term59062, term59062.getClass(), "last", null);
        setField(term59062, term59062.getClass(), "propListHead", null);
        setIntField(term59062, term59062.getClass(), "sourcePosition", 0);
        setField(term59062, term59062.getClass(), "jsType", null);
        setField(term59062, term59062.getClass(), "parent", null);
        setField(term59060, term59060.getClass(), "first", term59062);
        setField(term59060, term59060.getClass(), "last", null);
        setField(term59060, term59060.getClass(), "propListHead", null);
        setIntField(term59060, term59060.getClass(), "sourcePosition", 0);
        setField(term59060, term59060.getClass(), "jsType", null);
        setField(term59060, term59060.getClass(), "parent", null);
        setField(term59059, term59059.getClass(), "first", term59060);
        setField(term59059, term59059.getClass(), "last", null);
        setField(term59059, term59059.getClass(), "propListHead", null);
        setIntField(term59059, term59059.getClass(), "sourcePosition", 0);
        setField(term59059, term59059.getClass(), "jsType", null);
        setField(term59059, term59059.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term17093;
        Object retValue = callMethod(klass, "isPure", argTypes, term17023, args);
        assertTrue(recursiveEquals(term17023, term59058));
        assertTrue(recursiveEquals(term17093, term59059));
        assertTrue(recursiveEquals(retValue, false));
    }

};


