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

public class NodeUtil_tryMergeBlock_1632890151233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2162;

    public NodeUtil_tryMergeBlock_1632890151233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2175 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2185 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2162, term2162.getClass(), "type", -2134711835);
        setIntField(term2164, term2164.getClass(), "type", 225873732);
        setIntField(term2166, term2166.getClass(), "type", 0);
        setField(term2166, term2166.getClass(), "next", null);
        setField(term2166, term2166.getClass(), "first", null);
        setField(term2166, term2166.getClass(), "last", null);
        setField(term2166, term2166.getClass(), "propListHead", null);
        setIntField(term2166, term2166.getClass(), "sourcePosition", 0);
        setField(term2166, term2166.getClass(), "jsType", null);
        setField(term2166, term2166.getClass(), "parent", null);
        setField(term2164, term2164.getClass(), "next", term2166);
        setIntField(term2169, term2169.getClass(), "type", 0);
        setField(term2169, term2169.getClass(), "next", null);
        setField(term2169, term2169.getClass(), "first", null);
        setField(term2169, term2169.getClass(), "last", null);
        setField(term2169, term2169.getClass(), "propListHead", null);
        setIntField(term2169, term2169.getClass(), "sourcePosition", 0);
        setField(term2169, term2169.getClass(), "jsType", null);
        setField(term2169, term2169.getClass(), "parent", null);
        setField(term2164, term2164.getClass(), "first", term2169);
        setIntField(term2172, term2172.getClass(), "type", 0);
        setField(term2172, term2172.getClass(), "next", null);
        setField(term2172, term2172.getClass(), "first", null);
        setField(term2172, term2172.getClass(), "last", null);
        setField(term2172, term2172.getClass(), "propListHead", null);
        setIntField(term2172, term2172.getClass(), "sourcePosition", 0);
        setField(term2172, term2172.getClass(), "jsType", null);
        setField(term2172, term2172.getClass(), "parent", null);
        setField(term2164, term2164.getClass(), "last", term2172);
        setField(term2175, term2175.getClass(), "next", null);
        setIntField(term2175, term2175.getClass(), "type", 0);
        setIntField(term2175, term2175.getClass(), "intValue", 0);
        setField(term2175, term2175.getClass(), "objectValue", null);
        setField(term2164, term2164.getClass(), "propListHead", term2175);
        setIntField(term2164, term2164.getClass(), "sourcePosition", 1544768934);
        setField(term2164, term2164.getClass(), "jsType", null);
        setField(term2164, term2164.getClass(), "parent", null);
        setField(term2162, term2162.getClass(), "next", term2164);
        setIntField(term2179, term2179.getClass(), "type", 0);
        setField(term2179, term2179.getClass(), "next", null);
        setField(term2179, term2179.getClass(), "first", null);
        setField(term2179, term2179.getClass(), "last", null);
        setField(term2179, term2179.getClass(), "propListHead", null);
        setIntField(term2179, term2179.getClass(), "sourcePosition", 0);
        setField(term2179, term2179.getClass(), "jsType", null);
        setField(term2179, term2179.getClass(), "parent", null);
        setField(term2162, term2162.getClass(), "first", term2179);
        setIntField(term2182, term2182.getClass(), "type", 0);
        setField(term2182, term2182.getClass(), "next", null);
        setField(term2182, term2182.getClass(), "first", null);
        setField(term2182, term2182.getClass(), "last", null);
        setField(term2182, term2182.getClass(), "propListHead", null);
        setIntField(term2182, term2182.getClass(), "sourcePosition", 0);
        setField(term2182, term2182.getClass(), "jsType", null);
        setField(term2182, term2182.getClass(), "parent", null);
        setField(term2162, term2162.getClass(), "last", term2182);
        setField(term2185, term2185.getClass(), "next", null);
        setIntField(term2185, term2185.getClass(), "type", 0);
        setIntField(term2185, term2185.getClass(), "intValue", 0);
        setField(term2185, term2185.getClass(), "objectValue", null);
        setField(term2162, term2162.getClass(), "propListHead", term2185);
        setIntField(term2162, term2162.getClass(), "sourcePosition", -383508597);
        setField(term2162, term2162.getClass(), "jsType", null);
        setField(term2162, term2162.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2162;
        try {
            callMethod(klass, "tryMergeBlock", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


