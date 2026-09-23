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

public class FunctionType_isPropertyTypeInferred_64361076982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11390;

    public FunctionType_isPropertyTypeInferred_64361076982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term41378 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term41377 = ((Class) term41378).getDeclaredField((String) "ORDINARY");
        ((Field) term41377).setAccessible(true);
        Object enum107 = ((Field) term41377).get((Object) null);
        term11390 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term11391 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term11392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11405 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11415 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11421 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term11392, term11392.getClass(), "type", 339372704);
        setIntField(term11394, term11394.getClass(), "type", -2003192918);
        setIntField(term11396, term11396.getClass(), "type", 0);
        setField(term11396, term11396.getClass(), "next", null);
        setField(term11396, term11396.getClass(), "first", null);
        setField(term11396, term11396.getClass(), "last", null);
        setField(term11396, term11396.getClass(), "propListHead", null);
        setIntField(term11396, term11396.getClass(), "sourcePosition", 0);
        setField(term11396, term11396.getClass(), "jsType", null);
        setField(term11396, term11396.getClass(), "parent", null);
        setField(term11394, term11394.getClass(), "next", term11396);
        setIntField(term11399, term11399.getClass(), "type", 0);
        setField(term11399, term11399.getClass(), "next", null);
        setField(term11399, term11399.getClass(), "first", null);
        setField(term11399, term11399.getClass(), "last", null);
        setField(term11399, term11399.getClass(), "propListHead", null);
        setIntField(term11399, term11399.getClass(), "sourcePosition", 0);
        setField(term11399, term11399.getClass(), "jsType", null);
        setField(term11399, term11399.getClass(), "parent", null);
        setField(term11394, term11394.getClass(), "first", term11399);
        setIntField(term11402, term11402.getClass(), "type", 0);
        setField(term11402, term11402.getClass(), "next", null);
        setField(term11402, term11402.getClass(), "first", null);
        setField(term11402, term11402.getClass(), "last", null);
        setField(term11402, term11402.getClass(), "propListHead", null);
        setIntField(term11402, term11402.getClass(), "sourcePosition", 0);
        setField(term11402, term11402.getClass(), "jsType", null);
        setField(term11402, term11402.getClass(), "parent", null);
        setField(term11394, term11394.getClass(), "last", term11402);
        setField(term11405, term11405.getClass(), "next", null);
        setIntField(term11405, term11405.getClass(), "type", 0);
        setIntField(term11405, term11405.getClass(), "intValue", 0);
        setField(term11405, term11405.getClass(), "objectValue", null);
        setField(term11394, term11394.getClass(), "propListHead", term11405);
        setIntField(term11394, term11394.getClass(), "sourcePosition", -1362856620);
        setField(term11394, term11394.getClass(), "jsType", null);
        setField(term11394, term11394.getClass(), "parent", null);
        setField(term11392, term11392.getClass(), "next", term11394);
        setIntField(term11409, term11409.getClass(), "type", 0);
        setField(term11409, term11409.getClass(), "next", null);
        setField(term11409, term11409.getClass(), "first", null);
        setField(term11409, term11409.getClass(), "last", null);
        setField(term11409, term11409.getClass(), "propListHead", null);
        setIntField(term11409, term11409.getClass(), "sourcePosition", 0);
        setField(term11409, term11409.getClass(), "jsType", null);
        setField(term11409, term11409.getClass(), "parent", null);
        setField(term11392, term11392.getClass(), "first", term11409);
        setIntField(term11412, term11412.getClass(), "type", 0);
        setField(term11412, term11412.getClass(), "next", null);
        setField(term11412, term11412.getClass(), "first", null);
        setField(term11412, term11412.getClass(), "last", null);
        setField(term11412, term11412.getClass(), "propListHead", null);
        setIntField(term11412, term11412.getClass(), "sourcePosition", 0);
        setField(term11412, term11412.getClass(), "jsType", null);
        setField(term11412, term11412.getClass(), "parent", null);
        setField(term11392, term11392.getClass(), "last", term11412);
        setField(term11415, term11415.getClass(), "next", null);
        setIntField(term11415, term11415.getClass(), "type", 0);
        setIntField(term11415, term11415.getClass(), "intValue", 0);
        setField(term11415, term11415.getClass(), "objectValue", null);
        setField(term11392, term11392.getClass(), "propListHead", term11415);
        setIntField(term11392, term11392.getClass(), "sourcePosition", -1835839814);
        setField(term11392, term11392.getClass(), "jsType", null);
        setField(term11392, term11392.getClass(), "parent", null);
        setField(term11391, term11391.getClass(), "parameters", term11392);
        setField(term11391, term11391.getClass(), "returnType", null);
        setBooleanField(term11391, term11391.getClass(), "returnTypeInferred", false);
        setBooleanField(term11391, term11391.getClass(), "resolved", false);
        setField(term11391, term11391.getClass(), "resolveResult", null);
        setField(term11391, term11391.getClass(), "registry", null);
        setField(term11390, term11390.getClass(), "call", term11391);
        setField(term11421, term11421.getClass(), "ownerFunction", null);
        setField(term11421, term11421.getClass(), "className", null);
        setField(term11421, term11421.getClass(), "properties", null);
        setField(term11421, term11421.getClass(), "implicitPrototype", null);
        setBooleanField(term11421, term11421.getClass(), "nativeType", false);
        setBooleanField(term11421, term11421.getClass(), "prettyPrint", false);
        setBooleanField(term11421, term11421.getClass(), "visited", false);
        setField(term11421, term11421.getClass(), "docInfo", null);
        setBooleanField(term11421, term11421.getClass(), "unknown", false);
        setBooleanField(term11421, term11421.getClass(), "resolved", false);
        setField(term11421, term11421.getClass(), "resolveResult", null);
        setField(term11421, term11421.getClass(), "registry", null);
        setField(term11390, term11390.getClass(), "prototype", term11421);
        setField(term11390, term11390.getClass(), "kind", enum107);
        setField(term11390, term11390.getClass(), "typeOfThis", null);
        setField(term11390, term11390.getClass(), "source", null);
        setField(term11390, term11390.getClass(), "implementedInterfaces", null);
        setField(term11390, term11390.getClass(), "subTypes", null);
        setField(term11390, term11390.getClass(), "templateTypeName", null);
        setField(term11390, term11390.getClass(), "className", null);
        setField(term11390, term11390.getClass(), "properties", null);
        setField(term11390, term11390.getClass(), "implicitPrototype", null);
        setBooleanField(term11390, term11390.getClass(), "nativeType", false);
        setBooleanField(term11390, term11390.getClass(), "prettyPrint", false);
        setBooleanField(term11390, term11390.getClass(), "visited", false);
        setField(term11390, term11390.getClass(), "docInfo", null);
        setBooleanField(term11390, term11390.getClass(), "unknown", false);
        setBooleanField(term11390, term11390.getClass(), "resolved", false);
        setField(term11390, term11390.getClass(), "resolveResult", null);
        setField(term11390, term11390.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZfdXfCCFDf";
        try {
            callMethod(klass, "isPropertyTypeInferred", argTypes, term11390, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


