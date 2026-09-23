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

public class Scope_isGlobal_58025934949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1044;
     Object term3894;

    public Scope_isGlobal_58025934949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1045 = new HashMap();
        term1044 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1058 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1044, term1044.getClass(), "vars", term1045);
        setField(term1058, term1058.getClass(), "vars", null);
        setField(term1058, term1058.getClass(), "parent", null);
        setIntField(term1058, term1058.getClass(), "depth", 0);
        setField(term1058, term1058.getClass(), "rootNode", null);
        setField(term1058, term1058.getClass(), "thisType", null);
        setBooleanField(term1058, term1058.getClass(), "isBottom", false);
        setField(term1058, term1058.getClass(), "arguments", null);
        setField(term1044, term1044.getClass(), "parent", term1058);
        setIntField(term1044, term1044.getClass(), "depth", -680920524);
        setIntField(term1062, term1062.getClass(), "type", 0);
        setField(term1062, term1062.getClass(), "next", null);
        setField(term1062, term1062.getClass(), "first", null);
        setField(term1062, term1062.getClass(), "last", null);
        setField(term1062, term1062.getClass(), "propListHead", null);
        setIntField(term1062, term1062.getClass(), "sourcePosition", 0);
        setField(term1062, term1062.getClass(), "jsType", null);
        setField(term1062, term1062.getClass(), "parent", null);
        setField(term1044, term1044.getClass(), "rootNode", term1062);
        setField(term1044, term1044.getClass(), "thisType", null);
        setBooleanField(term1044, term1044.getClass(), "isBottom", false);
        setField(term1044, term1044.getClass(), "arguments", null);
        HashMap term3895 = new HashMap();
        term3894 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term3896 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term3897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term3894, term3894.getClass(), "vars", term3895);
        setField(term3896, term3896.getClass(), "vars", null);
        setField(term3896, term3896.getClass(), "parent", null);
        setIntField(term3896, term3896.getClass(), "depth", 0);
        setField(term3896, term3896.getClass(), "rootNode", null);
        setField(term3896, term3896.getClass(), "thisType", null);
        setBooleanField(term3896, term3896.getClass(), "isBottom", false);
        setField(term3896, term3896.getClass(), "arguments", null);
        setField(term3894, term3894.getClass(), "parent", term3896);
        setIntField(term3894, term3894.getClass(), "depth", -680920524);
        setIntField(term3897, term3897.getClass(), "type", 0);
        setField(term3897, term3897.getClass(), "next", null);
        setField(term3897, term3897.getClass(), "first", null);
        setField(term3897, term3897.getClass(), "last", null);
        setField(term3897, term3897.getClass(), "propListHead", null);
        setIntField(term3897, term3897.getClass(), "sourcePosition", 0);
        setField(term3897, term3897.getClass(), "jsType", null);
        setField(term3897, term3897.getClass(), "parent", null);
        setField(term3894, term3894.getClass(), "rootNode", term3897);
        setField(term3894, term3894.getClass(), "thisType", null);
        setBooleanField(term3894, term3894.getClass(), "isBottom", false);
        setField(term3894, term3894.getClass(), "arguments", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isGlobal", argTypes, term1044, args);
        assertTrue(recursiveEquals(term1044, term3894));
        assertTrue(recursiveEquals(retValue, false));
    }

};


