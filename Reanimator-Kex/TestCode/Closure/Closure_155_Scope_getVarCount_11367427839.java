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

public class Scope_getVarCount_11367427839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term881;
     Object term3417;

    public Scope_getVarCount_11367427839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term882 = new HashMap();
        term881 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term895 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term881, term881.getClass(), "vars", term882);
        setField(term895, term895.getClass(), "vars", null);
        setField(term895, term895.getClass(), "parent", null);
        setIntField(term895, term895.getClass(), "depth", 0);
        setField(term895, term895.getClass(), "rootNode", null);
        setField(term895, term895.getClass(), "thisType", null);
        setBooleanField(term895, term895.getClass(), "isBottom", false);
        setField(term881, term881.getClass(), "parent", term895);
        setIntField(term881, term881.getClass(), "depth", 515182546);
        setIntField(term899, term899.getClass(), "type", 0);
        setField(term899, term899.getClass(), "next", null);
        setField(term899, term899.getClass(), "first", null);
        setField(term899, term899.getClass(), "last", null);
        setField(term899, term899.getClass(), "propListHead", null);
        setIntField(term899, term899.getClass(), "sourcePosition", 0);
        setField(term899, term899.getClass(), "jsType", null);
        setField(term899, term899.getClass(), "parent", null);
        setField(term881, term881.getClass(), "rootNode", term899);
        setField(term881, term881.getClass(), "thisType", null);
        setBooleanField(term881, term881.getClass(), "isBottom", false);
        HashMap term3418 = new HashMap();
        term3417 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term3419 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term3420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term3417, term3417.getClass(), "vars", term3418);
        setField(term3419, term3419.getClass(), "vars", null);
        setField(term3419, term3419.getClass(), "parent", null);
        setIntField(term3419, term3419.getClass(), "depth", 0);
        setField(term3419, term3419.getClass(), "rootNode", null);
        setField(term3419, term3419.getClass(), "thisType", null);
        setBooleanField(term3419, term3419.getClass(), "isBottom", false);
        setField(term3417, term3417.getClass(), "parent", term3419);
        setIntField(term3417, term3417.getClass(), "depth", 515182546);
        setIntField(term3420, term3420.getClass(), "type", 0);
        setField(term3420, term3420.getClass(), "next", null);
        setField(term3420, term3420.getClass(), "first", null);
        setField(term3420, term3420.getClass(), "last", null);
        setField(term3420, term3420.getClass(), "propListHead", null);
        setIntField(term3420, term3420.getClass(), "sourcePosition", 0);
        setField(term3420, term3420.getClass(), "jsType", null);
        setField(term3420, term3420.getClass(), "parent", null);
        setField(term3417, term3417.getClass(), "rootNode", term3420);
        setField(term3417, term3417.getClass(), "thisType", null);
        setBooleanField(term3417, term3417.getClass(), "isBottom", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getVarCount", argTypes, term881, args);
        assertTrue(recursiveEquals(term881, term3417));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


