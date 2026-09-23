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

public class FunctionType_getGreatestSubtype_679591709313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199243;
     Object term199605;

    public FunctionType_getGreatestSubtype_679591709313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term200680 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term200679 = ((Class) term200680).getDeclaredField((String) "ORDINARY");
        ((Field) term200679).setAccessible(true);
        Object enum359 = ((Field) term200679).get((Object) null);
        term199243 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term199495 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term199243, term199243.getClass(), "kind", enum359);
        setField(term199243, term199243.getClass(), "registry", term199495);
        Class<? extends Object> term200971 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term200970 = ((Class) term200971).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term200970).setAccessible(true);
        Object enum360 = ((Field) term200970).get((Object) null);
        term199605 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term199605, term199605.getClass(), "kind", enum360);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term199605;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term199243, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


