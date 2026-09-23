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

public class FunctionType_getInstanceType_1940487563204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102187;
     Object term103823;

    public FunctionType_getInstanceType_1940487563204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term103828 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term103827 = ((Class) term103828).getDeclaredField((String) "INTERFACE");
        ((Field) term103827).setAccessible(true);
        Object enum217 = ((Field) term103827).get((Object) null);
        term102187 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term102187, term102187.getClass(), "kind", enum217);
        Class<? extends Object> term104122 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term104121 = ((Class) term104122).getDeclaredField((String) "INTERFACE");
        ((Field) term104121).setAccessible(true);
        Object enum218 = ((Field) term104121).get((Object) null);
        term103823 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term103823, term103823.getClass(), "call", null);
        setField(term103823, term103823.getClass(), "prototype", null);
        setField(term103823, term103823.getClass(), "kind", enum218);
        setField(term103823, term103823.getClass(), "typeOfThis", null);
        setField(term103823, term103823.getClass(), "source", null);
        setField(term103823, term103823.getClass(), "implementedInterfaces", null);
        setField(term103823, term103823.getClass(), "subTypes", null);
        setField(term103823, term103823.getClass(), "templateTypeName", null);
        setField(term103823, term103823.getClass(), "className", null);
        setField(term103823, term103823.getClass(), "properties", null);
        setField(term103823, term103823.getClass(), "implicitPrototype", null);
        setBooleanField(term103823, term103823.getClass(), "nativeType", false);
        setBooleanField(term103823, term103823.getClass(), "prettyPrint", false);
        setBooleanField(term103823, term103823.getClass(), "visited", false);
        setField(term103823, term103823.getClass(), "docInfo", null);
        setBooleanField(term103823, term103823.getClass(), "unknown", false);
        setBooleanField(term103823, term103823.getClass(), "resolved", false);
        setField(term103823, term103823.getClass(), "resolveResult", null);
        setField(term103823, term103823.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getInstanceType", argTypes, term102187, args);
        assertTrue(recursiveEquals(term102187, term103823));
        assertTrue(recursiveEquals(retValue, null));
    }

};


