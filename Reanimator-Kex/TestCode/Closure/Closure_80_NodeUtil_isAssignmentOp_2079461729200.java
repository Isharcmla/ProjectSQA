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

public class NodeUtil_isAssignmentOp_2079461729200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1190;
     Object term10918;

    public NodeUtil_isAssignmentOp_2079461729200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1192 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1203 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1213 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1190, term1190.getClass(), "type", 873659088);
        setIntField(term1192, term1192.getClass(), "type", -1736183862);
        setIntField(term1194, term1194.getClass(), "type", 0);
        setField(term1194, term1194.getClass(), "next", null);
        setField(term1194, term1194.getClass(), "first", null);
        setField(term1194, term1194.getClass(), "last", null);
        setField(term1194, term1194.getClass(), "propListHead", null);
        setIntField(term1194, term1194.getClass(), "sourcePosition", 0);
        setField(term1194, term1194.getClass(), "jsType", null);
        setField(term1194, term1194.getClass(), "parent", null);
        setField(term1192, term1192.getClass(), "next", term1194);
        setIntField(term1197, term1197.getClass(), "type", 0);
        setField(term1197, term1197.getClass(), "next", null);
        setField(term1197, term1197.getClass(), "first", null);
        setField(term1197, term1197.getClass(), "last", null);
        setField(term1197, term1197.getClass(), "propListHead", null);
        setIntField(term1197, term1197.getClass(), "sourcePosition", 0);
        setField(term1197, term1197.getClass(), "jsType", null);
        setField(term1197, term1197.getClass(), "parent", null);
        setField(term1192, term1192.getClass(), "first", term1197);
        setIntField(term1200, term1200.getClass(), "type", 0);
        setField(term1200, term1200.getClass(), "next", null);
        setField(term1200, term1200.getClass(), "first", null);
        setField(term1200, term1200.getClass(), "last", null);
        setField(term1200, term1200.getClass(), "propListHead", null);
        setIntField(term1200, term1200.getClass(), "sourcePosition", 0);
        setField(term1200, term1200.getClass(), "jsType", null);
        setField(term1200, term1200.getClass(), "parent", null);
        setField(term1192, term1192.getClass(), "last", term1200);
        setField(term1203, term1203.getClass(), "next", null);
        setIntField(term1203, term1203.getClass(), "type", 0);
        setIntField(term1203, term1203.getClass(), "intValue", 0);
        setField(term1203, term1203.getClass(), "objectValue", null);
        setField(term1192, term1192.getClass(), "propListHead", term1203);
        setIntField(term1192, term1192.getClass(), "sourcePosition", 1964967720);
        setField(term1192, term1192.getClass(), "jsType", null);
        setField(term1192, term1192.getClass(), "parent", null);
        setField(term1190, term1190.getClass(), "next", term1192);
        setIntField(term1207, term1207.getClass(), "type", 0);
        setField(term1207, term1207.getClass(), "next", null);
        setField(term1207, term1207.getClass(), "first", null);
        setField(term1207, term1207.getClass(), "last", null);
        setField(term1207, term1207.getClass(), "propListHead", null);
        setIntField(term1207, term1207.getClass(), "sourcePosition", 0);
        setField(term1207, term1207.getClass(), "jsType", null);
        setField(term1207, term1207.getClass(), "parent", null);
        setField(term1190, term1190.getClass(), "first", term1207);
        setIntField(term1210, term1210.getClass(), "type", 0);
        setField(term1210, term1210.getClass(), "next", null);
        setField(term1210, term1210.getClass(), "first", null);
        setField(term1210, term1210.getClass(), "last", null);
        setField(term1210, term1210.getClass(), "propListHead", null);
        setIntField(term1210, term1210.getClass(), "sourcePosition", 0);
        setField(term1210, term1210.getClass(), "jsType", null);
        setField(term1210, term1210.getClass(), "parent", null);
        setField(term1190, term1190.getClass(), "last", term1210);
        setField(term1213, term1213.getClass(), "next", null);
        setIntField(term1213, term1213.getClass(), "type", 0);
        setIntField(term1213, term1213.getClass(), "intValue", 0);
        setField(term1213, term1213.getClass(), "objectValue", null);
        setField(term1190, term1190.getClass(), "propListHead", term1213);
        setIntField(term1190, term1190.getClass(), "sourcePosition", 1351900243);
        setField(term1190, term1190.getClass(), "jsType", null);
        setField(term1190, term1190.getClass(), "parent", null);
        term10918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10923 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10926 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10918, term10918.getClass(), "type", 873659088);
        setIntField(term10919, term10919.getClass(), "type", -1736183862);
        setIntField(term10920, term10920.getClass(), "type", 0);
        setField(term10920, term10920.getClass(), "next", null);
        setField(term10920, term10920.getClass(), "first", null);
        setField(term10920, term10920.getClass(), "last", null);
        setField(term10920, term10920.getClass(), "propListHead", null);
        setIntField(term10920, term10920.getClass(), "sourcePosition", 0);
        setField(term10920, term10920.getClass(), "jsType", null);
        setField(term10920, term10920.getClass(), "parent", null);
        setField(term10919, term10919.getClass(), "next", term10920);
        setIntField(term10921, term10921.getClass(), "type", 0);
        setField(term10921, term10921.getClass(), "next", null);
        setField(term10921, term10921.getClass(), "first", null);
        setField(term10921, term10921.getClass(), "last", null);
        setField(term10921, term10921.getClass(), "propListHead", null);
        setIntField(term10921, term10921.getClass(), "sourcePosition", 0);
        setField(term10921, term10921.getClass(), "jsType", null);
        setField(term10921, term10921.getClass(), "parent", null);
        setField(term10919, term10919.getClass(), "first", term10921);
        setIntField(term10922, term10922.getClass(), "type", 0);
        setField(term10922, term10922.getClass(), "next", null);
        setField(term10922, term10922.getClass(), "first", null);
        setField(term10922, term10922.getClass(), "last", null);
        setField(term10922, term10922.getClass(), "propListHead", null);
        setIntField(term10922, term10922.getClass(), "sourcePosition", 0);
        setField(term10922, term10922.getClass(), "jsType", null);
        setField(term10922, term10922.getClass(), "parent", null);
        setField(term10919, term10919.getClass(), "last", term10922);
        setField(term10923, term10923.getClass(), "next", null);
        setIntField(term10923, term10923.getClass(), "type", 0);
        setIntField(term10923, term10923.getClass(), "intValue", 0);
        setField(term10923, term10923.getClass(), "objectValue", null);
        setField(term10919, term10919.getClass(), "propListHead", term10923);
        setIntField(term10919, term10919.getClass(), "sourcePosition", 1964967720);
        setField(term10919, term10919.getClass(), "jsType", null);
        setField(term10919, term10919.getClass(), "parent", null);
        setField(term10918, term10918.getClass(), "next", term10919);
        setIntField(term10924, term10924.getClass(), "type", 0);
        setField(term10924, term10924.getClass(), "next", null);
        setField(term10924, term10924.getClass(), "first", null);
        setField(term10924, term10924.getClass(), "last", null);
        setField(term10924, term10924.getClass(), "propListHead", null);
        setIntField(term10924, term10924.getClass(), "sourcePosition", 0);
        setField(term10924, term10924.getClass(), "jsType", null);
        setField(term10924, term10924.getClass(), "parent", null);
        setField(term10918, term10918.getClass(), "first", term10924);
        setIntField(term10925, term10925.getClass(), "type", 0);
        setField(term10925, term10925.getClass(), "next", null);
        setField(term10925, term10925.getClass(), "first", null);
        setField(term10925, term10925.getClass(), "last", null);
        setField(term10925, term10925.getClass(), "propListHead", null);
        setIntField(term10925, term10925.getClass(), "sourcePosition", 0);
        setField(term10925, term10925.getClass(), "jsType", null);
        setField(term10925, term10925.getClass(), "parent", null);
        setField(term10918, term10918.getClass(), "last", term10925);
        setField(term10926, term10926.getClass(), "next", null);
        setIntField(term10926, term10926.getClass(), "type", 0);
        setIntField(term10926, term10926.getClass(), "intValue", 0);
        setField(term10926, term10926.getClass(), "objectValue", null);
        setField(term10918, term10918.getClass(), "propListHead", term10926);
        setIntField(term10918, term10918.getClass(), "sourcePosition", 1351900243);
        setField(term10918, term10918.getClass(), "jsType", null);
        setField(term10918, term10918.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1190;
        Object retValue = callMethod(klass, "isAssignmentOp", argTypes, null, args);
        assertTrue(recursiveEquals(term1190, term10918));
        assertTrue(recursiveEquals(retValue, false));
    }

};


