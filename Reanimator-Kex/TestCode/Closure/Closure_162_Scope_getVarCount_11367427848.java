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
import java.util.HashMap;
import java.lang.Object;

public class Scope_getVarCount_11367427848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1022;
     Object term3874;

    public Scope_getVarCount_11367427848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1023 = new HashMap();
        term1022 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1036 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1040 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1022, term1022.getClass(), "vars", term1023);
        setField(term1036, term1036.getClass(), "vars", null);
        setField(term1036, term1036.getClass(), "parent", null);
        setIntField(term1036, term1036.getClass(), "depth", 0);
        setField(term1036, term1036.getClass(), "rootNode", null);
        setField(term1036, term1036.getClass(), "thisType", null);
        setBooleanField(term1036, term1036.getClass(), "isBottom", false);
        setField(term1036, term1036.getClass(), "arguments", null);
        setField(term1022, term1022.getClass(), "parent", term1036);
        setIntField(term1022, term1022.getClass(), "depth", 2009020256);
        setIntField(term1040, term1040.getClass(), "type", 0);
        setField(term1040, term1040.getClass(), "next", null);
        setField(term1040, term1040.getClass(), "first", null);
        setField(term1040, term1040.getClass(), "last", null);
        setField(term1040, term1040.getClass(), "propListHead", null);
        setIntField(term1040, term1040.getClass(), "sourcePosition", 0);
        setField(term1040, term1040.getClass(), "jsType", null);
        setField(term1040, term1040.getClass(), "parent", null);
        setField(term1022, term1022.getClass(), "rootNode", term1040);
        setField(term1022, term1022.getClass(), "thisType", null);
        setBooleanField(term1022, term1022.getClass(), "isBottom", false);
        setField(term1022, term1022.getClass(), "arguments", null);
        HashMap term3875 = new HashMap();
        term3874 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term3876 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term3877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term3874, term3874.getClass(), "vars", term3875);
        setField(term3876, term3876.getClass(), "vars", null);
        setField(term3876, term3876.getClass(), "parent", null);
        setIntField(term3876, term3876.getClass(), "depth", 0);
        setField(term3876, term3876.getClass(), "rootNode", null);
        setField(term3876, term3876.getClass(), "thisType", null);
        setBooleanField(term3876, term3876.getClass(), "isBottom", false);
        setField(term3876, term3876.getClass(), "arguments", null);
        setField(term3874, term3874.getClass(), "parent", term3876);
        setIntField(term3874, term3874.getClass(), "depth", 2009020256);
        setIntField(term3877, term3877.getClass(), "type", 0);
        setField(term3877, term3877.getClass(), "next", null);
        setField(term3877, term3877.getClass(), "first", null);
        setField(term3877, term3877.getClass(), "last", null);
        setField(term3877, term3877.getClass(), "propListHead", null);
        setIntField(term3877, term3877.getClass(), "sourcePosition", 0);
        setField(term3877, term3877.getClass(), "jsType", null);
        setField(term3877, term3877.getClass(), "parent", null);
        setField(term3874, term3874.getClass(), "rootNode", term3877);
        setField(term3874, term3874.getClass(), "thisType", null);
        setBooleanField(term3874, term3874.getClass(), "isBottom", false);
        setField(term3874, term3874.getClass(), "arguments", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getVarCount", argTypes, term1022, args);
        assertTrue(recursiveEquals(term1022, term3874));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


