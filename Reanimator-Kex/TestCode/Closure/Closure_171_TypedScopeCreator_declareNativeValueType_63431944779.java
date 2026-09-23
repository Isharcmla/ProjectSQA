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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TypedScopeCreator_declareNativeValueType_63431944779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31780;
     Object enum9;

    public TypedScopeCreator_declareNativeValueType_63431944779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31780 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term31884 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term31497 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term31884, term31884.getClass(), "nativeTypes", term31497);
        setField(term31780, term31780.getClass(), "typeRegistry", term31884);
        Class<? extends Object> term32637 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term32636 = ((Class) term32637).getDeclaredField((String) "OBJECT_NUMBER_STRING_BOOLEAN");
        ((Field) term32636).setAccessible(true);
        enum9 = ((Field) term32636).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = enum9;
        try {
            callMethod(klass, "declareNativeValueType", argTypes, term31780, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


