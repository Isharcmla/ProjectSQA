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

public class FunctionType_isSubtype_2101002158921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term999567;
     Object term1000219;
     Object term1000827;
     Object term1000832;

    public FunctionType_isSubtype_2101002158921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1000838 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1000837 = ((Class) term1000838).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1000837).setAccessible(true);
        Object enum1868 = ((Field) term1000837).get((Object) null);
        term999567 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1000111 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term999567, term999567.getClass(), "kind", enum1868);
        setField(term999567, term999567.getClass(), "typeOfThis", term1000111);
        term1000219 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1000219, term1000219.getClass(), "kind", enum1868);
        setField(term1000219, term1000219.getClass(), "typeOfThis", null);
        Class<? extends Object> term1001138 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1001137 = ((Class) term1001138).getDeclaredField((String) "INTERFACE");
        ((Field) term1001137).setAccessible(true);
        Object enum1869 = ((Field) term1001137).get((Object) null);
        term1000827 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1000831 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1000827, term1000827.getClass(), "this$0", null);
        setField(term1000827, term1000827.getClass(), "call", null);
        setField(term1000827, term1000827.getClass(), "prototype", null);
        setField(term1000827, term1000827.getClass(), "kind", enum1869);
        setField(term1000831, term1000831.getClass(), "call", null);
        setField(term1000831, term1000831.getClass(), "prototype", null);
        setField(term1000831, term1000831.getClass(), "kind", null);
        setField(term1000831, term1000831.getClass(), "typeOfThis", null);
        setField(term1000831, term1000831.getClass(), "source", null);
        setField(term1000831, term1000831.getClass(), "implementedInterfaces", null);
        setField(term1000831, term1000831.getClass(), "subTypes", null);
        setField(term1000831, term1000831.getClass(), "templateTypeName", null);
        setField(term1000831, term1000831.getClass(), "className", null);
        setField(term1000831, term1000831.getClass(), "properties", null);
        setField(term1000831, term1000831.getClass(), "implicitPrototype", null);
        setBooleanField(term1000831, term1000831.getClass(), "nativeType", false);
        setBooleanField(term1000831, term1000831.getClass(), "visited", false);
        setField(term1000831, term1000831.getClass(), "docInfo", null);
        setBooleanField(term1000831, term1000831.getClass(), "unknown", false);
        setBooleanField(term1000831, term1000831.getClass(), "resolved", false);
        setField(term1000831, term1000831.getClass(), "resolveResult", null);
        setField(term1000831, term1000831.getClass(), "registry", null);
        setField(term1000827, term1000827.getClass(), "typeOfThis", term1000831);
        setField(term1000827, term1000827.getClass(), "source", null);
        setField(term1000827, term1000827.getClass(), "implementedInterfaces", null);
        setField(term1000827, term1000827.getClass(), "subTypes", null);
        setField(term1000827, term1000827.getClass(), "templateTypeName", null);
        setField(term1000827, term1000827.getClass(), "className", null);
        setField(term1000827, term1000827.getClass(), "properties", null);
        setField(term1000827, term1000827.getClass(), "implicitPrototype", null);
        setBooleanField(term1000827, term1000827.getClass(), "nativeType", false);
        setBooleanField(term1000827, term1000827.getClass(), "visited", false);
        setField(term1000827, term1000827.getClass(), "docInfo", null);
        setBooleanField(term1000827, term1000827.getClass(), "unknown", false);
        setBooleanField(term1000827, term1000827.getClass(), "resolved", false);
        setField(term1000827, term1000827.getClass(), "resolveResult", null);
        setField(term1000827, term1000827.getClass(), "registry", null);
        Class<? extends Object> term1001432 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1001431 = ((Class) term1001432).getDeclaredField((String) "INTERFACE");
        ((Field) term1001431).setAccessible(true);
        Object enum1870 = ((Field) term1001431).get((Object) null);
        term1000832 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1000832, term1000832.getClass(), "this$0", null);
        setField(term1000832, term1000832.getClass(), "call", null);
        setField(term1000832, term1000832.getClass(), "prototype", null);
        setField(term1000832, term1000832.getClass(), "kind", enum1870);
        setField(term1000832, term1000832.getClass(), "typeOfThis", null);
        setField(term1000832, term1000832.getClass(), "source", null);
        setField(term1000832, term1000832.getClass(), "implementedInterfaces", null);
        setField(term1000832, term1000832.getClass(), "subTypes", null);
        setField(term1000832, term1000832.getClass(), "templateTypeName", null);
        setField(term1000832, term1000832.getClass(), "className", null);
        setField(term1000832, term1000832.getClass(), "properties", null);
        setField(term1000832, term1000832.getClass(), "implicitPrototype", null);
        setBooleanField(term1000832, term1000832.getClass(), "nativeType", false);
        setBooleanField(term1000832, term1000832.getClass(), "visited", false);
        setField(term1000832, term1000832.getClass(), "docInfo", null);
        setBooleanField(term1000832, term1000832.getClass(), "unknown", false);
        setBooleanField(term1000832, term1000832.getClass(), "resolved", false);
        setField(term1000832, term1000832.getClass(), "resolveResult", null);
        setField(term1000832, term1000832.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1000219;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term999567, args);
        assertTrue(recursiveEquals(term999567, term1000827));
        assertTrue(recursiveEquals(term1000219, term1000832));
        assertTrue(recursiveEquals(retValue, true));
    }

};


