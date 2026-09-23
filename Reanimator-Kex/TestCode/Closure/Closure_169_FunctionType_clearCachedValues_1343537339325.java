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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class FunctionType_clearCachedValues_1343537339325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297910;

    public FunctionType_clearCachedValues_1343537339325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term298945 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term298944 = ((Class) term298945).getDeclaredField((String) "INTERFACE");
        ((Field) term298944).setAccessible(true);
        Object enum526 = ((Field) term298944).get((Object) null);
        term297910 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term297910, term297910.getClass(), "unknown", false);
        setField(term297910, term297910.getClass(), "subTypes", null);
        setBooleanField(term297910, term297910.getClass(), "nativeType", false);
        setField(term297910, term297910.getClass(), "kind", enum526);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clearCachedValues", argTypes, term297910, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


