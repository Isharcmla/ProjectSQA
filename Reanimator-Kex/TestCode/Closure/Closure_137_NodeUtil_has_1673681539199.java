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

public class NodeUtil_has_1673681539199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2927;

    public NodeUtil_has_1673681539199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2931 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2940 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2944 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2947 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2950 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2927, term2927.getClass(), "type", -189738995);
        setIntField(term2929, term2929.getClass(), "type", -1626074989);
        setIntField(term2931, term2931.getClass(), "type", 0);
        setField(term2931, term2931.getClass(), "next", null);
        setField(term2931, term2931.getClass(), "first", null);
        setField(term2931, term2931.getClass(), "last", null);
        setField(term2931, term2931.getClass(), "propListHead", null);
        setIntField(term2931, term2931.getClass(), "sourcePosition", 0);
        setField(term2931, term2931.getClass(), "jsType", null);
        setField(term2931, term2931.getClass(), "parent", null);
        setField(term2929, term2929.getClass(), "next", term2931);
        setIntField(term2934, term2934.getClass(), "type", 0);
        setField(term2934, term2934.getClass(), "next", null);
        setField(term2934, term2934.getClass(), "first", null);
        setField(term2934, term2934.getClass(), "last", null);
        setField(term2934, term2934.getClass(), "propListHead", null);
        setIntField(term2934, term2934.getClass(), "sourcePosition", 0);
        setField(term2934, term2934.getClass(), "jsType", null);
        setField(term2934, term2934.getClass(), "parent", null);
        setField(term2929, term2929.getClass(), "first", term2934);
        setIntField(term2937, term2937.getClass(), "type", 0);
        setField(term2937, term2937.getClass(), "next", null);
        setField(term2937, term2937.getClass(), "first", null);
        setField(term2937, term2937.getClass(), "last", null);
        setField(term2937, term2937.getClass(), "propListHead", null);
        setIntField(term2937, term2937.getClass(), "sourcePosition", 0);
        setField(term2937, term2937.getClass(), "jsType", null);
        setField(term2937, term2937.getClass(), "parent", null);
        setField(term2929, term2929.getClass(), "last", term2937);
        setField(term2940, term2940.getClass(), "next", null);
        setIntField(term2940, term2940.getClass(), "type", 0);
        setIntField(term2940, term2940.getClass(), "intValue", 0);
        setField(term2940, term2940.getClass(), "objectValue", null);
        setField(term2929, term2929.getClass(), "propListHead", term2940);
        setIntField(term2929, term2929.getClass(), "sourcePosition", 1761540885);
        setField(term2929, term2929.getClass(), "jsType", null);
        setField(term2929, term2929.getClass(), "parent", null);
        setField(term2927, term2927.getClass(), "next", term2929);
        setIntField(term2944, term2944.getClass(), "type", 0);
        setField(term2944, term2944.getClass(), "next", null);
        setField(term2944, term2944.getClass(), "first", null);
        setField(term2944, term2944.getClass(), "last", null);
        setField(term2944, term2944.getClass(), "propListHead", null);
        setIntField(term2944, term2944.getClass(), "sourcePosition", 0);
        setField(term2944, term2944.getClass(), "jsType", null);
        setField(term2944, term2944.getClass(), "parent", null);
        setField(term2927, term2927.getClass(), "first", term2944);
        setIntField(term2947, term2947.getClass(), "type", 0);
        setField(term2947, term2947.getClass(), "next", null);
        setField(term2947, term2947.getClass(), "first", null);
        setField(term2947, term2947.getClass(), "last", null);
        setField(term2947, term2947.getClass(), "propListHead", null);
        setIntField(term2947, term2947.getClass(), "sourcePosition", 0);
        setField(term2947, term2947.getClass(), "jsType", null);
        setField(term2947, term2947.getClass(), "parent", null);
        setField(term2927, term2927.getClass(), "last", term2947);
        setField(term2950, term2950.getClass(), "next", null);
        setIntField(term2950, term2950.getClass(), "type", 0);
        setIntField(term2950, term2950.getClass(), "intValue", 0);
        setField(term2950, term2950.getClass(), "objectValue", null);
        setField(term2927, term2927.getClass(), "propListHead", term2950);
        setIntField(term2927, term2927.getClass(), "sourcePosition", -168498989);
        setField(term2927, term2927.getClass(), "jsType", null);
        setField(term2927, term2927.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.common.base.Predicate");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term2927;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "has", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


