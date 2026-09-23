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

public class FunctionType_getPropertyType_121783819474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9868;

    public FunctionType_getPropertyType_121783819474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37105 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term37104 = ((Class) term37105).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term37104).setAccessible(true);
        Object enum93 = ((Field) term37104).get((Object) null);
        term9868 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term9869 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term9870 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9874 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9883 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9893 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9898 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term9870, term9870.getClass(), "type", 278355793);
        setIntField(term9872, term9872.getClass(), "type", 993388358);
        setIntField(term9874, term9874.getClass(), "type", 0);
        setField(term9874, term9874.getClass(), "next", null);
        setField(term9874, term9874.getClass(), "first", null);
        setField(term9874, term9874.getClass(), "last", null);
        setField(term9874, term9874.getClass(), "propListHead", null);
        setIntField(term9874, term9874.getClass(), "sourcePosition", 0);
        setField(term9874, term9874.getClass(), "jsType", null);
        setField(term9874, term9874.getClass(), "parent", null);
        setField(term9872, term9872.getClass(), "next", term9874);
        setIntField(term9877, term9877.getClass(), "type", 0);
        setField(term9877, term9877.getClass(), "next", null);
        setField(term9877, term9877.getClass(), "first", null);
        setField(term9877, term9877.getClass(), "last", null);
        setField(term9877, term9877.getClass(), "propListHead", null);
        setIntField(term9877, term9877.getClass(), "sourcePosition", 0);
        setField(term9877, term9877.getClass(), "jsType", null);
        setField(term9877, term9877.getClass(), "parent", null);
        setField(term9872, term9872.getClass(), "first", term9877);
        setIntField(term9880, term9880.getClass(), "type", 0);
        setField(term9880, term9880.getClass(), "next", null);
        setField(term9880, term9880.getClass(), "first", null);
        setField(term9880, term9880.getClass(), "last", null);
        setField(term9880, term9880.getClass(), "propListHead", null);
        setIntField(term9880, term9880.getClass(), "sourcePosition", 0);
        setField(term9880, term9880.getClass(), "jsType", null);
        setField(term9880, term9880.getClass(), "parent", null);
        setField(term9872, term9872.getClass(), "last", term9880);
        setField(term9883, term9883.getClass(), "next", null);
        setIntField(term9883, term9883.getClass(), "type", 0);
        setIntField(term9883, term9883.getClass(), "intValue", 0);
        setField(term9883, term9883.getClass(), "objectValue", null);
        setField(term9872, term9872.getClass(), "propListHead", term9883);
        setIntField(term9872, term9872.getClass(), "sourcePosition", -765191335);
        setField(term9872, term9872.getClass(), "jsType", null);
        setField(term9872, term9872.getClass(), "parent", null);
        setField(term9870, term9870.getClass(), "next", term9872);
        setIntField(term9887, term9887.getClass(), "type", 0);
        setField(term9887, term9887.getClass(), "next", null);
        setField(term9887, term9887.getClass(), "first", null);
        setField(term9887, term9887.getClass(), "last", null);
        setField(term9887, term9887.getClass(), "propListHead", null);
        setIntField(term9887, term9887.getClass(), "sourcePosition", 0);
        setField(term9887, term9887.getClass(), "jsType", null);
        setField(term9887, term9887.getClass(), "parent", null);
        setField(term9870, term9870.getClass(), "first", term9887);
        setIntField(term9890, term9890.getClass(), "type", 0);
        setField(term9890, term9890.getClass(), "next", null);
        setField(term9890, term9890.getClass(), "first", null);
        setField(term9890, term9890.getClass(), "last", null);
        setField(term9890, term9890.getClass(), "propListHead", null);
        setIntField(term9890, term9890.getClass(), "sourcePosition", 0);
        setField(term9890, term9890.getClass(), "jsType", null);
        setField(term9890, term9890.getClass(), "parent", null);
        setField(term9870, term9870.getClass(), "last", term9890);
        setField(term9893, term9893.getClass(), "next", null);
        setIntField(term9893, term9893.getClass(), "type", 0);
        setIntField(term9893, term9893.getClass(), "intValue", 0);
        setField(term9893, term9893.getClass(), "objectValue", null);
        setField(term9870, term9870.getClass(), "propListHead", term9893);
        setIntField(term9870, term9870.getClass(), "sourcePosition", -1697741155);
        setField(term9870, term9870.getClass(), "jsType", null);
        setField(term9870, term9870.getClass(), "parent", null);
        setField(term9869, term9869.getClass(), "parameters", term9870);
        setField(term9869, term9869.getClass(), "returnType", null);
        setBooleanField(term9869, term9869.getClass(), "resolved", false);
        setField(term9869, term9869.getClass(), "resolveResult", null);
        setField(term9869, term9869.getClass(), "registry", null);
        setField(term9868, term9868.getClass(), "call", term9869);
        setField(term9898, term9898.getClass(), "ownerFunction", null);
        setField(term9898, term9898.getClass(), "className", null);
        setField(term9898, term9898.getClass(), "properties", null);
        setField(term9898, term9898.getClass(), "implicitPrototype", null);
        setBooleanField(term9898, term9898.getClass(), "nativeType", false);
        setBooleanField(term9898, term9898.getClass(), "visited", false);
        setField(term9898, term9898.getClass(), "docInfo", null);
        setBooleanField(term9898, term9898.getClass(), "unknown", false);
        setBooleanField(term9898, term9898.getClass(), "resolved", false);
        setField(term9898, term9898.getClass(), "resolveResult", null);
        setField(term9898, term9898.getClass(), "registry", null);
        setField(term9868, term9868.getClass(), "prototype", term9898);
        setField(term9868, term9868.getClass(), "kind", enum93);
        setField(term9868, term9868.getClass(), "typeOfThis", null);
        setField(term9868, term9868.getClass(), "source", null);
        setField(term9868, term9868.getClass(), "implementedInterfaces", null);
        setField(term9868, term9868.getClass(), "subTypes", null);
        setField(term9868, term9868.getClass(), "templateTypeName", null);
        setField(term9868, term9868.getClass(), "className", null);
        setField(term9868, term9868.getClass(), "properties", null);
        setField(term9868, term9868.getClass(), "implicitPrototype", null);
        setBooleanField(term9868, term9868.getClass(), "nativeType", false);
        setBooleanField(term9868, term9868.getClass(), "visited", false);
        setField(term9868, term9868.getClass(), "docInfo", null);
        setBooleanField(term9868, term9868.getClass(), "unknown", false);
        setBooleanField(term9868, term9868.getClass(), "resolved", false);
        setField(term9868, term9868.getClass(), "resolveResult", null);
        setField(term9868, term9868.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SIODFGaQhr";
        try {
            callMethod(klass, "getPropertyType", argTypes, term9868, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


