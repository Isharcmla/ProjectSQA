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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class NodeUtil_containsType_951752563258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2863;
     Object term2890;

    public NodeUtil_containsType_951752563258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2865 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2870 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2876 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2883 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2886 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2863, term2863.getClass(), "type", 2079590265);
        setIntField(term2865, term2865.getClass(), "type", -308526089);
        setIntField(term2867, term2867.getClass(), "type", 0);
        setField(term2867, term2867.getClass(), "next", null);
        setField(term2867, term2867.getClass(), "first", null);
        setField(term2867, term2867.getClass(), "last", null);
        setField(term2867, term2867.getClass(), "propListHead", null);
        setIntField(term2867, term2867.getClass(), "sourcePosition", 0);
        setField(term2867, term2867.getClass(), "jsType", null);
        setField(term2867, term2867.getClass(), "parent", null);
        setField(term2865, term2865.getClass(), "next", term2867);
        setIntField(term2870, term2870.getClass(), "type", 0);
        setField(term2870, term2870.getClass(), "next", null);
        setField(term2870, term2870.getClass(), "first", null);
        setField(term2870, term2870.getClass(), "last", null);
        setField(term2870, term2870.getClass(), "propListHead", null);
        setIntField(term2870, term2870.getClass(), "sourcePosition", 0);
        setField(term2870, term2870.getClass(), "jsType", null);
        setField(term2870, term2870.getClass(), "parent", null);
        setField(term2865, term2865.getClass(), "first", term2870);
        setIntField(term2873, term2873.getClass(), "type", 0);
        setField(term2873, term2873.getClass(), "next", null);
        setField(term2873, term2873.getClass(), "first", null);
        setField(term2873, term2873.getClass(), "last", null);
        setField(term2873, term2873.getClass(), "propListHead", null);
        setIntField(term2873, term2873.getClass(), "sourcePosition", 0);
        setField(term2873, term2873.getClass(), "jsType", null);
        setField(term2873, term2873.getClass(), "parent", null);
        setField(term2865, term2865.getClass(), "last", term2873);
        setField(term2876, term2876.getClass(), "next", null);
        setIntField(term2876, term2876.getClass(), "type", 0);
        setIntField(term2876, term2876.getClass(), "intValue", 0);
        setField(term2876, term2876.getClass(), "objectValue", null);
        setField(term2865, term2865.getClass(), "propListHead", term2876);
        setIntField(term2865, term2865.getClass(), "sourcePosition", 776218451);
        setField(term2865, term2865.getClass(), "jsType", null);
        setField(term2865, term2865.getClass(), "parent", null);
        setField(term2863, term2863.getClass(), "next", term2865);
        setIntField(term2880, term2880.getClass(), "type", 0);
        setField(term2880, term2880.getClass(), "next", null);
        setField(term2880, term2880.getClass(), "first", null);
        setField(term2880, term2880.getClass(), "last", null);
        setField(term2880, term2880.getClass(), "propListHead", null);
        setIntField(term2880, term2880.getClass(), "sourcePosition", 0);
        setField(term2880, term2880.getClass(), "jsType", null);
        setField(term2880, term2880.getClass(), "parent", null);
        setField(term2863, term2863.getClass(), "first", term2880);
        setIntField(term2883, term2883.getClass(), "type", 0);
        setField(term2883, term2883.getClass(), "next", null);
        setField(term2883, term2883.getClass(), "first", null);
        setField(term2883, term2883.getClass(), "last", null);
        setField(term2883, term2883.getClass(), "propListHead", null);
        setIntField(term2883, term2883.getClass(), "sourcePosition", 0);
        setField(term2883, term2883.getClass(), "jsType", null);
        setField(term2883, term2883.getClass(), "parent", null);
        setField(term2863, term2863.getClass(), "last", term2883);
        setField(term2886, term2886.getClass(), "next", null);
        setIntField(term2886, term2886.getClass(), "type", 0);
        setIntField(term2886, term2886.getClass(), "intValue", 0);
        setField(term2886, term2886.getClass(), "objectValue", null);
        setField(term2863, term2863.getClass(), "propListHead", term2886);
        setIntField(term2863, term2863.getClass(), "sourcePosition", -1362132929);
        setField(term2863, term2863.getClass(), "jsType", null);
        setField(term2863, term2863.getClass(), "parent", null);
        term2890 = new Integer(1267740164);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term2863;
        args[1] = term2890;
        args[2] = null;
        try {
            callMethod(klass, "containsType", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


