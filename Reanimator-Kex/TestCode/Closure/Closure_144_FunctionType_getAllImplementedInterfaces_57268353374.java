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

public class FunctionType_getAllImplementedInterfaces_57268353374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8478;

    public FunctionType_getAllImplementedInterfaces_57268353374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36523 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term36522 = ((Class) term36523).getDeclaredField((String) "ORDINARY");
        ((Field) term36522).setAccessible(true);
        Object enum97 = ((Field) term36522).get((Object) null);
        term8478 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term8479 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term8480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8490 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8493 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8500 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8503 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8509 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term8480, term8480.getClass(), "type", -1618206977);
        setIntField(term8482, term8482.getClass(), "type", -1476644457);
        setIntField(term8484, term8484.getClass(), "type", 0);
        setField(term8484, term8484.getClass(), "next", null);
        setField(term8484, term8484.getClass(), "first", null);
        setField(term8484, term8484.getClass(), "last", null);
        setField(term8484, term8484.getClass(), "propListHead", null);
        setIntField(term8484, term8484.getClass(), "sourcePosition", 0);
        setField(term8484, term8484.getClass(), "jsType", null);
        setField(term8484, term8484.getClass(), "parent", null);
        setField(term8482, term8482.getClass(), "next", term8484);
        setIntField(term8487, term8487.getClass(), "type", 0);
        setField(term8487, term8487.getClass(), "next", null);
        setField(term8487, term8487.getClass(), "first", null);
        setField(term8487, term8487.getClass(), "last", null);
        setField(term8487, term8487.getClass(), "propListHead", null);
        setIntField(term8487, term8487.getClass(), "sourcePosition", 0);
        setField(term8487, term8487.getClass(), "jsType", null);
        setField(term8487, term8487.getClass(), "parent", null);
        setField(term8482, term8482.getClass(), "first", term8487);
        setIntField(term8490, term8490.getClass(), "type", 0);
        setField(term8490, term8490.getClass(), "next", null);
        setField(term8490, term8490.getClass(), "first", null);
        setField(term8490, term8490.getClass(), "last", null);
        setField(term8490, term8490.getClass(), "propListHead", null);
        setIntField(term8490, term8490.getClass(), "sourcePosition", 0);
        setField(term8490, term8490.getClass(), "jsType", null);
        setField(term8490, term8490.getClass(), "parent", null);
        setField(term8482, term8482.getClass(), "last", term8490);
        setField(term8493, term8493.getClass(), "next", null);
        setIntField(term8493, term8493.getClass(), "type", 0);
        setIntField(term8493, term8493.getClass(), "intValue", 0);
        setField(term8493, term8493.getClass(), "objectValue", null);
        setField(term8482, term8482.getClass(), "propListHead", term8493);
        setIntField(term8482, term8482.getClass(), "sourcePosition", 1270666529);
        setField(term8482, term8482.getClass(), "jsType", null);
        setField(term8482, term8482.getClass(), "parent", null);
        setField(term8480, term8480.getClass(), "next", term8482);
        setIntField(term8497, term8497.getClass(), "type", 0);
        setField(term8497, term8497.getClass(), "next", null);
        setField(term8497, term8497.getClass(), "first", null);
        setField(term8497, term8497.getClass(), "last", null);
        setField(term8497, term8497.getClass(), "propListHead", null);
        setIntField(term8497, term8497.getClass(), "sourcePosition", 0);
        setField(term8497, term8497.getClass(), "jsType", null);
        setField(term8497, term8497.getClass(), "parent", null);
        setField(term8480, term8480.getClass(), "first", term8497);
        setIntField(term8500, term8500.getClass(), "type", 0);
        setField(term8500, term8500.getClass(), "next", null);
        setField(term8500, term8500.getClass(), "first", null);
        setField(term8500, term8500.getClass(), "last", null);
        setField(term8500, term8500.getClass(), "propListHead", null);
        setIntField(term8500, term8500.getClass(), "sourcePosition", 0);
        setField(term8500, term8500.getClass(), "jsType", null);
        setField(term8500, term8500.getClass(), "parent", null);
        setField(term8480, term8480.getClass(), "last", term8500);
        setField(term8503, term8503.getClass(), "next", null);
        setIntField(term8503, term8503.getClass(), "type", 0);
        setIntField(term8503, term8503.getClass(), "intValue", 0);
        setField(term8503, term8503.getClass(), "objectValue", null);
        setField(term8480, term8480.getClass(), "propListHead", term8503);
        setIntField(term8480, term8480.getClass(), "sourcePosition", -1146679443);
        setField(term8480, term8480.getClass(), "jsType", null);
        setField(term8480, term8480.getClass(), "parent", null);
        setField(term8479, term8479.getClass(), "parameters", term8480);
        setField(term8479, term8479.getClass(), "returnType", null);
        setBooleanField(term8479, term8479.getClass(), "returnTypeInferred", false);
        setBooleanField(term8479, term8479.getClass(), "resolved", false);
        setField(term8479, term8479.getClass(), "resolveResult", null);
        setField(term8479, term8479.getClass(), "registry", null);
        setField(term8478, term8478.getClass(), "call", term8479);
        setField(term8509, term8509.getClass(), "ownerFunction", null);
        setField(term8509, term8509.getClass(), "className", null);
        setField(term8509, term8509.getClass(), "properties", null);
        setField(term8509, term8509.getClass(), "implicitPrototype", null);
        setBooleanField(term8509, term8509.getClass(), "nativeType", false);
        setBooleanField(term8509, term8509.getClass(), "prettyPrint", false);
        setBooleanField(term8509, term8509.getClass(), "visited", false);
        setField(term8509, term8509.getClass(), "docInfo", null);
        setBooleanField(term8509, term8509.getClass(), "unknown", false);
        setBooleanField(term8509, term8509.getClass(), "resolved", false);
        setField(term8509, term8509.getClass(), "resolveResult", null);
        setField(term8509, term8509.getClass(), "registry", null);
        setField(term8478, term8478.getClass(), "prototype", term8509);
        setField(term8478, term8478.getClass(), "kind", enum97);
        setField(term8478, term8478.getClass(), "typeOfThis", null);
        setField(term8478, term8478.getClass(), "source", null);
        setField(term8478, term8478.getClass(), "implementedInterfaces", null);
        setField(term8478, term8478.getClass(), "subTypes", null);
        setField(term8478, term8478.getClass(), "templateTypeName", null);
        setField(term8478, term8478.getClass(), "className", null);
        setField(term8478, term8478.getClass(), "properties", null);
        setField(term8478, term8478.getClass(), "implicitPrototype", null);
        setBooleanField(term8478, term8478.getClass(), "nativeType", false);
        setBooleanField(term8478, term8478.getClass(), "prettyPrint", false);
        setBooleanField(term8478, term8478.getClass(), "visited", false);
        setField(term8478, term8478.getClass(), "docInfo", null);
        setBooleanField(term8478, term8478.getClass(), "unknown", false);
        setBooleanField(term8478, term8478.getClass(), "resolved", false);
        setField(term8478, term8478.getClass(), "resolveResult", null);
        setField(term8478, term8478.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllImplementedInterfaces", argTypes, term8478, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


