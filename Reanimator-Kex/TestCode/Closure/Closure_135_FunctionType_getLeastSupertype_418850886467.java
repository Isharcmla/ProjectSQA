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

public class FunctionType_getLeastSupertype_418850886467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323922;
     Object term324178;
     Object term324634;
     Object term324638;
     Object term324548;

    public FunctionType_getLeastSupertype_418850886467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term324643 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term324642 = ((Class) term324643).getDeclaredField((String) "INTERFACE");
        ((Field) term324642).setAccessible(true);
        Object enum591 = ((Field) term324642).get((Object) null);
        term323922 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term323922, term323922.getClass(), "kind", enum591);
        term324178 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term324178, term324178.getClass(), "kind", enum591);
        Class<? extends Object> term324937 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term324936 = ((Class) term324937).getDeclaredField((String) "INTERFACE");
        ((Field) term324936).setAccessible(true);
        Object enum592 = ((Field) term324936).get((Object) null);
        term324634 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term324634, term324634.getClass(), "this$0", null);
        setField(term324634, term324634.getClass(), "call", null);
        setField(term324634, term324634.getClass(), "prototype", null);
        setField(term324634, term324634.getClass(), "kind", enum592);
        setField(term324634, term324634.getClass(), "typeOfThis", null);
        setField(term324634, term324634.getClass(), "source", null);
        setField(term324634, term324634.getClass(), "implementedInterfaces", null);
        setField(term324634, term324634.getClass(), "subTypes", null);
        setField(term324634, term324634.getClass(), "templateTypeName", null);
        setField(term324634, term324634.getClass(), "className", null);
        setField(term324634, term324634.getClass(), "properties", null);
        setField(term324634, term324634.getClass(), "implicitPrototype", null);
        setBooleanField(term324634, term324634.getClass(), "nativeType", false);
        setBooleanField(term324634, term324634.getClass(), "visited", false);
        setField(term324634, term324634.getClass(), "docInfo", null);
        setBooleanField(term324634, term324634.getClass(), "unknown", false);
        setBooleanField(term324634, term324634.getClass(), "resolved", false);
        setField(term324634, term324634.getClass(), "resolveResult", null);
        setField(term324634, term324634.getClass(), "registry", null);
        Class<? extends Object> term325231 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term325230 = ((Class) term325231).getDeclaredField((String) "INTERFACE");
        ((Field) term325230).setAccessible(true);
        Object enum593 = ((Field) term325230).get((Object) null);
        term324638 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term324638, term324638.getClass(), "this$0", null);
        setField(term324638, term324638.getClass(), "call", null);
        setField(term324638, term324638.getClass(), "prototype", null);
        setField(term324638, term324638.getClass(), "kind", enum593);
        setField(term324638, term324638.getClass(), "typeOfThis", null);
        setField(term324638, term324638.getClass(), "source", null);
        setField(term324638, term324638.getClass(), "implementedInterfaces", null);
        setField(term324638, term324638.getClass(), "subTypes", null);
        setField(term324638, term324638.getClass(), "templateTypeName", null);
        setField(term324638, term324638.getClass(), "className", null);
        setField(term324638, term324638.getClass(), "properties", null);
        setField(term324638, term324638.getClass(), "implicitPrototype", null);
        setBooleanField(term324638, term324638.getClass(), "nativeType", false);
        setBooleanField(term324638, term324638.getClass(), "visited", false);
        setField(term324638, term324638.getClass(), "docInfo", null);
        setBooleanField(term324638, term324638.getClass(), "unknown", false);
        setBooleanField(term324638, term324638.getClass(), "resolved", false);
        setField(term324638, term324638.getClass(), "resolveResult", null);
        setField(term324638, term324638.getClass(), "registry", null);
        Class<? extends Object> term325525 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term325524 = ((Class) term325525).getDeclaredField((String) "INTERFACE");
        ((Field) term325524).setAccessible(true);
        Object enum594 = ((Field) term325524).get((Object) null);
        term324548 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term324548, term324548.getClass(), "this$0", null);
        setField(term324548, term324548.getClass(), "call", null);
        setField(term324548, term324548.getClass(), "prototype", null);
        setField(term324548, term324548.getClass(), "kind", enum594);
        setField(term324548, term324548.getClass(), "typeOfThis", null);
        setField(term324548, term324548.getClass(), "source", null);
        setField(term324548, term324548.getClass(), "implementedInterfaces", null);
        setField(term324548, term324548.getClass(), "subTypes", null);
        setField(term324548, term324548.getClass(), "templateTypeName", null);
        setField(term324548, term324548.getClass(), "className", null);
        setField(term324548, term324548.getClass(), "properties", null);
        setField(term324548, term324548.getClass(), "implicitPrototype", null);
        setBooleanField(term324548, term324548.getClass(), "nativeType", false);
        setBooleanField(term324548, term324548.getClass(), "visited", false);
        setField(term324548, term324548.getClass(), "docInfo", null);
        setBooleanField(term324548, term324548.getClass(), "unknown", false);
        setBooleanField(term324548, term324548.getClass(), "resolved", false);
        setField(term324548, term324548.getClass(), "resolveResult", null);
        setField(term324548, term324548.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term324178;
        Object retValue = callMethod(klass, "getLeastSupertype", argTypes, term323922, args);
        assertTrue(recursiveEquals(term323922, term324634));
        assertTrue(recursiveEquals(term324178, term324638));
        assertTrue(recursiveEquals(retValue, term324548));
    }

};


