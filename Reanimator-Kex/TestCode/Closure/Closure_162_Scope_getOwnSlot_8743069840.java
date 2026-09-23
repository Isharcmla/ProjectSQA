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

public class Scope_getOwnSlot_8743069840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term684;
     Object term2951;

    public Scope_getOwnSlot_8743069840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term685 = new HashMap();
        term684 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term698 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term684, term684.getClass(), "vars", term685);
        setField(term698, term698.getClass(), "vars", null);
        setField(term698, term698.getClass(), "parent", null);
        setIntField(term698, term698.getClass(), "depth", 0);
        setField(term698, term698.getClass(), "rootNode", null);
        setField(term698, term698.getClass(), "thisType", null);
        setBooleanField(term698, term698.getClass(), "isBottom", false);
        setField(term698, term698.getClass(), "arguments", null);
        setField(term684, term684.getClass(), "parent", term698);
        setIntField(term684, term684.getClass(), "depth", -507387516);
        setIntField(term702, term702.getClass(), "type", 0);
        setField(term702, term702.getClass(), "next", null);
        setField(term702, term702.getClass(), "first", null);
        setField(term702, term702.getClass(), "last", null);
        setField(term702, term702.getClass(), "propListHead", null);
        setIntField(term702, term702.getClass(), "sourcePosition", 0);
        setField(term702, term702.getClass(), "jsType", null);
        setField(term702, term702.getClass(), "parent", null);
        setField(term684, term684.getClass(), "rootNode", term702);
        setField(term684, term684.getClass(), "thisType", null);
        setBooleanField(term684, term684.getClass(), "isBottom", false);
        setField(term684, term684.getClass(), "arguments", null);
        HashMap term2952 = new HashMap();
        term2951 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term2953 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term2954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2951, term2951.getClass(), "vars", term2952);
        setField(term2953, term2953.getClass(), "vars", null);
        setField(term2953, term2953.getClass(), "parent", null);
        setIntField(term2953, term2953.getClass(), "depth", 0);
        setField(term2953, term2953.getClass(), "rootNode", null);
        setField(term2953, term2953.getClass(), "thisType", null);
        setBooleanField(term2953, term2953.getClass(), "isBottom", false);
        setField(term2953, term2953.getClass(), "arguments", null);
        setField(term2951, term2951.getClass(), "parent", term2953);
        setIntField(term2951, term2951.getClass(), "depth", -507387516);
        setIntField(term2954, term2954.getClass(), "type", 0);
        setField(term2954, term2954.getClass(), "next", null);
        setField(term2954, term2954.getClass(), "first", null);
        setField(term2954, term2954.getClass(), "last", null);
        setField(term2954, term2954.getClass(), "propListHead", null);
        setIntField(term2954, term2954.getClass(), "sourcePosition", 0);
        setField(term2954, term2954.getClass(), "jsType", null);
        setField(term2954, term2954.getClass(), "parent", null);
        setField(term2951, term2951.getClass(), "rootNode", term2954);
        setField(term2951, term2951.getClass(), "thisType", null);
        setBooleanField(term2951, term2951.getClass(), "isBottom", false);
        setField(term2951, term2951.getClass(), "arguments", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SdCKLMIYnX";
        Object retValue = callMethod(klass, "getOwnSlot", argTypes, term684, args);
        assertTrue(recursiveEquals(term684, term2951));
        assertTrue(recursiveEquals(retValue, null));
    }

};


