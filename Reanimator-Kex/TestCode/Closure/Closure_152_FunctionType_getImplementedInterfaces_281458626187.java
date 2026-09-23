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

public class FunctionType_getImplementedInterfaces_281458626187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93491;
     Object term94928;

    public FunctionType_getImplementedInterfaces_281458626187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term94933 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term94932 = ((Class) term94933).getDeclaredField((String) "INTERFACE");
        ((Field) term94932).setAccessible(true);
        Object enum198 = ((Field) term94932).get((Object) null);
        term93491 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term93491, term93491.getClass(), "kind", enum198);
        Class<? extends Object> term95227 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term95226 = ((Class) term95227).getDeclaredField((String) "ORDINARY");
        ((Field) term95226).setAccessible(true);
        Object enum199 = ((Field) term95226).get((Object) null);
        term94928 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term94928, term94928.getClass(), "call", null);
        setField(term94928, term94928.getClass(), "prototype", null);
        setField(term94928, term94928.getClass(), "kind", enum199);
        setField(term94928, term94928.getClass(), "typeOfThis", null);
        setField(term94928, term94928.getClass(), "source", null);
        setField(term94928, term94928.getClass(), "implementedInterfaces", null);
        setField(term94928, term94928.getClass(), "subTypes", null);
        setField(term94928, term94928.getClass(), "templateTypeName", null);
        setField(term94928, term94928.getClass(), "className", null);
        setField(term94928, term94928.getClass(), "properties", null);
        setBooleanField(term94928, term94928.getClass(), "nativeType", false);
        setField(term94928, term94928.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term94928, term94928.getClass(), "prettyPrint", false);
        setBooleanField(term94928, term94928.getClass(), "visited", false);
        setField(term94928, term94928.getClass(), "docInfo", null);
        setBooleanField(term94928, term94928.getClass(), "unknown", false);
        setBooleanField(term94928, term94928.getClass(), "resolved", false);
        setField(term94928, term94928.getClass(), "resolveResult", null);
        setField(term94928, term94928.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getImplementedInterfaces", argTypes, term93491, args);
        assertTrue(recursiveEquals(term93491, term94928));
        assertTrue(recursiveEquals(retValue, null));
    }

};


