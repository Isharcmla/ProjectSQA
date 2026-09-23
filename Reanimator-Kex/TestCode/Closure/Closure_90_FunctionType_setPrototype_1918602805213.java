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

public class FunctionType_setPrototype_1918602805213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117043;
     Object term117309;
     Object term118567;
     Object term118572;

    public FunctionType_setPrototype_1918602805213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term118575 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term118574 = ((Class) term118575).getDeclaredField((String) "INTERFACE");
        ((Field) term118574).setAccessible(true);
        Object enum234 = ((Field) term118574).get((Object) null);
        term117043 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term117043, term117043.getClass(), "kind", enum234);
        setField(term117043, term117043.getClass(), "prototype", null);
        term117309 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Class<? extends Object> term118869 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term118868 = ((Class) term118869).getDeclaredField((String) "INTERFACE");
        ((Field) term118868).setAccessible(true);
        Object enum235 = ((Field) term118868).get((Object) null);
        term118567 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term118568 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term118567, term118567.getClass(), "call", null);
        setField(term118568, term118568.getClass(), "ownerFunction", null);
        setField(term118568, term118568.getClass(), "className", null);
        setField(term118568, term118568.getClass(), "properties", null);
        setBooleanField(term118568, term118568.getClass(), "nativeType", false);
        setField(term118568, term118568.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term118568, term118568.getClass(), "prettyPrint", false);
        setBooleanField(term118568, term118568.getClass(), "visited", false);
        setField(term118568, term118568.getClass(), "docInfo", null);
        setBooleanField(term118568, term118568.getClass(), "unknown", false);
        setBooleanField(term118568, term118568.getClass(), "resolved", false);
        setField(term118568, term118568.getClass(), "resolveResult", null);
        setField(term118568, term118568.getClass(), "registry", null);
        setField(term118567, term118567.getClass(), "prototype", term118568);
        setField(term118567, term118567.getClass(), "kind", enum235);
        setField(term118567, term118567.getClass(), "typeOfThis", null);
        setField(term118567, term118567.getClass(), "source", null);
        setField(term118567, term118567.getClass(), "implementedInterfaces", null);
        setField(term118567, term118567.getClass(), "subTypes", null);
        setField(term118567, term118567.getClass(), "templateTypeName", null);
        setField(term118567, term118567.getClass(), "className", null);
        setField(term118567, term118567.getClass(), "properties", null);
        setBooleanField(term118567, term118567.getClass(), "nativeType", false);
        setField(term118567, term118567.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term118567, term118567.getClass(), "prettyPrint", false);
        setBooleanField(term118567, term118567.getClass(), "visited", false);
        setField(term118567, term118567.getClass(), "docInfo", null);
        setBooleanField(term118567, term118567.getClass(), "unknown", false);
        setBooleanField(term118567, term118567.getClass(), "resolved", false);
        setField(term118567, term118567.getClass(), "resolveResult", null);
        setField(term118567, term118567.getClass(), "registry", null);
        term118572 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term118572, term118572.getClass(), "ownerFunction", null);
        setField(term118572, term118572.getClass(), "className", null);
        setField(term118572, term118572.getClass(), "properties", null);
        setBooleanField(term118572, term118572.getClass(), "nativeType", false);
        setField(term118572, term118572.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term118572, term118572.getClass(), "prettyPrint", false);
        setBooleanField(term118572, term118572.getClass(), "visited", false);
        setField(term118572, term118572.getClass(), "docInfo", null);
        setBooleanField(term118572, term118572.getClass(), "unknown", false);
        setBooleanField(term118572, term118572.getClass(), "resolved", false);
        setField(term118572, term118572.getClass(), "resolveResult", null);
        setField(term118572, term118572.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType");
        Object[] args = new Object[1];
        args[0] = term117309;
        Object retValue = callMethod(klass, "setPrototype", argTypes, term117043, args);
        assertTrue(recursiveEquals(term117043, term118567));
        assertTrue(recursiveEquals(term117309, term118572));
        assertTrue(recursiveEquals(retValue, true));
    }

};


