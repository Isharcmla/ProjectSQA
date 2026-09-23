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

public class FunctionType_isSubtype_2101002158715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term662667;
     Object term662923;
     Object term663378;
     Object term663382;

    public FunctionType_isSubtype_2101002158715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term663388 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term663387 = ((Class) term663388).getDeclaredField((String) "INTERFACE");
        ((Field) term663387).setAccessible(true);
        Object enum1231 = ((Field) term663387).get((Object) null);
        term662667 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term662667, term662667.getClass(), "kind", enum1231);
        term662923 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term662923, term662923.getClass(), "kind", enum1231);
        Class<? extends Object> term663682 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term663681 = ((Class) term663682).getDeclaredField((String) "INTERFACE");
        ((Field) term663681).setAccessible(true);
        Object enum1232 = ((Field) term663681).get((Object) null);
        term663378 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term663378, term663378.getClass(), "call", null);
        setField(term663378, term663378.getClass(), "prototype", null);
        setField(term663378, term663378.getClass(), "kind", enum1232);
        setField(term663378, term663378.getClass(), "typeOfThis", null);
        setField(term663378, term663378.getClass(), "source", null);
        setField(term663378, term663378.getClass(), "implementedInterfaces", null);
        setField(term663378, term663378.getClass(), "subTypes", null);
        setField(term663378, term663378.getClass(), "templateTypeName", null);
        setField(term663378, term663378.getClass(), "className", null);
        setField(term663378, term663378.getClass(), "properties", null);
        setField(term663378, term663378.getClass(), "implicitPrototype", null);
        setBooleanField(term663378, term663378.getClass(), "nativeType", false);
        setBooleanField(term663378, term663378.getClass(), "visited", false);
        setField(term663378, term663378.getClass(), "docInfo", null);
        setBooleanField(term663378, term663378.getClass(), "unknown", false);
        setBooleanField(term663378, term663378.getClass(), "resolved", false);
        setField(term663378, term663378.getClass(), "resolveResult", null);
        setField(term663378, term663378.getClass(), "registry", null);
        Class<? extends Object> term663976 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term663975 = ((Class) term663976).getDeclaredField((String) "INTERFACE");
        ((Field) term663975).setAccessible(true);
        Object enum1233 = ((Field) term663975).get((Object) null);
        term663382 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term663382, term663382.getClass(), "this$0", null);
        setField(term663382, term663382.getClass(), "call", null);
        setField(term663382, term663382.getClass(), "prototype", null);
        setField(term663382, term663382.getClass(), "kind", enum1233);
        setField(term663382, term663382.getClass(), "typeOfThis", null);
        setField(term663382, term663382.getClass(), "source", null);
        setField(term663382, term663382.getClass(), "implementedInterfaces", null);
        setField(term663382, term663382.getClass(), "subTypes", null);
        setField(term663382, term663382.getClass(), "templateTypeName", null);
        setField(term663382, term663382.getClass(), "className", null);
        setField(term663382, term663382.getClass(), "properties", null);
        setField(term663382, term663382.getClass(), "implicitPrototype", null);
        setBooleanField(term663382, term663382.getClass(), "nativeType", false);
        setBooleanField(term663382, term663382.getClass(), "visited", false);
        setField(term663382, term663382.getClass(), "docInfo", null);
        setBooleanField(term663382, term663382.getClass(), "unknown", false);
        setBooleanField(term663382, term663382.getClass(), "resolved", false);
        setField(term663382, term663382.getClass(), "resolveResult", null);
        setField(term663382, term663382.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term662923;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term662667, args);
        assertTrue(recursiveEquals(term662667, term663378));
        assertTrue(recursiveEquals(term662923, term663382));
        assertTrue(recursiveEquals(retValue, true));
    }

};


