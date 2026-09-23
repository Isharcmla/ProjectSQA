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

public class FunctionType_isEquivalentTo_230708275305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185665;
     Object term186219;
     Object term186957;
     Object term186961;

    public FunctionType_isEquivalentTo_230708275305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term186967 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term186966 = ((Class) term186967).getDeclaredField((String) "INTERFACE");
        ((Field) term186966).setAccessible(true);
        Object enum338 = ((Field) term186966).get((Object) null);
        term185665 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term185665, term185665.getClass(), "kind", enum338);
        Class<? extends Object> term187261 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term187260 = ((Class) term187261).getDeclaredField((String) "INTERFACE");
        ((Field) term187260).setAccessible(true);
        Object enum339 = ((Field) term187260).get((Object) null);
        term186219 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term186219, term186219.getClass(), "kind", enum339);
        Class<? extends Object> term187555 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term187554 = ((Class) term187555).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term187554).setAccessible(true);
        Object enum340 = ((Field) term187554).get((Object) null);
        term186957 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term186957, term186957.getClass(), "call", null);
        setField(term186957, term186957.getClass(), "prototype", null);
        setField(term186957, term186957.getClass(), "kind", enum340);
        setField(term186957, term186957.getClass(), "typeOfThis", null);
        setField(term186957, term186957.getClass(), "source", null);
        setField(term186957, term186957.getClass(), "implementedInterfaces", null);
        setField(term186957, term186957.getClass(), "subTypes", null);
        setField(term186957, term186957.getClass(), "templateTypeName", null);
        setField(term186957, term186957.getClass(), "className", null);
        setField(term186957, term186957.getClass(), "properties", null);
        setBooleanField(term186957, term186957.getClass(), "nativeType", false);
        setField(term186957, term186957.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term186957, term186957.getClass(), "prettyPrint", false);
        setBooleanField(term186957, term186957.getClass(), "visited", false);
        setField(term186957, term186957.getClass(), "docInfo", null);
        setBooleanField(term186957, term186957.getClass(), "unknown", false);
        setBooleanField(term186957, term186957.getClass(), "resolved", false);
        setField(term186957, term186957.getClass(), "resolveResult", null);
        setField(term186957, term186957.getClass(), "registry", null);
        Class<? extends Object> term187855 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term187854 = ((Class) term187855).getDeclaredField((String) "INTERFACE");
        ((Field) term187854).setAccessible(true);
        Object enum341 = ((Field) term187854).get((Object) null);
        term186961 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term186961, term186961.getClass(), "call", null);
        setField(term186961, term186961.getClass(), "prototype", null);
        setField(term186961, term186961.getClass(), "kind", enum341);
        setField(term186961, term186961.getClass(), "typeOfThis", null);
        setField(term186961, term186961.getClass(), "source", null);
        setField(term186961, term186961.getClass(), "implementedInterfaces", null);
        setField(term186961, term186961.getClass(), "subTypes", null);
        setField(term186961, term186961.getClass(), "templateTypeName", null);
        setField(term186961, term186961.getClass(), "className", null);
        setField(term186961, term186961.getClass(), "properties", null);
        setBooleanField(term186961, term186961.getClass(), "nativeType", false);
        setField(term186961, term186961.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term186961, term186961.getClass(), "prettyPrint", false);
        setBooleanField(term186961, term186961.getClass(), "visited", false);
        setField(term186961, term186961.getClass(), "docInfo", null);
        setBooleanField(term186961, term186961.getClass(), "unknown", false);
        setBooleanField(term186961, term186961.getClass(), "resolved", false);
        setField(term186961, term186961.getClass(), "resolveResult", null);
        setField(term186961, term186961.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term186219;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term185665, args);
        assertTrue(recursiveEquals(term185665, term186957));
        assertTrue(recursiveEquals(term186219, term186961));
        assertTrue(recursiveEquals(retValue, false));
    }

};


