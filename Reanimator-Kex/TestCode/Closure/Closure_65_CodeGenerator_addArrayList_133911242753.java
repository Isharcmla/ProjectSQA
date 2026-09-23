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
import java.lang.Error;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class CodeGenerator_addArrayList_133911242753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2240;
     Object term2251;

    public CodeGenerator_addArrayList_133911242753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2241 = new HashMap();
        term2240 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term2240, term2240.getClass(), "ESCAPED_JS_STRINGS", term2241);
        setField(term2240, term2240.getClass(), "cc", null);
        setField(term2240, term2240.getClass(), "outputCharsetEncoder", null);
        term2251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2258 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2261 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2264 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2274 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2251, term2251.getClass(), "type", -2015048153);
        setIntField(term2253, term2253.getClass(), "type", -1565502840);
        setIntField(term2255, term2255.getClass(), "type", 0);
        setField(term2255, term2255.getClass(), "next", null);
        setField(term2255, term2255.getClass(), "first", null);
        setField(term2255, term2255.getClass(), "last", null);
        setField(term2255, term2255.getClass(), "propListHead", null);
        setIntField(term2255, term2255.getClass(), "sourcePosition", 0);
        setField(term2255, term2255.getClass(), "jsType", null);
        setField(term2255, term2255.getClass(), "parent", null);
        setField(term2253, term2253.getClass(), "next", term2255);
        setIntField(term2258, term2258.getClass(), "type", 0);
        setField(term2258, term2258.getClass(), "next", null);
        setField(term2258, term2258.getClass(), "first", null);
        setField(term2258, term2258.getClass(), "last", null);
        setField(term2258, term2258.getClass(), "propListHead", null);
        setIntField(term2258, term2258.getClass(), "sourcePosition", 0);
        setField(term2258, term2258.getClass(), "jsType", null);
        setField(term2258, term2258.getClass(), "parent", null);
        setField(term2253, term2253.getClass(), "first", term2258);
        setIntField(term2261, term2261.getClass(), "type", 0);
        setField(term2261, term2261.getClass(), "next", null);
        setField(term2261, term2261.getClass(), "first", null);
        setField(term2261, term2261.getClass(), "last", null);
        setField(term2261, term2261.getClass(), "propListHead", null);
        setIntField(term2261, term2261.getClass(), "sourcePosition", 0);
        setField(term2261, term2261.getClass(), "jsType", null);
        setField(term2261, term2261.getClass(), "parent", null);
        setField(term2253, term2253.getClass(), "last", term2261);
        setField(term2264, term2264.getClass(), "next", null);
        setIntField(term2264, term2264.getClass(), "type", 0);
        setIntField(term2264, term2264.getClass(), "intValue", 0);
        setField(term2264, term2264.getClass(), "objectValue", null);
        setField(term2253, term2253.getClass(), "propListHead", term2264);
        setIntField(term2253, term2253.getClass(), "sourcePosition", -25637976);
        setField(term2253, term2253.getClass(), "jsType", null);
        setField(term2253, term2253.getClass(), "parent", null);
        setField(term2251, term2251.getClass(), "next", term2253);
        setIntField(term2268, term2268.getClass(), "type", 0);
        setField(term2268, term2268.getClass(), "next", null);
        setField(term2268, term2268.getClass(), "first", null);
        setField(term2268, term2268.getClass(), "last", null);
        setField(term2268, term2268.getClass(), "propListHead", null);
        setIntField(term2268, term2268.getClass(), "sourcePosition", 0);
        setField(term2268, term2268.getClass(), "jsType", null);
        setField(term2268, term2268.getClass(), "parent", null);
        setField(term2251, term2251.getClass(), "first", term2268);
        setIntField(term2271, term2271.getClass(), "type", 0);
        setField(term2271, term2271.getClass(), "next", null);
        setField(term2271, term2271.getClass(), "first", null);
        setField(term2271, term2271.getClass(), "last", null);
        setField(term2271, term2271.getClass(), "propListHead", null);
        setIntField(term2271, term2271.getClass(), "sourcePosition", 0);
        setField(term2271, term2271.getClass(), "jsType", null);
        setField(term2271, term2271.getClass(), "parent", null);
        setField(term2251, term2251.getClass(), "last", term2271);
        setField(term2274, term2274.getClass(), "next", null);
        setIntField(term2274, term2274.getClass(), "type", 0);
        setIntField(term2274, term2274.getClass(), "intValue", 0);
        setField(term2274, term2274.getClass(), "objectValue", null);
        setField(term2251, term2251.getClass(), "propListHead", term2274);
        setIntField(term2251, term2251.getClass(), "sourcePosition", 1555897383);
        setField(term2251, term2251.getClass(), "jsType", null);
        setField(term2251, term2251.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2251;
        try {
            callMethod(klass, "addArrayList", argTypes, term2240, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


