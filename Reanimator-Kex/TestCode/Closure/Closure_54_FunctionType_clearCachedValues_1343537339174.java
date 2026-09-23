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

public class FunctionType_clearCachedValues_1343537339174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85817;

    public FunctionType_clearCachedValues_1343537339174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term85967 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term85966 = ((Class) term85967).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term85966).setAccessible(true);
        Object enum182 = ((Field) term85966).get((Object) null);
        term85817 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term85817, term85817.getClass(), "unknown", false);
        setField(term85817, term85817.getClass(), "subTypes", null);
        setBooleanField(term85817, term85817.getClass(), "nativeType", false);
        setField(term85817, term85817.getClass(), "kind", enum182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearCachedValues", argTypes, term85817, args);
    }

};


