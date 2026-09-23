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

public class NodeUtil_isReferenceName_334258165226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1919;
     Object term13809;

    public NodeUtil_isReferenceName_334258165226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1932 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1942 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1919, term1919.getClass(), "type", -944986533);
        setIntField(term1921, term1921.getClass(), "type", -1165271567);
        setIntField(term1923, term1923.getClass(), "type", 0);
        setField(term1923, term1923.getClass(), "next", null);
        setField(term1923, term1923.getClass(), "first", null);
        setField(term1923, term1923.getClass(), "last", null);
        setField(term1923, term1923.getClass(), "propListHead", null);
        setIntField(term1923, term1923.getClass(), "sourcePosition", 0);
        setField(term1923, term1923.getClass(), "jsType", null);
        setField(term1923, term1923.getClass(), "parent", null);
        setField(term1921, term1921.getClass(), "next", term1923);
        setIntField(term1926, term1926.getClass(), "type", 0);
        setField(term1926, term1926.getClass(), "next", null);
        setField(term1926, term1926.getClass(), "first", null);
        setField(term1926, term1926.getClass(), "last", null);
        setField(term1926, term1926.getClass(), "propListHead", null);
        setIntField(term1926, term1926.getClass(), "sourcePosition", 0);
        setField(term1926, term1926.getClass(), "jsType", null);
        setField(term1926, term1926.getClass(), "parent", null);
        setField(term1921, term1921.getClass(), "first", term1926);
        setIntField(term1929, term1929.getClass(), "type", 0);
        setField(term1929, term1929.getClass(), "next", null);
        setField(term1929, term1929.getClass(), "first", null);
        setField(term1929, term1929.getClass(), "last", null);
        setField(term1929, term1929.getClass(), "propListHead", null);
        setIntField(term1929, term1929.getClass(), "sourcePosition", 0);
        setField(term1929, term1929.getClass(), "jsType", null);
        setField(term1929, term1929.getClass(), "parent", null);
        setField(term1921, term1921.getClass(), "last", term1929);
        setField(term1932, term1932.getClass(), "next", null);
        setIntField(term1932, term1932.getClass(), "type", 0);
        setIntField(term1932, term1932.getClass(), "intValue", 0);
        setField(term1932, term1932.getClass(), "objectValue", null);
        setField(term1921, term1921.getClass(), "propListHead", term1932);
        setIntField(term1921, term1921.getClass(), "sourcePosition", -642716895);
        setField(term1921, term1921.getClass(), "jsType", null);
        setField(term1921, term1921.getClass(), "parent", null);
        setField(term1919, term1919.getClass(), "next", term1921);
        setIntField(term1936, term1936.getClass(), "type", 0);
        setField(term1936, term1936.getClass(), "next", null);
        setField(term1936, term1936.getClass(), "first", null);
        setField(term1936, term1936.getClass(), "last", null);
        setField(term1936, term1936.getClass(), "propListHead", null);
        setIntField(term1936, term1936.getClass(), "sourcePosition", 0);
        setField(term1936, term1936.getClass(), "jsType", null);
        setField(term1936, term1936.getClass(), "parent", null);
        setField(term1919, term1919.getClass(), "first", term1936);
        setIntField(term1939, term1939.getClass(), "type", 0);
        setField(term1939, term1939.getClass(), "next", null);
        setField(term1939, term1939.getClass(), "first", null);
        setField(term1939, term1939.getClass(), "last", null);
        setField(term1939, term1939.getClass(), "propListHead", null);
        setIntField(term1939, term1939.getClass(), "sourcePosition", 0);
        setField(term1939, term1939.getClass(), "jsType", null);
        setField(term1939, term1939.getClass(), "parent", null);
        setField(term1919, term1919.getClass(), "last", term1939);
        setField(term1942, term1942.getClass(), "next", null);
        setIntField(term1942, term1942.getClass(), "type", 0);
        setIntField(term1942, term1942.getClass(), "intValue", 0);
        setField(term1942, term1942.getClass(), "objectValue", null);
        setField(term1919, term1919.getClass(), "propListHead", term1942);
        setIntField(term1919, term1919.getClass(), "sourcePosition", 1743398246);
        setField(term1919, term1919.getClass(), "jsType", null);
        setField(term1919, term1919.getClass(), "parent", null);
        term13809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13814 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term13815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13816 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13817 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term13809, term13809.getClass(), "type", -944986533);
        setIntField(term13810, term13810.getClass(), "type", -1165271567);
        setIntField(term13811, term13811.getClass(), "type", 0);
        setField(term13811, term13811.getClass(), "next", null);
        setField(term13811, term13811.getClass(), "first", null);
        setField(term13811, term13811.getClass(), "last", null);
        setField(term13811, term13811.getClass(), "propListHead", null);
        setIntField(term13811, term13811.getClass(), "sourcePosition", 0);
        setField(term13811, term13811.getClass(), "jsType", null);
        setField(term13811, term13811.getClass(), "parent", null);
        setField(term13810, term13810.getClass(), "next", term13811);
        setIntField(term13812, term13812.getClass(), "type", 0);
        setField(term13812, term13812.getClass(), "next", null);
        setField(term13812, term13812.getClass(), "first", null);
        setField(term13812, term13812.getClass(), "last", null);
        setField(term13812, term13812.getClass(), "propListHead", null);
        setIntField(term13812, term13812.getClass(), "sourcePosition", 0);
        setField(term13812, term13812.getClass(), "jsType", null);
        setField(term13812, term13812.getClass(), "parent", null);
        setField(term13810, term13810.getClass(), "first", term13812);
        setIntField(term13813, term13813.getClass(), "type", 0);
        setField(term13813, term13813.getClass(), "next", null);
        setField(term13813, term13813.getClass(), "first", null);
        setField(term13813, term13813.getClass(), "last", null);
        setField(term13813, term13813.getClass(), "propListHead", null);
        setIntField(term13813, term13813.getClass(), "sourcePosition", 0);
        setField(term13813, term13813.getClass(), "jsType", null);
        setField(term13813, term13813.getClass(), "parent", null);
        setField(term13810, term13810.getClass(), "last", term13813);
        setField(term13814, term13814.getClass(), "next", null);
        setIntField(term13814, term13814.getClass(), "type", 0);
        setIntField(term13814, term13814.getClass(), "intValue", 0);
        setField(term13814, term13814.getClass(), "objectValue", null);
        setField(term13810, term13810.getClass(), "propListHead", term13814);
        setIntField(term13810, term13810.getClass(), "sourcePosition", -642716895);
        setField(term13810, term13810.getClass(), "jsType", null);
        setField(term13810, term13810.getClass(), "parent", null);
        setField(term13809, term13809.getClass(), "next", term13810);
        setIntField(term13815, term13815.getClass(), "type", 0);
        setField(term13815, term13815.getClass(), "next", null);
        setField(term13815, term13815.getClass(), "first", null);
        setField(term13815, term13815.getClass(), "last", null);
        setField(term13815, term13815.getClass(), "propListHead", null);
        setIntField(term13815, term13815.getClass(), "sourcePosition", 0);
        setField(term13815, term13815.getClass(), "jsType", null);
        setField(term13815, term13815.getClass(), "parent", null);
        setField(term13809, term13809.getClass(), "first", term13815);
        setIntField(term13816, term13816.getClass(), "type", 0);
        setField(term13816, term13816.getClass(), "next", null);
        setField(term13816, term13816.getClass(), "first", null);
        setField(term13816, term13816.getClass(), "last", null);
        setField(term13816, term13816.getClass(), "propListHead", null);
        setIntField(term13816, term13816.getClass(), "sourcePosition", 0);
        setField(term13816, term13816.getClass(), "jsType", null);
        setField(term13816, term13816.getClass(), "parent", null);
        setField(term13809, term13809.getClass(), "last", term13816);
        setField(term13817, term13817.getClass(), "next", null);
        setIntField(term13817, term13817.getClass(), "type", 0);
        setIntField(term13817, term13817.getClass(), "intValue", 0);
        setField(term13817, term13817.getClass(), "objectValue", null);
        setField(term13809, term13809.getClass(), "propListHead", term13817);
        setIntField(term13809, term13809.getClass(), "sourcePosition", 1743398246);
        setField(term13809, term13809.getClass(), "jsType", null);
        setField(term13809, term13809.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1919;
        Object retValue = callMethod(klass, "isReferenceName", argTypes, null, args);
        assertTrue(recursiveEquals(term1919, term13809));
        assertTrue(recursiveEquals(retValue, false));
    }

};


