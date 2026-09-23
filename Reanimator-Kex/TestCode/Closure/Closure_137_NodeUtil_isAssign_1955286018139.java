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

public class NodeUtil_isAssign_1955286018139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term895;
     Object term6951;

    public NodeUtil_isAssign_1955286018139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term905 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term908 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term912 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term915 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term918 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term895, term895.getClass(), "type", -100825168);
        setIntField(term897, term897.getClass(), "type", -233024044);
        setIntField(term899, term899.getClass(), "type", 0);
        setField(term899, term899.getClass(), "next", null);
        setField(term899, term899.getClass(), "first", null);
        setField(term899, term899.getClass(), "last", null);
        setField(term899, term899.getClass(), "propListHead", null);
        setIntField(term899, term899.getClass(), "sourcePosition", 0);
        setField(term899, term899.getClass(), "jsType", null);
        setField(term899, term899.getClass(), "parent", null);
        setField(term897, term897.getClass(), "next", term899);
        setIntField(term902, term902.getClass(), "type", 0);
        setField(term902, term902.getClass(), "next", null);
        setField(term902, term902.getClass(), "first", null);
        setField(term902, term902.getClass(), "last", null);
        setField(term902, term902.getClass(), "propListHead", null);
        setIntField(term902, term902.getClass(), "sourcePosition", 0);
        setField(term902, term902.getClass(), "jsType", null);
        setField(term902, term902.getClass(), "parent", null);
        setField(term897, term897.getClass(), "first", term902);
        setIntField(term905, term905.getClass(), "type", 0);
        setField(term905, term905.getClass(), "next", null);
        setField(term905, term905.getClass(), "first", null);
        setField(term905, term905.getClass(), "last", null);
        setField(term905, term905.getClass(), "propListHead", null);
        setIntField(term905, term905.getClass(), "sourcePosition", 0);
        setField(term905, term905.getClass(), "jsType", null);
        setField(term905, term905.getClass(), "parent", null);
        setField(term897, term897.getClass(), "last", term905);
        setField(term908, term908.getClass(), "next", null);
        setIntField(term908, term908.getClass(), "type", 0);
        setIntField(term908, term908.getClass(), "intValue", 0);
        setField(term908, term908.getClass(), "objectValue", null);
        setField(term897, term897.getClass(), "propListHead", term908);
        setIntField(term897, term897.getClass(), "sourcePosition", -828982065);
        setField(term897, term897.getClass(), "jsType", null);
        setField(term897, term897.getClass(), "parent", null);
        setField(term895, term895.getClass(), "next", term897);
        setIntField(term912, term912.getClass(), "type", 0);
        setField(term912, term912.getClass(), "next", null);
        setField(term912, term912.getClass(), "first", null);
        setField(term912, term912.getClass(), "last", null);
        setField(term912, term912.getClass(), "propListHead", null);
        setIntField(term912, term912.getClass(), "sourcePosition", 0);
        setField(term912, term912.getClass(), "jsType", null);
        setField(term912, term912.getClass(), "parent", null);
        setField(term895, term895.getClass(), "first", term912);
        setIntField(term915, term915.getClass(), "type", 0);
        setField(term915, term915.getClass(), "next", null);
        setField(term915, term915.getClass(), "first", null);
        setField(term915, term915.getClass(), "last", null);
        setField(term915, term915.getClass(), "propListHead", null);
        setIntField(term915, term915.getClass(), "sourcePosition", 0);
        setField(term915, term915.getClass(), "jsType", null);
        setField(term915, term915.getClass(), "parent", null);
        setField(term895, term895.getClass(), "last", term915);
        setField(term918, term918.getClass(), "next", null);
        setIntField(term918, term918.getClass(), "type", 0);
        setIntField(term918, term918.getClass(), "intValue", 0);
        setField(term918, term918.getClass(), "objectValue", null);
        setField(term895, term895.getClass(), "propListHead", term918);
        setIntField(term895, term895.getClass(), "sourcePosition", 1221443226);
        setField(term895, term895.getClass(), "jsType", null);
        setField(term895, term895.getClass(), "parent", null);
        term6951 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6956 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6957 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6959 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6951, term6951.getClass(), "type", -100825168);
        setIntField(term6952, term6952.getClass(), "type", -233024044);
        setIntField(term6953, term6953.getClass(), "type", 0);
        setField(term6953, term6953.getClass(), "next", null);
        setField(term6953, term6953.getClass(), "first", null);
        setField(term6953, term6953.getClass(), "last", null);
        setField(term6953, term6953.getClass(), "propListHead", null);
        setIntField(term6953, term6953.getClass(), "sourcePosition", 0);
        setField(term6953, term6953.getClass(), "jsType", null);
        setField(term6953, term6953.getClass(), "parent", null);
        setField(term6952, term6952.getClass(), "next", term6953);
        setIntField(term6954, term6954.getClass(), "type", 0);
        setField(term6954, term6954.getClass(), "next", null);
        setField(term6954, term6954.getClass(), "first", null);
        setField(term6954, term6954.getClass(), "last", null);
        setField(term6954, term6954.getClass(), "propListHead", null);
        setIntField(term6954, term6954.getClass(), "sourcePosition", 0);
        setField(term6954, term6954.getClass(), "jsType", null);
        setField(term6954, term6954.getClass(), "parent", null);
        setField(term6952, term6952.getClass(), "first", term6954);
        setIntField(term6955, term6955.getClass(), "type", 0);
        setField(term6955, term6955.getClass(), "next", null);
        setField(term6955, term6955.getClass(), "first", null);
        setField(term6955, term6955.getClass(), "last", null);
        setField(term6955, term6955.getClass(), "propListHead", null);
        setIntField(term6955, term6955.getClass(), "sourcePosition", 0);
        setField(term6955, term6955.getClass(), "jsType", null);
        setField(term6955, term6955.getClass(), "parent", null);
        setField(term6952, term6952.getClass(), "last", term6955);
        setField(term6956, term6956.getClass(), "next", null);
        setIntField(term6956, term6956.getClass(), "type", 0);
        setIntField(term6956, term6956.getClass(), "intValue", 0);
        setField(term6956, term6956.getClass(), "objectValue", null);
        setField(term6952, term6952.getClass(), "propListHead", term6956);
        setIntField(term6952, term6952.getClass(), "sourcePosition", -828982065);
        setField(term6952, term6952.getClass(), "jsType", null);
        setField(term6952, term6952.getClass(), "parent", null);
        setField(term6951, term6951.getClass(), "next", term6952);
        setIntField(term6957, term6957.getClass(), "type", 0);
        setField(term6957, term6957.getClass(), "next", null);
        setField(term6957, term6957.getClass(), "first", null);
        setField(term6957, term6957.getClass(), "last", null);
        setField(term6957, term6957.getClass(), "propListHead", null);
        setIntField(term6957, term6957.getClass(), "sourcePosition", 0);
        setField(term6957, term6957.getClass(), "jsType", null);
        setField(term6957, term6957.getClass(), "parent", null);
        setField(term6951, term6951.getClass(), "first", term6957);
        setIntField(term6958, term6958.getClass(), "type", 0);
        setField(term6958, term6958.getClass(), "next", null);
        setField(term6958, term6958.getClass(), "first", null);
        setField(term6958, term6958.getClass(), "last", null);
        setField(term6958, term6958.getClass(), "propListHead", null);
        setIntField(term6958, term6958.getClass(), "sourcePosition", 0);
        setField(term6958, term6958.getClass(), "jsType", null);
        setField(term6958, term6958.getClass(), "parent", null);
        setField(term6951, term6951.getClass(), "last", term6958);
        setField(term6959, term6959.getClass(), "next", null);
        setIntField(term6959, term6959.getClass(), "type", 0);
        setIntField(term6959, term6959.getClass(), "intValue", 0);
        setField(term6959, term6959.getClass(), "objectValue", null);
        setField(term6951, term6951.getClass(), "propListHead", term6959);
        setIntField(term6951, term6951.getClass(), "sourcePosition", 1221443226);
        setField(term6951, term6951.getClass(), "jsType", null);
        setField(term6951, term6951.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term895;
        Object retValue = callMethod(klass, "isAssign", argTypes, null, args);
        assertTrue(recursiveEquals(term895, term6951));
        assertTrue(recursiveEquals(retValue, false));
    }

};


