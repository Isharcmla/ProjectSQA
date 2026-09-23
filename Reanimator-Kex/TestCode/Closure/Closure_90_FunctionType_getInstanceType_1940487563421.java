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

public class FunctionType_getInstanceType_1940487563421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326803;
     Object term327575;

    public FunctionType_getInstanceType_1940487563421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term327580 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term327579 = ((Class) term327580).getDeclaredField((String) "ORDINARY");
        ((Field) term327579).setAccessible(true);
        Object enum565 = ((Field) term327579).get((Object) null);
        term326803 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term326803, term326803.getClass(), "kind", enum565);
        Class<? extends Object> term327871 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term327870 = ((Class) term327871).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term327870).setAccessible(true);
        Object enum566 = ((Field) term327870).get((Object) null);
        term327575 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term327575, term327575.getClass(), "call", null);
        setField(term327575, term327575.getClass(), "prototype", null);
        setField(term327575, term327575.getClass(), "kind", enum566);
        setField(term327575, term327575.getClass(), "typeOfThis", null);
        setField(term327575, term327575.getClass(), "source", null);
        setField(term327575, term327575.getClass(), "implementedInterfaces", null);
        setField(term327575, term327575.getClass(), "subTypes", null);
        setField(term327575, term327575.getClass(), "templateTypeName", null);
        setField(term327575, term327575.getClass(), "className", null);
        setField(term327575, term327575.getClass(), "properties", null);
        setBooleanField(term327575, term327575.getClass(), "nativeType", false);
        setField(term327575, term327575.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term327575, term327575.getClass(), "prettyPrint", false);
        setBooleanField(term327575, term327575.getClass(), "visited", false);
        setField(term327575, term327575.getClass(), "docInfo", null);
        setBooleanField(term327575, term327575.getClass(), "unknown", false);
        setBooleanField(term327575, term327575.getClass(), "resolved", false);
        setField(term327575, term327575.getClass(), "resolveResult", null);
        setField(term327575, term327575.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getInstanceType", argTypes, term326803, args);
        assertTrue(recursiveEquals(term326803, term327575));
        assertTrue(recursiveEquals(retValue, null));
    }

};


