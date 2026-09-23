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

public class PeepholeSubstituteAlternateSyntax_skipFinallyNodes_145785212062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term420;
     Object term423;

    public PeepholeSubstituteAlternateSyntax_skipFinallyNodes_145785212062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term420 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term420, term420.getClass(), "late", false);
        setIntField(term420, term420.getClass(), "STRING_SPLIT_OVERHEAD", -1498296052);
        setField(term420, term420.getClass(), "compiler", null);
        term423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term423, term423.getClass(), "type", 2098647989);
        setIntField(term425, term425.getClass(), "type", 1598895173);
        setIntField(term427, term427.getClass(), "type", 1830648570);
        setIntField(term429, term429.getClass(), "type", -227365013);
        setIntField(term431, term431.getClass(), "type", 11724947);
        setField(term431, term431.getClass(), "next", null);
        setField(term431, term431.getClass(), "first", null);
        setField(term431, term431.getClass(), "last", null);
        setField(term431, term431.getClass(), "propListHead", null);
        setIntField(term431, term431.getClass(), "sourcePosition", 0);
        setField(term431, term431.getClass(), "jsType", null);
        setField(term431, term431.getClass(), "parent", null);
        setField(term429, term429.getClass(), "next", term431);
        setIntField(term434, term434.getClass(), "type", 1953277050);
        setField(term434, term434.getClass(), "next", null);
        setField(term434, term434.getClass(), "first", null);
        setField(term434, term434.getClass(), "last", term431);
        setField(term434, term434.getClass(), "propListHead", null);
        setIntField(term434, term434.getClass(), "sourcePosition", 0);
        setField(term434, term434.getClass(), "jsType", null);
        setField(term434, term434.getClass(), "parent", null);
        setField(term429, term429.getClass(), "first", term434);
        setField(term429, term429.getClass(), "last", term427);
        setField(term429, term429.getClass(), "propListHead", null);
        setIntField(term429, term429.getClass(), "sourcePosition", 0);
        setField(term429, term429.getClass(), "jsType", null);
        setField(term429, term429.getClass(), "parent", null);
        setField(term427, term427.getClass(), "next", term429);
        setField(term427, term427.getClass(), "first", term431);
        setIntField(term438, term438.getClass(), "type", -523949691);
        setIntField(term440, term440.getClass(), "type", 1398204340);
        setField(term440, term440.getClass(), "next", null);
        setField(term440, term440.getClass(), "first", term434);
        setField(term440, term440.getClass(), "last", term429);
        setField(term440, term440.getClass(), "propListHead", null);
        setIntField(term440, term440.getClass(), "sourcePosition", 0);
        setField(term440, term440.getClass(), "jsType", null);
        setField(term440, term440.getClass(), "parent", null);
        setField(term438, term438.getClass(), "next", term440);
        setField(term438, term438.getClass(), "first", term425);
        setField(term438, term438.getClass(), "last", term425);
        setField(term438, term438.getClass(), "propListHead", null);
        setIntField(term438, term438.getClass(), "sourcePosition", 0);
        setField(term438, term438.getClass(), "jsType", null);
        setField(term438, term438.getClass(), "parent", null);
        setField(term427, term427.getClass(), "last", term438);
        setField(term427, term427.getClass(), "propListHead", null);
        setIntField(term427, term427.getClass(), "sourcePosition", 0);
        setField(term427, term427.getClass(), "jsType", null);
        setField(term427, term427.getClass(), "parent", null);
        setField(term425, term425.getClass(), "next", term427);
        setIntField(term445, term445.getClass(), "type", 229204365);
        setField(term445, term445.getClass(), "next", term438);
        setField(term445, term445.getClass(), "first", term440);
        setField(term445, term445.getClass(), "last", term423);
        setField(term445, term445.getClass(), "propListHead", null);
        setIntField(term445, term445.getClass(), "sourcePosition", 0);
        setField(term445, term445.getClass(), "jsType", null);
        setField(term445, term445.getClass(), "parent", null);
        setField(term425, term425.getClass(), "first", term445);
        setField(term425, term425.getClass(), "last", term445);
        setField(term425, term425.getClass(), "propListHead", null);
        setIntField(term425, term425.getClass(), "sourcePosition", 0);
        setField(term425, term425.getClass(), "jsType", null);
        setField(term425, term425.getClass(), "parent", null);
        setField(term423, term423.getClass(), "next", term425);
        setField(term423, term423.getClass(), "first", term429);
        setField(term423, term423.getClass(), "last", term431);
        setField(term423, term423.getClass(), "propListHead", null);
        setIntField(term423, term423.getClass(), "sourcePosition", 0);
        setField(term423, term423.getClass(), "jsType", null);
        setField(term423, term423.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term423;
        try {
            callMethod(klass, "skipFinallyNodes", argTypes, term420, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


