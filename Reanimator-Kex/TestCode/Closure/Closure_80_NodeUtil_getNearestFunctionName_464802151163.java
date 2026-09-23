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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_getNearestFunctionName_464802151163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236;

    public NodeUtil_getNearestFunctionName_464802151163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term249 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term259 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term236, term236.getClass(), "type", 1114000454);
        setIntField(term238, term238.getClass(), "type", -505439934);
        setIntField(term240, term240.getClass(), "type", 0);
        setField(term240, term240.getClass(), "next", null);
        setField(term240, term240.getClass(), "first", null);
        setField(term240, term240.getClass(), "last", null);
        setField(term240, term240.getClass(), "propListHead", null);
        setIntField(term240, term240.getClass(), "sourcePosition", 0);
        setField(term240, term240.getClass(), "jsType", null);
        setField(term240, term240.getClass(), "parent", null);
        setField(term238, term238.getClass(), "next", term240);
        setIntField(term243, term243.getClass(), "type", 0);
        setField(term243, term243.getClass(), "next", null);
        setField(term243, term243.getClass(), "first", null);
        setField(term243, term243.getClass(), "last", null);
        setField(term243, term243.getClass(), "propListHead", null);
        setIntField(term243, term243.getClass(), "sourcePosition", 0);
        setField(term243, term243.getClass(), "jsType", null);
        setField(term243, term243.getClass(), "parent", null);
        setField(term238, term238.getClass(), "first", term243);
        setIntField(term246, term246.getClass(), "type", 0);
        setField(term246, term246.getClass(), "next", null);
        setField(term246, term246.getClass(), "first", null);
        setField(term246, term246.getClass(), "last", null);
        setField(term246, term246.getClass(), "propListHead", null);
        setIntField(term246, term246.getClass(), "sourcePosition", 0);
        setField(term246, term246.getClass(), "jsType", null);
        setField(term246, term246.getClass(), "parent", null);
        setField(term238, term238.getClass(), "last", term246);
        setField(term249, term249.getClass(), "next", null);
        setIntField(term249, term249.getClass(), "type", 0);
        setIntField(term249, term249.getClass(), "intValue", 0);
        setField(term249, term249.getClass(), "objectValue", null);
        setField(term238, term238.getClass(), "propListHead", term249);
        setIntField(term238, term238.getClass(), "sourcePosition", 444029505);
        setField(term238, term238.getClass(), "jsType", null);
        setField(term238, term238.getClass(), "parent", null);
        setField(term236, term236.getClass(), "next", term238);
        setIntField(term253, term253.getClass(), "type", 0);
        setField(term253, term253.getClass(), "next", null);
        setField(term253, term253.getClass(), "first", null);
        setField(term253, term253.getClass(), "last", null);
        setField(term253, term253.getClass(), "propListHead", null);
        setIntField(term253, term253.getClass(), "sourcePosition", 0);
        setField(term253, term253.getClass(), "jsType", null);
        setField(term253, term253.getClass(), "parent", null);
        setField(term236, term236.getClass(), "first", term253);
        setIntField(term256, term256.getClass(), "type", 0);
        setField(term256, term256.getClass(), "next", null);
        setField(term256, term256.getClass(), "first", null);
        setField(term256, term256.getClass(), "last", null);
        setField(term256, term256.getClass(), "propListHead", null);
        setIntField(term256, term256.getClass(), "sourcePosition", 0);
        setField(term256, term256.getClass(), "jsType", null);
        setField(term256, term256.getClass(), "parent", null);
        setField(term236, term236.getClass(), "last", term256);
        setField(term259, term259.getClass(), "next", null);
        setIntField(term259, term259.getClass(), "type", 0);
        setIntField(term259, term259.getClass(), "intValue", 0);
        setField(term259, term259.getClass(), "objectValue", null);
        setField(term236, term236.getClass(), "propListHead", term259);
        setIntField(term236, term236.getClass(), "sourcePosition", -1034506028);
        setField(term236, term236.getClass(), "jsType", null);
        setField(term236, term236.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term236;
        try {
            callMethod(klass, "getNearestFunctionName", argTypes, null, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


