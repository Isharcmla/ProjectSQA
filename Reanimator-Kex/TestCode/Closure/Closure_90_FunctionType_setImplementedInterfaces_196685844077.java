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
import java.util.LinkedList;

public class FunctionType_setImplementedInterfaces_196685844077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9477;
     Object term9534;

    public FunctionType_setImplementedInterfaces_196685844077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38289 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term38288 = ((Class) term38289).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term38288).setAccessible(true);
        Object enum101 = ((Field) term38288).get((Object) null);
        term9477 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term9478 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term9479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9492 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9502 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9508 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term9479, term9479.getClass(), "type", -282881827);
        setIntField(term9481, term9481.getClass(), "type", -1497710478);
        setIntField(term9483, term9483.getClass(), "type", 0);
        setField(term9483, term9483.getClass(), "next", null);
        setField(term9483, term9483.getClass(), "first", null);
        setField(term9483, term9483.getClass(), "last", null);
        setField(term9483, term9483.getClass(), "propListHead", null);
        setIntField(term9483, term9483.getClass(), "sourcePosition", 0);
        setField(term9483, term9483.getClass(), "jsType", null);
        setField(term9483, term9483.getClass(), "parent", null);
        setField(term9481, term9481.getClass(), "next", term9483);
        setIntField(term9486, term9486.getClass(), "type", 0);
        setField(term9486, term9486.getClass(), "next", null);
        setField(term9486, term9486.getClass(), "first", null);
        setField(term9486, term9486.getClass(), "last", null);
        setField(term9486, term9486.getClass(), "propListHead", null);
        setIntField(term9486, term9486.getClass(), "sourcePosition", 0);
        setField(term9486, term9486.getClass(), "jsType", null);
        setField(term9486, term9486.getClass(), "parent", null);
        setField(term9481, term9481.getClass(), "first", term9486);
        setIntField(term9489, term9489.getClass(), "type", 0);
        setField(term9489, term9489.getClass(), "next", null);
        setField(term9489, term9489.getClass(), "first", null);
        setField(term9489, term9489.getClass(), "last", null);
        setField(term9489, term9489.getClass(), "propListHead", null);
        setIntField(term9489, term9489.getClass(), "sourcePosition", 0);
        setField(term9489, term9489.getClass(), "jsType", null);
        setField(term9489, term9489.getClass(), "parent", null);
        setField(term9481, term9481.getClass(), "last", term9489);
        setField(term9492, term9492.getClass(), "next", null);
        setIntField(term9492, term9492.getClass(), "type", 0);
        setIntField(term9492, term9492.getClass(), "intValue", 0);
        setField(term9492, term9492.getClass(), "objectValue", null);
        setField(term9481, term9481.getClass(), "propListHead", term9492);
        setIntField(term9481, term9481.getClass(), "sourcePosition", 49950830);
        setField(term9481, term9481.getClass(), "jsType", null);
        setField(term9481, term9481.getClass(), "parent", null);
        setField(term9479, term9479.getClass(), "next", term9481);
        setIntField(term9496, term9496.getClass(), "type", 0);
        setField(term9496, term9496.getClass(), "next", null);
        setField(term9496, term9496.getClass(), "first", null);
        setField(term9496, term9496.getClass(), "last", null);
        setField(term9496, term9496.getClass(), "propListHead", null);
        setIntField(term9496, term9496.getClass(), "sourcePosition", 0);
        setField(term9496, term9496.getClass(), "jsType", null);
        setField(term9496, term9496.getClass(), "parent", null);
        setField(term9479, term9479.getClass(), "first", term9496);
        setIntField(term9499, term9499.getClass(), "type", 0);
        setField(term9499, term9499.getClass(), "next", null);
        setField(term9499, term9499.getClass(), "first", null);
        setField(term9499, term9499.getClass(), "last", null);
        setField(term9499, term9499.getClass(), "propListHead", null);
        setIntField(term9499, term9499.getClass(), "sourcePosition", 0);
        setField(term9499, term9499.getClass(), "jsType", null);
        setField(term9499, term9499.getClass(), "parent", null);
        setField(term9479, term9479.getClass(), "last", term9499);
        setField(term9502, term9502.getClass(), "next", null);
        setIntField(term9502, term9502.getClass(), "type", 0);
        setIntField(term9502, term9502.getClass(), "intValue", 0);
        setField(term9502, term9502.getClass(), "objectValue", null);
        setField(term9479, term9479.getClass(), "propListHead", term9502);
        setIntField(term9479, term9479.getClass(), "sourcePosition", -525257914);
        setField(term9479, term9479.getClass(), "jsType", null);
        setField(term9479, term9479.getClass(), "parent", null);
        setField(term9478, term9478.getClass(), "parameters", term9479);
        setField(term9478, term9478.getClass(), "returnType", null);
        setBooleanField(term9478, term9478.getClass(), "returnTypeInferred", false);
        setBooleanField(term9478, term9478.getClass(), "resolved", false);
        setField(term9478, term9478.getClass(), "resolveResult", null);
        setField(term9478, term9478.getClass(), "registry", null);
        setField(term9477, term9477.getClass(), "call", term9478);
        setField(term9508, term9508.getClass(), "ownerFunction", null);
        setField(term9508, term9508.getClass(), "className", null);
        setField(term9508, term9508.getClass(), "properties", null);
        setBooleanField(term9508, term9508.getClass(), "nativeType", false);
        setField(term9508, term9508.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term9508, term9508.getClass(), "prettyPrint", false);
        setBooleanField(term9508, term9508.getClass(), "visited", false);
        setField(term9508, term9508.getClass(), "docInfo", null);
        setBooleanField(term9508, term9508.getClass(), "unknown", false);
        setBooleanField(term9508, term9508.getClass(), "resolved", false);
        setField(term9508, term9508.getClass(), "resolveResult", null);
        setField(term9508, term9508.getClass(), "registry", null);
        setField(term9477, term9477.getClass(), "prototype", term9508);
        setField(term9477, term9477.getClass(), "kind", enum101);
        setField(term9477, term9477.getClass(), "typeOfThis", null);
        setField(term9477, term9477.getClass(), "source", null);
        setField(term9477, term9477.getClass(), "implementedInterfaces", null);
        setField(term9477, term9477.getClass(), "subTypes", null);
        setField(term9477, term9477.getClass(), "templateTypeName", null);
        setField(term9477, term9477.getClass(), "className", null);
        setField(term9477, term9477.getClass(), "properties", null);
        setBooleanField(term9477, term9477.getClass(), "nativeType", false);
        setField(term9477, term9477.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term9477, term9477.getClass(), "prettyPrint", false);
        setBooleanField(term9477, term9477.getClass(), "visited", false);
        setField(term9477, term9477.getClass(), "docInfo", null);
        setBooleanField(term9477, term9477.getClass(), "unknown", false);
        setBooleanField(term9477, term9477.getClass(), "resolved", false);
        setField(term9477, term9477.getClass(), "resolveResult", null);
        setField(term9477, term9477.getClass(), "registry", null);
        term9534 = new LinkedList();
        ((LinkedList) term9534).add((Object)null);
        ((LinkedList) term9534).add((Object)null);
        ((LinkedList) term9534).add((Object)null);
        ((LinkedList) term9534).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term9534;
        try {
            callMethod(klass, "setImplementedInterfaces", argTypes, term9477, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


