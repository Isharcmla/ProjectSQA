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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20593;
     Object term20663;
     Object term21240;
     Object term21241;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20593 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term20663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20663, term20663.getClass(), "type", 120);
        setIntField(term20733, term20733.getClass(), "type", 2);
        setIntField(term20803, term20803.getClass(), "type", 1);
        setField(term20803, term20803.getClass(), "first", null);
        setField(term20803, term20803.getClass(), "next", null);
        setField(term20733, term20733.getClass(), "first", term20803);
        setIntField(term20873, term20873.getClass(), "type", 0);
        setField(term20873, term20873.getClass(), "first", null);
        setField(term20873, term20873.getClass(), "next", null);
        setField(term20733, term20733.getClass(), "next", term20873);
        setField(term20663, term20663.getClass(), "first", term20733);
        term21240 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term21240, term21240.getClass(), "late", false);
        setIntField(term21240, term21240.getClass(), "STRING_SPLIT_OVERHEAD", 0);
        setField(term21240, term21240.getClass(), "compiler", null);
        term21241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21241, term21241.getClass(), "type", 120);
        setField(term21241, term21241.getClass(), "next", null);
        setIntField(term21242, term21242.getClass(), "type", 2);
        setIntField(term21243, term21243.getClass(), "type", 0);
        setField(term21243, term21243.getClass(), "next", null);
        setField(term21243, term21243.getClass(), "first", null);
        setField(term21243, term21243.getClass(), "last", null);
        setField(term21243, term21243.getClass(), "propListHead", null);
        setIntField(term21243, term21243.getClass(), "sourcePosition", 0);
        setField(term21243, term21243.getClass(), "jsType", null);
        setField(term21243, term21243.getClass(), "parent", null);
        setField(term21242, term21242.getClass(), "next", term21243);
        setIntField(term21244, term21244.getClass(), "type", 1);
        setField(term21244, term21244.getClass(), "next", null);
        setField(term21244, term21244.getClass(), "first", null);
        setField(term21244, term21244.getClass(), "last", null);
        setField(term21244, term21244.getClass(), "propListHead", null);
        setIntField(term21244, term21244.getClass(), "sourcePosition", 0);
        setField(term21244, term21244.getClass(), "jsType", null);
        setField(term21244, term21244.getClass(), "parent", null);
        setField(term21242, term21242.getClass(), "first", term21244);
        setField(term21242, term21242.getClass(), "last", null);
        setField(term21242, term21242.getClass(), "propListHead", null);
        setIntField(term21242, term21242.getClass(), "sourcePosition", 0);
        setField(term21242, term21242.getClass(), "jsType", null);
        setField(term21242, term21242.getClass(), "parent", null);
        setField(term21241, term21241.getClass(), "first", term21242);
        setField(term21241, term21241.getClass(), "last", null);
        setField(term21241, term21241.getClass(), "propListHead", null);
        setIntField(term21241, term21241.getClass(), "sourcePosition", 0);
        setField(term21241, term21241.getClass(), "jsType", null);
        setField(term21241, term21241.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term20663;
        Object retValue = callMethod(klass, "isPure", argTypes, term20593, args);
        assertTrue(recursiveEquals(term20593, term21240));
        assertTrue(recursiveEquals(term20663, term21241));
        assertTrue(recursiveEquals(retValue, false));
    }

};


