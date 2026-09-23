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

public class FunctionType_getGreatestSubtype_679591709299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179318;
     Object term179576;

    public FunctionType_getGreatestSubtype_679591709299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term180166 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term180165 = ((Class) term180166).getDeclaredField((String) "ORDINARY");
        ((Field) term180165).setAccessible(true);
        Object enum325 = ((Field) term180165).get((Object) null);
        term179318 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term179318, term179318.getClass(), "kind", enum325);
        term179576 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term179576;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term179318, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


