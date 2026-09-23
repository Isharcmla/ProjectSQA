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

public class FunctionType_isSubtype_21010021581023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1160739;
     Object term1160995;
     Object term1161351;
     Object term1161355;

    public FunctionType_isSubtype_21010021581023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1161358 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1161357 = ((Class) term1161358).getDeclaredField((String) "INTERFACE");
        ((Field) term1161357).setAccessible(true);
        Object enum2162 = ((Field) term1161357).get((Object) null);
        term1160739 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1160739, term1160739.getClass(), "kind", enum2162);
        term1160995 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Class<? extends Object> term1161652 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1161651 = ((Class) term1161652).getDeclaredField((String) "INTERFACE");
        ((Field) term1161651).setAccessible(true);
        Object enum2163 = ((Field) term1161651).get((Object) null);
        term1161351 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1161351, term1161351.getClass(), "call", null);
        setField(term1161351, term1161351.getClass(), "prototype", null);
        setField(term1161351, term1161351.getClass(), "kind", enum2163);
        setField(term1161351, term1161351.getClass(), "typeOfThis", null);
        setField(term1161351, term1161351.getClass(), "source", null);
        setField(term1161351, term1161351.getClass(), "implementedInterfaces", null);
        setField(term1161351, term1161351.getClass(), "subTypes", null);
        setField(term1161351, term1161351.getClass(), "templateTypeName", null);
        setField(term1161351, term1161351.getClass(), "className", null);
        setField(term1161351, term1161351.getClass(), "properties", null);
        setField(term1161351, term1161351.getClass(), "implicitPrototype", null);
        setBooleanField(term1161351, term1161351.getClass(), "nativeType", false);
        setBooleanField(term1161351, term1161351.getClass(), "visited", false);
        setField(term1161351, term1161351.getClass(), "docInfo", null);
        setBooleanField(term1161351, term1161351.getClass(), "unknown", false);
        setBooleanField(term1161351, term1161351.getClass(), "resolved", false);
        setField(term1161351, term1161351.getClass(), "resolveResult", null);
        setField(term1161351, term1161351.getClass(), "registry", null);
        term1161355 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1161355, term1161355.getClass(), "this$0", null);
        setField(term1161355, term1161355.getClass(), "call", null);
        setField(term1161355, term1161355.getClass(), "prototype", null);
        setField(term1161355, term1161355.getClass(), "kind", null);
        setField(term1161355, term1161355.getClass(), "typeOfThis", null);
        setField(term1161355, term1161355.getClass(), "source", null);
        setField(term1161355, term1161355.getClass(), "implementedInterfaces", null);
        setField(term1161355, term1161355.getClass(), "subTypes", null);
        setField(term1161355, term1161355.getClass(), "templateTypeName", null);
        setField(term1161355, term1161355.getClass(), "className", null);
        setField(term1161355, term1161355.getClass(), "properties", null);
        setField(term1161355, term1161355.getClass(), "implicitPrototype", null);
        setBooleanField(term1161355, term1161355.getClass(), "nativeType", false);
        setBooleanField(term1161355, term1161355.getClass(), "visited", false);
        setField(term1161355, term1161355.getClass(), "docInfo", null);
        setBooleanField(term1161355, term1161355.getClass(), "unknown", false);
        setBooleanField(term1161355, term1161355.getClass(), "resolved", false);
        setField(term1161355, term1161355.getClass(), "resolveResult", null);
        setField(term1161355, term1161355.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1160995;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1160739, args);
        assertTrue(recursiveEquals(term1160739, term1161351));
        assertTrue(recursiveEquals(term1160995, term1161355));
        assertTrue(recursiveEquals(retValue, false));
    }

};


