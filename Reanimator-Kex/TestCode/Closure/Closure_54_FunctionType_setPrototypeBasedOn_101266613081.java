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

public class FunctionType_setPrototypeBasedOn_101266613081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6395;

    public FunctionType_setPrototypeBasedOn_101266613081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34065 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term34064 = ((Class) term34065).getDeclaredField((String) "ORDINARY");
        ((Field) term34064).setAccessible(true);
        Object enum90 = ((Field) term34064).get((Object) null);
        term6395 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term6396 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term6397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6420 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term6426 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        setIntField(term6397, term6397.getClass(), "type", -1896376975);
        setIntField(term6399, term6399.getClass(), "type", 584893196);
        setIntField(term6401, term6401.getClass(), "type", 0);
        setField(term6401, term6401.getClass(), "next", null);
        setField(term6401, term6401.getClass(), "first", null);
        setField(term6401, term6401.getClass(), "last", null);
        setField(term6401, term6401.getClass(), "propListHead", null);
        setIntField(term6401, term6401.getClass(), "sourcePosition", 0);
        setField(term6401, term6401.getClass(), "jsType", null);
        setField(term6401, term6401.getClass(), "parent", null);
        setField(term6399, term6399.getClass(), "next", term6401);
        setIntField(term6404, term6404.getClass(), "type", 0);
        setField(term6404, term6404.getClass(), "next", null);
        setField(term6404, term6404.getClass(), "first", null);
        setField(term6404, term6404.getClass(), "last", null);
        setField(term6404, term6404.getClass(), "propListHead", null);
        setIntField(term6404, term6404.getClass(), "sourcePosition", 0);
        setField(term6404, term6404.getClass(), "jsType", null);
        setField(term6404, term6404.getClass(), "parent", null);
        setField(term6399, term6399.getClass(), "first", term6404);
        setIntField(term6407, term6407.getClass(), "type", 0);
        setField(term6407, term6407.getClass(), "next", null);
        setField(term6407, term6407.getClass(), "first", null);
        setField(term6407, term6407.getClass(), "last", null);
        setField(term6407, term6407.getClass(), "propListHead", null);
        setIntField(term6407, term6407.getClass(), "sourcePosition", 0);
        setField(term6407, term6407.getClass(), "jsType", null);
        setField(term6407, term6407.getClass(), "parent", null);
        setField(term6399, term6399.getClass(), "last", term6407);
        setField(term6399, term6399.getClass(), "propListHead", null);
        setIntField(term6399, term6399.getClass(), "sourcePosition", 0);
        setField(term6399, term6399.getClass(), "jsType", null);
        setField(term6399, term6399.getClass(), "parent", null);
        setField(term6397, term6397.getClass(), "next", term6399);
        setIntField(term6411, term6411.getClass(), "type", 0);
        setField(term6411, term6411.getClass(), "next", null);
        setField(term6411, term6411.getClass(), "first", null);
        setField(term6411, term6411.getClass(), "last", null);
        setField(term6411, term6411.getClass(), "propListHead", null);
        setIntField(term6411, term6411.getClass(), "sourcePosition", 0);
        setField(term6411, term6411.getClass(), "jsType", null);
        setField(term6411, term6411.getClass(), "parent", null);
        setField(term6397, term6397.getClass(), "first", term6411);
        setIntField(term6414, term6414.getClass(), "type", 0);
        setField(term6414, term6414.getClass(), "next", null);
        setField(term6414, term6414.getClass(), "first", null);
        setField(term6414, term6414.getClass(), "last", null);
        setField(term6414, term6414.getClass(), "propListHead", null);
        setIntField(term6414, term6414.getClass(), "sourcePosition", 0);
        setField(term6414, term6414.getClass(), "jsType", null);
        setField(term6414, term6414.getClass(), "parent", null);
        setField(term6397, term6397.getClass(), "last", term6414);
        setField(term6397, term6397.getClass(), "propListHead", null);
        setIntField(term6397, term6397.getClass(), "sourcePosition", 0);
        setField(term6397, term6397.getClass(), "jsType", null);
        setField(term6397, term6397.getClass(), "parent", null);
        setField(term6396, term6396.getClass(), "parameters", term6397);
        setField(term6396, term6396.getClass(), "returnType", null);
        setBooleanField(term6396, term6396.getClass(), "returnTypeInferred", false);
        setBooleanField(term6396, term6396.getClass(), "resolved", false);
        setField(term6396, term6396.getClass(), "resolveResult", null);
        setField(term6396, term6396.getClass(), "registry", null);
        setField(term6395, term6395.getClass(), "call", term6396);
        setField(term6420, term6420.getClass(), "className", null);
        setField(term6420, term6420.getClass(), "properties", null);
        setBooleanField(term6420, term6420.getClass(), "nativeType", false);
        setField(term6420, term6420.getClass(), "implicitPrototypeFallback", null);
        setField(term6420, term6420.getClass(), "ownerFunction", null);
        setBooleanField(term6420, term6420.getClass(), "prettyPrint", false);
        setBooleanField(term6420, term6420.getClass(), "visited", false);
        setField(term6420, term6420.getClass(), "docInfo", null);
        setBooleanField(term6420, term6420.getClass(), "unknown", false);
        setBooleanField(term6420, term6420.getClass(), "resolved", false);
        setField(term6420, term6420.getClass(), "resolveResult", null);
        setField(term6420, term6420.getClass(), "registry", null);
        setField(term6395, term6395.getClass(), "prototype", term6420);
        setField(term6426, term6426.getClass(), "name", null);
        setField(term6426, term6426.getClass(), "type", null);
        setBooleanField(term6426, term6426.getClass(), "inferred", false);
        setField(term6395, term6395.getClass(), "prototypeSlot", term6426);
        setField(term6395, term6395.getClass(), "kind", enum90);
        setField(term6395, term6395.getClass(), "typeOfThis", null);
        setField(term6395, term6395.getClass(), "source", null);
        setField(term6395, term6395.getClass(), "implementedInterfaces", null);
        setField(term6395, term6395.getClass(), "extendedInterfaces", null);
        setField(term6395, term6395.getClass(), "subTypes", null);
        setField(term6395, term6395.getClass(), "templateTypeName", null);
        setField(term6395, term6395.getClass(), "className", null);
        setField(term6395, term6395.getClass(), "properties", null);
        setBooleanField(term6395, term6395.getClass(), "nativeType", false);
        setField(term6395, term6395.getClass(), "implicitPrototypeFallback", null);
        setField(term6395, term6395.getClass(), "ownerFunction", null);
        setBooleanField(term6395, term6395.getClass(), "prettyPrint", false);
        setBooleanField(term6395, term6395.getClass(), "visited", false);
        setField(term6395, term6395.getClass(), "docInfo", null);
        setBooleanField(term6395, term6395.getClass(), "unknown", false);
        setBooleanField(term6395, term6395.getClass(), "resolved", false);
        setField(term6395, term6395.getClass(), "resolveResult", null);
        setField(term6395, term6395.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "setPrototypeBasedOn", argTypes, term6395, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


