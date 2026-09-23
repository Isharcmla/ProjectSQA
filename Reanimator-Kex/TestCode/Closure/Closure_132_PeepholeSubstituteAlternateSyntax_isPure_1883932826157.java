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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35527;
     Object term35597;
     Object term61193;
     Object term61194;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35527 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setField(term35527, term35527.getClass(), "compiler", null);
        term35597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35667 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35597, term35597.getClass(), "type", 144);
        setIntField(term35667, term35667.getClass(), "type", 2);
        setIntField(term35737, term35737.getClass(), "type", 1);
        setField(term35737, term35737.getClass(), "first", null);
        setField(term35737, term35737.getClass(), "next", null);
        setField(term35667, term35667.getClass(), "first", term35737);
        setIntField(term35807, term35807.getClass(), "type", 0);
        setField(term35807, term35807.getClass(), "first", null);
        setField(term35807, term35807.getClass(), "next", null);
        setField(term35667, term35667.getClass(), "next", term35807);
        setField(term35597, term35597.getClass(), "first", term35667);
        term61193 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term61193, term61193.getClass(), "late", false);
        setIntField(term61193, term61193.getClass(), "STRING_SPLIT_OVERHEAD", 0);
        setField(term61193, term61193.getClass(), "compiler", null);
        term61194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term61194, term61194.getClass(), "type", 144);
        setField(term61194, term61194.getClass(), "next", null);
        setIntField(term61195, term61195.getClass(), "type", 2);
        setIntField(term61196, term61196.getClass(), "type", 0);
        setField(term61196, term61196.getClass(), "next", null);
        setField(term61196, term61196.getClass(), "first", null);
        setField(term61196, term61196.getClass(), "last", null);
        setField(term61196, term61196.getClass(), "propListHead", null);
        setIntField(term61196, term61196.getClass(), "sourcePosition", 0);
        setField(term61196, term61196.getClass(), "jsType", null);
        setField(term61196, term61196.getClass(), "parent", null);
        setField(term61195, term61195.getClass(), "next", term61196);
        setIntField(term61197, term61197.getClass(), "type", 1);
        setField(term61197, term61197.getClass(), "next", null);
        setField(term61197, term61197.getClass(), "first", null);
        setField(term61197, term61197.getClass(), "last", null);
        setField(term61197, term61197.getClass(), "propListHead", null);
        setIntField(term61197, term61197.getClass(), "sourcePosition", 0);
        setField(term61197, term61197.getClass(), "jsType", null);
        setField(term61197, term61197.getClass(), "parent", null);
        setField(term61195, term61195.getClass(), "first", term61197);
        setField(term61195, term61195.getClass(), "last", null);
        setField(term61195, term61195.getClass(), "propListHead", null);
        setIntField(term61195, term61195.getClass(), "sourcePosition", 0);
        setField(term61195, term61195.getClass(), "jsType", null);
        setField(term61195, term61195.getClass(), "parent", null);
        setField(term61194, term61194.getClass(), "first", term61195);
        setField(term61194, term61194.getClass(), "last", null);
        setField(term61194, term61194.getClass(), "propListHead", null);
        setIntField(term61194, term61194.getClass(), "sourcePosition", 0);
        setField(term61194, term61194.getClass(), "jsType", null);
        setField(term61194, term61194.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term35597;
        Object retValue = callMethod(klass, "isPure", argTypes, term35527, args);
        assertTrue(recursiveEquals(term35527, term61193));
        assertTrue(recursiveEquals(term35597, term61194));
        assertTrue(recursiveEquals(retValue, false));
    }

};


