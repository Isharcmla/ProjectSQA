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

public class FunctionType_visit_187068537796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16399;

    public FunctionType_visit_187068537796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term51324 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term51323 = ((Class) term51324).getDeclaredField((String) "INTERFACE");
        ((Field) term51323).setAccessible(true);
        Object enum128 = ((Field) term51323).get((Object) null);
        term16399 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term16400 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term16401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16414 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term16418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16421 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16424 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term16430 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term16401, term16401.getClass(), "type", 934477462);
        setIntField(term16403, term16403.getClass(), "type", 812570053);
        setIntField(term16405, term16405.getClass(), "type", 0);
        setField(term16405, term16405.getClass(), "next", null);
        setField(term16405, term16405.getClass(), "first", null);
        setField(term16405, term16405.getClass(), "last", null);
        setField(term16405, term16405.getClass(), "propListHead", null);
        setIntField(term16405, term16405.getClass(), "sourcePosition", 0);
        setField(term16405, term16405.getClass(), "jsType", null);
        setField(term16405, term16405.getClass(), "parent", null);
        setField(term16403, term16403.getClass(), "next", term16405);
        setIntField(term16408, term16408.getClass(), "type", 0);
        setField(term16408, term16408.getClass(), "next", null);
        setField(term16408, term16408.getClass(), "first", null);
        setField(term16408, term16408.getClass(), "last", null);
        setField(term16408, term16408.getClass(), "propListHead", null);
        setIntField(term16408, term16408.getClass(), "sourcePosition", 0);
        setField(term16408, term16408.getClass(), "jsType", null);
        setField(term16408, term16408.getClass(), "parent", null);
        setField(term16403, term16403.getClass(), "first", term16408);
        setIntField(term16411, term16411.getClass(), "type", 0);
        setField(term16411, term16411.getClass(), "next", null);
        setField(term16411, term16411.getClass(), "first", null);
        setField(term16411, term16411.getClass(), "last", null);
        setField(term16411, term16411.getClass(), "propListHead", null);
        setIntField(term16411, term16411.getClass(), "sourcePosition", 0);
        setField(term16411, term16411.getClass(), "jsType", null);
        setField(term16411, term16411.getClass(), "parent", null);
        setField(term16403, term16403.getClass(), "last", term16411);
        setField(term16414, term16414.getClass(), "next", null);
        setIntField(term16414, term16414.getClass(), "type", 0);
        setIntField(term16414, term16414.getClass(), "intValue", 0);
        setField(term16414, term16414.getClass(), "objectValue", null);
        setField(term16403, term16403.getClass(), "propListHead", term16414);
        setIntField(term16403, term16403.getClass(), "sourcePosition", -1488938905);
        setField(term16403, term16403.getClass(), "jsType", null);
        setField(term16403, term16403.getClass(), "parent", null);
        setField(term16401, term16401.getClass(), "next", term16403);
        setIntField(term16418, term16418.getClass(), "type", 0);
        setField(term16418, term16418.getClass(), "next", null);
        setField(term16418, term16418.getClass(), "first", null);
        setField(term16418, term16418.getClass(), "last", null);
        setField(term16418, term16418.getClass(), "propListHead", null);
        setIntField(term16418, term16418.getClass(), "sourcePosition", 0);
        setField(term16418, term16418.getClass(), "jsType", null);
        setField(term16418, term16418.getClass(), "parent", null);
        setField(term16401, term16401.getClass(), "first", term16418);
        setIntField(term16421, term16421.getClass(), "type", 0);
        setField(term16421, term16421.getClass(), "next", null);
        setField(term16421, term16421.getClass(), "first", null);
        setField(term16421, term16421.getClass(), "last", null);
        setField(term16421, term16421.getClass(), "propListHead", null);
        setIntField(term16421, term16421.getClass(), "sourcePosition", 0);
        setField(term16421, term16421.getClass(), "jsType", null);
        setField(term16421, term16421.getClass(), "parent", null);
        setField(term16401, term16401.getClass(), "last", term16421);
        setField(term16424, term16424.getClass(), "next", null);
        setIntField(term16424, term16424.getClass(), "type", 0);
        setIntField(term16424, term16424.getClass(), "intValue", 0);
        setField(term16424, term16424.getClass(), "objectValue", null);
        setField(term16401, term16401.getClass(), "propListHead", term16424);
        setIntField(term16401, term16401.getClass(), "sourcePosition", 1916544127);
        setField(term16401, term16401.getClass(), "jsType", null);
        setField(term16401, term16401.getClass(), "parent", null);
        setField(term16400, term16400.getClass(), "parameters", term16401);
        setField(term16400, term16400.getClass(), "returnType", null);
        setBooleanField(term16400, term16400.getClass(), "returnTypeInferred", false);
        setBooleanField(term16400, term16400.getClass(), "resolved", false);
        setField(term16400, term16400.getClass(), "resolveResult", null);
        setField(term16400, term16400.getClass(), "registry", null);
        setField(term16399, term16399.getClass(), "call", term16400);
        setField(term16430, term16430.getClass(), "ownerFunction", null);
        setField(term16430, term16430.getClass(), "className", null);
        setField(term16430, term16430.getClass(), "properties", null);
        setBooleanField(term16430, term16430.getClass(), "nativeType", false);
        setField(term16430, term16430.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term16430, term16430.getClass(), "prettyPrint", false);
        setBooleanField(term16430, term16430.getClass(), "visited", false);
        setField(term16430, term16430.getClass(), "docInfo", null);
        setBooleanField(term16430, term16430.getClass(), "unknown", false);
        setBooleanField(term16430, term16430.getClass(), "resolved", false);
        setField(term16430, term16430.getClass(), "resolveResult", null);
        setField(term16430, term16430.getClass(), "registry", null);
        setField(term16399, term16399.getClass(), "prototype", term16430);
        setField(term16399, term16399.getClass(), "kind", enum128);
        setField(term16399, term16399.getClass(), "typeOfThis", null);
        setField(term16399, term16399.getClass(), "source", null);
        setField(term16399, term16399.getClass(), "implementedInterfaces", null);
        setField(term16399, term16399.getClass(), "subTypes", null);
        setField(term16399, term16399.getClass(), "templateTypeName", null);
        setField(term16399, term16399.getClass(), "className", null);
        setField(term16399, term16399.getClass(), "properties", null);
        setBooleanField(term16399, term16399.getClass(), "nativeType", false);
        setField(term16399, term16399.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term16399, term16399.getClass(), "prettyPrint", false);
        setBooleanField(term16399, term16399.getClass(), "visited", false);
        setField(term16399, term16399.getClass(), "docInfo", null);
        setBooleanField(term16399, term16399.getClass(), "unknown", false);
        setBooleanField(term16399, term16399.getClass(), "resolved", false);
        setField(term16399, term16399.getClass(), "resolveResult", null);
        setField(term16399, term16399.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "visit", argTypes, term16399, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


