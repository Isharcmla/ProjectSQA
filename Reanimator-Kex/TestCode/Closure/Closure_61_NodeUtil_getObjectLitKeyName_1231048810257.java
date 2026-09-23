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

public class NodeUtil_getObjectLitKeyName_1231048810257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2213;

    public NodeUtil_getObjectLitKeyName_1231048810257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2220 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2213, term2213.getClass(), "type", 314478878);
        setIntField(term2215, term2215.getClass(), "type", 1472218987);
        setIntField(term2217, term2217.getClass(), "type", 0);
        setField(term2217, term2217.getClass(), "next", null);
        setField(term2217, term2217.getClass(), "first", null);
        setField(term2217, term2217.getClass(), "last", null);
        setField(term2217, term2217.getClass(), "propListHead", null);
        setIntField(term2217, term2217.getClass(), "sourcePosition", 0);
        setField(term2217, term2217.getClass(), "jsType", null);
        setField(term2217, term2217.getClass(), "parent", null);
        setField(term2215, term2215.getClass(), "next", term2217);
        setIntField(term2220, term2220.getClass(), "type", 0);
        setField(term2220, term2220.getClass(), "next", null);
        setField(term2220, term2220.getClass(), "first", null);
        setField(term2220, term2220.getClass(), "last", null);
        setField(term2220, term2220.getClass(), "propListHead", null);
        setIntField(term2220, term2220.getClass(), "sourcePosition", 0);
        setField(term2220, term2220.getClass(), "jsType", null);
        setField(term2220, term2220.getClass(), "parent", null);
        setField(term2215, term2215.getClass(), "first", term2220);
        setIntField(term2223, term2223.getClass(), "type", 0);
        setField(term2223, term2223.getClass(), "next", null);
        setField(term2223, term2223.getClass(), "first", null);
        setField(term2223, term2223.getClass(), "last", null);
        setField(term2223, term2223.getClass(), "propListHead", null);
        setIntField(term2223, term2223.getClass(), "sourcePosition", 0);
        setField(term2223, term2223.getClass(), "jsType", null);
        setField(term2223, term2223.getClass(), "parent", null);
        setField(term2215, term2215.getClass(), "last", term2223);
        setField(term2215, term2215.getClass(), "propListHead", null);
        setIntField(term2215, term2215.getClass(), "sourcePosition", 0);
        setField(term2215, term2215.getClass(), "jsType", null);
        setField(term2215, term2215.getClass(), "parent", null);
        setField(term2213, term2213.getClass(), "next", term2215);
        setIntField(term2227, term2227.getClass(), "type", 0);
        setField(term2227, term2227.getClass(), "next", null);
        setField(term2227, term2227.getClass(), "first", null);
        setField(term2227, term2227.getClass(), "last", null);
        setField(term2227, term2227.getClass(), "propListHead", null);
        setIntField(term2227, term2227.getClass(), "sourcePosition", 0);
        setField(term2227, term2227.getClass(), "jsType", null);
        setField(term2227, term2227.getClass(), "parent", null);
        setField(term2213, term2213.getClass(), "first", term2227);
        setIntField(term2230, term2230.getClass(), "type", 0);
        setField(term2230, term2230.getClass(), "next", null);
        setField(term2230, term2230.getClass(), "first", null);
        setField(term2230, term2230.getClass(), "last", null);
        setField(term2230, term2230.getClass(), "propListHead", null);
        setIntField(term2230, term2230.getClass(), "sourcePosition", 0);
        setField(term2230, term2230.getClass(), "jsType", null);
        setField(term2230, term2230.getClass(), "parent", null);
        setField(term2213, term2213.getClass(), "last", term2230);
        setField(term2213, term2213.getClass(), "propListHead", null);
        setIntField(term2213, term2213.getClass(), "sourcePosition", 0);
        setField(term2213, term2213.getClass(), "jsType", null);
        setField(term2213, term2213.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2213;
        try {
            callMethod(klass, "getObjectLitKeyName", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


