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

public class ObjectType_setOwnerFunction_94268834779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1457;

    public ObjectType_setOwnerFunction_94268834779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10869 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term10868 = ((Class) term10869).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term10868).setAccessible(true);
        Object enum3 = ((Field) term10868).get((Object) null);
        term1457 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1458 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1485 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term1459, term1459.getClass(), "type", -1530420153);
        setIntField(term1461, term1461.getClass(), "type", -469968304);
        setIntField(term1463, term1463.getClass(), "type", -1145578966);
        setField(term1463, term1463.getClass(), "next", null);
        setField(term1463, term1463.getClass(), "first", null);
        setField(term1463, term1463.getClass(), "last", null);
        setField(term1463, term1463.getClass(), "propListHead", null);
        setIntField(term1463, term1463.getClass(), "sourcePosition", 0);
        setField(term1463, term1463.getClass(), "jsType", null);
        setField(term1463, term1463.getClass(), "parent", null);
        setField(term1461, term1461.getClass(), "next", term1463);
        setIntField(term1466, term1466.getClass(), "type", 0);
        setField(term1466, term1466.getClass(), "next", null);
        setField(term1466, term1466.getClass(), "first", null);
        setField(term1466, term1466.getClass(), "last", null);
        setField(term1466, term1466.getClass(), "propListHead", null);
        setIntField(term1466, term1466.getClass(), "sourcePosition", 0);
        setField(term1466, term1466.getClass(), "jsType", null);
        setField(term1466, term1466.getClass(), "parent", null);
        setField(term1461, term1461.getClass(), "first", term1466);
        setIntField(term1469, term1469.getClass(), "type", -157887805);
        setField(term1469, term1469.getClass(), "next", null);
        setField(term1469, term1469.getClass(), "first", term1466);
        setField(term1469, term1469.getClass(), "last", term1469);
        setField(term1469, term1469.getClass(), "propListHead", null);
        setIntField(term1469, term1469.getClass(), "sourcePosition", 0);
        setField(term1469, term1469.getClass(), "jsType", null);
        setField(term1469, term1469.getClass(), "parent", null);
        setField(term1461, term1461.getClass(), "last", term1469);
        setField(term1461, term1461.getClass(), "propListHead", null);
        setIntField(term1461, term1461.getClass(), "sourcePosition", 0);
        setField(term1461, term1461.getClass(), "jsType", null);
        setField(term1461, term1461.getClass(), "parent", null);
        setField(term1459, term1459.getClass(), "next", term1461);
        setIntField(term1473, term1473.getClass(), "type", 767834723);
        setIntField(term1475, term1475.getClass(), "type", -602026508);
        setField(term1475, term1475.getClass(), "next", term1469);
        setField(term1475, term1475.getClass(), "first", null);
        setField(term1475, term1475.getClass(), "last", term1459);
        setField(term1475, term1475.getClass(), "propListHead", null);
        setIntField(term1475, term1475.getClass(), "sourcePosition", 0);
        setField(term1475, term1475.getClass(), "jsType", null);
        setField(term1475, term1475.getClass(), "parent", null);
        setField(term1473, term1473.getClass(), "next", term1475);
        setField(term1473, term1473.getClass(), "first", term1473);
        setIntField(term1478, term1478.getClass(), "type", 679763016);
        setField(term1478, term1478.getClass(), "next", null);
        setField(term1478, term1478.getClass(), "first", term1466);
        setField(term1478, term1478.getClass(), "last", term1469);
        setField(term1478, term1478.getClass(), "propListHead", null);
        setIntField(term1478, term1478.getClass(), "sourcePosition", 0);
        setField(term1478, term1478.getClass(), "jsType", null);
        setField(term1478, term1478.getClass(), "parent", null);
        setField(term1473, term1473.getClass(), "last", term1478);
        setField(term1473, term1473.getClass(), "propListHead", null);
        setIntField(term1473, term1473.getClass(), "sourcePosition", 0);
        setField(term1473, term1473.getClass(), "jsType", null);
        setField(term1473, term1473.getClass(), "parent", null);
        setField(term1459, term1459.getClass(), "first", term1473);
        setField(term1459, term1459.getClass(), "last", term1463);
        setField(term1459, term1459.getClass(), "propListHead", null);
        setIntField(term1459, term1459.getClass(), "sourcePosition", 0);
        setField(term1459, term1459.getClass(), "jsType", null);
        setField(term1459, term1459.getClass(), "parent", null);
        setField(term1458, term1458.getClass(), "parameters", term1459);
        setField(term1458, term1458.getClass(), "returnType", null);
        setBooleanField(term1458, term1458.getClass(), "returnTypeInferred", false);
        setBooleanField(term1458, term1458.getClass(), "resolved", false);
        setField(term1458, term1458.getClass(), "resolveResult", null);
        setField(term1458, term1458.getClass(), "registry", null);
        setField(term1457, term1457.getClass(), "call", term1458);
        setField(term1485, term1485.getClass(), "name", null);
        setField(term1485, term1485.getClass(), "type", null);
        setBooleanField(term1485, term1485.getClass(), "inferred", false);
        setField(term1485, term1485.getClass(), "propertyNode", null);
        setField(term1485, term1485.getClass(), "docInfo", null);
        setField(term1457, term1457.getClass(), "prototypeSlot", term1485);
        setField(term1457, term1457.getClass(), "kind", enum3);
        setField(term1457, term1457.getClass(), "typeOfThis", null);
        setField(term1457, term1457.getClass(), "source", null);
        setField(term1457, term1457.getClass(), "implementedInterfaces", null);
        setField(term1457, term1457.getClass(), "extendedInterfaces", null);
        setField(term1457, term1457.getClass(), "subTypes", null);
        setField(term1457, term1457.getClass(), "templateTypeName", null);
        setField(term1457, term1457.getClass(), "className", null);
        setField(term1457, term1457.getClass(), "properties", null);
        setBooleanField(term1457, term1457.getClass(), "nativeType", false);
        setField(term1457, term1457.getClass(), "implicitPrototypeFallback", null);
        setField(term1457, term1457.getClass(), "ownerFunction", null);
        setBooleanField(term1457, term1457.getClass(), "prettyPrint", false);
        setBooleanField(term1457, term1457.getClass(), "visited", false);
        setField(term1457, term1457.getClass(), "docInfo", null);
        setBooleanField(term1457, term1457.getClass(), "unknown", false);
        setBooleanField(term1457, term1457.getClass(), "resolved", false);
        setField(term1457, term1457.getClass(), "resolveResult", null);
        setField(term1457, term1457.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term1457;
        try {
            callMethod(klass, "setOwnerFunction", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


