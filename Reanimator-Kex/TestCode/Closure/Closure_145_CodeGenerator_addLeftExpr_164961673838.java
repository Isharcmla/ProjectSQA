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
import java.lang.Error;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;

public class CodeGenerator_addLeftExpr_164961673838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term918;
     Object term919;
     Object term946;
     Object enum10;

    public CodeGenerator_addLeftExpr_164961673838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term918 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term918, term918.getClass(), "cc", null);
        setField(term918, term918.getClass(), "outputCharsetEncoder", null);
        term919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term932 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term942 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term919, term919.getClass(), "type", 454281060);
        setIntField(term921, term921.getClass(), "type", 292681826);
        setIntField(term923, term923.getClass(), "type", 0);
        setField(term923, term923.getClass(), "next", null);
        setField(term923, term923.getClass(), "first", null);
        setField(term923, term923.getClass(), "last", null);
        setField(term923, term923.getClass(), "propListHead", null);
        setIntField(term923, term923.getClass(), "sourcePosition", 0);
        setField(term923, term923.getClass(), "jsType", null);
        setField(term923, term923.getClass(), "parent", null);
        setField(term921, term921.getClass(), "next", term923);
        setIntField(term926, term926.getClass(), "type", 0);
        setField(term926, term926.getClass(), "next", null);
        setField(term926, term926.getClass(), "first", null);
        setField(term926, term926.getClass(), "last", null);
        setField(term926, term926.getClass(), "propListHead", null);
        setIntField(term926, term926.getClass(), "sourcePosition", 0);
        setField(term926, term926.getClass(), "jsType", null);
        setField(term926, term926.getClass(), "parent", null);
        setField(term921, term921.getClass(), "first", term926);
        setIntField(term929, term929.getClass(), "type", 0);
        setField(term929, term929.getClass(), "next", null);
        setField(term929, term929.getClass(), "first", null);
        setField(term929, term929.getClass(), "last", null);
        setField(term929, term929.getClass(), "propListHead", null);
        setIntField(term929, term929.getClass(), "sourcePosition", 0);
        setField(term929, term929.getClass(), "jsType", null);
        setField(term929, term929.getClass(), "parent", null);
        setField(term921, term921.getClass(), "last", term929);
        setField(term932, term932.getClass(), "next", null);
        setIntField(term932, term932.getClass(), "type", 0);
        setIntField(term932, term932.getClass(), "intValue", 0);
        setField(term932, term932.getClass(), "objectValue", null);
        setField(term921, term921.getClass(), "propListHead", term932);
        setIntField(term921, term921.getClass(), "sourcePosition", 493620644);
        setField(term921, term921.getClass(), "jsType", null);
        setField(term921, term921.getClass(), "parent", null);
        setField(term919, term919.getClass(), "next", term921);
        setIntField(term936, term936.getClass(), "type", 0);
        setField(term936, term936.getClass(), "next", null);
        setField(term936, term936.getClass(), "first", null);
        setField(term936, term936.getClass(), "last", null);
        setField(term936, term936.getClass(), "propListHead", null);
        setIntField(term936, term936.getClass(), "sourcePosition", 0);
        setField(term936, term936.getClass(), "jsType", null);
        setField(term936, term936.getClass(), "parent", null);
        setField(term919, term919.getClass(), "first", term936);
        setIntField(term939, term939.getClass(), "type", 0);
        setField(term939, term939.getClass(), "next", null);
        setField(term939, term939.getClass(), "first", null);
        setField(term939, term939.getClass(), "last", null);
        setField(term939, term939.getClass(), "propListHead", null);
        setIntField(term939, term939.getClass(), "sourcePosition", 0);
        setField(term939, term939.getClass(), "jsType", null);
        setField(term939, term939.getClass(), "parent", null);
        setField(term919, term919.getClass(), "last", term939);
        setField(term942, term942.getClass(), "next", null);
        setIntField(term942, term942.getClass(), "type", 0);
        setIntField(term942, term942.getClass(), "intValue", 0);
        setField(term942, term942.getClass(), "objectValue", null);
        setField(term919, term919.getClass(), "propListHead", term942);
        setIntField(term919, term919.getClass(), "sourcePosition", 1328271830);
        setField(term919, term919.getClass(), "jsType", null);
        setField(term919, term919.getClass(), "parent", null);
        term946 = new Integer(1596070772);
        Class<? extends Object> term5747 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term5746 = ((Class) term5747).getDeclaredField((String) "IN_FOR_INIT_CLAUSE");
        ((Field) term5746).setAccessible(true);
        enum10 = ((Field) term5746).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[3];
        args[0] = term919;
        args[1] = term946;
        args[2] = enum10;
        try {
            callMethod(klass, "addLeftExpr", argTypes, term918, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


