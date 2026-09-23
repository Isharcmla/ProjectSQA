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
import java.lang.Object;
import java.lang.Integer;

public class CodeGenerator_getNonEmptyChildCount_147325746227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2934;
     Object term2961;

    public CodeGenerator_getNonEmptyChildCount_147325746227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2940 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2942 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2951 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2934, term2934.getClass(), "type", 9726679);
        setIntField(term2936, term2936.getClass(), "type", -25637976);
        setIntField(term2938, term2938.getClass(), "type", 1555897383);
        setIntField(term2940, term2940.getClass(), "type", 202001407);
        setIntField(term2942, term2942.getClass(), "type", 158873461);
        setField(term2942, term2942.getClass(), "next", null);
        setField(term2942, term2942.getClass(), "first", null);
        setField(term2942, term2942.getClass(), "last", null);
        setField(term2942, term2942.getClass(), "propListHead", null);
        setIntField(term2942, term2942.getClass(), "sourcePosition", 0);
        setField(term2942, term2942.getClass(), "jsType", null);
        setField(term2942, term2942.getClass(), "parent", null);
        setField(term2940, term2940.getClass(), "next", term2942);
        setIntField(term2945, term2945.getClass(), "type", -430151637);
        setField(term2945, term2945.getClass(), "next", null);
        setField(term2945, term2945.getClass(), "first", null);
        setField(term2945, term2945.getClass(), "last", term2942);
        setField(term2945, term2945.getClass(), "propListHead", null);
        setIntField(term2945, term2945.getClass(), "sourcePosition", 0);
        setField(term2945, term2945.getClass(), "jsType", null);
        setField(term2945, term2945.getClass(), "parent", null);
        setField(term2940, term2940.getClass(), "first", term2945);
        setField(term2940, term2940.getClass(), "last", term2938);
        setField(term2940, term2940.getClass(), "propListHead", null);
        setIntField(term2940, term2940.getClass(), "sourcePosition", 0);
        setField(term2940, term2940.getClass(), "jsType", null);
        setField(term2940, term2940.getClass(), "parent", null);
        setField(term2938, term2938.getClass(), "next", term2940);
        setField(term2938, term2938.getClass(), "first", term2942);
        setIntField(term2949, term2949.getClass(), "type", 98922530);
        setIntField(term2951, term2951.getClass(), "type", -1388471422);
        setField(term2951, term2951.getClass(), "next", null);
        setField(term2951, term2951.getClass(), "first", term2945);
        setField(term2951, term2951.getClass(), "last", term2940);
        setField(term2951, term2951.getClass(), "propListHead", null);
        setIntField(term2951, term2951.getClass(), "sourcePosition", 0);
        setField(term2951, term2951.getClass(), "jsType", null);
        setField(term2951, term2951.getClass(), "parent", null);
        setField(term2949, term2949.getClass(), "next", term2951);
        setField(term2949, term2949.getClass(), "first", term2936);
        setField(term2949, term2949.getClass(), "last", term2936);
        setField(term2949, term2949.getClass(), "propListHead", null);
        setIntField(term2949, term2949.getClass(), "sourcePosition", 0);
        setField(term2949, term2949.getClass(), "jsType", null);
        setField(term2949, term2949.getClass(), "parent", null);
        setField(term2938, term2938.getClass(), "last", term2949);
        setField(term2938, term2938.getClass(), "propListHead", null);
        setIntField(term2938, term2938.getClass(), "sourcePosition", 0);
        setField(term2938, term2938.getClass(), "jsType", null);
        setField(term2938, term2938.getClass(), "parent", null);
        setField(term2936, term2936.getClass(), "next", term2938);
        setIntField(term2956, term2956.getClass(), "type", -1498296052);
        setField(term2956, term2956.getClass(), "next", term2949);
        setField(term2956, term2956.getClass(), "first", term2951);
        setField(term2956, term2956.getClass(), "last", term2934);
        setField(term2956, term2956.getClass(), "propListHead", null);
        setIntField(term2956, term2956.getClass(), "sourcePosition", 0);
        setField(term2956, term2956.getClass(), "jsType", null);
        setField(term2956, term2956.getClass(), "parent", null);
        setField(term2936, term2936.getClass(), "first", term2956);
        setField(term2936, term2936.getClass(), "last", term2956);
        setField(term2936, term2936.getClass(), "propListHead", null);
        setIntField(term2936, term2936.getClass(), "sourcePosition", 0);
        setField(term2936, term2936.getClass(), "jsType", null);
        setField(term2936, term2936.getClass(), "parent", null);
        setField(term2934, term2934.getClass(), "next", term2936);
        setField(term2934, term2934.getClass(), "first", term2940);
        setField(term2934, term2934.getClass(), "last", term2942);
        setField(term2934, term2934.getClass(), "propListHead", null);
        setIntField(term2934, term2934.getClass(), "sourcePosition", 0);
        setField(term2934, term2934.getClass(), "jsType", null);
        setField(term2934, term2934.getClass(), "parent", null);
        term2961 = new Integer(2098647989);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2934;
        args[1] = term2961;
        callMethod(klass, "getNonEmptyChildCount", argTypes, null, args);
    }

};


