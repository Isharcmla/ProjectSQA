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

public class FunctionType_getLeastSupertype_418850886343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233653;
     Object term234105;
     Object term234109;
     Object term234029;

    public FunctionType_getLeastSupertype_418850886343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term234114 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term234113 = ((Class) term234114).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term234113).setAccessible(true);
        Object enum410 = ((Field) term234113).get((Object) null);
        term233653 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term233653, term233653.getClass(), "kind", enum410);
        Class<? extends Object> term234414 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term234413 = ((Class) term234414).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term234413).setAccessible(true);
        Object enum411 = ((Field) term234413).get((Object) null);
        term234105 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term234105, term234105.getClass(), "call", null);
        setField(term234105, term234105.getClass(), "prototype", null);
        setField(term234105, term234105.getClass(), "kind", enum411);
        setField(term234105, term234105.getClass(), "typeOfThis", null);
        setField(term234105, term234105.getClass(), "source", null);
        setField(term234105, term234105.getClass(), "implementedInterfaces", null);
        setField(term234105, term234105.getClass(), "subTypes", null);
        setField(term234105, term234105.getClass(), "templateTypeName", null);
        setField(term234105, term234105.getClass(), "className", null);
        setField(term234105, term234105.getClass(), "properties", null);
        setBooleanField(term234105, term234105.getClass(), "nativeType", false);
        setField(term234105, term234105.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term234105, term234105.getClass(), "prettyPrint", false);
        setBooleanField(term234105, term234105.getClass(), "visited", false);
        setField(term234105, term234105.getClass(), "docInfo", null);
        setBooleanField(term234105, term234105.getClass(), "unknown", false);
        setBooleanField(term234105, term234105.getClass(), "resolved", false);
        setField(term234105, term234105.getClass(), "resolveResult", null);
        setField(term234105, term234105.getClass(), "registry", null);
        Class<? extends Object> term234714 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term234713 = ((Class) term234714).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term234713).setAccessible(true);
        Object enum412 = ((Field) term234713).get((Object) null);
        term234109 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term234109, term234109.getClass(), "call", null);
        setField(term234109, term234109.getClass(), "prototype", null);
        setField(term234109, term234109.getClass(), "kind", enum412);
        setField(term234109, term234109.getClass(), "typeOfThis", null);
        setField(term234109, term234109.getClass(), "source", null);
        setField(term234109, term234109.getClass(), "implementedInterfaces", null);
        setField(term234109, term234109.getClass(), "subTypes", null);
        setField(term234109, term234109.getClass(), "templateTypeName", null);
        setField(term234109, term234109.getClass(), "className", null);
        setField(term234109, term234109.getClass(), "properties", null);
        setBooleanField(term234109, term234109.getClass(), "nativeType", false);
        setField(term234109, term234109.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term234109, term234109.getClass(), "prettyPrint", false);
        setBooleanField(term234109, term234109.getClass(), "visited", false);
        setField(term234109, term234109.getClass(), "docInfo", null);
        setBooleanField(term234109, term234109.getClass(), "unknown", false);
        setBooleanField(term234109, term234109.getClass(), "resolved", false);
        setField(term234109, term234109.getClass(), "resolveResult", null);
        setField(term234109, term234109.getClass(), "registry", null);
        Class<? extends Object> term235014 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term235013 = ((Class) term235014).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term235013).setAccessible(true);
        Object enum413 = ((Field) term235013).get((Object) null);
        term234029 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term234029, term234029.getClass(), "call", null);
        setField(term234029, term234029.getClass(), "prototype", null);
        setField(term234029, term234029.getClass(), "kind", enum413);
        setField(term234029, term234029.getClass(), "typeOfThis", null);
        setField(term234029, term234029.getClass(), "source", null);
        setField(term234029, term234029.getClass(), "implementedInterfaces", null);
        setField(term234029, term234029.getClass(), "subTypes", null);
        setField(term234029, term234029.getClass(), "templateTypeName", null);
        setField(term234029, term234029.getClass(), "className", null);
        setField(term234029, term234029.getClass(), "properties", null);
        setBooleanField(term234029, term234029.getClass(), "nativeType", false);
        setField(term234029, term234029.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term234029, term234029.getClass(), "prettyPrint", false);
        setBooleanField(term234029, term234029.getClass(), "visited", false);
        setField(term234029, term234029.getClass(), "docInfo", null);
        setBooleanField(term234029, term234029.getClass(), "unknown", false);
        setBooleanField(term234029, term234029.getClass(), "resolved", false);
        setField(term234029, term234029.getClass(), "resolveResult", null);
        setField(term234029, term234029.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term233653;
        Object retValue = callMethod(klass, "getLeastSupertype", argTypes, term233653, args);
        assertTrue(recursiveEquals(term233653, term234105));
        assertTrue(recursiveEquals(term233653, term234109));
        assertTrue(recursiveEquals(retValue, term234029));
    }

};


