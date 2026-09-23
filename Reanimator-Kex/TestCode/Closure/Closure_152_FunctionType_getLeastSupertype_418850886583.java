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

public class FunctionType_getLeastSupertype_418850886583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term563328;
     Object term563992;

    public FunctionType_getLeastSupertype_418850886583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term565120 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term565119 = ((Class) term565120).getDeclaredField((String) "ORDINARY");
        ((Field) term565119).setAccessible(true);
        Object enum875 = ((Field) term565119).get((Object) null);
        term563328 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term563882 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term563328, term563328.getClass(), "kind", enum875);
        setField(term563328, term563328.getClass(), "typeOfThis", term563882);
        Class<? extends Object> term565411 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term565410 = ((Class) term565411).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term565410).setAccessible(true);
        Object enum876 = ((Field) term565410).get((Object) null);
        term563992 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term564166 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term563992, term563992.getClass(), "kind", enum876);
        setField(term564166, term564166.getClass(), "kind", enum876);
        setField(term564166, term564166.getClass(), "typeOfThis", null);
        setField(term563992, term563992.getClass(), "typeOfThis", term564166);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term563992;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term563328, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


