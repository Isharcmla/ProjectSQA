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
     Object term2316;
     Object term2327;

    public CodeGenerator_addAllSiblings_124279642255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2317 = new HashMap();
        term2316 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term2316, term2316.getClass(), "ESCAPED_JS_STRINGS", term2317);
        setField(term2316, term2316.getClass(), "cc", null);
        setField(term2316, term2316.getClass(), "outputCharsetEncoder", null);
        term2327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2340 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2350 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2327, term2327.getClass(), "type", 1398204340);
        setIntField(term2329, term2329.getClass(), "type", 1384592638);
        setIntField(term2331, term2331.getClass(), "type", 0);
        setField(term2331, term2331.getClass(), "next", null);
        setField(term2331, term2331.getClass(), "first", null);
        setField(term2331, term2331.getClass(), "last", null);
        setField(term2331, term2331.getClass(), "propListHead", null);
        setIntField(term2331, term2331.getClass(), "sourcePosition", 0);
        setField(term2331, term2331.getClass(), "jsType", null);
        setField(term2331, term2331.getClass(), "parent", null);
        setField(term2329, term2329.getClass(), "next", term2331);
        setIntField(term2334, term2334.getClass(), "type", 0);
        setField(term2334, term2334.getClass(), "next", null);
        setField(term2334, term2334.getClass(), "first", null);
        setField(term2334, term2334.getClass(), "last", null);
        setField(term2334, term2334.getClass(), "propListHead", null);
        setIntField(term2334, term2334.getClass(), "sourcePosition", 0);
        setField(term2334, term2334.getClass(), "jsType", null);
        setField(term2334, term2334.getClass(), "parent", null);
        setField(term2329, term2329.getClass(), "first", term2334);
        setIntField(term2337, term2337.getClass(), "type", 0);
        setField(term2337, term2337.getClass(), "next", null);
        setField(term2337, term2337.getClass(), "first", null);
        setField(term2337, term2337.getClass(), "last", null);
        setField(term2337, term2337.getClass(), "propListHead", null);
        setIntField(term2337, term2337.getClass(), "sourcePosition", 0);
        setField(term2337, term2337.getClass(), "jsType", null);
        setField(term2337, term2337.getClass(), "parent", null);
        setField(term2329, term2329.getClass(), "last", term2337);
        setField(term2340, term2340.getClass(), "next", null);
        setIntField(term2340, term2340.getClass(), "type", 0);
        setIntField(term2340, term2340.getClass(), "intValue", 0);
        setField(term2340, term2340.getClass(), "objectValue", null);
        setField(term2329, term2329.getClass(), "propListHead", term2340);
        setIntField(term2329, term2329.getClass(), "sourcePosition", 1296895584);
        setField(term2329, term2329.getClass(), "jsType", null);
        setField(term2329, term2329.getClass(), "parent", null);
        setField(term2327, term2327.getClass(), "next", term2329);
        setIntField(term2344, term2344.getClass(), "type", 0);
        setField(term2344, term2344.getClass(), "next", null);
        setField(term2344, term2344.getClass(), "first", null);
        setField(term2344, term2344.getClass(), "last", null);
        setField(term2344, term2344.getClass(), "propListHead", null);
        setIntField(term2344, term2344.getClass(), "sourcePosition", 0);
        setField(term2344, term2344.getClass(), "jsType", null);
        setField(term2344, term2344.getClass(), "parent", null);
        setField(term2327, term2327.getClass(), "first", term2344);
        setIntField(term2347, term2347.getClass(), "type", 0);
        setField(term2347, term2347.getClass(), "next", null);
        setField(term2347, term2347.getClass(), "first", null);
        setField(term2347, term2347.getClass(), "last", null);
        setField(term2347, term2347.getClass(), "propListHead", null);
        setIntField(term2347, term2347.getClass(), "sourcePosition", 0);
        setField(term2347, term2347.getClass(), "jsType", null);
        setField(term2347, term2347.getClass(), "parent", null);
        setField(term2327, term2327.getClass(), "last", term2347);
        setField(term2350, term2350.getClass(), "next", null);
        setIntField(term2350, term2350.getClass(), "type", 0);
        setIntField(term2350, term2350.getClass(), "intValue", 0);
        setField(term2350, term2350.getClass(), "objectValue", null);
        setField(term2327, term2327.getClass(), "propListHead", term2350);
        setIntField(term2327, term2327.getClass(), "sourcePosition", 628918458);
        setField(term2327, term2327.getClass(), "jsType", null);
        setField(term2327, term2327.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2327;
        try {
            callMethod(klass, "addAllSiblings", argTypes, term2316, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


