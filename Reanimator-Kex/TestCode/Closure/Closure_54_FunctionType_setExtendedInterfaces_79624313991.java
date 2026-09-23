package com.google.javascript.rhino.jstype;

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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.LinkedList;

public class FunctionType_setExtendedInterfaces_79624313991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9918;
     Object term9968;

    public FunctionType_setExtendedInterfaces_79624313991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term41117 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term41116 = ((Class) term41117).getDeclaredField((String) "ORDINARY");
        ((Field) term41116).setAccessible(true);
        Object enum106 = ((Field) term41116).get((Object) null);
        term9918 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term9919 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term9920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9930 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9943 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term9949 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        setIntField(term9920, term9920.getClass(), "type", 1745276158);
        setIntField(term9922, term9922.getClass(), "type", 1050765721);
        setIntField(term9924, term9924.getClass(), "type", 0);
        setField(term9924, term9924.getClass(), "next", null);
        setField(term9924, term9924.getClass(), "first", null);
        setField(term9924, term9924.getClass(), "last", null);
        setField(term9924, term9924.getClass(), "propListHead", null);
        setIntField(term9924, term9924.getClass(), "sourcePosition", 0);
        setField(term9924, term9924.getClass(), "jsType", null);
        setField(term9924, term9924.getClass(), "parent", null);
        setField(term9922, term9922.getClass(), "next", term9924);
        setIntField(term9927, term9927.getClass(), "type", 0);
        setField(term9927, term9927.getClass(), "next", null);
        setField(term9927, term9927.getClass(), "first", null);
        setField(term9927, term9927.getClass(), "last", null);
        setField(term9927, term9927.getClass(), "propListHead", null);
        setIntField(term9927, term9927.getClass(), "sourcePosition", 0);
        setField(term9927, term9927.getClass(), "jsType", null);
        setField(term9927, term9927.getClass(), "parent", null);
        setField(term9922, term9922.getClass(), "first", term9927);
        setIntField(term9930, term9930.getClass(), "type", 0);
        setField(term9930, term9930.getClass(), "next", null);
        setField(term9930, term9930.getClass(), "first", null);
        setField(term9930, term9930.getClass(), "last", null);
        setField(term9930, term9930.getClass(), "propListHead", null);
        setIntField(term9930, term9930.getClass(), "sourcePosition", 0);
        setField(term9930, term9930.getClass(), "jsType", null);
        setField(term9930, term9930.getClass(), "parent", null);
        setField(term9922, term9922.getClass(), "last", term9930);
        setField(term9922, term9922.getClass(), "propListHead", null);
        setIntField(term9922, term9922.getClass(), "sourcePosition", 0);
        setField(term9922, term9922.getClass(), "jsType", null);
        setField(term9922, term9922.getClass(), "parent", null);
        setField(term9920, term9920.getClass(), "next", term9922);
        setIntField(term9934, term9934.getClass(), "type", 0);
        setField(term9934, term9934.getClass(), "next", null);
        setField(term9934, term9934.getClass(), "first", null);
        setField(term9934, term9934.getClass(), "last", null);
        setField(term9934, term9934.getClass(), "propListHead", null);
        setIntField(term9934, term9934.getClass(), "sourcePosition", 0);
        setField(term9934, term9934.getClass(), "jsType", null);
        setField(term9934, term9934.getClass(), "parent", null);
        setField(term9920, term9920.getClass(), "first", term9934);
        setIntField(term9937, term9937.getClass(), "type", 0);
        setField(term9937, term9937.getClass(), "next", null);
        setField(term9937, term9937.getClass(), "first", null);
        setField(term9937, term9937.getClass(), "last", null);
        setField(term9937, term9937.getClass(), "propListHead", null);
        setIntField(term9937, term9937.getClass(), "sourcePosition", 0);
        setField(term9937, term9937.getClass(), "jsType", null);
        setField(term9937, term9937.getClass(), "parent", null);
        setField(term9920, term9920.getClass(), "last", term9937);
        setField(term9920, term9920.getClass(), "propListHead", null);
        setIntField(term9920, term9920.getClass(), "sourcePosition", 0);
        setField(term9920, term9920.getClass(), "jsType", null);
        setField(term9920, term9920.getClass(), "parent", null);
        setField(term9919, term9919.getClass(), "parameters", term9920);
        setField(term9919, term9919.getClass(), "returnType", null);
        setBooleanField(term9919, term9919.getClass(), "returnTypeInferred", false);
        setBooleanField(term9919, term9919.getClass(), "resolved", false);
        setField(term9919, term9919.getClass(), "resolveResult", null);
        setField(term9919, term9919.getClass(), "registry", null);
        setField(term9918, term9918.getClass(), "call", term9919);
        setField(term9943, term9943.getClass(), "className", null);
        setField(term9943, term9943.getClass(), "properties", null);
        setBooleanField(term9943, term9943.getClass(), "nativeType", false);
        setField(term9943, term9943.getClass(), "implicitPrototypeFallback", null);
        setField(term9943, term9943.getClass(), "ownerFunction", null);
        setBooleanField(term9943, term9943.getClass(), "prettyPrint", false);
        setBooleanField(term9943, term9943.getClass(), "visited", false);
        setField(term9943, term9943.getClass(), "docInfo", null);
        setBooleanField(term9943, term9943.getClass(), "unknown", false);
        setBooleanField(term9943, term9943.getClass(), "resolved", false);
        setField(term9943, term9943.getClass(), "resolveResult", null);
        setField(term9943, term9943.getClass(), "registry", null);
        setField(term9918, term9918.getClass(), "prototype", term9943);
        setField(term9949, term9949.getClass(), "name", null);
        setField(term9949, term9949.getClass(), "type", null);
        setBooleanField(term9949, term9949.getClass(), "inferred", false);
        setField(term9918, term9918.getClass(), "prototypeSlot", term9949);
        setField(term9918, term9918.getClass(), "kind", enum106);
        setField(term9918, term9918.getClass(), "typeOfThis", null);
        setField(term9918, term9918.getClass(), "source", null);
        setField(term9918, term9918.getClass(), "implementedInterfaces", null);
        setField(term9918, term9918.getClass(), "extendedInterfaces", null);
        setField(term9918, term9918.getClass(), "subTypes", null);
        setField(term9918, term9918.getClass(), "templateTypeName", null);
        setField(term9918, term9918.getClass(), "className", null);
        setField(term9918, term9918.getClass(), "properties", null);
        setBooleanField(term9918, term9918.getClass(), "nativeType", false);
        setField(term9918, term9918.getClass(), "implicitPrototypeFallback", null);
        setField(term9918, term9918.getClass(), "ownerFunction", null);
        setBooleanField(term9918, term9918.getClass(), "prettyPrint", false);
        setBooleanField(term9918, term9918.getClass(), "visited", false);
        setField(term9918, term9918.getClass(), "docInfo", null);
        setBooleanField(term9918, term9918.getClass(), "unknown", false);
        setBooleanField(term9918, term9918.getClass(), "resolved", false);
        setField(term9918, term9918.getClass(), "resolveResult", null);
        setField(term9918, term9918.getClass(), "registry", null);
        term9968 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term9968;
        try {
            callMethod(klass, "setExtendedInterfaces", argTypes, term9918, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


