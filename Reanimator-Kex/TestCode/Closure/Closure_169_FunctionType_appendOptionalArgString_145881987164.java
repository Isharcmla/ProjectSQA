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
import java.lang.Boolean;

public class FunctionType_appendOptionalArgString_145881987164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35913;
     Object term35969;
     Object term35989;

    public FunctionType_appendOptionalArgString_145881987164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term191006 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term191005 = ((Class) term191006).getDeclaredField((String) "ORDINARY");
        ((Field) term191005).setAccessible(true);
        Object enum337 = ((Field) term191005).get((Object) null);
        Class<? extends Object> term191297 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term191296 = ((Class) term191297).getDeclaredField((String) "ANY");
        ((Field) term191296).setAccessible(true);
        Object enum338 = ((Field) term191296).get((Object) null);
        term35913 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term35914 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term35915 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35931 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35942 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term35915, term35915.getClass(), "type", 1692937831);
        setIntField(term35917, term35917.getClass(), "type", -1539747985);
        setIntField(term35919, term35919.getClass(), "type", -1982489643);
        setField(term35919, term35919.getClass(), "next", null);
        setField(term35919, term35919.getClass(), "first", null);
        setField(term35919, term35919.getClass(), "last", null);
        setField(term35919, term35919.getClass(), "propListHead", null);
        setIntField(term35919, term35919.getClass(), "sourcePosition", 0);
        setField(term35919, term35919.getClass(), "jsType", null);
        setField(term35919, term35919.getClass(), "parent", null);
        setField(term35917, term35917.getClass(), "next", term35919);
        setIntField(term35922, term35922.getClass(), "type", 0);
        setField(term35922, term35922.getClass(), "next", null);
        setField(term35922, term35922.getClass(), "first", null);
        setField(term35922, term35922.getClass(), "last", null);
        setField(term35922, term35922.getClass(), "propListHead", null);
        setIntField(term35922, term35922.getClass(), "sourcePosition", 0);
        setField(term35922, term35922.getClass(), "jsType", null);
        setField(term35922, term35922.getClass(), "parent", null);
        setField(term35917, term35917.getClass(), "first", term35922);
        setIntField(term35925, term35925.getClass(), "type", 2068435279);
        setField(term35925, term35925.getClass(), "next", null);
        setField(term35925, term35925.getClass(), "first", term35922);
        setField(term35925, term35925.getClass(), "last", term35925);
        setField(term35925, term35925.getClass(), "propListHead", null);
        setIntField(term35925, term35925.getClass(), "sourcePosition", 0);
        setField(term35925, term35925.getClass(), "jsType", null);
        setField(term35925, term35925.getClass(), "parent", null);
        setField(term35917, term35917.getClass(), "last", term35925);
        setField(term35917, term35917.getClass(), "propListHead", null);
        setIntField(term35917, term35917.getClass(), "sourcePosition", 0);
        setField(term35917, term35917.getClass(), "jsType", null);
        setField(term35917, term35917.getClass(), "parent", null);
        setField(term35915, term35915.getClass(), "next", term35917);
        setIntField(term35929, term35929.getClass(), "type", -1945635750);
        setIntField(term35931, term35931.getClass(), "type", -1622760744);
        setField(term35931, term35931.getClass(), "next", term35925);
        setField(term35931, term35931.getClass(), "first", null);
        setField(term35931, term35931.getClass(), "last", term35915);
        setField(term35931, term35931.getClass(), "propListHead", null);
        setIntField(term35931, term35931.getClass(), "sourcePosition", 0);
        setField(term35931, term35931.getClass(), "jsType", null);
        setField(term35931, term35931.getClass(), "parent", null);
        setField(term35929, term35929.getClass(), "next", term35931);
        setField(term35929, term35929.getClass(), "first", term35929);
        setIntField(term35934, term35934.getClass(), "type", 550892835);
        setField(term35934, term35934.getClass(), "next", null);
        setField(term35934, term35934.getClass(), "first", term35922);
        setField(term35934, term35934.getClass(), "last", term35925);
        setField(term35934, term35934.getClass(), "propListHead", null);
        setIntField(term35934, term35934.getClass(), "sourcePosition", 0);
        setField(term35934, term35934.getClass(), "jsType", null);
        setField(term35934, term35934.getClass(), "parent", null);
        setField(term35929, term35929.getClass(), "last", term35934);
        setField(term35929, term35929.getClass(), "propListHead", null);
        setIntField(term35929, term35929.getClass(), "sourcePosition", 0);
        setField(term35929, term35929.getClass(), "jsType", null);
        setField(term35929, term35929.getClass(), "parent", null);
        setField(term35915, term35915.getClass(), "first", term35929);
        setField(term35915, term35915.getClass(), "last", term35919);
        setField(term35915, term35915.getClass(), "propListHead", null);
        setIntField(term35915, term35915.getClass(), "sourcePosition", 0);
        setField(term35915, term35915.getClass(), "jsType", null);
        setField(term35915, term35915.getClass(), "parent", null);
        setField(term35914, term35914.getClass(), "parameters", term35915);
        setField(term35914, term35914.getClass(), "returnType", null);
        setBooleanField(term35914, term35914.getClass(), "returnTypeInferred", false);
        setBooleanField(term35914, term35914.getClass(), "resolved", false);
        setField(term35914, term35914.getClass(), "resolveResult", null);
        setBooleanField(term35914, term35914.getClass(), "inTemplatedCheckVisit", false);
        setField(term35914, term35914.getClass(), "registry", null);
        setField(term35913, term35913.getClass(), "call", term35914);
        setField(term35942, term35942.getClass(), "name", null);
        setField(term35942, term35942.getClass(), "type", null);
        setBooleanField(term35942, term35942.getClass(), "inferred", false);
        setField(term35942, term35942.getClass(), "propertyNode", null);
        setField(term35942, term35942.getClass(), "docInfo", null);
        setField(term35913, term35913.getClass(), "prototypeSlot", term35942);
        setField(term35913, term35913.getClass(), "kind", enum337);
        setField(term35913, term35913.getClass(), "propAccess", enum338);
        setField(term35913, term35913.getClass(), "typeOfThis", null);
        setField(term35913, term35913.getClass(), "source", null);
        setField(term35913, term35913.getClass(), "implementedInterfaces", null);
        setField(term35913, term35913.getClass(), "extendedInterfaces", null);
        setField(term35913, term35913.getClass(), "subTypes", null);
        setField(term35913, term35913.getClass(), "templateTypeNames", null);
        setField(term35913, term35913.getClass(), "className", null);
        setField(term35913, term35913.getClass(), "properties", null);
        setBooleanField(term35913, term35913.getClass(), "nativeType", false);
        setField(term35913, term35913.getClass(), "implicitPrototypeFallback", null);
        setField(term35913, term35913.getClass(), "ownerFunction", null);
        setBooleanField(term35913, term35913.getClass(), "prettyPrint", false);
        setBooleanField(term35913, term35913.getClass(), "visited", false);
        setField(term35913, term35913.getClass(), "docInfo", null);
        setBooleanField(term35913, term35913.getClass(), "unknown", false);
        setBooleanField(term35913, term35913.getClass(), "resolved", false);
        setField(term35913, term35913.getClass(), "resolveResult", null);
        setBooleanField(term35913, term35913.getClass(), "inTemplatedCheckVisit", false);
        setField(term35913, term35913.getClass(), "registry", null);
        term35969 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term35970 = (byte[]) newByteArray(16);
        setField(term35969, term35969.getClass(), "value", term35970);
        setByteField(term35969, term35969.getClass(), "coder", (byte) 89);
        setIntField(term35969, term35969.getClass(), "count", -1556527718);
        term35989 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term35969;
        args[1] = null;
        args[2] = term35989;
        try {
            callMethod(klass, "appendOptionalArgString", argTypes, term35913, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


