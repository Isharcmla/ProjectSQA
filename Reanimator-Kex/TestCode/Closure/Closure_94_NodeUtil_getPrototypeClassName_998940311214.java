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

public class NodeUtil_getPrototypeClassName_998940311214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2860;
     Object term15601;

    public NodeUtil_getPrototypeClassName_998940311214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2860 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2864 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2870 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2873 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2883 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2860, term2860.getClass(), "type", -168498989);
        setIntField(term2862, term2862.getClass(), "type", 1833713431);
        setIntField(term2864, term2864.getClass(), "type", 0);
        setField(term2864, term2864.getClass(), "next", null);
        setField(term2864, term2864.getClass(), "first", null);
        setField(term2864, term2864.getClass(), "last", null);
        setField(term2864, term2864.getClass(), "propListHead", null);
        setIntField(term2864, term2864.getClass(), "sourcePosition", 0);
        setField(term2864, term2864.getClass(), "jsType", null);
        setField(term2864, term2864.getClass(), "parent", null);
        setField(term2862, term2862.getClass(), "next", term2864);
        setIntField(term2867, term2867.getClass(), "type", 0);
        setField(term2867, term2867.getClass(), "next", null);
        setField(term2867, term2867.getClass(), "first", null);
        setField(term2867, term2867.getClass(), "last", null);
        setField(term2867, term2867.getClass(), "propListHead", null);
        setIntField(term2867, term2867.getClass(), "sourcePosition", 0);
        setField(term2867, term2867.getClass(), "jsType", null);
        setField(term2867, term2867.getClass(), "parent", null);
        setField(term2862, term2862.getClass(), "first", term2867);
        setIntField(term2870, term2870.getClass(), "type", 0);
        setField(term2870, term2870.getClass(), "next", null);
        setField(term2870, term2870.getClass(), "first", null);
        setField(term2870, term2870.getClass(), "last", null);
        setField(term2870, term2870.getClass(), "propListHead", null);
        setIntField(term2870, term2870.getClass(), "sourcePosition", 0);
        setField(term2870, term2870.getClass(), "jsType", null);
        setField(term2870, term2870.getClass(), "parent", null);
        setField(term2862, term2862.getClass(), "last", term2870);
        setField(term2873, term2873.getClass(), "next", null);
        setIntField(term2873, term2873.getClass(), "type", 0);
        setIntField(term2873, term2873.getClass(), "intValue", 0);
        setField(term2873, term2873.getClass(), "objectValue", null);
        setField(term2862, term2862.getClass(), "propListHead", term2873);
        setIntField(term2862, term2862.getClass(), "sourcePosition", 1378805929);
        setField(term2862, term2862.getClass(), "jsType", null);
        setField(term2862, term2862.getClass(), "parent", null);
        setField(term2860, term2860.getClass(), "next", term2862);
        setIntField(term2877, term2877.getClass(), "type", 0);
        setField(term2877, term2877.getClass(), "next", null);
        setField(term2877, term2877.getClass(), "first", null);
        setField(term2877, term2877.getClass(), "last", null);
        setField(term2877, term2877.getClass(), "propListHead", null);
        setIntField(term2877, term2877.getClass(), "sourcePosition", 0);
        setField(term2877, term2877.getClass(), "jsType", null);
        setField(term2877, term2877.getClass(), "parent", null);
        setField(term2860, term2860.getClass(), "first", term2877);
        setIntField(term2880, term2880.getClass(), "type", 0);
        setField(term2880, term2880.getClass(), "next", null);
        setField(term2880, term2880.getClass(), "first", null);
        setField(term2880, term2880.getClass(), "last", null);
        setField(term2880, term2880.getClass(), "propListHead", null);
        setIntField(term2880, term2880.getClass(), "sourcePosition", 0);
        setField(term2880, term2880.getClass(), "jsType", null);
        setField(term2880, term2880.getClass(), "parent", null);
        setField(term2860, term2860.getClass(), "last", term2880);
        setField(term2883, term2883.getClass(), "next", null);
        setIntField(term2883, term2883.getClass(), "type", 0);
        setIntField(term2883, term2883.getClass(), "intValue", 0);
        setField(term2883, term2883.getClass(), "objectValue", null);
        setField(term2860, term2860.getClass(), "propListHead", term2883);
        setIntField(term2860, term2860.getClass(), "sourcePosition", 695052304);
        setField(term2860, term2860.getClass(), "jsType", null);
        setField(term2860, term2860.getClass(), "parent", null);
        term15601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15606 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15609 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term15601, term15601.getClass(), "type", -168498989);
        setIntField(term15602, term15602.getClass(), "type", 1833713431);
        setIntField(term15603, term15603.getClass(), "type", 0);
        setField(term15603, term15603.getClass(), "next", null);
        setField(term15603, term15603.getClass(), "first", null);
        setField(term15603, term15603.getClass(), "last", null);
        setField(term15603, term15603.getClass(), "propListHead", null);
        setIntField(term15603, term15603.getClass(), "sourcePosition", 0);
        setField(term15603, term15603.getClass(), "jsType", null);
        setField(term15603, term15603.getClass(), "parent", null);
        setField(term15602, term15602.getClass(), "next", term15603);
        setIntField(term15604, term15604.getClass(), "type", 0);
        setField(term15604, term15604.getClass(), "next", null);
        setField(term15604, term15604.getClass(), "first", null);
        setField(term15604, term15604.getClass(), "last", null);
        setField(term15604, term15604.getClass(), "propListHead", null);
        setIntField(term15604, term15604.getClass(), "sourcePosition", 0);
        setField(term15604, term15604.getClass(), "jsType", null);
        setField(term15604, term15604.getClass(), "parent", null);
        setField(term15602, term15602.getClass(), "first", term15604);
        setIntField(term15605, term15605.getClass(), "type", 0);
        setField(term15605, term15605.getClass(), "next", null);
        setField(term15605, term15605.getClass(), "first", null);
        setField(term15605, term15605.getClass(), "last", null);
        setField(term15605, term15605.getClass(), "propListHead", null);
        setIntField(term15605, term15605.getClass(), "sourcePosition", 0);
        setField(term15605, term15605.getClass(), "jsType", null);
        setField(term15605, term15605.getClass(), "parent", null);
        setField(term15602, term15602.getClass(), "last", term15605);
        setField(term15606, term15606.getClass(), "next", null);
        setIntField(term15606, term15606.getClass(), "type", 0);
        setIntField(term15606, term15606.getClass(), "intValue", 0);
        setField(term15606, term15606.getClass(), "objectValue", null);
        setField(term15602, term15602.getClass(), "propListHead", term15606);
        setIntField(term15602, term15602.getClass(), "sourcePosition", 1378805929);
        setField(term15602, term15602.getClass(), "jsType", null);
        setField(term15602, term15602.getClass(), "parent", null);
        setField(term15601, term15601.getClass(), "next", term15602);
        setIntField(term15607, term15607.getClass(), "type", 0);
        setField(term15607, term15607.getClass(), "next", null);
        setField(term15607, term15607.getClass(), "first", null);
        setField(term15607, term15607.getClass(), "last", null);
        setField(term15607, term15607.getClass(), "propListHead", null);
        setIntField(term15607, term15607.getClass(), "sourcePosition", 0);
        setField(term15607, term15607.getClass(), "jsType", null);
        setField(term15607, term15607.getClass(), "parent", null);
        setField(term15601, term15601.getClass(), "first", term15607);
        setIntField(term15608, term15608.getClass(), "type", 0);
        setField(term15608, term15608.getClass(), "next", null);
        setField(term15608, term15608.getClass(), "first", null);
        setField(term15608, term15608.getClass(), "last", null);
        setField(term15608, term15608.getClass(), "propListHead", null);
        setIntField(term15608, term15608.getClass(), "sourcePosition", 0);
        setField(term15608, term15608.getClass(), "jsType", null);
        setField(term15608, term15608.getClass(), "parent", null);
        setField(term15601, term15601.getClass(), "last", term15608);
        setField(term15609, term15609.getClass(), "next", null);
        setIntField(term15609, term15609.getClass(), "type", 0);
        setIntField(term15609, term15609.getClass(), "intValue", 0);
        setField(term15609, term15609.getClass(), "objectValue", null);
        setField(term15601, term15601.getClass(), "propListHead", term15609);
        setIntField(term15601, term15601.getClass(), "sourcePosition", 695052304);
        setField(term15601, term15601.getClass(), "jsType", null);
        setField(term15601, term15601.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2860;
        Object retValue = callMethod(klass, "getPrototypeClassName", argTypes, null, args);
        assertTrue(recursiveEquals(term2860, term15601));
        assertTrue(recursiveEquals(retValue, null));
    }

};


