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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22218;
     Object term22288;
     Object term22577;
     Object term22578;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22218 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term22288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22288, term22288.getClass(), "type", 76);
        setIntField(term22358, term22358.getClass(), "type", 2);
        setIntField(term22428, term22428.getClass(), "type", 1);
        setField(term22428, term22428.getClass(), "first", null);
        setField(term22428, term22428.getClass(), "next", null);
        setField(term22358, term22358.getClass(), "first", term22428);
        setIntField(term22498, term22498.getClass(), "type", 0);
        setField(term22498, term22498.getClass(), "first", null);
        setField(term22498, term22498.getClass(), "next", null);
        setField(term22358, term22358.getClass(), "next", term22498);
        setField(term22288, term22288.getClass(), "first", term22358);
        term22577 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term22577, term22577.getClass(), "late", false);
        setIntField(term22577, term22577.getClass(), "STRING_SPLIT_OVERHEAD", 0);
        setField(term22577, term22577.getClass(), "compiler", null);
        term22578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22581 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22578, term22578.getClass(), "type", 76);
        setField(term22578, term22578.getClass(), "next", null);
        setIntField(term22579, term22579.getClass(), "type", 2);
        setIntField(term22580, term22580.getClass(), "type", 0);
        setField(term22580, term22580.getClass(), "next", null);
        setField(term22580, term22580.getClass(), "first", null);
        setField(term22580, term22580.getClass(), "last", null);
        setField(term22580, term22580.getClass(), "propListHead", null);
        setIntField(term22580, term22580.getClass(), "sourcePosition", 0);
        setField(term22580, term22580.getClass(), "jsType", null);
        setField(term22580, term22580.getClass(), "parent", null);
        setField(term22579, term22579.getClass(), "next", term22580);
        setIntField(term22581, term22581.getClass(), "type", 1);
        setField(term22581, term22581.getClass(), "next", null);
        setField(term22581, term22581.getClass(), "first", null);
        setField(term22581, term22581.getClass(), "last", null);
        setField(term22581, term22581.getClass(), "propListHead", null);
        setIntField(term22581, term22581.getClass(), "sourcePosition", 0);
        setField(term22581, term22581.getClass(), "jsType", null);
        setField(term22581, term22581.getClass(), "parent", null);
        setField(term22579, term22579.getClass(), "first", term22581);
        setField(term22579, term22579.getClass(), "last", null);
        setField(term22579, term22579.getClass(), "propListHead", null);
        setIntField(term22579, term22579.getClass(), "sourcePosition", 0);
        setField(term22579, term22579.getClass(), "jsType", null);
        setField(term22579, term22579.getClass(), "parent", null);
        setField(term22578, term22578.getClass(), "first", term22579);
        setField(term22578, term22578.getClass(), "last", null);
        setField(term22578, term22578.getClass(), "propListHead", null);
        setIntField(term22578, term22578.getClass(), "sourcePosition", 0);
        setField(term22578, term22578.getClass(), "jsType", null);
        setField(term22578, term22578.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term22288;
        Object retValue = callMethod(klass, "isPure", argTypes, term22218, args);
        assertTrue(recursiveEquals(term22218, term22577));
        assertTrue(recursiveEquals(term22288, term22578));
        assertTrue(recursiveEquals(retValue, false));
    }

};


