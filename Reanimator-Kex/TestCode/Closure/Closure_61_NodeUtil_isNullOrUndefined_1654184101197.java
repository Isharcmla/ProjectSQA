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

public class NodeUtil_isNullOrUndefined_1654184101197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term862;
     Object term9667;

    public NodeUtil_isNullOrUndefined_1654184101197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term864 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term866 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term876 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term862, term862.getClass(), "type", -938508470);
        setIntField(term864, term864.getClass(), "type", -1553893255);
        setIntField(term866, term866.getClass(), "type", 0);
        setField(term866, term866.getClass(), "next", null);
        setField(term866, term866.getClass(), "first", null);
        setField(term866, term866.getClass(), "last", null);
        setField(term866, term866.getClass(), "propListHead", null);
        setIntField(term866, term866.getClass(), "sourcePosition", 0);
        setField(term866, term866.getClass(), "jsType", null);
        setField(term866, term866.getClass(), "parent", null);
        setField(term864, term864.getClass(), "next", term866);
        setIntField(term869, term869.getClass(), "type", 0);
        setField(term869, term869.getClass(), "next", null);
        setField(term869, term869.getClass(), "first", null);
        setField(term869, term869.getClass(), "last", null);
        setField(term869, term869.getClass(), "propListHead", null);
        setIntField(term869, term869.getClass(), "sourcePosition", 0);
        setField(term869, term869.getClass(), "jsType", null);
        setField(term869, term869.getClass(), "parent", null);
        setField(term864, term864.getClass(), "first", term869);
        setIntField(term872, term872.getClass(), "type", 0);
        setField(term872, term872.getClass(), "next", null);
        setField(term872, term872.getClass(), "first", null);
        setField(term872, term872.getClass(), "last", null);
        setField(term872, term872.getClass(), "propListHead", null);
        setIntField(term872, term872.getClass(), "sourcePosition", 0);
        setField(term872, term872.getClass(), "jsType", null);
        setField(term872, term872.getClass(), "parent", null);
        setField(term864, term864.getClass(), "last", term872);
        setField(term864, term864.getClass(), "propListHead", null);
        setIntField(term864, term864.getClass(), "sourcePosition", 0);
        setField(term864, term864.getClass(), "jsType", null);
        setField(term864, term864.getClass(), "parent", null);
        setField(term862, term862.getClass(), "next", term864);
        setIntField(term876, term876.getClass(), "type", 0);
        setField(term876, term876.getClass(), "next", null);
        setField(term876, term876.getClass(), "first", null);
        setField(term876, term876.getClass(), "last", null);
        setField(term876, term876.getClass(), "propListHead", null);
        setIntField(term876, term876.getClass(), "sourcePosition", 0);
        setField(term876, term876.getClass(), "jsType", null);
        setField(term876, term876.getClass(), "parent", null);
        setField(term862, term862.getClass(), "first", term876);
        setIntField(term879, term879.getClass(), "type", 0);
        setField(term879, term879.getClass(), "next", null);
        setField(term879, term879.getClass(), "first", null);
        setField(term879, term879.getClass(), "last", null);
        setField(term879, term879.getClass(), "propListHead", null);
        setIntField(term879, term879.getClass(), "sourcePosition", 0);
        setField(term879, term879.getClass(), "jsType", null);
        setField(term879, term879.getClass(), "parent", null);
        setField(term862, term862.getClass(), "last", term879);
        setField(term862, term862.getClass(), "propListHead", null);
        setIntField(term862, term862.getClass(), "sourcePosition", 0);
        setField(term862, term862.getClass(), "jsType", null);
        setField(term862, term862.getClass(), "parent", null);
        term9667 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9672 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9667, term9667.getClass(), "type", -938508470);
        setIntField(term9668, term9668.getClass(), "type", -1553893255);
        setIntField(term9669, term9669.getClass(), "type", 0);
        setField(term9669, term9669.getClass(), "next", null);
        setField(term9669, term9669.getClass(), "first", null);
        setField(term9669, term9669.getClass(), "last", null);
        setField(term9669, term9669.getClass(), "propListHead", null);
        setIntField(term9669, term9669.getClass(), "sourcePosition", 0);
        setField(term9669, term9669.getClass(), "jsType", null);
        setField(term9669, term9669.getClass(), "parent", null);
        setField(term9668, term9668.getClass(), "next", term9669);
        setIntField(term9670, term9670.getClass(), "type", 0);
        setField(term9670, term9670.getClass(), "next", null);
        setField(term9670, term9670.getClass(), "first", null);
        setField(term9670, term9670.getClass(), "last", null);
        setField(term9670, term9670.getClass(), "propListHead", null);
        setIntField(term9670, term9670.getClass(), "sourcePosition", 0);
        setField(term9670, term9670.getClass(), "jsType", null);
        setField(term9670, term9670.getClass(), "parent", null);
        setField(term9668, term9668.getClass(), "first", term9670);
        setIntField(term9671, term9671.getClass(), "type", 0);
        setField(term9671, term9671.getClass(), "next", null);
        setField(term9671, term9671.getClass(), "first", null);
        setField(term9671, term9671.getClass(), "last", null);
        setField(term9671, term9671.getClass(), "propListHead", null);
        setIntField(term9671, term9671.getClass(), "sourcePosition", 0);
        setField(term9671, term9671.getClass(), "jsType", null);
        setField(term9671, term9671.getClass(), "parent", null);
        setField(term9668, term9668.getClass(), "last", term9671);
        setField(term9668, term9668.getClass(), "propListHead", null);
        setIntField(term9668, term9668.getClass(), "sourcePosition", 0);
        setField(term9668, term9668.getClass(), "jsType", null);
        setField(term9668, term9668.getClass(), "parent", null);
        setField(term9667, term9667.getClass(), "next", term9668);
        setIntField(term9672, term9672.getClass(), "type", 0);
        setField(term9672, term9672.getClass(), "next", null);
        setField(term9672, term9672.getClass(), "first", null);
        setField(term9672, term9672.getClass(), "last", null);
        setField(term9672, term9672.getClass(), "propListHead", null);
        setIntField(term9672, term9672.getClass(), "sourcePosition", 0);
        setField(term9672, term9672.getClass(), "jsType", null);
        setField(term9672, term9672.getClass(), "parent", null);
        setField(term9667, term9667.getClass(), "first", term9672);
        setIntField(term9673, term9673.getClass(), "type", 0);
        setField(term9673, term9673.getClass(), "next", null);
        setField(term9673, term9673.getClass(), "first", null);
        setField(term9673, term9673.getClass(), "last", null);
        setField(term9673, term9673.getClass(), "propListHead", null);
        setIntField(term9673, term9673.getClass(), "sourcePosition", 0);
        setField(term9673, term9673.getClass(), "jsType", null);
        setField(term9673, term9673.getClass(), "parent", null);
        setField(term9667, term9667.getClass(), "last", term9673);
        setField(term9667, term9667.getClass(), "propListHead", null);
        setIntField(term9667, term9667.getClass(), "sourcePosition", 0);
        setField(term9667, term9667.getClass(), "jsType", null);
        setField(term9667, term9667.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term862;
        Object retValue = callMethod(klass, "isNullOrUndefined", argTypes, null, args);
        assertTrue(recursiveEquals(term862, term9667));
        assertTrue(recursiveEquals(retValue, false));
    }

};


