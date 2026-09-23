package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TypedScopeCreator_declareNativeFunctionType_123196205559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24218;
     Object enum6;

    public TypedScopeCreator_declareNativeFunctionType_123196205559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24218 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term24322 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term23936 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term24322, term24322.getClass(), "nativeTypes", term23936);
        setField(term24218, term24218.getClass(), "typeRegistry", term24322);
        Class<? extends Object> term24462 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term24461 = ((Class) term24462).getDeclaredField((String) "VOID_TYPE");
        ((Field) term24461).setAccessible(true);
        enum6 = ((Field) term24461).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = enum6;
        callMethod(klass, "declareNativeFunctionType", argTypes, term24218, args);
    }

};


