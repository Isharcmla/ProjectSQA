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

public class NodeUtil_isConstantByConvention_1985733150297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3346;
     Object term3367;

    public NodeUtil_isConstantByConvention_1985733150297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3346 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3360 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3363 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3346, term3346.getClass(), "type", -19567889);
        setIntField(term3348, term3348.getClass(), "type", 848113442);
        setIntField(term3350, term3350.getClass(), "type", 0);
        setField(term3350, term3350.getClass(), "next", null);
        setField(term3350, term3350.getClass(), "first", null);
        setField(term3350, term3350.getClass(), "last", null);
        setField(term3350, term3350.getClass(), "propListHead", null);
        setIntField(term3350, term3350.getClass(), "sourcePosition", 0);
        setField(term3350, term3350.getClass(), "jsType", null);
        setField(term3350, term3350.getClass(), "parent", null);
        setField(term3348, term3348.getClass(), "next", term3350);
        setIntField(term3353, term3353.getClass(), "type", 0);
        setField(term3353, term3353.getClass(), "next", null);
        setField(term3353, term3353.getClass(), "first", null);
        setField(term3353, term3353.getClass(), "last", null);
        setField(term3353, term3353.getClass(), "propListHead", null);
        setIntField(term3353, term3353.getClass(), "sourcePosition", 0);
        setField(term3353, term3353.getClass(), "jsType", null);
        setField(term3353, term3353.getClass(), "parent", null);
        setField(term3348, term3348.getClass(), "first", term3353);
        setIntField(term3356, term3356.getClass(), "type", 0);
        setField(term3356, term3356.getClass(), "next", null);
        setField(term3356, term3356.getClass(), "first", null);
        setField(term3356, term3356.getClass(), "last", null);
        setField(term3356, term3356.getClass(), "propListHead", null);
        setIntField(term3356, term3356.getClass(), "sourcePosition", 0);
        setField(term3356, term3356.getClass(), "jsType", null);
        setField(term3356, term3356.getClass(), "parent", null);
        setField(term3348, term3348.getClass(), "last", term3356);
        setField(term3348, term3348.getClass(), "propListHead", null);
        setIntField(term3348, term3348.getClass(), "sourcePosition", 0);
        setField(term3348, term3348.getClass(), "jsType", null);
        setField(term3348, term3348.getClass(), "parent", null);
        setField(term3346, term3346.getClass(), "next", term3348);
        setIntField(term3360, term3360.getClass(), "type", 0);
        setField(term3360, term3360.getClass(), "next", null);
        setField(term3360, term3360.getClass(), "first", null);
        setField(term3360, term3360.getClass(), "last", null);
        setField(term3360, term3360.getClass(), "propListHead", null);
        setIntField(term3360, term3360.getClass(), "sourcePosition", 0);
        setField(term3360, term3360.getClass(), "jsType", null);
        setField(term3360, term3360.getClass(), "parent", null);
        setField(term3346, term3346.getClass(), "first", term3360);
        setIntField(term3363, term3363.getClass(), "type", 0);
        setField(term3363, term3363.getClass(), "next", null);
        setField(term3363, term3363.getClass(), "first", null);
        setField(term3363, term3363.getClass(), "last", null);
        setField(term3363, term3363.getClass(), "propListHead", null);
        setIntField(term3363, term3363.getClass(), "sourcePosition", 0);
        setField(term3363, term3363.getClass(), "jsType", null);
        setField(term3363, term3363.getClass(), "parent", null);
        setField(term3346, term3346.getClass(), "last", term3363);
        setField(term3346, term3346.getClass(), "propListHead", null);
        setIntField(term3346, term3346.getClass(), "sourcePosition", 0);
        setField(term3346, term3346.getClass(), "jsType", null);
        setField(term3346, term3346.getClass(), "parent", null);
        term3367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3367, term3367.getClass(), "type", -126399768);
        setIntField(term3369, term3369.getClass(), "type", 241533020);
        setIntField(term3371, term3371.getClass(), "type", 0);
        setField(term3371, term3371.getClass(), "next", null);
        setField(term3371, term3371.getClass(), "first", null);
        setField(term3371, term3371.getClass(), "last", null);
        setField(term3371, term3371.getClass(), "propListHead", null);
        setIntField(term3371, term3371.getClass(), "sourcePosition", 0);
        setField(term3371, term3371.getClass(), "jsType", null);
        setField(term3371, term3371.getClass(), "parent", null);
        setField(term3369, term3369.getClass(), "next", term3371);
        setIntField(term3374, term3374.getClass(), "type", 0);
        setField(term3374, term3374.getClass(), "next", null);
        setField(term3374, term3374.getClass(), "first", null);
        setField(term3374, term3374.getClass(), "last", null);
        setField(term3374, term3374.getClass(), "propListHead", null);
        setIntField(term3374, term3374.getClass(), "sourcePosition", 0);
        setField(term3374, term3374.getClass(), "jsType", null);
        setField(term3374, term3374.getClass(), "parent", null);
        setField(term3369, term3369.getClass(), "first", term3374);
        setIntField(term3377, term3377.getClass(), "type", 0);
        setField(term3377, term3377.getClass(), "next", null);
        setField(term3377, term3377.getClass(), "first", null);
        setField(term3377, term3377.getClass(), "last", null);
        setField(term3377, term3377.getClass(), "propListHead", null);
        setIntField(term3377, term3377.getClass(), "sourcePosition", 0);
        setField(term3377, term3377.getClass(), "jsType", null);
        setField(term3377, term3377.getClass(), "parent", null);
        setField(term3369, term3369.getClass(), "last", term3377);
        setField(term3369, term3369.getClass(), "propListHead", null);
        setIntField(term3369, term3369.getClass(), "sourcePosition", 0);
        setField(term3369, term3369.getClass(), "jsType", null);
        setField(term3369, term3369.getClass(), "parent", null);
        setField(term3367, term3367.getClass(), "next", term3369);
        setIntField(term3381, term3381.getClass(), "type", 0);
        setField(term3381, term3381.getClass(), "next", null);
        setField(term3381, term3381.getClass(), "first", null);
        setField(term3381, term3381.getClass(), "last", null);
        setField(term3381, term3381.getClass(), "propListHead", null);
        setIntField(term3381, term3381.getClass(), "sourcePosition", 0);
        setField(term3381, term3381.getClass(), "jsType", null);
        setField(term3381, term3381.getClass(), "parent", null);
        setField(term3367, term3367.getClass(), "first", term3381);
        setIntField(term3384, term3384.getClass(), "type", 0);
        setField(term3384, term3384.getClass(), "next", null);
        setField(term3384, term3384.getClass(), "first", null);
        setField(term3384, term3384.getClass(), "last", null);
        setField(term3384, term3384.getClass(), "propListHead", null);
        setIntField(term3384, term3384.getClass(), "sourcePosition", 0);
        setField(term3384, term3384.getClass(), "jsType", null);
        setField(term3384, term3384.getClass(), "parent", null);
        setField(term3367, term3367.getClass(), "last", term3384);
        setField(term3367, term3367.getClass(), "propListHead", null);
        setIntField(term3367, term3367.getClass(), "sourcePosition", 0);
        setField(term3367, term3367.getClass(), "jsType", null);
        setField(term3367, term3367.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CodingConvention");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term3346;
        args[2] = term3367;
        try {
            callMethod(klass, "isConstantByConvention", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


