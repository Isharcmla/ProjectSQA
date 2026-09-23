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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14601;
     Object term14671;
     Object term15173;
     Object term15174;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14601 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term14671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14881 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14671, term14671.getClass(), "type", 106);
        setIntField(term14741, term14741.getClass(), "type", 2);
        setIntField(term14811, term14811.getClass(), "type", 1);
        setField(term14811, term14811.getClass(), "first", null);
        setField(term14811, term14811.getClass(), "next", null);
        setField(term14741, term14741.getClass(), "first", term14811);
        setIntField(term14881, term14881.getClass(), "type", 0);
        setField(term14881, term14881.getClass(), "first", null);
        setField(term14881, term14881.getClass(), "next", null);
        setField(term14741, term14741.getClass(), "next", term14881);
        setField(term14671, term14671.getClass(), "first", term14741);
        term15173 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term15173, term15173.getClass(), "late", false);
        setIntField(term15173, term15173.getClass(), "STRING_SPLIT_OVERHEAD", 0);
        setField(term15173, term15173.getClass(), "compiler", null);
        term15174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15176 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15174, term15174.getClass(), "type", 106);
        setField(term15174, term15174.getClass(), "next", null);
        setIntField(term15175, term15175.getClass(), "type", 2);
        setIntField(term15176, term15176.getClass(), "type", 0);
        setField(term15176, term15176.getClass(), "next", null);
        setField(term15176, term15176.getClass(), "first", null);
        setField(term15176, term15176.getClass(), "last", null);
        setField(term15176, term15176.getClass(), "propListHead", null);
        setIntField(term15176, term15176.getClass(), "sourcePosition", 0);
        setField(term15176, term15176.getClass(), "jsType", null);
        setField(term15176, term15176.getClass(), "parent", null);
        setField(term15175, term15175.getClass(), "next", term15176);
        setIntField(term15177, term15177.getClass(), "type", 1);
        setField(term15177, term15177.getClass(), "next", null);
        setField(term15177, term15177.getClass(), "first", null);
        setField(term15177, term15177.getClass(), "last", null);
        setField(term15177, term15177.getClass(), "propListHead", null);
        setIntField(term15177, term15177.getClass(), "sourcePosition", 0);
        setField(term15177, term15177.getClass(), "jsType", null);
        setField(term15177, term15177.getClass(), "parent", null);
        setField(term15175, term15175.getClass(), "first", term15177);
        setField(term15175, term15175.getClass(), "last", null);
        setField(term15175, term15175.getClass(), "propListHead", null);
        setIntField(term15175, term15175.getClass(), "sourcePosition", 0);
        setField(term15175, term15175.getClass(), "jsType", null);
        setField(term15175, term15175.getClass(), "parent", null);
        setField(term15174, term15174.getClass(), "first", term15175);
        setField(term15174, term15174.getClass(), "last", null);
        setField(term15174, term15174.getClass(), "propListHead", null);
        setIntField(term15174, term15174.getClass(), "sourcePosition", 0);
        setField(term15174, term15174.getClass(), "jsType", null);
        setField(term15174, term15174.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term14671;
        Object retValue = callMethod(klass, "isPure", argTypes, term14601, args);
        assertTrue(recursiveEquals(term14601, term15173));
        assertTrue(recursiveEquals(term14671, term15174));
        assertTrue(recursiveEquals(retValue, false));
    }

};


