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

public class CodeGenerator_addAllSiblings_124279642255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2238;
     Object term2249;

    public CodeGenerator_addAllSiblings_124279642255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2239 = new HashMap();
        term2238 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term2238, term2238.getClass(), "ESCAPED_JS_STRINGS", term2239);
        setField(term2238, term2238.getClass(), "cc", null);
        setField(term2238, term2238.getClass(), "outputCharsetEncoder", null);
        term2249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2249, term2249.getClass(), "type", 71190297);
        setIntField(term2251, term2251.getClass(), "type", -1222006000);
        setIntField(term2253, term2253.getClass(), "type", 0);
        setField(term2253, term2253.getClass(), "next", null);
        setField(term2253, term2253.getClass(), "first", null);
        setField(term2253, term2253.getClass(), "last", null);
        setField(term2253, term2253.getClass(), "propListHead", null);
        setIntField(term2253, term2253.getClass(), "sourcePosition", 0);
        setField(term2253, term2253.getClass(), "jsType", null);
        setField(term2253, term2253.getClass(), "parent", null);
        setField(term2251, term2251.getClass(), "next", term2253);
        setIntField(term2256, term2256.getClass(), "type", 0);
        setField(term2256, term2256.getClass(), "next", null);
        setField(term2256, term2256.getClass(), "first", null);
        setField(term2256, term2256.getClass(), "last", null);
        setField(term2256, term2256.getClass(), "propListHead", null);
        setIntField(term2256, term2256.getClass(), "sourcePosition", 0);
        setField(term2256, term2256.getClass(), "jsType", null);
        setField(term2256, term2256.getClass(), "parent", null);
        setField(term2251, term2251.getClass(), "first", term2256);
        setIntField(term2259, term2259.getClass(), "type", 0);
        setField(term2259, term2259.getClass(), "next", null);
        setField(term2259, term2259.getClass(), "first", null);
        setField(term2259, term2259.getClass(), "last", null);
        setField(term2259, term2259.getClass(), "propListHead", null);
        setIntField(term2259, term2259.getClass(), "sourcePosition", 0);
        setField(term2259, term2259.getClass(), "jsType", null);
        setField(term2259, term2259.getClass(), "parent", null);
        setField(term2251, term2251.getClass(), "last", term2259);
        setField(term2251, term2251.getClass(), "propListHead", null);
        setIntField(term2251, term2251.getClass(), "sourcePosition", 0);
        setField(term2251, term2251.getClass(), "jsType", null);
        setField(term2251, term2251.getClass(), "parent", null);
        setField(term2249, term2249.getClass(), "next", term2251);
        setIntField(term2263, term2263.getClass(), "type", 0);
        setField(term2263, term2263.getClass(), "next", null);
        setField(term2263, term2263.getClass(), "first", null);
        setField(term2263, term2263.getClass(), "last", null);
        setField(term2263, term2263.getClass(), "propListHead", null);
        setIntField(term2263, term2263.getClass(), "sourcePosition", 0);
        setField(term2263, term2263.getClass(), "jsType", null);
        setField(term2263, term2263.getClass(), "parent", null);
        setField(term2249, term2249.getClass(), "first", term2263);
        setIntField(term2266, term2266.getClass(), "type", 0);
        setField(term2266, term2266.getClass(), "next", null);
        setField(term2266, term2266.getClass(), "first", null);
        setField(term2266, term2266.getClass(), "last", null);
        setField(term2266, term2266.getClass(), "propListHead", null);
        setIntField(term2266, term2266.getClass(), "sourcePosition", 0);
        setField(term2266, term2266.getClass(), "jsType", null);
        setField(term2266, term2266.getClass(), "parent", null);
        setField(term2249, term2249.getClass(), "last", term2266);
        setField(term2249, term2249.getClass(), "propListHead", null);
        setIntField(term2249, term2249.getClass(), "sourcePosition", 0);
        setField(term2249, term2249.getClass(), "jsType", null);
        setField(term2249, term2249.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2249;
        try {
            callMethod(klass, "addAllSiblings", argTypes, term2238, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


