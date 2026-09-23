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

public class NodeUtil_containsType_951752563173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1922;
     Object term1949;

    public NodeUtil_containsType_951752563173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1935 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1942 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1945 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1922, term1922.getClass(), "type", 1474899591);
        setIntField(term1924, term1924.getClass(), "type", 2077491675);
        setIntField(term1926, term1926.getClass(), "type", 0);
        setField(term1926, term1926.getClass(), "next", null);
        setField(term1926, term1926.getClass(), "first", null);
        setField(term1926, term1926.getClass(), "last", null);
        setField(term1926, term1926.getClass(), "propListHead", null);
        setIntField(term1926, term1926.getClass(), "sourcePosition", 0);
        setField(term1926, term1926.getClass(), "jsType", null);
        setField(term1926, term1926.getClass(), "parent", null);
        setField(term1924, term1924.getClass(), "next", term1926);
        setIntField(term1929, term1929.getClass(), "type", 0);
        setField(term1929, term1929.getClass(), "next", null);
        setField(term1929, term1929.getClass(), "first", null);
        setField(term1929, term1929.getClass(), "last", null);
        setField(term1929, term1929.getClass(), "propListHead", null);
        setIntField(term1929, term1929.getClass(), "sourcePosition", 0);
        setField(term1929, term1929.getClass(), "jsType", null);
        setField(term1929, term1929.getClass(), "parent", null);
        setField(term1924, term1924.getClass(), "first", term1929);
        setIntField(term1932, term1932.getClass(), "type", 0);
        setField(term1932, term1932.getClass(), "next", null);
        setField(term1932, term1932.getClass(), "first", null);
        setField(term1932, term1932.getClass(), "last", null);
        setField(term1932, term1932.getClass(), "propListHead", null);
        setIntField(term1932, term1932.getClass(), "sourcePosition", 0);
        setField(term1932, term1932.getClass(), "jsType", null);
        setField(term1932, term1932.getClass(), "parent", null);
        setField(term1924, term1924.getClass(), "last", term1932);
        setField(term1935, term1935.getClass(), "next", null);
        setIntField(term1935, term1935.getClass(), "type", 0);
        setIntField(term1935, term1935.getClass(), "intValue", 0);
        setField(term1935, term1935.getClass(), "objectValue", null);
        setField(term1924, term1924.getClass(), "propListHead", term1935);
        setIntField(term1924, term1924.getClass(), "sourcePosition", -2093707412);
        setField(term1924, term1924.getClass(), "jsType", null);
        setField(term1924, term1924.getClass(), "parent", null);
        setField(term1922, term1922.getClass(), "next", term1924);
        setIntField(term1939, term1939.getClass(), "type", 0);
        setField(term1939, term1939.getClass(), "next", null);
        setField(term1939, term1939.getClass(), "first", null);
        setField(term1939, term1939.getClass(), "last", null);
        setField(term1939, term1939.getClass(), "propListHead", null);
        setIntField(term1939, term1939.getClass(), "sourcePosition", 0);
        setField(term1939, term1939.getClass(), "jsType", null);
        setField(term1939, term1939.getClass(), "parent", null);
        setField(term1922, term1922.getClass(), "first", term1939);
        setIntField(term1942, term1942.getClass(), "type", 0);
        setField(term1942, term1942.getClass(), "next", null);
        setField(term1942, term1942.getClass(), "first", null);
        setField(term1942, term1942.getClass(), "last", null);
        setField(term1942, term1942.getClass(), "propListHead", null);
        setIntField(term1942, term1942.getClass(), "sourcePosition", 0);
        setField(term1942, term1942.getClass(), "jsType", null);
        setField(term1942, term1942.getClass(), "parent", null);
        setField(term1922, term1922.getClass(), "last", term1942);
        setField(term1945, term1945.getClass(), "next", null);
        setIntField(term1945, term1945.getClass(), "type", 0);
        setIntField(term1945, term1945.getClass(), "intValue", 0);
        setField(term1945, term1945.getClass(), "objectValue", null);
        setField(term1922, term1922.getClass(), "propListHead", term1945);
        setIntField(term1922, term1922.getClass(), "sourcePosition", -680627153);
        setField(term1922, term1922.getClass(), "jsType", null);
        setField(term1922, term1922.getClass(), "parent", null);
        term1949 = new Integer(722519669);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term1922;
        args[1] = term1949;
        args[2] = null;
        try {
            callMethod(klass, "containsType", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


