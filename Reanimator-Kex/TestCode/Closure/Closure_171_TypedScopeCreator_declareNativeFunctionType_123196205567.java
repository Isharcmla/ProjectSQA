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

public class TypedScopeCreator_declareNativeFunctionType_123196205567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25180;
     Object enum7;

    public TypedScopeCreator_declareNativeFunctionType_123196205567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25180 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term25284 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term24898 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term25284, term25284.getClass(), "nativeTypes", term24898);
        setField(term25180, term25180.getClass(), "typeRegistry", term25284);
        Class<? extends Object> term26260 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term26259 = ((Class) term26260).getDeclaredField((String) "VOID_TYPE");
        ((Field) term26259).setAccessible(true);
        enum7 = ((Field) term26259).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = enum7;
        try {
            callMethod(klass, "declareNativeFunctionType", argTypes, term25180, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


