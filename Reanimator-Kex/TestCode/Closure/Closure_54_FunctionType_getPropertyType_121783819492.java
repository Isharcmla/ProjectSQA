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

public class FunctionType_getPropertyType_121783819492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10262;

    public FunctionType_getPropertyType_121783819492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term41949 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term41948 = ((Class) term41949).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term41948).setAccessible(true);
        Object enum108 = ((Field) term41948).get((Object) null);
        term10262 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term10263 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term10264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10287 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term10293 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        setIntField(term10264, term10264.getClass(), "type", 1870727665);
        setIntField(term10266, term10266.getClass(), "type", -919416536);
        setIntField(term10268, term10268.getClass(), "type", 0);
        setField(term10268, term10268.getClass(), "next", null);
        setField(term10268, term10268.getClass(), "first", null);
        setField(term10268, term10268.getClass(), "last", null);
        setField(term10268, term10268.getClass(), "propListHead", null);
        setIntField(term10268, term10268.getClass(), "sourcePosition", 0);
        setField(term10268, term10268.getClass(), "jsType", null);
        setField(term10268, term10268.getClass(), "parent", null);
        setField(term10266, term10266.getClass(), "next", term10268);
        setIntField(term10271, term10271.getClass(), "type", 0);
        setField(term10271, term10271.getClass(), "next", null);
        setField(term10271, term10271.getClass(), "first", null);
        setField(term10271, term10271.getClass(), "last", null);
        setField(term10271, term10271.getClass(), "propListHead", null);
        setIntField(term10271, term10271.getClass(), "sourcePosition", 0);
        setField(term10271, term10271.getClass(), "jsType", null);
        setField(term10271, term10271.getClass(), "parent", null);
        setField(term10266, term10266.getClass(), "first", term10271);
        setIntField(term10274, term10274.getClass(), "type", 0);
        setField(term10274, term10274.getClass(), "next", null);
        setField(term10274, term10274.getClass(), "first", null);
        setField(term10274, term10274.getClass(), "last", null);
        setField(term10274, term10274.getClass(), "propListHead", null);
        setIntField(term10274, term10274.getClass(), "sourcePosition", 0);
        setField(term10274, term10274.getClass(), "jsType", null);
        setField(term10274, term10274.getClass(), "parent", null);
        setField(term10266, term10266.getClass(), "last", term10274);
        setField(term10266, term10266.getClass(), "propListHead", null);
        setIntField(term10266, term10266.getClass(), "sourcePosition", 0);
        setField(term10266, term10266.getClass(), "jsType", null);
        setField(term10266, term10266.getClass(), "parent", null);
        setField(term10264, term10264.getClass(), "next", term10266);
        setIntField(term10278, term10278.getClass(), "type", 0);
        setField(term10278, term10278.getClass(), "next", null);
        setField(term10278, term10278.getClass(), "first", null);
        setField(term10278, term10278.getClass(), "last", null);
        setField(term10278, term10278.getClass(), "propListHead", null);
        setIntField(term10278, term10278.getClass(), "sourcePosition", 0);
        setField(term10278, term10278.getClass(), "jsType", null);
        setField(term10278, term10278.getClass(), "parent", null);
        setField(term10264, term10264.getClass(), "first", term10278);
        setIntField(term10281, term10281.getClass(), "type", 0);
        setField(term10281, term10281.getClass(), "next", null);
        setField(term10281, term10281.getClass(), "first", null);
        setField(term10281, term10281.getClass(), "last", null);
        setField(term10281, term10281.getClass(), "propListHead", null);
        setIntField(term10281, term10281.getClass(), "sourcePosition", 0);
        setField(term10281, term10281.getClass(), "jsType", null);
        setField(term10281, term10281.getClass(), "parent", null);
        setField(term10264, term10264.getClass(), "last", term10281);
        setField(term10264, term10264.getClass(), "propListHead", null);
        setIntField(term10264, term10264.getClass(), "sourcePosition", 0);
        setField(term10264, term10264.getClass(), "jsType", null);
        setField(term10264, term10264.getClass(), "parent", null);
        setField(term10263, term10263.getClass(), "parameters", term10264);
        setField(term10263, term10263.getClass(), "returnType", null);
        setBooleanField(term10263, term10263.getClass(), "returnTypeInferred", false);
        setBooleanField(term10263, term10263.getClass(), "resolved", false);
        setField(term10263, term10263.getClass(), "resolveResult", null);
        setField(term10263, term10263.getClass(), "registry", null);
        setField(term10262, term10262.getClass(), "call", term10263);
        setField(term10287, term10287.getClass(), "className", null);
        setField(term10287, term10287.getClass(), "properties", null);
        setBooleanField(term10287, term10287.getClass(), "nativeType", false);
        setField(term10287, term10287.getClass(), "implicitPrototypeFallback", null);
        setField(term10287, term10287.getClass(), "ownerFunction", null);
        setBooleanField(term10287, term10287.getClass(), "prettyPrint", false);
        setBooleanField(term10287, term10287.getClass(), "visited", false);
        setField(term10287, term10287.getClass(), "docInfo", null);
        setBooleanField(term10287, term10287.getClass(), "unknown", false);
        setBooleanField(term10287, term10287.getClass(), "resolved", false);
        setField(term10287, term10287.getClass(), "resolveResult", null);
        setField(term10287, term10287.getClass(), "registry", null);
        setField(term10262, term10262.getClass(), "prototype", term10287);
        setField(term10293, term10293.getClass(), "name", null);
        setField(term10293, term10293.getClass(), "type", null);
        setBooleanField(term10293, term10293.getClass(), "inferred", false);
        setField(term10262, term10262.getClass(), "prototypeSlot", term10293);
        setField(term10262, term10262.getClass(), "kind", enum108);
        setField(term10262, term10262.getClass(), "typeOfThis", null);
        setField(term10262, term10262.getClass(), "source", null);
        setField(term10262, term10262.getClass(), "implementedInterfaces", null);
        setField(term10262, term10262.getClass(), "extendedInterfaces", null);
        setField(term10262, term10262.getClass(), "subTypes", null);
        setField(term10262, term10262.getClass(), "templateTypeName", null);
        setField(term10262, term10262.getClass(), "className", null);
        setField(term10262, term10262.getClass(), "properties", null);
        setBooleanField(term10262, term10262.getClass(), "nativeType", false);
        setField(term10262, term10262.getClass(), "implicitPrototypeFallback", null);
        setField(term10262, term10262.getClass(), "ownerFunction", null);
        setBooleanField(term10262, term10262.getClass(), "prettyPrint", false);
        setBooleanField(term10262, term10262.getClass(), "visited", false);
        setField(term10262, term10262.getClass(), "docInfo", null);
        setBooleanField(term10262, term10262.getClass(), "unknown", false);
        setBooleanField(term10262, term10262.getClass(), "resolved", false);
        setField(term10262, term10262.getClass(), "resolveResult", null);
        setField(term10262, term10262.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aNWLJdrZMq";
        try {
            callMethod(klass, "getPropertyType", argTypes, term10262, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


