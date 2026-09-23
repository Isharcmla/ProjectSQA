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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19754;
     Object term19824;
     Object term61108;
     Object term61109;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19754 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setField(term19754, term19754.getClass(), "compiler", null);
        term19824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19824, term19824.getClass(), "type", 36);
        setIntField(term19894, term19894.getClass(), "type", 2);
        setIntField(term19964, term19964.getClass(), "type", 1);
        setField(term19964, term19964.getClass(), "first", null);
        setField(term19964, term19964.getClass(), "next", null);
        setField(term19894, term19894.getClass(), "first", term19964);
        setIntField(term20034, term20034.getClass(), "type", 0);
        setField(term20034, term20034.getClass(), "first", null);
        setField(term20034, term20034.getClass(), "next", null);
        setField(term19894, term19894.getClass(), "next", term20034);
        setField(term19824, term19824.getClass(), "first", term19894);
        term61108 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term61108, term61108.getClass(), "late", false);
        setIntField(term61108, term61108.getClass(), "STRING_SPLIT_OVERHEAD", 0);
        setField(term61108, term61108.getClass(), "compiler", null);
        term61109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term61109, term61109.getClass(), "type", 36);
        setField(term61109, term61109.getClass(), "next", null);
        setIntField(term61110, term61110.getClass(), "type", 2);
        setIntField(term61111, term61111.getClass(), "type", 0);
        setField(term61111, term61111.getClass(), "next", null);
        setField(term61111, term61111.getClass(), "first", null);
        setField(term61111, term61111.getClass(), "last", null);
        setField(term61111, term61111.getClass(), "propListHead", null);
        setIntField(term61111, term61111.getClass(), "sourcePosition", 0);
        setField(term61111, term61111.getClass(), "jsType", null);
        setField(term61111, term61111.getClass(), "parent", null);
        setField(term61110, term61110.getClass(), "next", term61111);
        setIntField(term61112, term61112.getClass(), "type", 1);
        setField(term61112, term61112.getClass(), "next", null);
        setField(term61112, term61112.getClass(), "first", null);
        setField(term61112, term61112.getClass(), "last", null);
        setField(term61112, term61112.getClass(), "propListHead", null);
        setIntField(term61112, term61112.getClass(), "sourcePosition", 0);
        setField(term61112, term61112.getClass(), "jsType", null);
        setField(term61112, term61112.getClass(), "parent", null);
        setField(term61110, term61110.getClass(), "first", term61112);
        setField(term61110, term61110.getClass(), "last", null);
        setField(term61110, term61110.getClass(), "propListHead", null);
        setIntField(term61110, term61110.getClass(), "sourcePosition", 0);
        setField(term61110, term61110.getClass(), "jsType", null);
        setField(term61110, term61110.getClass(), "parent", null);
        setField(term61109, term61109.getClass(), "first", term61110);
        setField(term61109, term61109.getClass(), "last", null);
        setField(term61109, term61109.getClass(), "propListHead", null);
        setIntField(term61109, term61109.getClass(), "sourcePosition", 0);
        setField(term61109, term61109.getClass(), "jsType", null);
        setField(term61109, term61109.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term19824;
        Object retValue = callMethod(klass, "isPure", argTypes, term19754, args);
        assertTrue(recursiveEquals(term19754, term61108));
        assertTrue(recursiveEquals(term19824, term61109));
        assertTrue(recursiveEquals(retValue, false));
    }

};


