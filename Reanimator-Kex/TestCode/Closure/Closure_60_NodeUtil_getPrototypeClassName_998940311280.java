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

public class NodeUtil_getPrototypeClassName_998940311280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2899;
     Object term19469;

    public NodeUtil_getPrototypeClassName_998940311280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2901 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2903 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2899, term2899.getClass(), "type", 1504698817);
        setIntField(term2901, term2901.getClass(), "type", -1573760035);
        setIntField(term2903, term2903.getClass(), "type", 0);
        setField(term2903, term2903.getClass(), "next", null);
        setField(term2903, term2903.getClass(), "first", null);
        setField(term2903, term2903.getClass(), "last", null);
        setField(term2903, term2903.getClass(), "propListHead", null);
        setIntField(term2903, term2903.getClass(), "sourcePosition", 0);
        setField(term2903, term2903.getClass(), "jsType", null);
        setField(term2903, term2903.getClass(), "parent", null);
        setField(term2901, term2901.getClass(), "next", term2903);
        setIntField(term2906, term2906.getClass(), "type", 0);
        setField(term2906, term2906.getClass(), "next", null);
        setField(term2906, term2906.getClass(), "first", null);
        setField(term2906, term2906.getClass(), "last", null);
        setField(term2906, term2906.getClass(), "propListHead", null);
        setIntField(term2906, term2906.getClass(), "sourcePosition", 0);
        setField(term2906, term2906.getClass(), "jsType", null);
        setField(term2906, term2906.getClass(), "parent", null);
        setField(term2901, term2901.getClass(), "first", term2906);
        setIntField(term2909, term2909.getClass(), "type", 0);
        setField(term2909, term2909.getClass(), "next", null);
        setField(term2909, term2909.getClass(), "first", null);
        setField(term2909, term2909.getClass(), "last", null);
        setField(term2909, term2909.getClass(), "propListHead", null);
        setIntField(term2909, term2909.getClass(), "sourcePosition", 0);
        setField(term2909, term2909.getClass(), "jsType", null);
        setField(term2909, term2909.getClass(), "parent", null);
        setField(term2901, term2901.getClass(), "last", term2909);
        setField(term2901, term2901.getClass(), "propListHead", null);
        setIntField(term2901, term2901.getClass(), "sourcePosition", 0);
        setField(term2901, term2901.getClass(), "jsType", null);
        setField(term2901, term2901.getClass(), "parent", null);
        setField(term2899, term2899.getClass(), "next", term2901);
        setIntField(term2913, term2913.getClass(), "type", 0);
        setField(term2913, term2913.getClass(), "next", null);
        setField(term2913, term2913.getClass(), "first", null);
        setField(term2913, term2913.getClass(), "last", null);
        setField(term2913, term2913.getClass(), "propListHead", null);
        setIntField(term2913, term2913.getClass(), "sourcePosition", 0);
        setField(term2913, term2913.getClass(), "jsType", null);
        setField(term2913, term2913.getClass(), "parent", null);
        setField(term2899, term2899.getClass(), "first", term2913);
        setIntField(term2916, term2916.getClass(), "type", 0);
        setField(term2916, term2916.getClass(), "next", null);
        setField(term2916, term2916.getClass(), "first", null);
        setField(term2916, term2916.getClass(), "last", null);
        setField(term2916, term2916.getClass(), "propListHead", null);
        setIntField(term2916, term2916.getClass(), "sourcePosition", 0);
        setField(term2916, term2916.getClass(), "jsType", null);
        setField(term2916, term2916.getClass(), "parent", null);
        setField(term2899, term2899.getClass(), "last", term2916);
        setField(term2899, term2899.getClass(), "propListHead", null);
        setIntField(term2899, term2899.getClass(), "sourcePosition", 0);
        setField(term2899, term2899.getClass(), "jsType", null);
        setField(term2899, term2899.getClass(), "parent", null);
        term19469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19470 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19471 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19469, term19469.getClass(), "type", 1504698817);
        setIntField(term19470, term19470.getClass(), "type", -1573760035);
        setIntField(term19471, term19471.getClass(), "type", 0);
        setField(term19471, term19471.getClass(), "next", null);
        setField(term19471, term19471.getClass(), "first", null);
        setField(term19471, term19471.getClass(), "last", null);
        setField(term19471, term19471.getClass(), "propListHead", null);
        setIntField(term19471, term19471.getClass(), "sourcePosition", 0);
        setField(term19471, term19471.getClass(), "jsType", null);
        setField(term19471, term19471.getClass(), "parent", null);
        setField(term19470, term19470.getClass(), "next", term19471);
        setIntField(term19472, term19472.getClass(), "type", 0);
        setField(term19472, term19472.getClass(), "next", null);
        setField(term19472, term19472.getClass(), "first", null);
        setField(term19472, term19472.getClass(), "last", null);
        setField(term19472, term19472.getClass(), "propListHead", null);
        setIntField(term19472, term19472.getClass(), "sourcePosition", 0);
        setField(term19472, term19472.getClass(), "jsType", null);
        setField(term19472, term19472.getClass(), "parent", null);
        setField(term19470, term19470.getClass(), "first", term19472);
        setIntField(term19473, term19473.getClass(), "type", 0);
        setField(term19473, term19473.getClass(), "next", null);
        setField(term19473, term19473.getClass(), "first", null);
        setField(term19473, term19473.getClass(), "last", null);
        setField(term19473, term19473.getClass(), "propListHead", null);
        setIntField(term19473, term19473.getClass(), "sourcePosition", 0);
        setField(term19473, term19473.getClass(), "jsType", null);
        setField(term19473, term19473.getClass(), "parent", null);
        setField(term19470, term19470.getClass(), "last", term19473);
        setField(term19470, term19470.getClass(), "propListHead", null);
        setIntField(term19470, term19470.getClass(), "sourcePosition", 0);
        setField(term19470, term19470.getClass(), "jsType", null);
        setField(term19470, term19470.getClass(), "parent", null);
        setField(term19469, term19469.getClass(), "next", term19470);
        setIntField(term19474, term19474.getClass(), "type", 0);
        setField(term19474, term19474.getClass(), "next", null);
        setField(term19474, term19474.getClass(), "first", null);
        setField(term19474, term19474.getClass(), "last", null);
        setField(term19474, term19474.getClass(), "propListHead", null);
        setIntField(term19474, term19474.getClass(), "sourcePosition", 0);
        setField(term19474, term19474.getClass(), "jsType", null);
        setField(term19474, term19474.getClass(), "parent", null);
        setField(term19469, term19469.getClass(), "first", term19474);
        setIntField(term19475, term19475.getClass(), "type", 0);
        setField(term19475, term19475.getClass(), "next", null);
        setField(term19475, term19475.getClass(), "first", null);
        setField(term19475, term19475.getClass(), "last", null);
        setField(term19475, term19475.getClass(), "propListHead", null);
        setIntField(term19475, term19475.getClass(), "sourcePosition", 0);
        setField(term19475, term19475.getClass(), "jsType", null);
        setField(term19475, term19475.getClass(), "parent", null);
        setField(term19469, term19469.getClass(), "last", term19475);
        setField(term19469, term19469.getClass(), "propListHead", null);
        setIntField(term19469, term19469.getClass(), "sourcePosition", 0);
        setField(term19469, term19469.getClass(), "jsType", null);
        setField(term19469, term19469.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2899;
        Object retValue = callMethod(klass, "getPrototypeClassName", argTypes, null, args);
        assertTrue(recursiveEquals(term2899, term19469));
        assertTrue(recursiveEquals(retValue, null));
    }

};


