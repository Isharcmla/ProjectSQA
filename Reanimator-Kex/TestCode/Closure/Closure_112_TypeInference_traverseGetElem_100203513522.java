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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseGetElem_100203513522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2258652;
     Object term2258722;

    public TypeInference_traverseGetElem_100203513522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2258652 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term2258722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2258792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2258862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2258932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2259002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2259072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2259142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2259212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2259282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2259352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2259422 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2259492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2259562 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2259632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2258792, term2258792.getClass(), "type", 98);
        setField(term2258862, term2258862.getClass(), "next", null);
        setIntField(term2258862, term2258862.getClass(), "type", 98);
        setField(term2258932, term2258932.getClass(), "next", null);
        setIntField(term2258932, term2258932.getClass(), "type", 98);
        setField(term2259002, term2259002.getClass(), "next", null);
        setIntField(term2259002, term2259002.getClass(), "type", 98);
        setField(term2259072, term2259072.getClass(), "next", null);
        setIntField(term2259072, term2259072.getClass(), "type", 98);
        setField(term2259142, term2259142.getClass(), "next", null);
        setIntField(term2259142, term2259142.getClass(), "type", 98);
        setField(term2259212, term2259212.getClass(), "next", null);
        setIntField(term2259212, term2259212.getClass(), "type", 98);
        setField(term2259282, term2259282.getClass(), "next", null);
        setIntField(term2259282, term2259282.getClass(), "type", 98);
        setField(term2259352, term2259352.getClass(), "next", null);
        setIntField(term2259352, term2259352.getClass(), "type", 98);
        setField(term2259422, term2259422.getClass(), "next", null);
        setIntField(term2259422, term2259422.getClass(), "type", 98);
        setField(term2259492, term2259492.getClass(), "next", null);
        setIntField(term2259492, term2259492.getClass(), "type", 98);
        setField(term2259562, term2259562.getClass(), "next", null);
        setIntField(term2259562, term2259562.getClass(), "type", 98);
        setField(term2259632, term2259632.getClass(), "next", null);
        setIntField(term2259632, term2259632.getClass(), "type", 109);
        setField(term2259562, term2259562.getClass(), "first", term2259632);
        setField(term2259562, term2259562.getClass(), "last", null);
        setField(term2259492, term2259492.getClass(), "first", term2259562);
        setField(term2259492, term2259492.getClass(), "last", null);
        setField(term2259422, term2259422.getClass(), "first", term2259492);
        setField(term2259422, term2259422.getClass(), "last", null);
        setField(term2259352, term2259352.getClass(), "first", term2259422);
        setField(term2259352, term2259352.getClass(), "last", null);
        setField(term2259282, term2259282.getClass(), "first", term2259352);
        setField(term2259282, term2259282.getClass(), "last", null);
        setField(term2259212, term2259212.getClass(), "first", term2259282);
        setField(term2259212, term2259212.getClass(), "last", null);
        setField(term2259142, term2259142.getClass(), "first", term2259212);
        setField(term2259142, term2259142.getClass(), "last", null);
        setField(term2259072, term2259072.getClass(), "first", term2259142);
        setField(term2259072, term2259072.getClass(), "last", null);
        setField(term2259002, term2259002.getClass(), "first", term2259072);
        setField(term2259002, term2259002.getClass(), "last", null);
        setField(term2258932, term2258932.getClass(), "first", term2259002);
        setField(term2258932, term2258932.getClass(), "last", null);
        setField(term2258862, term2258862.getClass(), "first", term2258932);
        setField(term2258862, term2258862.getClass(), "last", null);
        setField(term2258792, term2258792.getClass(), "first", term2258862);
        setField(term2258792, term2258792.getClass(), "last", null);
        setField(term2258722, term2258722.getClass(), "first", term2258792);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term2258722;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term2258652, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


