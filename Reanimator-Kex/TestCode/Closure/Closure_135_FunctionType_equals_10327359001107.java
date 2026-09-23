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

public class FunctionType_equals_10327359001107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1297512;
     Object term1298164;
     Object term1298915;
     Object term1298920;

    public FunctionType_equals_10327359001107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1298926 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1298925 = ((Class) term1298926).getDeclaredField((String) "INTERFACE");
        ((Field) term1298925).setAccessible(true);
        Object enum2422 = ((Field) term1298925).get((Object) null);
        term1297512 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1298064 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1297512, term1297512.getClass(), "kind", enum2422);
        setField(term1297512, term1297512.getClass(), "typeOfThis", term1298064);
        Class<? extends Object> term1299220 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1299219 = ((Class) term1299220).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1299219).setAccessible(true);
        Object enum2423 = ((Field) term1299219).get((Object) null);
        term1298164 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1298164, term1298164.getClass(), "kind", enum2423);
        setField(term1298164, term1298164.getClass(), "typeOfThis", null);
        Class<? extends Object> term1299520 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1299519 = ((Class) term1299520).getDeclaredField((String) "INTERFACE");
        ((Field) term1299519).setAccessible(true);
        Object enum2424 = ((Field) term1299519).get((Object) null);
        term1298915 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1298919 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1298915, term1298915.getClass(), "call", null);
        setField(term1298915, term1298915.getClass(), "prototype", null);
        setField(term1298915, term1298915.getClass(), "kind", enum2424);
        setField(term1298919, term1298919.getClass(), "this$0", null);
        setField(term1298919, term1298919.getClass(), "call", null);
        setField(term1298919, term1298919.getClass(), "prototype", null);
        setField(term1298919, term1298919.getClass(), "kind", null);
        setField(term1298919, term1298919.getClass(), "typeOfThis", null);
        setField(term1298919, term1298919.getClass(), "source", null);
        setField(term1298919, term1298919.getClass(), "implementedInterfaces", null);
        setField(term1298919, term1298919.getClass(), "subTypes", null);
        setField(term1298919, term1298919.getClass(), "templateTypeName", null);
        setField(term1298919, term1298919.getClass(), "className", null);
        setField(term1298919, term1298919.getClass(), "properties", null);
        setField(term1298919, term1298919.getClass(), "implicitPrototype", null);
        setBooleanField(term1298919, term1298919.getClass(), "nativeType", false);
        setBooleanField(term1298919, term1298919.getClass(), "visited", false);
        setField(term1298919, term1298919.getClass(), "docInfo", null);
        setBooleanField(term1298919, term1298919.getClass(), "unknown", false);
        setBooleanField(term1298919, term1298919.getClass(), "resolved", false);
        setField(term1298919, term1298919.getClass(), "resolveResult", null);
        setField(term1298919, term1298919.getClass(), "registry", null);
        setField(term1298915, term1298915.getClass(), "typeOfThis", term1298919);
        setField(term1298915, term1298915.getClass(), "source", null);
        setField(term1298915, term1298915.getClass(), "implementedInterfaces", null);
        setField(term1298915, term1298915.getClass(), "subTypes", null);
        setField(term1298915, term1298915.getClass(), "templateTypeName", null);
        setField(term1298915, term1298915.getClass(), "className", null);
        setField(term1298915, term1298915.getClass(), "properties", null);
        setField(term1298915, term1298915.getClass(), "implicitPrototype", null);
        setBooleanField(term1298915, term1298915.getClass(), "nativeType", false);
        setBooleanField(term1298915, term1298915.getClass(), "visited", false);
        setField(term1298915, term1298915.getClass(), "docInfo", null);
        setBooleanField(term1298915, term1298915.getClass(), "unknown", false);
        setBooleanField(term1298915, term1298915.getClass(), "resolved", false);
        setField(term1298915, term1298915.getClass(), "resolveResult", null);
        setField(term1298915, term1298915.getClass(), "registry", null);
        Class<? extends Object> term1299814 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1299813 = ((Class) term1299814).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1299813).setAccessible(true);
        Object enum2425 = ((Field) term1299813).get((Object) null);
        term1298920 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1298920, term1298920.getClass(), "call", null);
        setField(term1298920, term1298920.getClass(), "prototype", null);
        setField(term1298920, term1298920.getClass(), "kind", enum2425);
        setField(term1298920, term1298920.getClass(), "typeOfThis", null);
        setField(term1298920, term1298920.getClass(), "source", null);
        setField(term1298920, term1298920.getClass(), "implementedInterfaces", null);
        setField(term1298920, term1298920.getClass(), "subTypes", null);
        setField(term1298920, term1298920.getClass(), "templateTypeName", null);
        setField(term1298920, term1298920.getClass(), "className", null);
        setField(term1298920, term1298920.getClass(), "properties", null);
        setField(term1298920, term1298920.getClass(), "implicitPrototype", null);
        setBooleanField(term1298920, term1298920.getClass(), "nativeType", false);
        setBooleanField(term1298920, term1298920.getClass(), "visited", false);
        setField(term1298920, term1298920.getClass(), "docInfo", null);
        setBooleanField(term1298920, term1298920.getClass(), "unknown", false);
        setBooleanField(term1298920, term1298920.getClass(), "resolved", false);
        setField(term1298920, term1298920.getClass(), "resolveResult", null);
        setField(term1298920, term1298920.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1298164;
        Object retValue = callMethod(klass, "equals", argTypes, term1297512, args);
        assertTrue(recursiveEquals(term1297512, term1298915));
        assertTrue(recursiveEquals(term1298164, term1298920));
        assertTrue(recursiveEquals(retValue, false));
    }

};


