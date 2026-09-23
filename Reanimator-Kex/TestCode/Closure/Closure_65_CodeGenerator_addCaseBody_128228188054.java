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
import java.util.HashMap;
import java.lang.Object;

public class CodeGenerator_addCaseBody_128228188054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2278;
     Object term2289;

    public CodeGenerator_addCaseBody_128228188054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2279 = new HashMap();
        term2278 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term2278, term2278.getClass(), "ESCAPED_JS_STRINGS", term2279);
        setField(term2278, term2278.getClass(), "cc", null);
        setField(term2278, term2278.getClass(), "outputCharsetEncoder", null);
        term2289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2291 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2293 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2296 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2302 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2312 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2289, term2289.getClass(), "type", -1697741339);
        setIntField(term2291, term2291.getClass(), "type", 2098647989);
        setIntField(term2293, term2293.getClass(), "type", 0);
        setField(term2293, term2293.getClass(), "next", null);
        setField(term2293, term2293.getClass(), "first", null);
        setField(term2293, term2293.getClass(), "last", null);
        setField(term2293, term2293.getClass(), "propListHead", null);
        setIntField(term2293, term2293.getClass(), "sourcePosition", 0);
        setField(term2293, term2293.getClass(), "jsType", null);
        setField(term2293, term2293.getClass(), "parent", null);
        setField(term2291, term2291.getClass(), "next", term2293);
        setIntField(term2296, term2296.getClass(), "type", 0);
        setField(term2296, term2296.getClass(), "next", null);
        setField(term2296, term2296.getClass(), "first", null);
        setField(term2296, term2296.getClass(), "last", null);
        setField(term2296, term2296.getClass(), "propListHead", null);
        setIntField(term2296, term2296.getClass(), "sourcePosition", 0);
        setField(term2296, term2296.getClass(), "jsType", null);
        setField(term2296, term2296.getClass(), "parent", null);
        setField(term2291, term2291.getClass(), "first", term2296);
        setIntField(term2299, term2299.getClass(), "type", 0);
        setField(term2299, term2299.getClass(), "next", null);
        setField(term2299, term2299.getClass(), "first", null);
        setField(term2299, term2299.getClass(), "last", null);
        setField(term2299, term2299.getClass(), "propListHead", null);
        setIntField(term2299, term2299.getClass(), "sourcePosition", 0);
        setField(term2299, term2299.getClass(), "jsType", null);
        setField(term2299, term2299.getClass(), "parent", null);
        setField(term2291, term2291.getClass(), "last", term2299);
        setField(term2302, term2302.getClass(), "next", null);
        setIntField(term2302, term2302.getClass(), "type", 0);
        setIntField(term2302, term2302.getClass(), "intValue", 0);
        setField(term2302, term2302.getClass(), "objectValue", null);
        setField(term2291, term2291.getClass(), "propListHead", term2302);
        setIntField(term2291, term2291.getClass(), "sourcePosition", -227365013);
        setField(term2291, term2291.getClass(), "jsType", null);
        setField(term2291, term2291.getClass(), "parent", null);
        setField(term2289, term2289.getClass(), "next", term2291);
        setIntField(term2306, term2306.getClass(), "type", 0);
        setField(term2306, term2306.getClass(), "next", null);
        setField(term2306, term2306.getClass(), "first", null);
        setField(term2306, term2306.getClass(), "last", null);
        setField(term2306, term2306.getClass(), "propListHead", null);
        setIntField(term2306, term2306.getClass(), "sourcePosition", 0);
        setField(term2306, term2306.getClass(), "jsType", null);
        setField(term2306, term2306.getClass(), "parent", null);
        setField(term2289, term2289.getClass(), "first", term2306);
        setIntField(term2309, term2309.getClass(), "type", 0);
        setField(term2309, term2309.getClass(), "next", null);
        setField(term2309, term2309.getClass(), "first", null);
        setField(term2309, term2309.getClass(), "last", null);
        setField(term2309, term2309.getClass(), "propListHead", null);
        setIntField(term2309, term2309.getClass(), "sourcePosition", 0);
        setField(term2309, term2309.getClass(), "jsType", null);
        setField(term2309, term2309.getClass(), "parent", null);
        setField(term2289, term2289.getClass(), "last", term2309);
        setField(term2312, term2312.getClass(), "next", null);
        setIntField(term2312, term2312.getClass(), "type", 0);
        setIntField(term2312, term2312.getClass(), "intValue", 0);
        setField(term2312, term2312.getClass(), "objectValue", null);
        setField(term2289, term2289.getClass(), "propListHead", term2312);
        setIntField(term2289, term2289.getClass(), "sourcePosition", 11724947);
        setField(term2289, term2289.getClass(), "jsType", null);
        setField(term2289, term2289.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2289;
        try {
            callMethod(klass, "addCaseBody", argTypes, term2278, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


