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

public class Scope_isLocal_167383655341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term925;
     Object term3460;

    public Scope_isLocal_167383655341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term926 = new HashMap();
        term925 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term939 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term925, term925.getClass(), "vars", term926);
        setField(term939, term939.getClass(), "vars", null);
        setField(term939, term939.getClass(), "parent", null);
        setIntField(term939, term939.getClass(), "depth", 0);
        setField(term939, term939.getClass(), "rootNode", null);
        setField(term939, term939.getClass(), "thisType", null);
        setBooleanField(term939, term939.getClass(), "isBottom", false);
        setField(term925, term925.getClass(), "parent", term939);
        setIntField(term925, term925.getClass(), "depth", -123338791);
        setIntField(term943, term943.getClass(), "type", 0);
        setField(term943, term943.getClass(), "next", null);
        setField(term943, term943.getClass(), "first", null);
        setField(term943, term943.getClass(), "last", null);
        setField(term943, term943.getClass(), "propListHead", null);
        setIntField(term943, term943.getClass(), "sourcePosition", 0);
        setField(term943, term943.getClass(), "jsType", null);
        setField(term943, term943.getClass(), "parent", null);
        setField(term925, term925.getClass(), "rootNode", term943);
        setField(term925, term925.getClass(), "thisType", null);
        setBooleanField(term925, term925.getClass(), "isBottom", false);
        HashMap term3461 = new HashMap();
        term3460 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term3462 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term3463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term3460, term3460.getClass(), "vars", term3461);
        setField(term3462, term3462.getClass(), "vars", null);
        setField(term3462, term3462.getClass(), "parent", null);
        setIntField(term3462, term3462.getClass(), "depth", 0);
        setField(term3462, term3462.getClass(), "rootNode", null);
        setField(term3462, term3462.getClass(), "thisType", null);
        setBooleanField(term3462, term3462.getClass(), "isBottom", false);
        setField(term3460, term3460.getClass(), "parent", term3462);
        setIntField(term3460, term3460.getClass(), "depth", -123338791);
        setIntField(term3463, term3463.getClass(), "type", 0);
        setField(term3463, term3463.getClass(), "next", null);
        setField(term3463, term3463.getClass(), "first", null);
        setField(term3463, term3463.getClass(), "last", null);
        setField(term3463, term3463.getClass(), "propListHead", null);
        setIntField(term3463, term3463.getClass(), "sourcePosition", 0);
        setField(term3463, term3463.getClass(), "jsType", null);
        setField(term3463, term3463.getClass(), "parent", null);
        setField(term3460, term3460.getClass(), "rootNode", term3463);
        setField(term3460, term3460.getClass(), "thisType", null);
        setBooleanField(term3460, term3460.getClass(), "isBottom", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isLocal", argTypes, term925, args);
        assertTrue(recursiveEquals(term925, term3460));
        assertTrue(recursiveEquals(retValue, true));
    }

};


