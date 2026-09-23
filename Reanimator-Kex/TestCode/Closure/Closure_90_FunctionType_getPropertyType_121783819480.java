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

public class FunctionType_getPropertyType_121783819480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10575;

    public FunctionType_getPropertyType_121783819480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39942 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term39941 = ((Class) term39942).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term39941).setAccessible(true);
        Object enum104 = ((Field) term39941).get((Object) null);
        term10575 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term10576 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term10577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10581 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10590 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10600 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10606 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term10577, term10577.getClass(), "type", -680920524);
        setIntField(term10579, term10579.getClass(), "type", -1533843432);
        setIntField(term10581, term10581.getClass(), "type", 0);
        setField(term10581, term10581.getClass(), "next", null);
        setField(term10581, term10581.getClass(), "first", null);
        setField(term10581, term10581.getClass(), "last", null);
        setField(term10581, term10581.getClass(), "propListHead", null);
        setIntField(term10581, term10581.getClass(), "sourcePosition", 0);
        setField(term10581, term10581.getClass(), "jsType", null);
        setField(term10581, term10581.getClass(), "parent", null);
        setField(term10579, term10579.getClass(), "next", term10581);
        setIntField(term10584, term10584.getClass(), "type", 0);
        setField(term10584, term10584.getClass(), "next", null);
        setField(term10584, term10584.getClass(), "first", null);
        setField(term10584, term10584.getClass(), "last", null);
        setField(term10584, term10584.getClass(), "propListHead", null);
        setIntField(term10584, term10584.getClass(), "sourcePosition", 0);
        setField(term10584, term10584.getClass(), "jsType", null);
        setField(term10584, term10584.getClass(), "parent", null);
        setField(term10579, term10579.getClass(), "first", term10584);
        setIntField(term10587, term10587.getClass(), "type", 0);
        setField(term10587, term10587.getClass(), "next", null);
        setField(term10587, term10587.getClass(), "first", null);
        setField(term10587, term10587.getClass(), "last", null);
        setField(term10587, term10587.getClass(), "propListHead", null);
        setIntField(term10587, term10587.getClass(), "sourcePosition", 0);
        setField(term10587, term10587.getClass(), "jsType", null);
        setField(term10587, term10587.getClass(), "parent", null);
        setField(term10579, term10579.getClass(), "last", term10587);
        setField(term10590, term10590.getClass(), "next", null);
        setIntField(term10590, term10590.getClass(), "type", 0);
        setIntField(term10590, term10590.getClass(), "intValue", 0);
        setField(term10590, term10590.getClass(), "objectValue", null);
        setField(term10579, term10579.getClass(), "propListHead", term10590);
        setIntField(term10579, term10579.getClass(), "sourcePosition", -123338791);
        setField(term10579, term10579.getClass(), "jsType", null);
        setField(term10579, term10579.getClass(), "parent", null);
        setField(term10577, term10577.getClass(), "next", term10579);
        setIntField(term10594, term10594.getClass(), "type", 0);
        setField(term10594, term10594.getClass(), "next", null);
        setField(term10594, term10594.getClass(), "first", null);
        setField(term10594, term10594.getClass(), "last", null);
        setField(term10594, term10594.getClass(), "propListHead", null);
        setIntField(term10594, term10594.getClass(), "sourcePosition", 0);
        setField(term10594, term10594.getClass(), "jsType", null);
        setField(term10594, term10594.getClass(), "parent", null);
        setField(term10577, term10577.getClass(), "first", term10594);
        setIntField(term10597, term10597.getClass(), "type", 0);
        setField(term10597, term10597.getClass(), "next", null);
        setField(term10597, term10597.getClass(), "first", null);
        setField(term10597, term10597.getClass(), "last", null);
        setField(term10597, term10597.getClass(), "propListHead", null);
        setIntField(term10597, term10597.getClass(), "sourcePosition", 0);
        setField(term10597, term10597.getClass(), "jsType", null);
        setField(term10597, term10597.getClass(), "parent", null);
        setField(term10577, term10577.getClass(), "last", term10597);
        setField(term10600, term10600.getClass(), "next", null);
        setIntField(term10600, term10600.getClass(), "type", 0);
        setIntField(term10600, term10600.getClass(), "intValue", 0);
        setField(term10600, term10600.getClass(), "objectValue", null);
        setField(term10577, term10577.getClass(), "propListHead", term10600);
        setIntField(term10577, term10577.getClass(), "sourcePosition", -1467089634);
        setField(term10577, term10577.getClass(), "jsType", null);
        setField(term10577, term10577.getClass(), "parent", null);
        setField(term10576, term10576.getClass(), "parameters", term10577);
        setField(term10576, term10576.getClass(), "returnType", null);
        setBooleanField(term10576, term10576.getClass(), "returnTypeInferred", false);
        setBooleanField(term10576, term10576.getClass(), "resolved", false);
        setField(term10576, term10576.getClass(), "resolveResult", null);
        setField(term10576, term10576.getClass(), "registry", null);
        setField(term10575, term10575.getClass(), "call", term10576);
        setField(term10606, term10606.getClass(), "ownerFunction", null);
        setField(term10606, term10606.getClass(), "className", null);
        setField(term10606, term10606.getClass(), "properties", null);
        setBooleanField(term10606, term10606.getClass(), "nativeType", false);
        setField(term10606, term10606.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term10606, term10606.getClass(), "prettyPrint", false);
        setBooleanField(term10606, term10606.getClass(), "visited", false);
        setField(term10606, term10606.getClass(), "docInfo", null);
        setBooleanField(term10606, term10606.getClass(), "unknown", false);
        setBooleanField(term10606, term10606.getClass(), "resolved", false);
        setField(term10606, term10606.getClass(), "resolveResult", null);
        setField(term10606, term10606.getClass(), "registry", null);
        setField(term10575, term10575.getClass(), "prototype", term10606);
        setField(term10575, term10575.getClass(), "kind", enum104);
        setField(term10575, term10575.getClass(), "typeOfThis", null);
        setField(term10575, term10575.getClass(), "source", null);
        setField(term10575, term10575.getClass(), "implementedInterfaces", null);
        setField(term10575, term10575.getClass(), "subTypes", null);
        setField(term10575, term10575.getClass(), "templateTypeName", null);
        setField(term10575, term10575.getClass(), "className", null);
        setField(term10575, term10575.getClass(), "properties", null);
        setBooleanField(term10575, term10575.getClass(), "nativeType", false);
        setField(term10575, term10575.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term10575, term10575.getClass(), "prettyPrint", false);
        setBooleanField(term10575, term10575.getClass(), "visited", false);
        setField(term10575, term10575.getClass(), "docInfo", null);
        setBooleanField(term10575, term10575.getClass(), "unknown", false);
        setBooleanField(term10575, term10575.getClass(), "resolved", false);
        setField(term10575, term10575.getClass(), "resolveResult", null);
        setField(term10575, term10575.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SJiQaLvSKv";
        try {
            callMethod(klass, "getPropertyType", argTypes, term10575, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


