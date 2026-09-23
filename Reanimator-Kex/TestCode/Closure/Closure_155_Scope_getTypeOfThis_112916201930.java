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

public class Scope_getTypeOfThis_112916201930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236;
     Object term1585;

    public Scope_getTypeOfThis_112916201930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term237 = new HashMap();
        term236 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term250 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term236, term236.getClass(), "vars", term237);
        setField(term250, term250.getClass(), "vars", null);
        setField(term250, term250.getClass(), "parent", null);
        setIntField(term250, term250.getClass(), "depth", 0);
        setField(term250, term250.getClass(), "rootNode", null);
        setField(term250, term250.getClass(), "thisType", null);
        setBooleanField(term250, term250.getClass(), "isBottom", false);
        setField(term236, term236.getClass(), "parent", term250);
        setIntField(term236, term236.getClass(), "depth", 1474524152);
        setIntField(term254, term254.getClass(), "type", 0);
        setField(term254, term254.getClass(), "next", null);
        setField(term254, term254.getClass(), "first", null);
        setField(term254, term254.getClass(), "last", null);
        setField(term254, term254.getClass(), "propListHead", null);
        setIntField(term254, term254.getClass(), "sourcePosition", 0);
        setField(term254, term254.getClass(), "jsType", null);
        setField(term254, term254.getClass(), "parent", null);
        setField(term236, term236.getClass(), "rootNode", term254);
        setField(term236, term236.getClass(), "thisType", null);
        setBooleanField(term236, term236.getClass(), "isBottom", false);
        HashMap term1586 = new HashMap();
        term1585 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1587 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1585, term1585.getClass(), "vars", term1586);
        setField(term1587, term1587.getClass(), "vars", null);
        setField(term1587, term1587.getClass(), "parent", null);
        setIntField(term1587, term1587.getClass(), "depth", 0);
        setField(term1587, term1587.getClass(), "rootNode", null);
        setField(term1587, term1587.getClass(), "thisType", null);
        setBooleanField(term1587, term1587.getClass(), "isBottom", false);
        setField(term1585, term1585.getClass(), "parent", term1587);
        setIntField(term1585, term1585.getClass(), "depth", 1474524152);
        setIntField(term1588, term1588.getClass(), "type", 0);
        setField(term1588, term1588.getClass(), "next", null);
        setField(term1588, term1588.getClass(), "first", null);
        setField(term1588, term1588.getClass(), "last", null);
        setField(term1588, term1588.getClass(), "propListHead", null);
        setIntField(term1588, term1588.getClass(), "sourcePosition", 0);
        setField(term1588, term1588.getClass(), "jsType", null);
        setField(term1588, term1588.getClass(), "parent", null);
        setField(term1585, term1585.getClass(), "rootNode", term1588);
        setField(term1585, term1585.getClass(), "thisType", null);
        setBooleanField(term1585, term1585.getClass(), "isBottom", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getTypeOfThis", argTypes, term236, args);
        assertTrue(recursiveEquals(term236, term1585));
        assertTrue(recursiveEquals(retValue, null));
    }

};


