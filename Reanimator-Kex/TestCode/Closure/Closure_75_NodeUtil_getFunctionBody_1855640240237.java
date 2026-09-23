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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_getFunctionBody_1855640240237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2270;

    public NodeUtil_getFunctionBody_1855640240237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2277 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2283 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2290 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2293 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2270, term2270.getClass(), "type", -1142164411);
        setIntField(term2272, term2272.getClass(), "type", -965421502);
        setIntField(term2274, term2274.getClass(), "type", 0);
        setField(term2274, term2274.getClass(), "next", null);
        setField(term2274, term2274.getClass(), "first", null);
        setField(term2274, term2274.getClass(), "last", null);
        setField(term2274, term2274.getClass(), "propListHead", null);
        setIntField(term2274, term2274.getClass(), "sourcePosition", 0);
        setField(term2274, term2274.getClass(), "jsType", null);
        setField(term2274, term2274.getClass(), "parent", null);
        setField(term2272, term2272.getClass(), "next", term2274);
        setIntField(term2277, term2277.getClass(), "type", 0);
        setField(term2277, term2277.getClass(), "next", null);
        setField(term2277, term2277.getClass(), "first", null);
        setField(term2277, term2277.getClass(), "last", null);
        setField(term2277, term2277.getClass(), "propListHead", null);
        setIntField(term2277, term2277.getClass(), "sourcePosition", 0);
        setField(term2277, term2277.getClass(), "jsType", null);
        setField(term2277, term2277.getClass(), "parent", null);
        setField(term2272, term2272.getClass(), "first", term2277);
        setIntField(term2280, term2280.getClass(), "type", 0);
        setField(term2280, term2280.getClass(), "next", null);
        setField(term2280, term2280.getClass(), "first", null);
        setField(term2280, term2280.getClass(), "last", null);
        setField(term2280, term2280.getClass(), "propListHead", null);
        setIntField(term2280, term2280.getClass(), "sourcePosition", 0);
        setField(term2280, term2280.getClass(), "jsType", null);
        setField(term2280, term2280.getClass(), "parent", null);
        setField(term2272, term2272.getClass(), "last", term2280);
        setField(term2283, term2283.getClass(), "next", null);
        setIntField(term2283, term2283.getClass(), "type", 0);
        setIntField(term2283, term2283.getClass(), "intValue", 0);
        setField(term2283, term2283.getClass(), "objectValue", null);
        setField(term2272, term2272.getClass(), "propListHead", term2283);
        setIntField(term2272, term2272.getClass(), "sourcePosition", 1956006038);
        setField(term2272, term2272.getClass(), "jsType", null);
        setField(term2272, term2272.getClass(), "parent", null);
        setField(term2270, term2270.getClass(), "next", term2272);
        setIntField(term2287, term2287.getClass(), "type", 0);
        setField(term2287, term2287.getClass(), "next", null);
        setField(term2287, term2287.getClass(), "first", null);
        setField(term2287, term2287.getClass(), "last", null);
        setField(term2287, term2287.getClass(), "propListHead", null);
        setIntField(term2287, term2287.getClass(), "sourcePosition", 0);
        setField(term2287, term2287.getClass(), "jsType", null);
        setField(term2287, term2287.getClass(), "parent", null);
        setField(term2270, term2270.getClass(), "first", term2287);
        setIntField(term2290, term2290.getClass(), "type", 0);
        setField(term2290, term2290.getClass(), "next", null);
        setField(term2290, term2290.getClass(), "first", null);
        setField(term2290, term2290.getClass(), "last", null);
        setField(term2290, term2290.getClass(), "propListHead", null);
        setIntField(term2290, term2290.getClass(), "sourcePosition", 0);
        setField(term2290, term2290.getClass(), "jsType", null);
        setField(term2290, term2290.getClass(), "parent", null);
        setField(term2270, term2270.getClass(), "last", term2290);
        setField(term2293, term2293.getClass(), "next", null);
        setIntField(term2293, term2293.getClass(), "type", 0);
        setIntField(term2293, term2293.getClass(), "intValue", 0);
        setField(term2293, term2293.getClass(), "objectValue", null);
        setField(term2270, term2270.getClass(), "propListHead", term2293);
        setIntField(term2270, term2270.getClass(), "sourcePosition", -1062304878);
        setField(term2270, term2270.getClass(), "jsType", null);
        setField(term2270, term2270.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2270;
        try {
            callMethod(klass, "getFunctionBody", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


