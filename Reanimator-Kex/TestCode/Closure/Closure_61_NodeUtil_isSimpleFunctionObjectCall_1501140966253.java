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

public class NodeUtil_isSimpleFunctionObjectCall_1501140966253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2087;
     Object term14846;

    public NodeUtil_isSimpleFunctionObjectCall_1501140966253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2087 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2097 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2087, term2087.getClass(), "type", 86344574);
        setIntField(term2089, term2089.getClass(), "type", -1130401612);
        setIntField(term2091, term2091.getClass(), "type", 0);
        setField(term2091, term2091.getClass(), "next", null);
        setField(term2091, term2091.getClass(), "first", null);
        setField(term2091, term2091.getClass(), "last", null);
        setField(term2091, term2091.getClass(), "propListHead", null);
        setIntField(term2091, term2091.getClass(), "sourcePosition", 0);
        setField(term2091, term2091.getClass(), "jsType", null);
        setField(term2091, term2091.getClass(), "parent", null);
        setField(term2089, term2089.getClass(), "next", term2091);
        setIntField(term2094, term2094.getClass(), "type", 0);
        setField(term2094, term2094.getClass(), "next", null);
        setField(term2094, term2094.getClass(), "first", null);
        setField(term2094, term2094.getClass(), "last", null);
        setField(term2094, term2094.getClass(), "propListHead", null);
        setIntField(term2094, term2094.getClass(), "sourcePosition", 0);
        setField(term2094, term2094.getClass(), "jsType", null);
        setField(term2094, term2094.getClass(), "parent", null);
        setField(term2089, term2089.getClass(), "first", term2094);
        setIntField(term2097, term2097.getClass(), "type", 0);
        setField(term2097, term2097.getClass(), "next", null);
        setField(term2097, term2097.getClass(), "first", null);
        setField(term2097, term2097.getClass(), "last", null);
        setField(term2097, term2097.getClass(), "propListHead", null);
        setIntField(term2097, term2097.getClass(), "sourcePosition", 0);
        setField(term2097, term2097.getClass(), "jsType", null);
        setField(term2097, term2097.getClass(), "parent", null);
        setField(term2089, term2089.getClass(), "last", term2097);
        setField(term2089, term2089.getClass(), "propListHead", null);
        setIntField(term2089, term2089.getClass(), "sourcePosition", 0);
        setField(term2089, term2089.getClass(), "jsType", null);
        setField(term2089, term2089.getClass(), "parent", null);
        setField(term2087, term2087.getClass(), "next", term2089);
        setIntField(term2101, term2101.getClass(), "type", 0);
        setField(term2101, term2101.getClass(), "next", null);
        setField(term2101, term2101.getClass(), "first", null);
        setField(term2101, term2101.getClass(), "last", null);
        setField(term2101, term2101.getClass(), "propListHead", null);
        setIntField(term2101, term2101.getClass(), "sourcePosition", 0);
        setField(term2101, term2101.getClass(), "jsType", null);
        setField(term2101, term2101.getClass(), "parent", null);
        setField(term2087, term2087.getClass(), "first", term2101);
        setIntField(term2104, term2104.getClass(), "type", 0);
        setField(term2104, term2104.getClass(), "next", null);
        setField(term2104, term2104.getClass(), "first", null);
        setField(term2104, term2104.getClass(), "last", null);
        setField(term2104, term2104.getClass(), "propListHead", null);
        setIntField(term2104, term2104.getClass(), "sourcePosition", 0);
        setField(term2104, term2104.getClass(), "jsType", null);
        setField(term2104, term2104.getClass(), "parent", null);
        setField(term2087, term2087.getClass(), "last", term2104);
        setField(term2087, term2087.getClass(), "propListHead", null);
        setIntField(term2087, term2087.getClass(), "sourcePosition", 0);
        setField(term2087, term2087.getClass(), "jsType", null);
        setField(term2087, term2087.getClass(), "parent", null);
        term14846 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14850 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14852 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14846, term14846.getClass(), "type", 86344574);
        setIntField(term14847, term14847.getClass(), "type", -1130401612);
        setIntField(term14848, term14848.getClass(), "type", 0);
        setField(term14848, term14848.getClass(), "next", null);
        setField(term14848, term14848.getClass(), "first", null);
        setField(term14848, term14848.getClass(), "last", null);
        setField(term14848, term14848.getClass(), "propListHead", null);
        setIntField(term14848, term14848.getClass(), "sourcePosition", 0);
        setField(term14848, term14848.getClass(), "jsType", null);
        setField(term14848, term14848.getClass(), "parent", null);
        setField(term14847, term14847.getClass(), "next", term14848);
        setIntField(term14849, term14849.getClass(), "type", 0);
        setField(term14849, term14849.getClass(), "next", null);
        setField(term14849, term14849.getClass(), "first", null);
        setField(term14849, term14849.getClass(), "last", null);
        setField(term14849, term14849.getClass(), "propListHead", null);
        setIntField(term14849, term14849.getClass(), "sourcePosition", 0);
        setField(term14849, term14849.getClass(), "jsType", null);
        setField(term14849, term14849.getClass(), "parent", null);
        setField(term14847, term14847.getClass(), "first", term14849);
        setIntField(term14850, term14850.getClass(), "type", 0);
        setField(term14850, term14850.getClass(), "next", null);
        setField(term14850, term14850.getClass(), "first", null);
        setField(term14850, term14850.getClass(), "last", null);
        setField(term14850, term14850.getClass(), "propListHead", null);
        setIntField(term14850, term14850.getClass(), "sourcePosition", 0);
        setField(term14850, term14850.getClass(), "jsType", null);
        setField(term14850, term14850.getClass(), "parent", null);
        setField(term14847, term14847.getClass(), "last", term14850);
        setField(term14847, term14847.getClass(), "propListHead", null);
        setIntField(term14847, term14847.getClass(), "sourcePosition", 0);
        setField(term14847, term14847.getClass(), "jsType", null);
        setField(term14847, term14847.getClass(), "parent", null);
        setField(term14846, term14846.getClass(), "next", term14847);
        setIntField(term14851, term14851.getClass(), "type", 0);
        setField(term14851, term14851.getClass(), "next", null);
        setField(term14851, term14851.getClass(), "first", null);
        setField(term14851, term14851.getClass(), "last", null);
        setField(term14851, term14851.getClass(), "propListHead", null);
        setIntField(term14851, term14851.getClass(), "sourcePosition", 0);
        setField(term14851, term14851.getClass(), "jsType", null);
        setField(term14851, term14851.getClass(), "parent", null);
        setField(term14846, term14846.getClass(), "first", term14851);
        setIntField(term14852, term14852.getClass(), "type", 0);
        setField(term14852, term14852.getClass(), "next", null);
        setField(term14852, term14852.getClass(), "first", null);
        setField(term14852, term14852.getClass(), "last", null);
        setField(term14852, term14852.getClass(), "propListHead", null);
        setIntField(term14852, term14852.getClass(), "sourcePosition", 0);
        setField(term14852, term14852.getClass(), "jsType", null);
        setField(term14852, term14852.getClass(), "parent", null);
        setField(term14846, term14846.getClass(), "last", term14852);
        setField(term14846, term14846.getClass(), "propListHead", null);
        setIntField(term14846, term14846.getClass(), "sourcePosition", 0);
        setField(term14846, term14846.getClass(), "jsType", null);
        setField(term14846, term14846.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2087;
        Object retValue = callMethod(klass, "isSimpleFunctionObjectCall", argTypes, null, args);
        assertTrue(recursiveEquals(term2087, term14846));
        assertTrue(recursiveEquals(retValue, false));
    }

};


