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
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class FunctionType_isSubtype_21010021581340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1701552;
     Object term1701810;
     Object term1704344;
     Object term1704348;

    public FunctionType_isSubtype_21010021581340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1704354 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1704353 = ((Class) term1704354).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1704353).setAccessible(true);
        Object enum3180 = ((Field) term1704353).get((Object) null);
        term1701552 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1701552, term1701552.getClass(), "kind", enum3180);
        Class<? extends Object> term1704654 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1704653 = ((Class) term1704654).getDeclaredField((String) "INTERFACE");
        ((Field) term1704653).setAccessible(true);
        Object enum3181 = ((Field) term1704653).get((Object) null);
        term1701810 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1701810, term1701810.getClass(), "kind", enum3181);
        Class<? extends Object> term1704948 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1704947 = ((Class) term1704948).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1704947).setAccessible(true);
        Object enum3182 = ((Field) term1704947).get((Object) null);
        term1704344 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1704344, term1704344.getClass(), "this$0", null);
        setField(term1704344, term1704344.getClass(), "call", null);
        setField(term1704344, term1704344.getClass(), "prototype", null);
        setField(term1704344, term1704344.getClass(), "kind", enum3182);
        setField(term1704344, term1704344.getClass(), "typeOfThis", null);
        setField(term1704344, term1704344.getClass(), "source", null);
        setField(term1704344, term1704344.getClass(), "implementedInterfaces", null);
        setField(term1704344, term1704344.getClass(), "subTypes", null);
        setField(term1704344, term1704344.getClass(), "templateTypeName", null);
        setField(term1704344, term1704344.getClass(), "className", null);
        setField(term1704344, term1704344.getClass(), "properties", null);
        setField(term1704344, term1704344.getClass(), "implicitPrototype", null);
        setBooleanField(term1704344, term1704344.getClass(), "nativeType", false);
        setBooleanField(term1704344, term1704344.getClass(), "visited", false);
        setField(term1704344, term1704344.getClass(), "docInfo", null);
        setBooleanField(term1704344, term1704344.getClass(), "unknown", false);
        setBooleanField(term1704344, term1704344.getClass(), "resolved", false);
        setField(term1704344, term1704344.getClass(), "resolveResult", null);
        setField(term1704344, term1704344.getClass(), "registry", null);
        Class<? extends Object> term1705248 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1705247 = ((Class) term1705248).getDeclaredField((String) "INTERFACE");
        ((Field) term1705247).setAccessible(true);
        Object enum3183 = ((Field) term1705247).get((Object) null);
        term1704348 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1704348, term1704348.getClass(), "call", null);
        setField(term1704348, term1704348.getClass(), "prototype", null);
        setField(term1704348, term1704348.getClass(), "kind", enum3183);
        setField(term1704348, term1704348.getClass(), "typeOfThis", null);
        setField(term1704348, term1704348.getClass(), "source", null);
        setField(term1704348, term1704348.getClass(), "implementedInterfaces", null);
        setField(term1704348, term1704348.getClass(), "subTypes", null);
        setField(term1704348, term1704348.getClass(), "templateTypeName", null);
        setField(term1704348, term1704348.getClass(), "className", null);
        setField(term1704348, term1704348.getClass(), "properties", null);
        setField(term1704348, term1704348.getClass(), "implicitPrototype", null);
        setBooleanField(term1704348, term1704348.getClass(), "nativeType", false);
        setBooleanField(term1704348, term1704348.getClass(), "visited", false);
        setField(term1704348, term1704348.getClass(), "docInfo", null);
        setBooleanField(term1704348, term1704348.getClass(), "unknown", false);
        setBooleanField(term1704348, term1704348.getClass(), "resolved", false);
        setField(term1704348, term1704348.getClass(), "resolveResult", null);
        setField(term1704348, term1704348.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1701810;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1701552, args);
        assertTrue(recursiveEquals(term1701552, term1704344));
        assertTrue(recursiveEquals(term1701810, term1704348));
        assertTrue(recursiveEquals(retValue, true));
    }

};


