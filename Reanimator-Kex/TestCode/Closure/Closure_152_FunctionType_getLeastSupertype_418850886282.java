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

public class FunctionType_getLeastSupertype_418850886282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159629;
     Object term160183;

    public FunctionType_getLeastSupertype_418850886282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term163180 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term163179 = ((Class) term163180).getDeclaredField((String) "INTERFACE");
        ((Field) term163179).setAccessible(true);
        Object enum294 = ((Field) term163179).get((Object) null);
        term159629 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term159629, term159629.getClass(), "kind", enum294);
        Class<? extends Object> term163474 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term163473 = ((Class) term163474).getDeclaredField((String) "INTERFACE");
        ((Field) term163473).setAccessible(true);
        Object enum295 = ((Field) term163473).get((Object) null);
        term160183 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term160183, term160183.getClass(), "kind", enum295);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term160183;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term159629, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


