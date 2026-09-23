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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11930;
     Object term12000;
     Object term34238;
     Object term34239;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11930 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setField(term11930, term11930.getClass(), "compiler", null);
        term12000 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12070 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12000, term12000.getClass(), "type", 114);
        setIntField(term12070, term12070.getClass(), "type", 2);
        setIntField(term12140, term12140.getClass(), "type", 1);
        setField(term12140, term12140.getClass(), "first", null);
        setField(term12140, term12140.getClass(), "next", null);
        setField(term12070, term12070.getClass(), "first", term12140);
        setIntField(term12210, term12210.getClass(), "type", 0);
        setField(term12210, term12210.getClass(), "first", null);
        setField(term12210, term12210.getClass(), "next", null);
        setField(term12070, term12070.getClass(), "next", term12210);
        setField(term12000, term12000.getClass(), "first", term12070);
        term34238 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term34238, term34238.getClass(), "late", false);
        setIntField(term34238, term34238.getClass(), "STRING_SPLIT_OVERHEAD", 0);
        setField(term34238, term34238.getClass(), "compiler", null);
        term34239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34239, term34239.getClass(), "type", 114);
        setField(term34239, term34239.getClass(), "next", null);
        setIntField(term34240, term34240.getClass(), "type", 2);
        setIntField(term34241, term34241.getClass(), "type", 0);
        setField(term34241, term34241.getClass(), "next", null);
        setField(term34241, term34241.getClass(), "first", null);
        setField(term34241, term34241.getClass(), "last", null);
        setField(term34241, term34241.getClass(), "propListHead", null);
        setIntField(term34241, term34241.getClass(), "sourcePosition", 0);
        setField(term34241, term34241.getClass(), "jsType", null);
        setField(term34241, term34241.getClass(), "parent", null);
        setField(term34240, term34240.getClass(), "next", term34241);
        setIntField(term34242, term34242.getClass(), "type", 1);
        setField(term34242, term34242.getClass(), "next", null);
        setField(term34242, term34242.getClass(), "first", null);
        setField(term34242, term34242.getClass(), "last", null);
        setField(term34242, term34242.getClass(), "propListHead", null);
        setIntField(term34242, term34242.getClass(), "sourcePosition", 0);
        setField(term34242, term34242.getClass(), "jsType", null);
        setField(term34242, term34242.getClass(), "parent", null);
        setField(term34240, term34240.getClass(), "first", term34242);
        setField(term34240, term34240.getClass(), "last", null);
        setField(term34240, term34240.getClass(), "propListHead", null);
        setIntField(term34240, term34240.getClass(), "sourcePosition", 0);
        setField(term34240, term34240.getClass(), "jsType", null);
        setField(term34240, term34240.getClass(), "parent", null);
        setField(term34239, term34239.getClass(), "first", term34240);
        setField(term34239, term34239.getClass(), "last", null);
        setField(term34239, term34239.getClass(), "propListHead", null);
        setIntField(term34239, term34239.getClass(), "sourcePosition", 0);
        setField(term34239, term34239.getClass(), "jsType", null);
        setField(term34239, term34239.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term12000;
        Object retValue = callMethod(klass, "isPure", argTypes, term11930, args);
        assertTrue(recursiveEquals(term11930, term34238));
        assertTrue(recursiveEquals(term12000, term34239));
        assertTrue(recursiveEquals(retValue, false));
    }

};


