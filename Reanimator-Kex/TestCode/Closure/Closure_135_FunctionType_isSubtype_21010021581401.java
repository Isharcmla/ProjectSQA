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

public class FunctionType_isSubtype_21010021581401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1806777;
     Object term1807429;
     Object term1808318;
     Object term1808323;

    public FunctionType_isSubtype_21010021581401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1808330 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1808329 = ((Class) term1808330).getDeclaredField((String) "ORDINARY");
        ((Field) term1808329).setAccessible(true);
        Object enum3370 = ((Field) term1808329).get((Object) null);
        term1806777 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1807321 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1806777, term1806777.getClass(), "kind", enum3370);
        setField(term1806777, term1806777.getClass(), "typeOfThis", term1807321);
        Class<? extends Object> term1808621 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1808620 = ((Class) term1808621).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1808620).setAccessible(true);
        Object enum3371 = ((Field) term1808620).get((Object) null);
        term1807429 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1807603 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1807429, term1807429.getClass(), "kind", enum3371);
        setField(term1807429, term1807429.getClass(), "typeOfThis", term1807603);
        Class<? extends Object> term1808921 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1808920 = ((Class) term1808921).getDeclaredField((String) "INTERFACE");
        ((Field) term1808920).setAccessible(true);
        Object enum3372 = ((Field) term1808920).get((Object) null);
        term1808318 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1808322 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1808318, term1808318.getClass(), "this$0", null);
        setField(term1808318, term1808318.getClass(), "call", null);
        setField(term1808318, term1808318.getClass(), "prototype", null);
        setField(term1808318, term1808318.getClass(), "kind", enum3372);
        setField(term1808322, term1808322.getClass(), "call", null);
        setField(term1808322, term1808322.getClass(), "prototype", null);
        setField(term1808322, term1808322.getClass(), "kind", null);
        setField(term1808322, term1808322.getClass(), "typeOfThis", null);
        setField(term1808322, term1808322.getClass(), "source", null);
        setField(term1808322, term1808322.getClass(), "implementedInterfaces", null);
        setField(term1808322, term1808322.getClass(), "subTypes", null);
        setField(term1808322, term1808322.getClass(), "templateTypeName", null);
        setField(term1808322, term1808322.getClass(), "className", null);
        setField(term1808322, term1808322.getClass(), "properties", null);
        setField(term1808322, term1808322.getClass(), "implicitPrototype", null);
        setBooleanField(term1808322, term1808322.getClass(), "nativeType", false);
        setBooleanField(term1808322, term1808322.getClass(), "visited", false);
        setField(term1808322, term1808322.getClass(), "docInfo", null);
        setBooleanField(term1808322, term1808322.getClass(), "unknown", false);
        setBooleanField(term1808322, term1808322.getClass(), "resolved", false);
        setField(term1808322, term1808322.getClass(), "resolveResult", null);
        setField(term1808322, term1808322.getClass(), "registry", null);
        setField(term1808318, term1808318.getClass(), "typeOfThis", term1808322);
        setField(term1808318, term1808318.getClass(), "source", null);
        setField(term1808318, term1808318.getClass(), "implementedInterfaces", null);
        setField(term1808318, term1808318.getClass(), "subTypes", null);
        setField(term1808318, term1808318.getClass(), "templateTypeName", null);
        setField(term1808318, term1808318.getClass(), "className", null);
        setField(term1808318, term1808318.getClass(), "properties", null);
        setField(term1808318, term1808318.getClass(), "implicitPrototype", null);
        setBooleanField(term1808318, term1808318.getClass(), "nativeType", false);
        setBooleanField(term1808318, term1808318.getClass(), "visited", false);
        setField(term1808318, term1808318.getClass(), "docInfo", null);
        setBooleanField(term1808318, term1808318.getClass(), "unknown", false);
        setBooleanField(term1808318, term1808318.getClass(), "resolved", false);
        setField(term1808318, term1808318.getClass(), "resolveResult", null);
        setField(term1808318, term1808318.getClass(), "registry", null);
        Class<? extends Object> term1809215 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1809214 = ((Class) term1809215).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1809214).setAccessible(true);
        Object enum3373 = ((Field) term1809214).get((Object) null);
        term1808323 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1808327 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1808323, term1808323.getClass(), "this$0", null);
        setField(term1808323, term1808323.getClass(), "call", null);
        setField(term1808323, term1808323.getClass(), "prototype", null);
        setField(term1808323, term1808323.getClass(), "kind", enum3373);
        setField(term1808327, term1808327.getClass(), "call", null);
        setField(term1808327, term1808327.getClass(), "prototype", null);
        setField(term1808327, term1808327.getClass(), "kind", null);
        setField(term1808327, term1808327.getClass(), "typeOfThis", null);
        setField(term1808327, term1808327.getClass(), "source", null);
        setField(term1808327, term1808327.getClass(), "implementedInterfaces", null);
        setField(term1808327, term1808327.getClass(), "subTypes", null);
        setField(term1808327, term1808327.getClass(), "templateTypeName", null);
        setField(term1808327, term1808327.getClass(), "className", null);
        setField(term1808327, term1808327.getClass(), "properties", null);
        setField(term1808327, term1808327.getClass(), "implicitPrototype", null);
        setBooleanField(term1808327, term1808327.getClass(), "nativeType", false);
        setBooleanField(term1808327, term1808327.getClass(), "visited", false);
        setField(term1808327, term1808327.getClass(), "docInfo", null);
        setBooleanField(term1808327, term1808327.getClass(), "unknown", false);
        setBooleanField(term1808327, term1808327.getClass(), "resolved", false);
        setField(term1808327, term1808327.getClass(), "resolveResult", null);
        setField(term1808327, term1808327.getClass(), "registry", null);
        setField(term1808323, term1808323.getClass(), "typeOfThis", term1808327);
        setField(term1808323, term1808323.getClass(), "source", null);
        setField(term1808323, term1808323.getClass(), "implementedInterfaces", null);
        setField(term1808323, term1808323.getClass(), "subTypes", null);
        setField(term1808323, term1808323.getClass(), "templateTypeName", null);
        setField(term1808323, term1808323.getClass(), "className", null);
        setField(term1808323, term1808323.getClass(), "properties", null);
        setField(term1808323, term1808323.getClass(), "implicitPrototype", null);
        setBooleanField(term1808323, term1808323.getClass(), "nativeType", false);
        setBooleanField(term1808323, term1808323.getClass(), "visited", false);
        setField(term1808323, term1808323.getClass(), "docInfo", null);
        setBooleanField(term1808323, term1808323.getClass(), "unknown", false);
        setBooleanField(term1808323, term1808323.getClass(), "resolved", false);
        setField(term1808323, term1808323.getClass(), "resolveResult", null);
        setField(term1808323, term1808323.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1807429;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1806777, args);
        assertTrue(recursiveEquals(term1806777, term1808318));
        assertTrue(recursiveEquals(term1807429, term1808323));
        assertTrue(recursiveEquals(retValue, false));
    }

};


