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

public class FunctionType_getGreatestSubtype_679591709209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113374;
     Object term113928;

    public FunctionType_getGreatestSubtype_679591709209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term114921 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term114920 = ((Class) term114921).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term114920).setAccessible(true);
        Object enum226 = ((Field) term114920).get((Object) null);
        term113374 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term113374, term113374.getClass(), "kind", enum226);
        Class<? extends Object> term115221 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term115220 = ((Class) term115221).getDeclaredField((String) "INTERFACE");
        ((Field) term115220).setAccessible(true);
        Object enum227 = ((Field) term115220).get((Object) null);
        term113928 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term113928, term113928.getClass(), "kind", enum227);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term113928;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term113374, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


