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

public class TypedScopeCreator_getNativeType_204163761268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30692;
     Object enum7;

    public TypedScopeCreator_getNativeType_204163761268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30692 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term30796 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term30409 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term30796, term30796.getClass(), "nativeTypes", term30409);
        setField(term30692, term30692.getClass(), "typeRegistry", term30796);
        Class<? extends Object> term30936 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term30935 = ((Class) term30936).getDeclaredField((String) "NUMBER_STRING");
        ((Field) term30935).setAccessible(true);
        enum7 = ((Field) term30935).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[1];
        args[0] = enum7;
        callMethod(klass, "getNativeType", argTypes, term30692, args);
    }

};


