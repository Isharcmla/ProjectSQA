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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class FunctionType_appendVarArgsString_1568353105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15223;
     Object term15276;

    public FunctionType_appendVarArgsString_1568353105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term51323 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term51322 = ((Class) term51323).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term51322).setAccessible(true);
        Object enum129 = ((Field) term51322).get((Object) null);
        term15223 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term15224 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term15225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15248 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term15254 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        setIntField(term15225, term15225.getClass(), "type", 1334483645);
        setIntField(term15227, term15227.getClass(), "type", 833762980);
        setIntField(term15229, term15229.getClass(), "type", 0);
        setField(term15229, term15229.getClass(), "next", null);
        setField(term15229, term15229.getClass(), "first", null);
        setField(term15229, term15229.getClass(), "last", null);
        setField(term15229, term15229.getClass(), "propListHead", null);
        setIntField(term15229, term15229.getClass(), "sourcePosition", 0);
        setField(term15229, term15229.getClass(), "jsType", null);
        setField(term15229, term15229.getClass(), "parent", null);
        setField(term15227, term15227.getClass(), "next", term15229);
        setIntField(term15232, term15232.getClass(), "type", 0);
        setField(term15232, term15232.getClass(), "next", null);
        setField(term15232, term15232.getClass(), "first", null);
        setField(term15232, term15232.getClass(), "last", null);
        setField(term15232, term15232.getClass(), "propListHead", null);
        setIntField(term15232, term15232.getClass(), "sourcePosition", 0);
        setField(term15232, term15232.getClass(), "jsType", null);
        setField(term15232, term15232.getClass(), "parent", null);
        setField(term15227, term15227.getClass(), "first", term15232);
        setIntField(term15235, term15235.getClass(), "type", 0);
        setField(term15235, term15235.getClass(), "next", null);
        setField(term15235, term15235.getClass(), "first", null);
        setField(term15235, term15235.getClass(), "last", null);
        setField(term15235, term15235.getClass(), "propListHead", null);
        setIntField(term15235, term15235.getClass(), "sourcePosition", 0);
        setField(term15235, term15235.getClass(), "jsType", null);
        setField(term15235, term15235.getClass(), "parent", null);
        setField(term15227, term15227.getClass(), "last", term15235);
        setField(term15227, term15227.getClass(), "propListHead", null);
        setIntField(term15227, term15227.getClass(), "sourcePosition", 0);
        setField(term15227, term15227.getClass(), "jsType", null);
        setField(term15227, term15227.getClass(), "parent", null);
        setField(term15225, term15225.getClass(), "next", term15227);
        setIntField(term15239, term15239.getClass(), "type", 0);
        setField(term15239, term15239.getClass(), "next", null);
        setField(term15239, term15239.getClass(), "first", null);
        setField(term15239, term15239.getClass(), "last", null);
        setField(term15239, term15239.getClass(), "propListHead", null);
        setIntField(term15239, term15239.getClass(), "sourcePosition", 0);
        setField(term15239, term15239.getClass(), "jsType", null);
        setField(term15239, term15239.getClass(), "parent", null);
        setField(term15225, term15225.getClass(), "first", term15239);
        setIntField(term15242, term15242.getClass(), "type", 0);
        setField(term15242, term15242.getClass(), "next", null);
        setField(term15242, term15242.getClass(), "first", null);
        setField(term15242, term15242.getClass(), "last", null);
        setField(term15242, term15242.getClass(), "propListHead", null);
        setIntField(term15242, term15242.getClass(), "sourcePosition", 0);
        setField(term15242, term15242.getClass(), "jsType", null);
        setField(term15242, term15242.getClass(), "parent", null);
        setField(term15225, term15225.getClass(), "last", term15242);
        setField(term15225, term15225.getClass(), "propListHead", null);
        setIntField(term15225, term15225.getClass(), "sourcePosition", 0);
        setField(term15225, term15225.getClass(), "jsType", null);
        setField(term15225, term15225.getClass(), "parent", null);
        setField(term15224, term15224.getClass(), "parameters", term15225);
        setField(term15224, term15224.getClass(), "returnType", null);
        setBooleanField(term15224, term15224.getClass(), "returnTypeInferred", false);
        setBooleanField(term15224, term15224.getClass(), "resolved", false);
        setField(term15224, term15224.getClass(), "resolveResult", null);
        setField(term15224, term15224.getClass(), "registry", null);
        setField(term15223, term15223.getClass(), "call", term15224);
        setField(term15248, term15248.getClass(), "className", null);
        setField(term15248, term15248.getClass(), "properties", null);
        setBooleanField(term15248, term15248.getClass(), "nativeType", false);
        setField(term15248, term15248.getClass(), "implicitPrototypeFallback", null);
        setField(term15248, term15248.getClass(), "ownerFunction", null);
        setBooleanField(term15248, term15248.getClass(), "prettyPrint", false);
        setBooleanField(term15248, term15248.getClass(), "visited", false);
        setField(term15248, term15248.getClass(), "docInfo", null);
        setBooleanField(term15248, term15248.getClass(), "unknown", false);
        setBooleanField(term15248, term15248.getClass(), "resolved", false);
        setField(term15248, term15248.getClass(), "resolveResult", null);
        setField(term15248, term15248.getClass(), "registry", null);
        setField(term15223, term15223.getClass(), "prototype", term15248);
        setField(term15254, term15254.getClass(), "name", null);
        setField(term15254, term15254.getClass(), "type", null);
        setBooleanField(term15254, term15254.getClass(), "inferred", false);
        setField(term15223, term15223.getClass(), "prototypeSlot", term15254);
        setField(term15223, term15223.getClass(), "kind", enum129);
        setField(term15223, term15223.getClass(), "typeOfThis", null);
        setField(term15223, term15223.getClass(), "source", null);
        setField(term15223, term15223.getClass(), "implementedInterfaces", null);
        setField(term15223, term15223.getClass(), "extendedInterfaces", null);
        setField(term15223, term15223.getClass(), "subTypes", null);
        setField(term15223, term15223.getClass(), "templateTypeName", null);
        setField(term15223, term15223.getClass(), "className", null);
        setField(term15223, term15223.getClass(), "properties", null);
        setBooleanField(term15223, term15223.getClass(), "nativeType", false);
        setField(term15223, term15223.getClass(), "implicitPrototypeFallback", null);
        setField(term15223, term15223.getClass(), "ownerFunction", null);
        setBooleanField(term15223, term15223.getClass(), "prettyPrint", false);
        setBooleanField(term15223, term15223.getClass(), "visited", false);
        setField(term15223, term15223.getClass(), "docInfo", null);
        setBooleanField(term15223, term15223.getClass(), "unknown", false);
        setBooleanField(term15223, term15223.getClass(), "resolved", false);
        setField(term15223, term15223.getClass(), "resolveResult", null);
        setField(term15223, term15223.getClass(), "registry", null);
        term15276 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term15277 = (byte[]) newByteArray(16);
        setField(term15276, term15276.getClass(), "value", term15277);
        setByteField(term15276, term15276.getClass(), "coder", (byte) 47);
        setIntField(term15276, term15276.getClass(), "count", 320711637);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term15276;
        args[1] = null;
        try {
            callMethod(klass, "appendVarArgsString", argTypes, term15223, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


