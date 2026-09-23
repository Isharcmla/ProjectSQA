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

public class NodeUtil_isAssign_1955286018140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term895;
     Object term6979;

    public NodeUtil_isAssign_1955286018140() {
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
        term6979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6984 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6987 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6979, term6979.getClass(), "type", -100825168);
        setIntField(term6980, term6980.getClass(), "type", -233024044);
        setIntField(term6981, term6981.getClass(), "type", 0);
        setField(term6981, term6981.getClass(), "next", null);
        setField(term6981, term6981.getClass(), "first", null);
        setField(term6981, term6981.getClass(), "last", null);
        setField(term6981, term6981.getClass(), "propListHead", null);
        setIntField(term6981, term6981.getClass(), "sourcePosition", 0);
        setField(term6981, term6981.getClass(), "jsType", null);
        setField(term6981, term6981.getClass(), "parent", null);
        setField(term6980, term6980.getClass(), "next", term6981);
        setIntField(term6982, term6982.getClass(), "type", 0);
        setField(term6982, term6982.getClass(), "next", null);
        setField(term6982, term6982.getClass(), "first", null);
        setField(term6982, term6982.getClass(), "last", null);
        setField(term6982, term6982.getClass(), "propListHead", null);
        setIntField(term6982, term6982.getClass(), "sourcePosition", 0);
        setField(term6982, term6982.getClass(), "jsType", null);
        setField(term6982, term6982.getClass(), "parent", null);
        setField(term6980, term6980.getClass(), "first", term6982);
        setIntField(term6983, term6983.getClass(), "type", 0);
        setField(term6983, term6983.getClass(), "next", null);
        setField(term6983, term6983.getClass(), "first", null);
        setField(term6983, term6983.getClass(), "last", null);
        setField(term6983, term6983.getClass(), "propListHead", null);
        setIntField(term6983, term6983.getClass(), "sourcePosition", 0);
        setField(term6983, term6983.getClass(), "jsType", null);
        setField(term6983, term6983.getClass(), "parent", null);
        setField(term6980, term6980.getClass(), "last", term6983);
        setField(term6984, term6984.getClass(), "next", null);
        setIntField(term6984, term6984.getClass(), "type", 0);
        setIntField(term6984, term6984.getClass(), "intValue", 0);
        setField(term6984, term6984.getClass(), "objectValue", null);
        setField(term6980, term6980.getClass(), "propListHead", term6984);
        setIntField(term6980, term6980.getClass(), "sourcePosition", -828982065);
        setField(term6980, term6980.getClass(), "jsType", null);
        setField(term6980, term6980.getClass(), "parent", null);
        setField(term6979, term6979.getClass(), "next", term6980);
        setIntField(term6985, term6985.getClass(), "type", 0);
        setField(term6985, term6985.getClass(), "next", null);
        setField(term6985, term6985.getClass(), "first", null);
        setField(term6985, term6985.getClass(), "last", null);
        setField(term6985, term6985.getClass(), "propListHead", null);
        setIntField(term6985, term6985.getClass(), "sourcePosition", 0);
        setField(term6985, term6985.getClass(), "jsType", null);
        setField(term6985, term6985.getClass(), "parent", null);
        setField(term6979, term6979.getClass(), "first", term6985);
        setIntField(term6986, term6986.getClass(), "type", 0);
        setField(term6986, term6986.getClass(), "next", null);
        setField(term6986, term6986.getClass(), "first", null);
        setField(term6986, term6986.getClass(), "last", null);
        setField(term6986, term6986.getClass(), "propListHead", null);
        setIntField(term6986, term6986.getClass(), "sourcePosition", 0);
        setField(term6986, term6986.getClass(), "jsType", null);
        setField(term6986, term6986.getClass(), "parent", null);
        setField(term6979, term6979.getClass(), "last", term6986);
        setField(term6987, term6987.getClass(), "next", null);
        setIntField(term6987, term6987.getClass(), "type", 0);
        setIntField(term6987, term6987.getClass(), "intValue", 0);
        setField(term6987, term6987.getClass(), "objectValue", null);
        setField(term6979, term6979.getClass(), "propListHead", term6987);
        setIntField(term6979, term6979.getClass(), "sourcePosition", 1221443226);
        setField(term6979, term6979.getClass(), "jsType", null);
        setField(term6979, term6979.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term895;
        Object retValue = callMethod(klass, "isAssign", argTypes, null, args);
        assertTrue(recursiveEquals(term895, term6979));
        assertTrue(recursiveEquals(retValue, false));
    }

};


