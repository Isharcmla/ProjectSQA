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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18791;
     Object term18861;
     Object term19150;
     Object term19151;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18791 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term18861 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18931 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19071 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18861, term18861.getClass(), "type", 36);
        setIntField(term18931, term18931.getClass(), "type", 2);
        setIntField(term19001, term19001.getClass(), "type", 1);
        setField(term19001, term19001.getClass(), "first", null);
        setField(term19001, term19001.getClass(), "next", null);
        setField(term18931, term18931.getClass(), "first", term19001);
        setIntField(term19071, term19071.getClass(), "type", 0);
        setField(term19071, term19071.getClass(), "first", null);
        setField(term19071, term19071.getClass(), "next", null);
        setField(term18931, term18931.getClass(), "next", term19071);
        setField(term18861, term18861.getClass(), "first", term18931);
        term19150 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term19150, term19150.getClass(), "late", false);
        setIntField(term19150, term19150.getClass(), "STRING_SPLIT_OVERHEAD", 0);
        setField(term19150, term19150.getClass(), "compiler", null);
        term19151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19152 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19151, term19151.getClass(), "type", 36);
        setField(term19151, term19151.getClass(), "next", null);
        setIntField(term19152, term19152.getClass(), "type", 2);
        setIntField(term19153, term19153.getClass(), "type", 0);
        setField(term19153, term19153.getClass(), "next", null);
        setField(term19153, term19153.getClass(), "first", null);
        setField(term19153, term19153.getClass(), "last", null);
        setField(term19153, term19153.getClass(), "propListHead", null);
        setIntField(term19153, term19153.getClass(), "sourcePosition", 0);
        setField(term19153, term19153.getClass(), "jsType", null);
        setField(term19153, term19153.getClass(), "parent", null);
        setField(term19152, term19152.getClass(), "next", term19153);
        setIntField(term19154, term19154.getClass(), "type", 1);
        setField(term19154, term19154.getClass(), "next", null);
        setField(term19154, term19154.getClass(), "first", null);
        setField(term19154, term19154.getClass(), "last", null);
        setField(term19154, term19154.getClass(), "propListHead", null);
        setIntField(term19154, term19154.getClass(), "sourcePosition", 0);
        setField(term19154, term19154.getClass(), "jsType", null);
        setField(term19154, term19154.getClass(), "parent", null);
        setField(term19152, term19152.getClass(), "first", term19154);
        setField(term19152, term19152.getClass(), "last", null);
        setField(term19152, term19152.getClass(), "propListHead", null);
        setIntField(term19152, term19152.getClass(), "sourcePosition", 0);
        setField(term19152, term19152.getClass(), "jsType", null);
        setField(term19152, term19152.getClass(), "parent", null);
        setField(term19151, term19151.getClass(), "first", term19152);
        setField(term19151, term19151.getClass(), "last", null);
        setField(term19151, term19151.getClass(), "propListHead", null);
        setIntField(term19151, term19151.getClass(), "sourcePosition", 0);
        setField(term19151, term19151.getClass(), "jsType", null);
        setField(term19151, term19151.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term18861;
        Object retValue = callMethod(klass, "isPure", argTypes, term18791, args);
        assertTrue(recursiveEquals(term18791, term19150));
        assertTrue(recursiveEquals(term18861, term19151));
        assertTrue(recursiveEquals(retValue, false));
    }

};


