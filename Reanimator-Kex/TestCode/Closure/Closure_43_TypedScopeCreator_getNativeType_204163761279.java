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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TypedScopeCreator_getNativeType_204163761279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46804;
     Object enum7;

    public TypedScopeCreator_getNativeType_204163761279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46804 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term46908 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term46908, term46908.getClass(), "nativeTypes", null);
        setField(term46804, term46804.getClass(), "typeRegistry", term46908);
        Class<? extends Object> term48889 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term48888 = ((Class) term48889).getDeclaredField((String) "OBJECT_TYPE");
        ((Field) term48888).setAccessible(true);
        enum7 = ((Field) term48888).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[1];
        args[0] = enum7;
        try {
            callMethod(klass, "getNativeType", argTypes, term46804, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


