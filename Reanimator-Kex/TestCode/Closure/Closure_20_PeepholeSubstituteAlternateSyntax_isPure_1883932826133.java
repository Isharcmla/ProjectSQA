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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19472;
     Object term19542;
     Object term19836;
     Object term19837;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19472 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term19542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19612 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19542, term19542.getClass(), "type", 61);
        setIntField(term19612, term19612.getClass(), "type", 2);
        setIntField(term19682, term19682.getClass(), "type", 1);
        setField(term19682, term19682.getClass(), "first", null);
        setField(term19682, term19682.getClass(), "next", null);
        setField(term19612, term19612.getClass(), "first", term19682);
        setIntField(term19752, term19752.getClass(), "type", 0);
        setField(term19752, term19752.getClass(), "first", null);
        setField(term19752, term19752.getClass(), "next", null);
        setField(term19612, term19612.getClass(), "next", term19752);
        setField(term19542, term19542.getClass(), "first", term19612);
        term19836 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term19836, term19836.getClass(), "late", false);
        setIntField(term19836, term19836.getClass(), "STRING_SPLIT_OVERHEAD", 0);
        setField(term19836, term19836.getClass(), "compiler", null);
        term19837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19837, term19837.getClass(), "type", 61);
        setField(term19837, term19837.getClass(), "next", null);
        setIntField(term19838, term19838.getClass(), "type", 2);
        setIntField(term19839, term19839.getClass(), "type", 0);
        setField(term19839, term19839.getClass(), "next", null);
        setField(term19839, term19839.getClass(), "first", null);
        setField(term19839, term19839.getClass(), "last", null);
        setField(term19839, term19839.getClass(), "propListHead", null);
        setIntField(term19839, term19839.getClass(), "sourcePosition", 0);
        setField(term19839, term19839.getClass(), "jsType", null);
        setField(term19839, term19839.getClass(), "parent", null);
        setField(term19838, term19838.getClass(), "next", term19839);
        setIntField(term19840, term19840.getClass(), "type", 1);
        setField(term19840, term19840.getClass(), "next", null);
        setField(term19840, term19840.getClass(), "first", null);
        setField(term19840, term19840.getClass(), "last", null);
        setField(term19840, term19840.getClass(), "propListHead", null);
        setIntField(term19840, term19840.getClass(), "sourcePosition", 0);
        setField(term19840, term19840.getClass(), "jsType", null);
        setField(term19840, term19840.getClass(), "parent", null);
        setField(term19838, term19838.getClass(), "first", term19840);
        setField(term19838, term19838.getClass(), "last", null);
        setField(term19838, term19838.getClass(), "propListHead", null);
        setIntField(term19838, term19838.getClass(), "sourcePosition", 0);
        setField(term19838, term19838.getClass(), "jsType", null);
        setField(term19838, term19838.getClass(), "parent", null);
        setField(term19837, term19837.getClass(), "first", term19838);
        setField(term19837, term19837.getClass(), "last", null);
        setField(term19837, term19837.getClass(), "propListHead", null);
        setIntField(term19837, term19837.getClass(), "sourcePosition", 0);
        setField(term19837, term19837.getClass(), "jsType", null);
        setField(term19837, term19837.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term19542;
        Object retValue = callMethod(klass, "isPure", argTypes, term19472, args);
        assertTrue(recursiveEquals(term19472, term19836));
        assertTrue(recursiveEquals(term19542, term19837));
        assertTrue(recursiveEquals(retValue, false));
    }

};


