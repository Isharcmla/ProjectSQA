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

public class NodeUtil_hasCatchHandler_1686917870228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3328;

    public NodeUtil_hasCatchHandler_1686917870228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3330 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3341 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3351 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3328, term3328.getClass(), "type", 1369020869);
        setIntField(term3330, term3330.getClass(), "type", -1201819537);
        setIntField(term3332, term3332.getClass(), "type", 0);
        setField(term3332, term3332.getClass(), "next", null);
        setField(term3332, term3332.getClass(), "first", null);
        setField(term3332, term3332.getClass(), "last", null);
        setField(term3332, term3332.getClass(), "propListHead", null);
        setIntField(term3332, term3332.getClass(), "sourcePosition", 0);
        setField(term3332, term3332.getClass(), "jsType", null);
        setField(term3332, term3332.getClass(), "parent", null);
        setField(term3330, term3330.getClass(), "next", term3332);
        setIntField(term3335, term3335.getClass(), "type", 0);
        setField(term3335, term3335.getClass(), "next", null);
        setField(term3335, term3335.getClass(), "first", null);
        setField(term3335, term3335.getClass(), "last", null);
        setField(term3335, term3335.getClass(), "propListHead", null);
        setIntField(term3335, term3335.getClass(), "sourcePosition", 0);
        setField(term3335, term3335.getClass(), "jsType", null);
        setField(term3335, term3335.getClass(), "parent", null);
        setField(term3330, term3330.getClass(), "first", term3335);
        setIntField(term3338, term3338.getClass(), "type", 0);
        setField(term3338, term3338.getClass(), "next", null);
        setField(term3338, term3338.getClass(), "first", null);
        setField(term3338, term3338.getClass(), "last", null);
        setField(term3338, term3338.getClass(), "propListHead", null);
        setIntField(term3338, term3338.getClass(), "sourcePosition", 0);
        setField(term3338, term3338.getClass(), "jsType", null);
        setField(term3338, term3338.getClass(), "parent", null);
        setField(term3330, term3330.getClass(), "last", term3338);
        setField(term3341, term3341.getClass(), "next", null);
        setIntField(term3341, term3341.getClass(), "type", 0);
        setIntField(term3341, term3341.getClass(), "intValue", 0);
        setField(term3341, term3341.getClass(), "objectValue", null);
        setField(term3330, term3330.getClass(), "propListHead", term3341);
        setIntField(term3330, term3330.getClass(), "sourcePosition", -755209283);
        setField(term3330, term3330.getClass(), "jsType", null);
        setField(term3330, term3330.getClass(), "parent", null);
        setField(term3328, term3328.getClass(), "next", term3330);
        setIntField(term3345, term3345.getClass(), "type", 0);
        setField(term3345, term3345.getClass(), "next", null);
        setField(term3345, term3345.getClass(), "first", null);
        setField(term3345, term3345.getClass(), "last", null);
        setField(term3345, term3345.getClass(), "propListHead", null);
        setIntField(term3345, term3345.getClass(), "sourcePosition", 0);
        setField(term3345, term3345.getClass(), "jsType", null);
        setField(term3345, term3345.getClass(), "parent", null);
        setField(term3328, term3328.getClass(), "first", term3345);
        setIntField(term3348, term3348.getClass(), "type", 0);
        setField(term3348, term3348.getClass(), "next", null);
        setField(term3348, term3348.getClass(), "first", null);
        setField(term3348, term3348.getClass(), "last", null);
        setField(term3348, term3348.getClass(), "propListHead", null);
        setIntField(term3348, term3348.getClass(), "sourcePosition", 0);
        setField(term3348, term3348.getClass(), "jsType", null);
        setField(term3348, term3348.getClass(), "parent", null);
        setField(term3328, term3328.getClass(), "last", term3348);
        setField(term3351, term3351.getClass(), "next", null);
        setIntField(term3351, term3351.getClass(), "type", 0);
        setIntField(term3351, term3351.getClass(), "intValue", 0);
        setField(term3351, term3351.getClass(), "objectValue", null);
        setField(term3328, term3328.getClass(), "propListHead", term3351);
        setIntField(term3328, term3328.getClass(), "sourcePosition", -616562794);
        setField(term3328, term3328.getClass(), "jsType", null);
        setField(term3328, term3328.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3328;
        try {
            callMethod(klass, "hasCatchHandler", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


