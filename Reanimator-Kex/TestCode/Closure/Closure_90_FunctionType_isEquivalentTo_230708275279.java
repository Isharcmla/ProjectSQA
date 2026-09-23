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

public class FunctionType_isEquivalentTo_230708275279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168382;
     Object term168640;
     Object term168979;
     Object term168983;

    public FunctionType_isEquivalentTo_230708275279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term168986 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term168985 = ((Class) term168986).getDeclaredField((String) "INTERFACE");
        ((Field) term168985).setAccessible(true);
        Object enum310 = ((Field) term168985).get((Object) null);
        term168382 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term168382, term168382.getClass(), "kind", enum310);
        term168640 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class<? extends Object> term169280 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term169279 = ((Class) term169280).getDeclaredField((String) "INTERFACE");
        ((Field) term169279).setAccessible(true);
        Object enum311 = ((Field) term169279).get((Object) null);
        term168979 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term168979, term168979.getClass(), "call", null);
        setField(term168979, term168979.getClass(), "prototype", null);
        setField(term168979, term168979.getClass(), "kind", enum311);
        setField(term168979, term168979.getClass(), "typeOfThis", null);
        setField(term168979, term168979.getClass(), "source", null);
        setField(term168979, term168979.getClass(), "implementedInterfaces", null);
        setField(term168979, term168979.getClass(), "subTypes", null);
        setField(term168979, term168979.getClass(), "templateTypeName", null);
        setField(term168979, term168979.getClass(), "className", null);
        setField(term168979, term168979.getClass(), "properties", null);
        setBooleanField(term168979, term168979.getClass(), "nativeType", false);
        setField(term168979, term168979.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term168979, term168979.getClass(), "prettyPrint", false);
        setBooleanField(term168979, term168979.getClass(), "visited", false);
        setField(term168979, term168979.getClass(), "docInfo", null);
        setBooleanField(term168979, term168979.getClass(), "unknown", false);
        setBooleanField(term168979, term168979.getClass(), "resolved", false);
        setField(term168979, term168979.getClass(), "resolveResult", null);
        setField(term168979, term168979.getClass(), "registry", null);
        term168983 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term168983, term168983.getClass(), "call", null);
        setField(term168983, term168983.getClass(), "prototype", null);
        setField(term168983, term168983.getClass(), "kind", null);
        setField(term168983, term168983.getClass(), "typeOfThis", null);
        setField(term168983, term168983.getClass(), "source", null);
        setField(term168983, term168983.getClass(), "implementedInterfaces", null);
        setField(term168983, term168983.getClass(), "subTypes", null);
        setField(term168983, term168983.getClass(), "templateTypeName", null);
        setField(term168983, term168983.getClass(), "className", null);
        setField(term168983, term168983.getClass(), "properties", null);
        setBooleanField(term168983, term168983.getClass(), "nativeType", false);
        setField(term168983, term168983.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term168983, term168983.getClass(), "prettyPrint", false);
        setBooleanField(term168983, term168983.getClass(), "visited", false);
        setField(term168983, term168983.getClass(), "docInfo", null);
        setBooleanField(term168983, term168983.getClass(), "unknown", false);
        setBooleanField(term168983, term168983.getClass(), "resolved", false);
        setField(term168983, term168983.getClass(), "resolveResult", null);
        setField(term168983, term168983.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term168640;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term168382, args);
        assertTrue(recursiveEquals(term168382, term168979));
        assertTrue(recursiveEquals(term168640, term168983));
        assertTrue(recursiveEquals(retValue, false));
    }

};


