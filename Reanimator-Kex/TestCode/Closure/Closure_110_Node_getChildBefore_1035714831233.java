package com.google.javascript.rhino;

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
import java.lang.RuntimeException;
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Node_getChildBefore_1035714831233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term919;
     Object term946;

    public Node_getChildBefore_1035714831233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term930 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term919, term919.getClass(), "type", -1694747156);
        setIntField(term921, term921.getClass(), "type", 1466373988);
        setIntField(term923, term923.getClass(), "type", -358526505);
        setIntField(term925, term925.getClass(), "type", 1843268026);
        setIntField(term927, term927.getClass(), "type", 954660603);
        setField(term927, term927.getClass(), "next", null);
        setField(term927, term927.getClass(), "first", null);
        setField(term927, term927.getClass(), "last", null);
        setField(term927, term927.getClass(), "propListHead", null);
        setIntField(term927, term927.getClass(), "sourcePosition", 0);
        setField(term927, term927.getClass(), "jsType", null);
        setField(term927, term927.getClass(), "parent", null);
        setField(term925, term925.getClass(), "next", term927);
        setIntField(term930, term930.getClass(), "type", -1351605385);
        setField(term930, term930.getClass(), "next", null);
        setField(term930, term930.getClass(), "first", null);
        setField(term930, term930.getClass(), "last", term927);
        setField(term930, term930.getClass(), "propListHead", null);
        setIntField(term930, term930.getClass(), "sourcePosition", 0);
        setField(term930, term930.getClass(), "jsType", null);
        setField(term930, term930.getClass(), "parent", null);
        setField(term925, term925.getClass(), "first", term930);
        setField(term925, term925.getClass(), "last", term923);
        setField(term925, term925.getClass(), "propListHead", null);
        setIntField(term925, term925.getClass(), "sourcePosition", 0);
        setField(term925, term925.getClass(), "jsType", null);
        setField(term925, term925.getClass(), "parent", null);
        setField(term923, term923.getClass(), "next", term925);
        setField(term923, term923.getClass(), "first", term927);
        setIntField(term934, term934.getClass(), "type", -310648604);
        setIntField(term936, term936.getClass(), "type", -648200466);
        setField(term936, term936.getClass(), "next", null);
        setField(term936, term936.getClass(), "first", term930);
        setField(term936, term936.getClass(), "last", term925);
        setField(term936, term936.getClass(), "propListHead", null);
        setIntField(term936, term936.getClass(), "sourcePosition", 0);
        setField(term936, term936.getClass(), "jsType", null);
        setField(term936, term936.getClass(), "parent", null);
        setField(term934, term934.getClass(), "next", term936);
        setField(term934, term934.getClass(), "first", term921);
        setField(term934, term934.getClass(), "last", term921);
        setField(term934, term934.getClass(), "propListHead", null);
        setIntField(term934, term934.getClass(), "sourcePosition", 0);
        setField(term934, term934.getClass(), "jsType", null);
        setField(term934, term934.getClass(), "parent", null);
        setField(term923, term923.getClass(), "last", term934);
        setField(term923, term923.getClass(), "propListHead", null);
        setIntField(term923, term923.getClass(), "sourcePosition", 0);
        setField(term923, term923.getClass(), "jsType", null);
        setField(term923, term923.getClass(), "parent", null);
        setField(term921, term921.getClass(), "next", term923);
        setIntField(term941, term941.getClass(), "type", 2007134147);
        setField(term941, term941.getClass(), "next", term934);
        setField(term941, term941.getClass(), "first", term936);
        setField(term941, term941.getClass(), "last", term919);
        setField(term941, term941.getClass(), "propListHead", null);
        setIntField(term941, term941.getClass(), "sourcePosition", 0);
        setField(term941, term941.getClass(), "jsType", null);
        setField(term941, term941.getClass(), "parent", null);
        setField(term921, term921.getClass(), "first", term941);
        setField(term921, term921.getClass(), "last", term941);
        setField(term921, term921.getClass(), "propListHead", null);
        setIntField(term921, term921.getClass(), "sourcePosition", 0);
        setField(term921, term921.getClass(), "jsType", null);
        setField(term921, term921.getClass(), "parent", null);
        setField(term919, term919.getClass(), "next", term921);
        setField(term919, term919.getClass(), "first", term925);
        setField(term919, term919.getClass(), "last", term927);
        setField(term919, term919.getClass(), "propListHead", null);
        setIntField(term919, term919.getClass(), "sourcePosition", 0);
        setField(term919, term919.getClass(), "jsType", null);
        setField(term919, term919.getClass(), "parent", null);
        term946 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term950 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term957 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term946, term946.getClass(), "type", 993388358);
        setIntField(term948, term948.getClass(), "type", -765191335);
        setIntField(term950, term950.getClass(), "type", -1697741155);
        setIntField(term952, term952.getClass(), "type", 1295839803);
        setIntField(term954, term954.getClass(), "type", -1891015523);
        setField(term954, term954.getClass(), "next", null);
        setField(term954, term954.getClass(), "first", null);
        setField(term954, term954.getClass(), "last", null);
        setField(term954, term954.getClass(), "propListHead", null);
        setIntField(term954, term954.getClass(), "sourcePosition", 0);
        setField(term954, term954.getClass(), "jsType", null);
        setField(term954, term954.getClass(), "parent", null);
        setField(term952, term952.getClass(), "next", term954);
        setIntField(term957, term957.getClass(), "type", -1560631747);
        setField(term957, term957.getClass(), "next", null);
        setField(term957, term957.getClass(), "first", null);
        setField(term957, term957.getClass(), "last", term954);
        setField(term957, term957.getClass(), "propListHead", null);
        setIntField(term957, term957.getClass(), "sourcePosition", 0);
        setField(term957, term957.getClass(), "jsType", null);
        setField(term957, term957.getClass(), "parent", null);
        setField(term952, term952.getClass(), "first", term957);
        setField(term952, term952.getClass(), "last", term950);
        setField(term952, term952.getClass(), "propListHead", null);
        setIntField(term952, term952.getClass(), "sourcePosition", 0);
        setField(term952, term952.getClass(), "jsType", null);
        setField(term952, term952.getClass(), "parent", null);
        setField(term950, term950.getClass(), "next", term952);
        setField(term950, term950.getClass(), "first", term954);
        setIntField(term961, term961.getClass(), "type", -1422859977);
        setIntField(term963, term963.getClass(), "type", -1972436591);
        setField(term963, term963.getClass(), "next", null);
        setField(term963, term963.getClass(), "first", term957);
        setField(term963, term963.getClass(), "last", term952);
        setField(term963, term963.getClass(), "propListHead", null);
        setIntField(term963, term963.getClass(), "sourcePosition", 0);
        setField(term963, term963.getClass(), "jsType", null);
        setField(term963, term963.getClass(), "parent", null);
        setField(term961, term961.getClass(), "next", term963);
        setField(term961, term961.getClass(), "first", term948);
        setField(term961, term961.getClass(), "last", term948);
        setField(term961, term961.getClass(), "propListHead", null);
        setIntField(term961, term961.getClass(), "sourcePosition", 0);
        setField(term961, term961.getClass(), "jsType", null);
        setField(term961, term961.getClass(), "parent", null);
        setField(term950, term950.getClass(), "last", term961);
        setField(term950, term950.getClass(), "propListHead", null);
        setIntField(term950, term950.getClass(), "sourcePosition", 0);
        setField(term950, term950.getClass(), "jsType", null);
        setField(term950, term950.getClass(), "parent", null);
        setField(term948, term948.getClass(), "next", term950);
        setIntField(term968, term968.getClass(), "type", 68922753);
        setField(term968, term968.getClass(), "next", term961);
        setField(term968, term968.getClass(), "first", term963);
        setField(term968, term968.getClass(), "last", term946);
        setField(term968, term968.getClass(), "propListHead", null);
        setIntField(term968, term968.getClass(), "sourcePosition", 0);
        setField(term968, term968.getClass(), "jsType", null);
        setField(term968, term968.getClass(), "parent", null);
        setField(term948, term948.getClass(), "first", term968);
        setField(term948, term948.getClass(), "last", term968);
        setField(term948, term948.getClass(), "propListHead", null);
        setIntField(term948, term948.getClass(), "sourcePosition", 0);
        setField(term948, term948.getClass(), "jsType", null);
        setField(term948, term948.getClass(), "parent", null);
        setField(term946, term946.getClass(), "next", term948);
        setField(term946, term946.getClass(), "first", term952);
        setField(term946, term946.getClass(), "last", term954);
        setField(term946, term946.getClass(), "propListHead", null);
        setIntField(term946, term946.getClass(), "sourcePosition", 0);
        setField(term946, term946.getClass(), "jsType", null);
        setField(term946, term946.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term946;
        try {
            callMethod(klass, "getChildBefore", argTypes, term919, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


