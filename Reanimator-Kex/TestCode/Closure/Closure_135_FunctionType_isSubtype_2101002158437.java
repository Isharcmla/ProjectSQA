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
     Object term291739;
     Object term291997;
     Object term292452;
     Object term292456;

    public FunctionType_isSubtype_2101002158437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term292462 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term292461 = ((Class) term292462).getDeclaredField((String) "INTERFACE");
        ((Field) term292461).setAccessible(true);
        Object enum535 = ((Field) term292461).get((Object) null);
        term291739 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term291739, term291739.getClass(), "kind", enum535);
        term291997 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term291997, term291997.getClass(), "kind", enum535);
        Class<? extends Object> term292756 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term292755 = ((Class) term292756).getDeclaredField((String) "INTERFACE");
        ((Field) term292755).setAccessible(true);
        Object enum536 = ((Field) term292755).get((Object) null);
        term292452 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term292452, term292452.getClass(), "this$0", null);
        setField(term292452, term292452.getClass(), "call", null);
        setField(term292452, term292452.getClass(), "prototype", null);
        setField(term292452, term292452.getClass(), "kind", enum536);
        setField(term292452, term292452.getClass(), "typeOfThis", null);
        setField(term292452, term292452.getClass(), "source", null);
        setField(term292452, term292452.getClass(), "implementedInterfaces", null);
        setField(term292452, term292452.getClass(), "subTypes", null);
        setField(term292452, term292452.getClass(), "templateTypeName", null);
        setField(term292452, term292452.getClass(), "className", null);
        setField(term292452, term292452.getClass(), "properties", null);
        setField(term292452, term292452.getClass(), "implicitPrototype", null);
        setBooleanField(term292452, term292452.getClass(), "nativeType", false);
        setBooleanField(term292452, term292452.getClass(), "visited", false);
        setField(term292452, term292452.getClass(), "docInfo", null);
        setBooleanField(term292452, term292452.getClass(), "unknown", false);
        setBooleanField(term292452, term292452.getClass(), "resolved", false);
        setField(term292452, term292452.getClass(), "resolveResult", null);
        setField(term292452, term292452.getClass(), "registry", null);
        Class<? extends Object> term293050 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term293049 = ((Class) term293050).getDeclaredField((String) "INTERFACE");
        ((Field) term293049).setAccessible(true);
        Object enum537 = ((Field) term293049).get((Object) null);
        term292456 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term292456, term292456.getClass(), "call", null);
        setField(term292456, term292456.getClass(), "prototype", null);
        setField(term292456, term292456.getClass(), "kind", enum537);
        setField(term292456, term292456.getClass(), "typeOfThis", null);
        setField(term292456, term292456.getClass(), "source", null);
        setField(term292456, term292456.getClass(), "implementedInterfaces", null);
        setField(term292456, term292456.getClass(), "subTypes", null);
        setField(term292456, term292456.getClass(), "templateTypeName", null);
        setField(term292456, term292456.getClass(), "className", null);
        setField(term292456, term292456.getClass(), "properties", null);
        setField(term292456, term292456.getClass(), "implicitPrototype", null);
        setBooleanField(term292456, term292456.getClass(), "nativeType", false);
        setBooleanField(term292456, term292456.getClass(), "visited", false);
        setField(term292456, term292456.getClass(), "docInfo", null);
        setBooleanField(term292456, term292456.getClass(), "unknown", false);
        setBooleanField(term292456, term292456.getClass(), "resolved", false);
        setField(term292456, term292456.getClass(), "resolveResult", null);
        setField(term292456, term292456.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term291997;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term291739, args);
        assertTrue(recursiveEquals(term291739, term292452));
        assertTrue(recursiveEquals(term291997, term292456));
        assertTrue(recursiveEquals(retValue, true));
    }

};


