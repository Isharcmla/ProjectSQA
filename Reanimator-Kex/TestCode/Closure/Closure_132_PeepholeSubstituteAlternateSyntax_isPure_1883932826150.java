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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18156;
     Object term18226;
     Object term59481;
     Object term59482;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18156 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setField(term18156, term18156.getClass(), "compiler", null);
        term18226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18296 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18366 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18226, term18226.getClass(), "type", 107);
        setIntField(term18296, term18296.getClass(), "type", 2);
        setIntField(term18366, term18366.getClass(), "type", 1);
        setField(term18366, term18366.getClass(), "first", null);
        setField(term18366, term18366.getClass(), "next", null);
        setField(term18296, term18296.getClass(), "first", term18366);
        setIntField(term18436, term18436.getClass(), "type", 0);
        setField(term18436, term18436.getClass(), "first", null);
        setField(term18436, term18436.getClass(), "next", null);
        setField(term18296, term18296.getClass(), "next", term18436);
        setField(term18226, term18226.getClass(), "first", term18296);
        term59481 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term59481, term59481.getClass(), "late", false);
        setIntField(term59481, term59481.getClass(), "STRING_SPLIT_OVERHEAD", 0);
        setField(term59481, term59481.getClass(), "compiler", null);
        term59482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term59482, term59482.getClass(), "type", 107);
        setField(term59482, term59482.getClass(), "next", null);
        setIntField(term59483, term59483.getClass(), "type", 2);
        setIntField(term59484, term59484.getClass(), "type", 0);
        setField(term59484, term59484.getClass(), "next", null);
        setField(term59484, term59484.getClass(), "first", null);
        setField(term59484, term59484.getClass(), "last", null);
        setField(term59484, term59484.getClass(), "propListHead", null);
        setIntField(term59484, term59484.getClass(), "sourcePosition", 0);
        setField(term59484, term59484.getClass(), "jsType", null);
        setField(term59484, term59484.getClass(), "parent", null);
        setField(term59483, term59483.getClass(), "next", term59484);
        setIntField(term59485, term59485.getClass(), "type", 1);
        setField(term59485, term59485.getClass(), "next", null);
        setField(term59485, term59485.getClass(), "first", null);
        setField(term59485, term59485.getClass(), "last", null);
        setField(term59485, term59485.getClass(), "propListHead", null);
        setIntField(term59485, term59485.getClass(), "sourcePosition", 0);
        setField(term59485, term59485.getClass(), "jsType", null);
        setField(term59485, term59485.getClass(), "parent", null);
        setField(term59483, term59483.getClass(), "first", term59485);
        setField(term59483, term59483.getClass(), "last", null);
        setField(term59483, term59483.getClass(), "propListHead", null);
        setIntField(term59483, term59483.getClass(), "sourcePosition", 0);
        setField(term59483, term59483.getClass(), "jsType", null);
        setField(term59483, term59483.getClass(), "parent", null);
        setField(term59482, term59482.getClass(), "first", term59483);
        setField(term59482, term59482.getClass(), "last", null);
        setField(term59482, term59482.getClass(), "propListHead", null);
        setIntField(term59482, term59482.getClass(), "sourcePosition", 0);
        setField(term59482, term59482.getClass(), "jsType", null);
        setField(term59482, term59482.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term18226;
        Object retValue = callMethod(klass, "isPure", argTypes, term18156, args);
        assertTrue(recursiveEquals(term18156, term59481));
        assertTrue(recursiveEquals(term18226, term59482));
        assertTrue(recursiveEquals(retValue, false));
    }

};


