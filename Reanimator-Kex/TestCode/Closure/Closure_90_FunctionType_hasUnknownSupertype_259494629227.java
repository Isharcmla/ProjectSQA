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

public class FunctionType_hasUnknownSupertype_259494629227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123931;
     Object term124577;

    public FunctionType_hasUnknownSupertype_259494629227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term124584 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term124583 = ((Class) term124584).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term124583).setAccessible(true);
        Object enum237 = ((Field) term124583).get((Object) null);
        term123931 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term124197 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term123931, term123931.getClass(), "kind", enum237);
        setBooleanField(term123931, term123931.getClass(), "unknown", false);
        setField(term123931, term123931.getClass(), "prototype", term124197);
        Class<? extends Object> term124884 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term124883 = ((Class) term124884).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term124883).setAccessible(true);
        Object enum238 = ((Field) term124883).get((Object) null);
        term124577 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term124578 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term124577, term124577.getClass(), "call", null);
        setField(term124578, term124578.getClass(), "ownerFunction", null);
        setField(term124578, term124578.getClass(), "className", null);
        setField(term124578, term124578.getClass(), "properties", null);
        setBooleanField(term124578, term124578.getClass(), "nativeType", false);
        setField(term124578, term124578.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term124578, term124578.getClass(), "prettyPrint", false);
        setBooleanField(term124578, term124578.getClass(), "visited", false);
        setField(term124578, term124578.getClass(), "docInfo", null);
        setBooleanField(term124578, term124578.getClass(), "unknown", false);
        setBooleanField(term124578, term124578.getClass(), "resolved", false);
        setField(term124578, term124578.getClass(), "resolveResult", null);
        setField(term124578, term124578.getClass(), "registry", null);
        setField(term124577, term124577.getClass(), "prototype", term124578);
        setField(term124577, term124577.getClass(), "kind", enum238);
        setField(term124577, term124577.getClass(), "typeOfThis", null);
        setField(term124577, term124577.getClass(), "source", null);
        setField(term124577, term124577.getClass(), "implementedInterfaces", null);
        setField(term124577, term124577.getClass(), "subTypes", null);
        setField(term124577, term124577.getClass(), "templateTypeName", null);
        setField(term124577, term124577.getClass(), "className", null);
        setField(term124577, term124577.getClass(), "properties", null);
        setBooleanField(term124577, term124577.getClass(), "nativeType", false);
        setField(term124577, term124577.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term124577, term124577.getClass(), "prettyPrint", false);
        setBooleanField(term124577, term124577.getClass(), "visited", false);
        setField(term124577, term124577.getClass(), "docInfo", null);
        setBooleanField(term124577, term124577.getClass(), "unknown", false);
        setBooleanField(term124577, term124577.getClass(), "resolved", false);
        setField(term124577, term124577.getClass(), "resolveResult", null);
        setField(term124577, term124577.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasUnknownSupertype", argTypes, term123931, args);
        assertTrue(recursiveEquals(term123931, term124577));
        assertTrue(recursiveEquals(retValue, false));
    }

};


