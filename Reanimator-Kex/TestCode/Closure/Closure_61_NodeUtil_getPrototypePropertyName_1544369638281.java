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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_getPrototypePropertyName_1544369638281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2920;

    public NodeUtil_getPrototypePropertyName_1544369638281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2930 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2920, term2920.getClass(), "type", 2108571355);
        setIntField(term2922, term2922.getClass(), "type", 2079590265);
        setIntField(term2924, term2924.getClass(), "type", 0);
        setField(term2924, term2924.getClass(), "next", null);
        setField(term2924, term2924.getClass(), "first", null);
        setField(term2924, term2924.getClass(), "last", null);
        setField(term2924, term2924.getClass(), "propListHead", null);
        setIntField(term2924, term2924.getClass(), "sourcePosition", 0);
        setField(term2924, term2924.getClass(), "jsType", null);
        setField(term2924, term2924.getClass(), "parent", null);
        setField(term2922, term2922.getClass(), "next", term2924);
        setIntField(term2927, term2927.getClass(), "type", 0);
        setField(term2927, term2927.getClass(), "next", null);
        setField(term2927, term2927.getClass(), "first", null);
        setField(term2927, term2927.getClass(), "last", null);
        setField(term2927, term2927.getClass(), "propListHead", null);
        setIntField(term2927, term2927.getClass(), "sourcePosition", 0);
        setField(term2927, term2927.getClass(), "jsType", null);
        setField(term2927, term2927.getClass(), "parent", null);
        setField(term2922, term2922.getClass(), "first", term2927);
        setIntField(term2930, term2930.getClass(), "type", 0);
        setField(term2930, term2930.getClass(), "next", null);
        setField(term2930, term2930.getClass(), "first", null);
        setField(term2930, term2930.getClass(), "last", null);
        setField(term2930, term2930.getClass(), "propListHead", null);
        setIntField(term2930, term2930.getClass(), "sourcePosition", 0);
        setField(term2930, term2930.getClass(), "jsType", null);
        setField(term2930, term2930.getClass(), "parent", null);
        setField(term2922, term2922.getClass(), "last", term2930);
        setField(term2922, term2922.getClass(), "propListHead", null);
        setIntField(term2922, term2922.getClass(), "sourcePosition", 0);
        setField(term2922, term2922.getClass(), "jsType", null);
        setField(term2922, term2922.getClass(), "parent", null);
        setField(term2920, term2920.getClass(), "next", term2922);
        setIntField(term2934, term2934.getClass(), "type", 0);
        setField(term2934, term2934.getClass(), "next", null);
        setField(term2934, term2934.getClass(), "first", null);
        setField(term2934, term2934.getClass(), "last", null);
        setField(term2934, term2934.getClass(), "propListHead", null);
        setIntField(term2934, term2934.getClass(), "sourcePosition", 0);
        setField(term2934, term2934.getClass(), "jsType", null);
        setField(term2934, term2934.getClass(), "parent", null);
        setField(term2920, term2920.getClass(), "first", term2934);
        setIntField(term2937, term2937.getClass(), "type", 0);
        setField(term2937, term2937.getClass(), "next", null);
        setField(term2937, term2937.getClass(), "first", null);
        setField(term2937, term2937.getClass(), "last", null);
        setField(term2937, term2937.getClass(), "propListHead", null);
        setIntField(term2937, term2937.getClass(), "sourcePosition", 0);
        setField(term2937, term2937.getClass(), "jsType", null);
        setField(term2937, term2937.getClass(), "parent", null);
        setField(term2920, term2920.getClass(), "last", term2937);
        setField(term2920, term2920.getClass(), "propListHead", null);
        setIntField(term2920, term2920.getClass(), "sourcePosition", 0);
        setField(term2920, term2920.getClass(), "jsType", null);
        setField(term2920, term2920.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2920;
        try {
            callMethod(klass, "getPrototypePropertyName", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


