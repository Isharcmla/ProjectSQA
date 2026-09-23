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

public class FunctionType_getTypeOfThis_433401205100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18125;

    public FunctionType_getTypeOfThis_433401205100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term54348 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term54347 = ((Class) term54348).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term54347).setAccessible(true);
        Object enum138 = ((Field) term54347).get((Object) null);
        term18125 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term18126 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term18127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18140 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term18144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18150 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term18156 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term18127, term18127.getClass(), "type", 1964967720);
        setIntField(term18129, term18129.getClass(), "type", 21031843);
        setIntField(term18131, term18131.getClass(), "type", 0);
        setField(term18131, term18131.getClass(), "next", null);
        setField(term18131, term18131.getClass(), "first", null);
        setField(term18131, term18131.getClass(), "last", null);
        setField(term18131, term18131.getClass(), "propListHead", null);
        setIntField(term18131, term18131.getClass(), "sourcePosition", 0);
        setField(term18131, term18131.getClass(), "jsType", null);
        setField(term18131, term18131.getClass(), "parent", null);
        setField(term18129, term18129.getClass(), "next", term18131);
        setIntField(term18134, term18134.getClass(), "type", 0);
        setField(term18134, term18134.getClass(), "next", null);
        setField(term18134, term18134.getClass(), "first", null);
        setField(term18134, term18134.getClass(), "last", null);
        setField(term18134, term18134.getClass(), "propListHead", null);
        setIntField(term18134, term18134.getClass(), "sourcePosition", 0);
        setField(term18134, term18134.getClass(), "jsType", null);
        setField(term18134, term18134.getClass(), "parent", null);
        setField(term18129, term18129.getClass(), "first", term18134);
        setIntField(term18137, term18137.getClass(), "type", 0);
        setField(term18137, term18137.getClass(), "next", null);
        setField(term18137, term18137.getClass(), "first", null);
        setField(term18137, term18137.getClass(), "last", null);
        setField(term18137, term18137.getClass(), "propListHead", null);
        setIntField(term18137, term18137.getClass(), "sourcePosition", 0);
        setField(term18137, term18137.getClass(), "jsType", null);
        setField(term18137, term18137.getClass(), "parent", null);
        setField(term18129, term18129.getClass(), "last", term18137);
        setField(term18140, term18140.getClass(), "next", null);
        setIntField(term18140, term18140.getClass(), "type", 0);
        setIntField(term18140, term18140.getClass(), "intValue", 0);
        setField(term18140, term18140.getClass(), "objectValue", null);
        setField(term18129, term18129.getClass(), "propListHead", term18140);
        setIntField(term18129, term18129.getClass(), "sourcePosition", -380787857);
        setField(term18129, term18129.getClass(), "jsType", null);
        setField(term18129, term18129.getClass(), "parent", null);
        setField(term18127, term18127.getClass(), "next", term18129);
        setIntField(term18144, term18144.getClass(), "type", 0);
        setField(term18144, term18144.getClass(), "next", null);
        setField(term18144, term18144.getClass(), "first", null);
        setField(term18144, term18144.getClass(), "last", null);
        setField(term18144, term18144.getClass(), "propListHead", null);
        setIntField(term18144, term18144.getClass(), "sourcePosition", 0);
        setField(term18144, term18144.getClass(), "jsType", null);
        setField(term18144, term18144.getClass(), "parent", null);
        setField(term18127, term18127.getClass(), "first", term18144);
        setIntField(term18147, term18147.getClass(), "type", 0);
        setField(term18147, term18147.getClass(), "next", null);
        setField(term18147, term18147.getClass(), "first", null);
        setField(term18147, term18147.getClass(), "last", null);
        setField(term18147, term18147.getClass(), "propListHead", null);
        setIntField(term18147, term18147.getClass(), "sourcePosition", 0);
        setField(term18147, term18147.getClass(), "jsType", null);
        setField(term18147, term18147.getClass(), "parent", null);
        setField(term18127, term18127.getClass(), "last", term18147);
        setField(term18150, term18150.getClass(), "next", null);
        setIntField(term18150, term18150.getClass(), "type", 0);
        setIntField(term18150, term18150.getClass(), "intValue", 0);
        setField(term18150, term18150.getClass(), "objectValue", null);
        setField(term18127, term18127.getClass(), "propListHead", term18150);
        setIntField(term18127, term18127.getClass(), "sourcePosition", 319853052);
        setField(term18127, term18127.getClass(), "jsType", null);
        setField(term18127, term18127.getClass(), "parent", null);
        setField(term18126, term18126.getClass(), "parameters", term18127);
        setField(term18126, term18126.getClass(), "returnType", null);
        setBooleanField(term18126, term18126.getClass(), "returnTypeInferred", false);
        setBooleanField(term18126, term18126.getClass(), "resolved", false);
        setField(term18126, term18126.getClass(), "resolveResult", null);
        setField(term18126, term18126.getClass(), "registry", null);
        setField(term18125, term18125.getClass(), "call", term18126);
        setField(term18156, term18156.getClass(), "ownerFunction", null);
        setField(term18156, term18156.getClass(), "className", null);
        setField(term18156, term18156.getClass(), "properties", null);
        setField(term18156, term18156.getClass(), "implicitPrototype", null);
        setBooleanField(term18156, term18156.getClass(), "nativeType", false);
        setBooleanField(term18156, term18156.getClass(), "prettyPrint", false);
        setBooleanField(term18156, term18156.getClass(), "visited", false);
        setField(term18156, term18156.getClass(), "docInfo", null);
        setBooleanField(term18156, term18156.getClass(), "unknown", false);
        setBooleanField(term18156, term18156.getClass(), "resolved", false);
        setField(term18156, term18156.getClass(), "resolveResult", null);
        setField(term18156, term18156.getClass(), "registry", null);
        setField(term18125, term18125.getClass(), "prototype", term18156);
        setField(term18125, term18125.getClass(), "kind", enum138);
        setField(term18125, term18125.getClass(), "typeOfThis", null);
        setField(term18125, term18125.getClass(), "source", null);
        setField(term18125, term18125.getClass(), "implementedInterfaces", null);
        setField(term18125, term18125.getClass(), "subTypes", null);
        setField(term18125, term18125.getClass(), "templateTypeName", null);
        setField(term18125, term18125.getClass(), "className", null);
        setField(term18125, term18125.getClass(), "properties", null);
        setField(term18125, term18125.getClass(), "implicitPrototype", null);
        setBooleanField(term18125, term18125.getClass(), "nativeType", false);
        setBooleanField(term18125, term18125.getClass(), "prettyPrint", false);
        setBooleanField(term18125, term18125.getClass(), "visited", false);
        setField(term18125, term18125.getClass(), "docInfo", null);
        setBooleanField(term18125, term18125.getClass(), "unknown", false);
        setBooleanField(term18125, term18125.getClass(), "resolved", false);
        setField(term18125, term18125.getClass(), "resolveResult", null);
        setField(term18125, term18125.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getTypeOfThis", argTypes, term18125, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


