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

public class FunctionType_isSubtype_2101002158597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term574378;
     Object term574634;

    public FunctionType_isSubtype_2101002158597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term575251 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term575250 = ((Class) term575251).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term575250).setAccessible(true);
        Object enum1046 = ((Field) term575250).get((Object) null);
        term574378 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term574378, term574378.getClass(), "kind", enum1046);
        term574634 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term574634;
        try {
            callMethod(klass, "isSubtype", argTypes, term574378, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


