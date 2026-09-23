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

public class FunctionType_clearCachedValues_1343537339150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71036;

    public FunctionType_clearCachedValues_1343537339150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term71582 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term71581 = ((Class) term71582).getDeclaredField((String) "ORDINARY");
        ((Field) term71581).setAccessible(true);
        Object enum169 = ((Field) term71581).get((Object) null);
        term71036 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term71580 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term71036, term71036.getClass(), "unknown", false);
        setField(term71036, term71036.getClass(), "subTypes", null);
        setBooleanField(term71036, term71036.getClass(), "nativeType", false);
        setField(term71036, term71036.getClass(), "kind", enum169);
        setField(term71036, term71036.getClass(), "prototype", term71580);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearCachedValues", argTypes, term71036, args);
    }

};


