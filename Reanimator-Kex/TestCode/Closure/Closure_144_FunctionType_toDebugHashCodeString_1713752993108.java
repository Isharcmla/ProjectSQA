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

public class FunctionType_toDebugHashCodeString_1713752993108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21317;

    public FunctionType_toDebugHashCodeString_1713752993108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term60784 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term60783 = ((Class) term60784).getDeclaredField((String) "ORDINARY");
        ((Field) term60783).setAccessible(true);
        Object enum156 = ((Field) term60783).get((Object) null);
        term21317 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term21318 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term21319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21332 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term21336 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21342 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term21348 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term21319, term21319.getClass(), "type", 520504102);
        setIntField(term21321, term21321.getClass(), "type", 1895143076);
        setIntField(term21323, term21323.getClass(), "type", 0);
        setField(term21323, term21323.getClass(), "next", null);
        setField(term21323, term21323.getClass(), "first", null);
        setField(term21323, term21323.getClass(), "last", null);
        setField(term21323, term21323.getClass(), "propListHead", null);
        setIntField(term21323, term21323.getClass(), "sourcePosition", 0);
        setField(term21323, term21323.getClass(), "jsType", null);
        setField(term21323, term21323.getClass(), "parent", null);
        setField(term21321, term21321.getClass(), "next", term21323);
        setIntField(term21326, term21326.getClass(), "type", 0);
        setField(term21326, term21326.getClass(), "next", null);
        setField(term21326, term21326.getClass(), "first", null);
        setField(term21326, term21326.getClass(), "last", null);
        setField(term21326, term21326.getClass(), "propListHead", null);
        setIntField(term21326, term21326.getClass(), "sourcePosition", 0);
        setField(term21326, term21326.getClass(), "jsType", null);
        setField(term21326, term21326.getClass(), "parent", null);
        setField(term21321, term21321.getClass(), "first", term21326);
        setIntField(term21329, term21329.getClass(), "type", 0);
        setField(term21329, term21329.getClass(), "next", null);
        setField(term21329, term21329.getClass(), "first", null);
        setField(term21329, term21329.getClass(), "last", null);
        setField(term21329, term21329.getClass(), "propListHead", null);
        setIntField(term21329, term21329.getClass(), "sourcePosition", 0);
        setField(term21329, term21329.getClass(), "jsType", null);
        setField(term21329, term21329.getClass(), "parent", null);
        setField(term21321, term21321.getClass(), "last", term21329);
        setField(term21332, term21332.getClass(), "next", null);
        setIntField(term21332, term21332.getClass(), "type", 0);
        setIntField(term21332, term21332.getClass(), "intValue", 0);
        setField(term21332, term21332.getClass(), "objectValue", null);
        setField(term21321, term21321.getClass(), "propListHead", term21332);
        setIntField(term21321, term21321.getClass(), "sourcePosition", 1981860404);
        setField(term21321, term21321.getClass(), "jsType", null);
        setField(term21321, term21321.getClass(), "parent", null);
        setField(term21319, term21319.getClass(), "next", term21321);
        setIntField(term21336, term21336.getClass(), "type", 0);
        setField(term21336, term21336.getClass(), "next", null);
        setField(term21336, term21336.getClass(), "first", null);
        setField(term21336, term21336.getClass(), "last", null);
        setField(term21336, term21336.getClass(), "propListHead", null);
        setIntField(term21336, term21336.getClass(), "sourcePosition", 0);
        setField(term21336, term21336.getClass(), "jsType", null);
        setField(term21336, term21336.getClass(), "parent", null);
        setField(term21319, term21319.getClass(), "first", term21336);
        setIntField(term21339, term21339.getClass(), "type", 0);
        setField(term21339, term21339.getClass(), "next", null);
        setField(term21339, term21339.getClass(), "first", null);
        setField(term21339, term21339.getClass(), "last", null);
        setField(term21339, term21339.getClass(), "propListHead", null);
        setIntField(term21339, term21339.getClass(), "sourcePosition", 0);
        setField(term21339, term21339.getClass(), "jsType", null);
        setField(term21339, term21339.getClass(), "parent", null);
        setField(term21319, term21319.getClass(), "last", term21339);
        setField(term21342, term21342.getClass(), "next", null);
        setIntField(term21342, term21342.getClass(), "type", 0);
        setIntField(term21342, term21342.getClass(), "intValue", 0);
        setField(term21342, term21342.getClass(), "objectValue", null);
        setField(term21319, term21319.getClass(), "propListHead", term21342);
        setIntField(term21319, term21319.getClass(), "sourcePosition", 732174235);
        setField(term21319, term21319.getClass(), "jsType", null);
        setField(term21319, term21319.getClass(), "parent", null);
        setField(term21318, term21318.getClass(), "parameters", term21319);
        setField(term21318, term21318.getClass(), "returnType", null);
        setBooleanField(term21318, term21318.getClass(), "returnTypeInferred", false);
        setBooleanField(term21318, term21318.getClass(), "resolved", false);
        setField(term21318, term21318.getClass(), "resolveResult", null);
        setField(term21318, term21318.getClass(), "registry", null);
        setField(term21317, term21317.getClass(), "call", term21318);
        setField(term21348, term21348.getClass(), "ownerFunction", null);
        setField(term21348, term21348.getClass(), "className", null);
        setField(term21348, term21348.getClass(), "properties", null);
        setField(term21348, term21348.getClass(), "implicitPrototype", null);
        setBooleanField(term21348, term21348.getClass(), "nativeType", false);
        setBooleanField(term21348, term21348.getClass(), "prettyPrint", false);
        setBooleanField(term21348, term21348.getClass(), "visited", false);
        setField(term21348, term21348.getClass(), "docInfo", null);
        setBooleanField(term21348, term21348.getClass(), "unknown", false);
        setBooleanField(term21348, term21348.getClass(), "resolved", false);
        setField(term21348, term21348.getClass(), "resolveResult", null);
        setField(term21348, term21348.getClass(), "registry", null);
        setField(term21317, term21317.getClass(), "prototype", term21348);
        setField(term21317, term21317.getClass(), "kind", enum156);
        setField(term21317, term21317.getClass(), "typeOfThis", null);
        setField(term21317, term21317.getClass(), "source", null);
        setField(term21317, term21317.getClass(), "implementedInterfaces", null);
        setField(term21317, term21317.getClass(), "subTypes", null);
        setField(term21317, term21317.getClass(), "templateTypeName", null);
        setField(term21317, term21317.getClass(), "className", null);
        setField(term21317, term21317.getClass(), "properties", null);
        setField(term21317, term21317.getClass(), "implicitPrototype", null);
        setBooleanField(term21317, term21317.getClass(), "nativeType", false);
        setBooleanField(term21317, term21317.getClass(), "prettyPrint", false);
        setBooleanField(term21317, term21317.getClass(), "visited", false);
        setField(term21317, term21317.getClass(), "docInfo", null);
        setBooleanField(term21317, term21317.getClass(), "unknown", false);
        setBooleanField(term21317, term21317.getClass(), "resolved", false);
        setField(term21317, term21317.getClass(), "resolveResult", null);
        setField(term21317, term21317.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toDebugHashCodeString", argTypes, term21317, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


