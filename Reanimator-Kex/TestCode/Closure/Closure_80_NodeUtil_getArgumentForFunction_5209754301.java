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

public class NodeUtil_getArgumentForFunction_5209754301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4379;
     Object term4406;

    public NodeUtil_getArgumentForFunction_5209754301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4383 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4392 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4402 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4379, term4379.getClass(), "type", -1454325068);
        setIntField(term4381, term4381.getClass(), "type", 522501050);
        setIntField(term4383, term4383.getClass(), "type", 0);
        setField(term4383, term4383.getClass(), "next", null);
        setField(term4383, term4383.getClass(), "first", null);
        setField(term4383, term4383.getClass(), "last", null);
        setField(term4383, term4383.getClass(), "propListHead", null);
        setIntField(term4383, term4383.getClass(), "sourcePosition", 0);
        setField(term4383, term4383.getClass(), "jsType", null);
        setField(term4383, term4383.getClass(), "parent", null);
        setField(term4381, term4381.getClass(), "next", term4383);
        setIntField(term4386, term4386.getClass(), "type", 0);
        setField(term4386, term4386.getClass(), "next", null);
        setField(term4386, term4386.getClass(), "first", null);
        setField(term4386, term4386.getClass(), "last", null);
        setField(term4386, term4386.getClass(), "propListHead", null);
        setIntField(term4386, term4386.getClass(), "sourcePosition", 0);
        setField(term4386, term4386.getClass(), "jsType", null);
        setField(term4386, term4386.getClass(), "parent", null);
        setField(term4381, term4381.getClass(), "first", term4386);
        setIntField(term4389, term4389.getClass(), "type", 0);
        setField(term4389, term4389.getClass(), "next", null);
        setField(term4389, term4389.getClass(), "first", null);
        setField(term4389, term4389.getClass(), "last", null);
        setField(term4389, term4389.getClass(), "propListHead", null);
        setIntField(term4389, term4389.getClass(), "sourcePosition", 0);
        setField(term4389, term4389.getClass(), "jsType", null);
        setField(term4389, term4389.getClass(), "parent", null);
        setField(term4381, term4381.getClass(), "last", term4389);
        setField(term4392, term4392.getClass(), "next", null);
        setIntField(term4392, term4392.getClass(), "type", 0);
        setIntField(term4392, term4392.getClass(), "intValue", 0);
        setField(term4392, term4392.getClass(), "objectValue", null);
        setField(term4381, term4381.getClass(), "propListHead", term4392);
        setIntField(term4381, term4381.getClass(), "sourcePosition", -1811706962);
        setField(term4381, term4381.getClass(), "jsType", null);
        setField(term4381, term4381.getClass(), "parent", null);
        setField(term4379, term4379.getClass(), "next", term4381);
        setIntField(term4396, term4396.getClass(), "type", 0);
        setField(term4396, term4396.getClass(), "next", null);
        setField(term4396, term4396.getClass(), "first", null);
        setField(term4396, term4396.getClass(), "last", null);
        setField(term4396, term4396.getClass(), "propListHead", null);
        setIntField(term4396, term4396.getClass(), "sourcePosition", 0);
        setField(term4396, term4396.getClass(), "jsType", null);
        setField(term4396, term4396.getClass(), "parent", null);
        setField(term4379, term4379.getClass(), "first", term4396);
        setIntField(term4399, term4399.getClass(), "type", 0);
        setField(term4399, term4399.getClass(), "next", null);
        setField(term4399, term4399.getClass(), "first", null);
        setField(term4399, term4399.getClass(), "last", null);
        setField(term4399, term4399.getClass(), "propListHead", null);
        setIntField(term4399, term4399.getClass(), "sourcePosition", 0);
        setField(term4399, term4399.getClass(), "jsType", null);
        setField(term4399, term4399.getClass(), "parent", null);
        setField(term4379, term4379.getClass(), "last", term4399);
        setField(term4402, term4402.getClass(), "next", null);
        setIntField(term4402, term4402.getClass(), "type", 0);
        setIntField(term4402, term4402.getClass(), "intValue", 0);
        setField(term4402, term4402.getClass(), "objectValue", null);
        setField(term4379, term4379.getClass(), "propListHead", term4402);
        setIntField(term4379, term4379.getClass(), "sourcePosition", -1242133071);
        setField(term4379, term4379.getClass(), "jsType", null);
        setField(term4379, term4379.getClass(), "parent", null);
        term4406 = new Integer(-455052015);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4379;
        args[1] = term4406;
        try {
            callMethod(klass, "getArgumentForFunction", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


