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

public class FunctionType_isSubtype_2101002158437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350665;
     Object term350923;
     Object term351277;
     Object term351281;

    public FunctionType_isSubtype_2101002158437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term351284 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term351283 = ((Class) term351284).getDeclaredField((String) "INTERFACE");
        ((Field) term351283).setAccessible(true);
        Object enum638 = ((Field) term351283).get((Object) null);
        term350665 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term350665, term350665.getClass(), "kind", enum638);
        term350923 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class<? extends Object> term351578 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term351577 = ((Class) term351578).getDeclaredField((String) "INTERFACE");
        ((Field) term351577).setAccessible(true);
        Object enum639 = ((Field) term351577).get((Object) null);
        term351277 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term351277, term351277.getClass(), "this$0", null);
        setField(term351277, term351277.getClass(), "call", null);
        setField(term351277, term351277.getClass(), "prototype", null);
        setField(term351277, term351277.getClass(), "kind", enum639);
        setField(term351277, term351277.getClass(), "typeOfThis", null);
        setField(term351277, term351277.getClass(), "source", null);
        setField(term351277, term351277.getClass(), "implementedInterfaces", null);
        setField(term351277, term351277.getClass(), "subTypes", null);
        setField(term351277, term351277.getClass(), "templateTypeName", null);
        setField(term351277, term351277.getClass(), "className", null);
        setField(term351277, term351277.getClass(), "properties", null);
        setField(term351277, term351277.getClass(), "implicitPrototype", null);
        setBooleanField(term351277, term351277.getClass(), "nativeType", false);
        setBooleanField(term351277, term351277.getClass(), "prettyPrint", false);
        setBooleanField(term351277, term351277.getClass(), "visited", false);
        setField(term351277, term351277.getClass(), "docInfo", null);
        setBooleanField(term351277, term351277.getClass(), "unknown", false);
        setBooleanField(term351277, term351277.getClass(), "resolved", false);
        setField(term351277, term351277.getClass(), "resolveResult", null);
        setField(term351277, term351277.getClass(), "registry", null);
        term351281 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term351281, term351281.getClass(), "call", null);
        setField(term351281, term351281.getClass(), "prototype", null);
        setField(term351281, term351281.getClass(), "kind", null);
        setField(term351281, term351281.getClass(), "typeOfThis", null);
        setField(term351281, term351281.getClass(), "source", null);
        setField(term351281, term351281.getClass(), "implementedInterfaces", null);
        setField(term351281, term351281.getClass(), "subTypes", null);
        setField(term351281, term351281.getClass(), "templateTypeName", null);
        setField(term351281, term351281.getClass(), "className", null);
        setField(term351281, term351281.getClass(), "properties", null);
        setField(term351281, term351281.getClass(), "implicitPrototype", null);
        setBooleanField(term351281, term351281.getClass(), "nativeType", false);
        setBooleanField(term351281, term351281.getClass(), "prettyPrint", false);
        setBooleanField(term351281, term351281.getClass(), "visited", false);
        setField(term351281, term351281.getClass(), "docInfo", null);
        setBooleanField(term351281, term351281.getClass(), "unknown", false);
        setBooleanField(term351281, term351281.getClass(), "resolved", false);
        setField(term351281, term351281.getClass(), "resolveResult", null);
        setField(term351281, term351281.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term350923;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term350665, args);
        assertTrue(recursiveEquals(term350665, term351277));
        assertTrue(recursiveEquals(term350923, term351281));
        assertTrue(recursiveEquals(retValue, false));
    }

};


