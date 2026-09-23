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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class ClosureCodingConvention_getObjectLiteralCast_148496234308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125249;
     Object term125341;
     Object term125766;
     Object term125767;

    public ClosureCodingConvention_getObjectLiteralCast_148496234308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125249 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term125341 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term125433 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term125341, term125341.getClass(), "type", 37);
        setField(term125341, term125341.getClass(), "first", term125433);
        term125766 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term125766, term125766.getClass(), "propertyTestFunctions", null);
        term125767 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term125768 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term125767, term125767.getClass(), "number", 0.0);
        setIntField(term125767, term125767.getClass(), "type", 37);
        setField(term125767, term125767.getClass(), "next", null);
        setDoubleField(term125768, term125768.getClass(), "number", 0.0);
        setIntField(term125768, term125768.getClass(), "type", 0);
        setField(term125768, term125768.getClass(), "next", null);
        setField(term125768, term125768.getClass(), "first", null);
        setField(term125768, term125768.getClass(), "last", null);
        setField(term125768, term125768.getClass(), "propListHead", null);
        setIntField(term125768, term125768.getClass(), "sourcePosition", 0);
        setField(term125768, term125768.getClass(), "jsType", null);
        setField(term125768, term125768.getClass(), "parent", null);
        setField(term125767, term125767.getClass(), "first", term125768);
        setField(term125767, term125767.getClass(), "last", null);
        setField(term125767, term125767.getClass(), "propListHead", null);
        setIntField(term125767, term125767.getClass(), "sourcePosition", 0);
        setField(term125767, term125767.getClass(), "jsType", null);
        setField(term125767, term125767.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term125341;
        Object retValue = callMethod(klass, "getObjectLiteralCast", argTypes, term125249, args);
        assertTrue(recursiveEquals(term125249, term125766));
        assertTrue(recursiveEquals(term125341, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


