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

public class FunctionType_getGreatestSubtype_679591709486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406566;
     Object term406928;

    public FunctionType_getGreatestSubtype_679591709486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term479289 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term479288 = ((Class) term479289).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term479288).setAccessible(true);
        Object enum692 = ((Field) term479288).get((Object) null);
        term406566 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term406818 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term406566, term406566.getClass(), "kind", enum692);
        setField(term406566, term406566.getClass(), "registry", term406818);
        term406928 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term406928, term406928.getClass(), "kind", enum692);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term406928;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term406566, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


