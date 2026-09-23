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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36447;
     Object term36517;
     Object term61414;
     Object term61415;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36447 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setField(term36447, term36447.getClass(), "compiler", null);
        term36517 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36517, term36517.getClass(), "type", 56);
        setIntField(term36587, term36587.getClass(), "type", 2);
        setIntField(term36657, term36657.getClass(), "type", 1);
        setField(term36657, term36657.getClass(), "first", null);
        setField(term36657, term36657.getClass(), "next", null);
        setField(term36587, term36587.getClass(), "first", term36657);
        setIntField(term36727, term36727.getClass(), "type", 0);
        setField(term36727, term36727.getClass(), "first", null);
        setField(term36727, term36727.getClass(), "next", null);
        setField(term36587, term36587.getClass(), "next", term36727);
        setField(term36517, term36517.getClass(), "first", term36587);
        term61414 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term61414, term61414.getClass(), "late", false);
        setIntField(term61414, term61414.getClass(), "STRING_SPLIT_OVERHEAD", 0);
        setField(term61414, term61414.getClass(), "compiler", null);
        term61415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term61415, term61415.getClass(), "type", 56);
        setField(term61415, term61415.getClass(), "next", null);
        setIntField(term61416, term61416.getClass(), "type", 2);
        setIntField(term61417, term61417.getClass(), "type", 0);
        setField(term61417, term61417.getClass(), "next", null);
        setField(term61417, term61417.getClass(), "first", null);
        setField(term61417, term61417.getClass(), "last", null);
        setField(term61417, term61417.getClass(), "propListHead", null);
        setIntField(term61417, term61417.getClass(), "sourcePosition", 0);
        setField(term61417, term61417.getClass(), "jsType", null);
        setField(term61417, term61417.getClass(), "parent", null);
        setField(term61416, term61416.getClass(), "next", term61417);
        setIntField(term61418, term61418.getClass(), "type", 1);
        setField(term61418, term61418.getClass(), "next", null);
        setField(term61418, term61418.getClass(), "first", null);
        setField(term61418, term61418.getClass(), "last", null);
        setField(term61418, term61418.getClass(), "propListHead", null);
        setIntField(term61418, term61418.getClass(), "sourcePosition", 0);
        setField(term61418, term61418.getClass(), "jsType", null);
        setField(term61418, term61418.getClass(), "parent", null);
        setField(term61416, term61416.getClass(), "first", term61418);
        setField(term61416, term61416.getClass(), "last", null);
        setField(term61416, term61416.getClass(), "propListHead", null);
        setIntField(term61416, term61416.getClass(), "sourcePosition", 0);
        setField(term61416, term61416.getClass(), "jsType", null);
        setField(term61416, term61416.getClass(), "parent", null);
        setField(term61415, term61415.getClass(), "first", term61416);
        setField(term61415, term61415.getClass(), "last", null);
        setField(term61415, term61415.getClass(), "propListHead", null);
        setIntField(term61415, term61415.getClass(), "sourcePosition", 0);
        setField(term61415, term61415.getClass(), "jsType", null);
        setField(term61415, term61415.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term36517;
        Object retValue = callMethod(klass, "isPure", argTypes, term36447, args);
        assertTrue(recursiveEquals(term36447, term61414));
        assertTrue(recursiveEquals(term36517, term61415));
        assertTrue(recursiveEquals(retValue, false));
    }

};


