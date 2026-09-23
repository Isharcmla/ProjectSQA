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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class FunctionType_getTopMostDefiningType_1569120663100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13139;

    public FunctionType_getTopMostDefiningType_1569120663100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term47744 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term47743 = ((Class) term47744).getDeclaredField((String) "ORDINARY");
        ((Field) term47743).setAccessible(true);
        Object enum120 = ((Field) term47743).get((Object) null);
        term13139 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term13140 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term13141 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13164 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term13170 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        setIntField(term13141, term13141.getClass(), "type", 1094107751);
        setIntField(term13143, term13143.getClass(), "type", 719656595);
        setIntField(term13145, term13145.getClass(), "type", 0);
        setField(term13145, term13145.getClass(), "next", null);
        setField(term13145, term13145.getClass(), "first", null);
        setField(term13145, term13145.getClass(), "last", null);
        setField(term13145, term13145.getClass(), "propListHead", null);
        setIntField(term13145, term13145.getClass(), "sourcePosition", 0);
        setField(term13145, term13145.getClass(), "jsType", null);
        setField(term13145, term13145.getClass(), "parent", null);
        setField(term13143, term13143.getClass(), "next", term13145);
        setIntField(term13148, term13148.getClass(), "type", 0);
        setField(term13148, term13148.getClass(), "next", null);
        setField(term13148, term13148.getClass(), "first", null);
        setField(term13148, term13148.getClass(), "last", null);
        setField(term13148, term13148.getClass(), "propListHead", null);
        setIntField(term13148, term13148.getClass(), "sourcePosition", 0);
        setField(term13148, term13148.getClass(), "jsType", null);
        setField(term13148, term13148.getClass(), "parent", null);
        setField(term13143, term13143.getClass(), "first", term13148);
        setIntField(term13151, term13151.getClass(), "type", 0);
        setField(term13151, term13151.getClass(), "next", null);
        setField(term13151, term13151.getClass(), "first", null);
        setField(term13151, term13151.getClass(), "last", null);
        setField(term13151, term13151.getClass(), "propListHead", null);
        setIntField(term13151, term13151.getClass(), "sourcePosition", 0);
        setField(term13151, term13151.getClass(), "jsType", null);
        setField(term13151, term13151.getClass(), "parent", null);
        setField(term13143, term13143.getClass(), "last", term13151);
        setField(term13143, term13143.getClass(), "propListHead", null);
        setIntField(term13143, term13143.getClass(), "sourcePosition", 0);
        setField(term13143, term13143.getClass(), "jsType", null);
        setField(term13143, term13143.getClass(), "parent", null);
        setField(term13141, term13141.getClass(), "next", term13143);
        setIntField(term13155, term13155.getClass(), "type", 0);
        setField(term13155, term13155.getClass(), "next", null);
        setField(term13155, term13155.getClass(), "first", null);
        setField(term13155, term13155.getClass(), "last", null);
        setField(term13155, term13155.getClass(), "propListHead", null);
        setIntField(term13155, term13155.getClass(), "sourcePosition", 0);
        setField(term13155, term13155.getClass(), "jsType", null);
        setField(term13155, term13155.getClass(), "parent", null);
        setField(term13141, term13141.getClass(), "first", term13155);
        setIntField(term13158, term13158.getClass(), "type", 0);
        setField(term13158, term13158.getClass(), "next", null);
        setField(term13158, term13158.getClass(), "first", null);
        setField(term13158, term13158.getClass(), "last", null);
        setField(term13158, term13158.getClass(), "propListHead", null);
        setIntField(term13158, term13158.getClass(), "sourcePosition", 0);
        setField(term13158, term13158.getClass(), "jsType", null);
        setField(term13158, term13158.getClass(), "parent", null);
        setField(term13141, term13141.getClass(), "last", term13158);
        setField(term13141, term13141.getClass(), "propListHead", null);
        setIntField(term13141, term13141.getClass(), "sourcePosition", 0);
        setField(term13141, term13141.getClass(), "jsType", null);
        setField(term13141, term13141.getClass(), "parent", null);
        setField(term13140, term13140.getClass(), "parameters", term13141);
        setField(term13140, term13140.getClass(), "returnType", null);
        setBooleanField(term13140, term13140.getClass(), "returnTypeInferred", false);
        setBooleanField(term13140, term13140.getClass(), "resolved", false);
        setField(term13140, term13140.getClass(), "resolveResult", null);
        setField(term13140, term13140.getClass(), "registry", null);
        setField(term13139, term13139.getClass(), "call", term13140);
        setField(term13164, term13164.getClass(), "className", null);
        setField(term13164, term13164.getClass(), "properties", null);
        setBooleanField(term13164, term13164.getClass(), "nativeType", false);
        setField(term13164, term13164.getClass(), "implicitPrototypeFallback", null);
        setField(term13164, term13164.getClass(), "ownerFunction", null);
        setBooleanField(term13164, term13164.getClass(), "prettyPrint", false);
        setBooleanField(term13164, term13164.getClass(), "visited", false);
        setField(term13164, term13164.getClass(), "docInfo", null);
        setBooleanField(term13164, term13164.getClass(), "unknown", false);
        setBooleanField(term13164, term13164.getClass(), "resolved", false);
        setField(term13164, term13164.getClass(), "resolveResult", null);
        setField(term13164, term13164.getClass(), "registry", null);
        setField(term13139, term13139.getClass(), "prototype", term13164);
        setField(term13170, term13170.getClass(), "name", null);
        setField(term13170, term13170.getClass(), "type", null);
        setBooleanField(term13170, term13170.getClass(), "inferred", false);
        setField(term13139, term13139.getClass(), "prototypeSlot", term13170);
        setField(term13139, term13139.getClass(), "kind", enum120);
        setField(term13139, term13139.getClass(), "typeOfThis", null);
        setField(term13139, term13139.getClass(), "source", null);
        setField(term13139, term13139.getClass(), "implementedInterfaces", null);
        setField(term13139, term13139.getClass(), "extendedInterfaces", null);
        setField(term13139, term13139.getClass(), "subTypes", null);
        setField(term13139, term13139.getClass(), "templateTypeName", null);
        setField(term13139, term13139.getClass(), "className", null);
        setField(term13139, term13139.getClass(), "properties", null);
        setBooleanField(term13139, term13139.getClass(), "nativeType", false);
        setField(term13139, term13139.getClass(), "implicitPrototypeFallback", null);
        setField(term13139, term13139.getClass(), "ownerFunction", null);
        setBooleanField(term13139, term13139.getClass(), "prettyPrint", false);
        setBooleanField(term13139, term13139.getClass(), "visited", false);
        setField(term13139, term13139.getClass(), "docInfo", null);
        setBooleanField(term13139, term13139.getClass(), "unknown", false);
        setBooleanField(term13139, term13139.getClass(), "resolved", false);
        setField(term13139, term13139.getClass(), "resolveResult", null);
        setField(term13139, term13139.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HWkpTmtlrc";
        try {
            callMethod(klass, "getTopMostDefiningType", argTypes, term13139, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


