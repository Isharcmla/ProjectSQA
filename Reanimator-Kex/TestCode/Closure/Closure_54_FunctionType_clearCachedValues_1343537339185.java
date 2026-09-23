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
import java.lang.String;
import java.lang.Object;

public class FunctionType_clearCachedValues_1343537339185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92861;

    public FunctionType_clearCachedValues_1343537339185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term93411 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term93410 = ((Class) term93411).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term93410).setAccessible(true);
        Object enum186 = ((Field) term93410).get((Object) null);
        term92861 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term93409 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setBooleanField(term92861, term92861.getClass(), "unknown", false);
        setField(term92861, term92861.getClass(), "subTypes", null);
        setBooleanField(term92861, term92861.getClass(), "nativeType", false);
        setField(term92861, term92861.getClass(), "kind", enum186);
        setField(term92861, term92861.getClass(), "prototype", term93409);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearCachedValues", argTypes, term92861, args);
    }

};


