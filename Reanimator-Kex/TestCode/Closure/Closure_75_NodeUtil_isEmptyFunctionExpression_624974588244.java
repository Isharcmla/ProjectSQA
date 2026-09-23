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

public class NodeUtil_isEmptyFunctionExpression_624974588244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2459;
     Object term15889;

    public NodeUtil_isEmptyFunctionExpression_624974588244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2472 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2482 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2459, term2459.getClass(), "type", 1485731037);
        setIntField(term2461, term2461.getClass(), "type", -203163250);
        setIntField(term2463, term2463.getClass(), "type", 0);
        setField(term2463, term2463.getClass(), "next", null);
        setField(term2463, term2463.getClass(), "first", null);
        setField(term2463, term2463.getClass(), "last", null);
        setField(term2463, term2463.getClass(), "propListHead", null);
        setIntField(term2463, term2463.getClass(), "sourcePosition", 0);
        setField(term2463, term2463.getClass(), "jsType", null);
        setField(term2463, term2463.getClass(), "parent", null);
        setField(term2461, term2461.getClass(), "next", term2463);
        setIntField(term2466, term2466.getClass(), "type", 0);
        setField(term2466, term2466.getClass(), "next", null);
        setField(term2466, term2466.getClass(), "first", null);
        setField(term2466, term2466.getClass(), "last", null);
        setField(term2466, term2466.getClass(), "propListHead", null);
        setIntField(term2466, term2466.getClass(), "sourcePosition", 0);
        setField(term2466, term2466.getClass(), "jsType", null);
        setField(term2466, term2466.getClass(), "parent", null);
        setField(term2461, term2461.getClass(), "first", term2466);
        setIntField(term2469, term2469.getClass(), "type", 0);
        setField(term2469, term2469.getClass(), "next", null);
        setField(term2469, term2469.getClass(), "first", null);
        setField(term2469, term2469.getClass(), "last", null);
        setField(term2469, term2469.getClass(), "propListHead", null);
        setIntField(term2469, term2469.getClass(), "sourcePosition", 0);
        setField(term2469, term2469.getClass(), "jsType", null);
        setField(term2469, term2469.getClass(), "parent", null);
        setField(term2461, term2461.getClass(), "last", term2469);
        setField(term2472, term2472.getClass(), "next", null);
        setIntField(term2472, term2472.getClass(), "type", 0);
        setIntField(term2472, term2472.getClass(), "intValue", 0);
        setField(term2472, term2472.getClass(), "objectValue", null);
        setField(term2461, term2461.getClass(), "propListHead", term2472);
        setIntField(term2461, term2461.getClass(), "sourcePosition", 1670041824);
        setField(term2461, term2461.getClass(), "jsType", null);
        setField(term2461, term2461.getClass(), "parent", null);
        setField(term2459, term2459.getClass(), "next", term2461);
        setIntField(term2476, term2476.getClass(), "type", 0);
        setField(term2476, term2476.getClass(), "next", null);
        setField(term2476, term2476.getClass(), "first", null);
        setField(term2476, term2476.getClass(), "last", null);
        setField(term2476, term2476.getClass(), "propListHead", null);
        setIntField(term2476, term2476.getClass(), "sourcePosition", 0);
        setField(term2476, term2476.getClass(), "jsType", null);
        setField(term2476, term2476.getClass(), "parent", null);
        setField(term2459, term2459.getClass(), "first", term2476);
        setIntField(term2479, term2479.getClass(), "type", 0);
        setField(term2479, term2479.getClass(), "next", null);
        setField(term2479, term2479.getClass(), "first", null);
        setField(term2479, term2479.getClass(), "last", null);
        setField(term2479, term2479.getClass(), "propListHead", null);
        setIntField(term2479, term2479.getClass(), "sourcePosition", 0);
        setField(term2479, term2479.getClass(), "jsType", null);
        setField(term2479, term2479.getClass(), "parent", null);
        setField(term2459, term2459.getClass(), "last", term2479);
        setField(term2482, term2482.getClass(), "next", null);
        setIntField(term2482, term2482.getClass(), "type", 0);
        setIntField(term2482, term2482.getClass(), "intValue", 0);
        setField(term2482, term2482.getClass(), "objectValue", null);
        setField(term2459, term2459.getClass(), "propListHead", term2482);
        setIntField(term2459, term2459.getClass(), "sourcePosition", 2140388634);
        setField(term2459, term2459.getClass(), "jsType", null);
        setField(term2459, term2459.getClass(), "parent", null);
        term15889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15891 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15892 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15894 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15897 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term15889, term15889.getClass(), "type", 1485731037);
        setIntField(term15890, term15890.getClass(), "type", -203163250);
        setIntField(term15891, term15891.getClass(), "type", 0);
        setField(term15891, term15891.getClass(), "next", null);
        setField(term15891, term15891.getClass(), "first", null);
        setField(term15891, term15891.getClass(), "last", null);
        setField(term15891, term15891.getClass(), "propListHead", null);
        setIntField(term15891, term15891.getClass(), "sourcePosition", 0);
        setField(term15891, term15891.getClass(), "jsType", null);
        setField(term15891, term15891.getClass(), "parent", null);
        setField(term15890, term15890.getClass(), "next", term15891);
        setIntField(term15892, term15892.getClass(), "type", 0);
        setField(term15892, term15892.getClass(), "next", null);
        setField(term15892, term15892.getClass(), "first", null);
        setField(term15892, term15892.getClass(), "last", null);
        setField(term15892, term15892.getClass(), "propListHead", null);
        setIntField(term15892, term15892.getClass(), "sourcePosition", 0);
        setField(term15892, term15892.getClass(), "jsType", null);
        setField(term15892, term15892.getClass(), "parent", null);
        setField(term15890, term15890.getClass(), "first", term15892);
        setIntField(term15893, term15893.getClass(), "type", 0);
        setField(term15893, term15893.getClass(), "next", null);
        setField(term15893, term15893.getClass(), "first", null);
        setField(term15893, term15893.getClass(), "last", null);
        setField(term15893, term15893.getClass(), "propListHead", null);
        setIntField(term15893, term15893.getClass(), "sourcePosition", 0);
        setField(term15893, term15893.getClass(), "jsType", null);
        setField(term15893, term15893.getClass(), "parent", null);
        setField(term15890, term15890.getClass(), "last", term15893);
        setField(term15894, term15894.getClass(), "next", null);
        setIntField(term15894, term15894.getClass(), "type", 0);
        setIntField(term15894, term15894.getClass(), "intValue", 0);
        setField(term15894, term15894.getClass(), "objectValue", null);
        setField(term15890, term15890.getClass(), "propListHead", term15894);
        setIntField(term15890, term15890.getClass(), "sourcePosition", 1670041824);
        setField(term15890, term15890.getClass(), "jsType", null);
        setField(term15890, term15890.getClass(), "parent", null);
        setField(term15889, term15889.getClass(), "next", term15890);
        setIntField(term15895, term15895.getClass(), "type", 0);
        setField(term15895, term15895.getClass(), "next", null);
        setField(term15895, term15895.getClass(), "first", null);
        setField(term15895, term15895.getClass(), "last", null);
        setField(term15895, term15895.getClass(), "propListHead", null);
        setIntField(term15895, term15895.getClass(), "sourcePosition", 0);
        setField(term15895, term15895.getClass(), "jsType", null);
        setField(term15895, term15895.getClass(), "parent", null);
        setField(term15889, term15889.getClass(), "first", term15895);
        setIntField(term15896, term15896.getClass(), "type", 0);
        setField(term15896, term15896.getClass(), "next", null);
        setField(term15896, term15896.getClass(), "first", null);
        setField(term15896, term15896.getClass(), "last", null);
        setField(term15896, term15896.getClass(), "propListHead", null);
        setIntField(term15896, term15896.getClass(), "sourcePosition", 0);
        setField(term15896, term15896.getClass(), "jsType", null);
        setField(term15896, term15896.getClass(), "parent", null);
        setField(term15889, term15889.getClass(), "last", term15896);
        setField(term15897, term15897.getClass(), "next", null);
        setIntField(term15897, term15897.getClass(), "type", 0);
        setIntField(term15897, term15897.getClass(), "intValue", 0);
        setField(term15897, term15897.getClass(), "objectValue", null);
        setField(term15889, term15889.getClass(), "propListHead", term15897);
        setIntField(term15889, term15889.getClass(), "sourcePosition", 2140388634);
        setField(term15889, term15889.getClass(), "jsType", null);
        setField(term15889, term15889.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2459;
        Object retValue = callMethod(klass, "isEmptyFunctionExpression", argTypes, null, args);
        assertTrue(recursiveEquals(term2459, term15889));
        assertTrue(recursiveEquals(retValue, false));
    }

};


