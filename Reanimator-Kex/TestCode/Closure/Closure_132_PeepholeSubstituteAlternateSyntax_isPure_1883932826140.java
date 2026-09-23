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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14518;
     Object term14588;
     Object term44166;
     Object term44167;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14518 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setField(term14518, term14518.getClass(), "compiler", null);
        term14588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14588, term14588.getClass(), "type", 70);
        setIntField(term14658, term14658.getClass(), "type", 2);
        setIntField(term14728, term14728.getClass(), "type", 1);
        setField(term14728, term14728.getClass(), "first", null);
        setField(term14728, term14728.getClass(), "next", null);
        setField(term14658, term14658.getClass(), "first", term14728);
        setIntField(term14798, term14798.getClass(), "type", 0);
        setField(term14798, term14798.getClass(), "first", null);
        setField(term14798, term14798.getClass(), "next", null);
        setField(term14658, term14658.getClass(), "next", term14798);
        setField(term14588, term14588.getClass(), "first", term14658);
        term44166 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term44166, term44166.getClass(), "late", false);
        setIntField(term44166, term44166.getClass(), "STRING_SPLIT_OVERHEAD", 0);
        setField(term44166, term44166.getClass(), "compiler", null);
        term44167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44167, term44167.getClass(), "type", 70);
        setField(term44167, term44167.getClass(), "next", null);
        setIntField(term44168, term44168.getClass(), "type", 2);
        setIntField(term44169, term44169.getClass(), "type", 0);
        setField(term44169, term44169.getClass(), "next", null);
        setField(term44169, term44169.getClass(), "first", null);
        setField(term44169, term44169.getClass(), "last", null);
        setField(term44169, term44169.getClass(), "propListHead", null);
        setIntField(term44169, term44169.getClass(), "sourcePosition", 0);
        setField(term44169, term44169.getClass(), "jsType", null);
        setField(term44169, term44169.getClass(), "parent", null);
        setField(term44168, term44168.getClass(), "next", term44169);
        setIntField(term44170, term44170.getClass(), "type", 1);
        setField(term44170, term44170.getClass(), "next", null);
        setField(term44170, term44170.getClass(), "first", null);
        setField(term44170, term44170.getClass(), "last", null);
        setField(term44170, term44170.getClass(), "propListHead", null);
        setIntField(term44170, term44170.getClass(), "sourcePosition", 0);
        setField(term44170, term44170.getClass(), "jsType", null);
        setField(term44170, term44170.getClass(), "parent", null);
        setField(term44168, term44168.getClass(), "first", term44170);
        setField(term44168, term44168.getClass(), "last", null);
        setField(term44168, term44168.getClass(), "propListHead", null);
        setIntField(term44168, term44168.getClass(), "sourcePosition", 0);
        setField(term44168, term44168.getClass(), "jsType", null);
        setField(term44168, term44168.getClass(), "parent", null);
        setField(term44167, term44167.getClass(), "first", term44168);
        setField(term44167, term44167.getClass(), "last", null);
        setField(term44167, term44167.getClass(), "propListHead", null);
        setIntField(term44167, term44167.getClass(), "sourcePosition", 0);
        setField(term44167, term44167.getClass(), "jsType", null);
        setField(term44167, term44167.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term14588;
        Object retValue = callMethod(klass, "isPure", argTypes, term14518, args);
        assertTrue(recursiveEquals(term14518, term44166));
        assertTrue(recursiveEquals(term14588, term44167));
        assertTrue(recursiveEquals(retValue, false));
    }

};


