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

public class FunctionType_isSubtype_2101002158756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term725445;
     Object term725703;
     Object term727252;
     Object term727256;

    public FunctionType_isSubtype_2101002158756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term727259 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term727258 = ((Class) term727259).getDeclaredField((String) "INTERFACE");
        ((Field) term727258).setAccessible(true);
        Object enum1353 = ((Field) term727258).get((Object) null);
        term725445 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term725445, term725445.getClass(), "kind", enum1353);
        term725703 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class<? extends Object> term727553 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term727552 = ((Class) term727553).getDeclaredField((String) "INTERFACE");
        ((Field) term727552).setAccessible(true);
        Object enum1354 = ((Field) term727552).get((Object) null);
        term727252 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term727252, term727252.getClass(), "this$0", null);
        setField(term727252, term727252.getClass(), "call", null);
        setField(term727252, term727252.getClass(), "prototype", null);
        setField(term727252, term727252.getClass(), "kind", enum1354);
        setField(term727252, term727252.getClass(), "typeOfThis", null);
        setField(term727252, term727252.getClass(), "source", null);
        setField(term727252, term727252.getClass(), "implementedInterfaces", null);
        setField(term727252, term727252.getClass(), "subTypes", null);
        setField(term727252, term727252.getClass(), "templateTypeName", null);
        setField(term727252, term727252.getClass(), "className", null);
        setField(term727252, term727252.getClass(), "properties", null);
        setField(term727252, term727252.getClass(), "implicitPrototype", null);
        setBooleanField(term727252, term727252.getClass(), "nativeType", false);
        setBooleanField(term727252, term727252.getClass(), "visited", false);
        setField(term727252, term727252.getClass(), "docInfo", null);
        setBooleanField(term727252, term727252.getClass(), "unknown", false);
        setBooleanField(term727252, term727252.getClass(), "resolved", false);
        setField(term727252, term727252.getClass(), "resolveResult", null);
        setField(term727252, term727252.getClass(), "registry", null);
        term727256 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term727256, term727256.getClass(), "call", null);
        setField(term727256, term727256.getClass(), "prototype", null);
        setField(term727256, term727256.getClass(), "kind", null);
        setField(term727256, term727256.getClass(), "typeOfThis", null);
        setField(term727256, term727256.getClass(), "source", null);
        setField(term727256, term727256.getClass(), "implementedInterfaces", null);
        setField(term727256, term727256.getClass(), "subTypes", null);
        setField(term727256, term727256.getClass(), "templateTypeName", null);
        setField(term727256, term727256.getClass(), "className", null);
        setField(term727256, term727256.getClass(), "properties", null);
        setField(term727256, term727256.getClass(), "implicitPrototype", null);
        setBooleanField(term727256, term727256.getClass(), "nativeType", false);
        setBooleanField(term727256, term727256.getClass(), "visited", false);
        setField(term727256, term727256.getClass(), "docInfo", null);
        setBooleanField(term727256, term727256.getClass(), "unknown", false);
        setBooleanField(term727256, term727256.getClass(), "resolved", false);
        setField(term727256, term727256.getClass(), "resolveResult", null);
        setField(term727256, term727256.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term725703;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term725445, args);
        assertTrue(recursiveEquals(term725445, term727252));
        assertTrue(recursiveEquals(term725703, term727256));
        assertTrue(recursiveEquals(retValue, false));
    }

};


