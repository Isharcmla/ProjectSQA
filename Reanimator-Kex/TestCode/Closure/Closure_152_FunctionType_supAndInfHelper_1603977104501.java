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

public class FunctionType_supAndInfHelper_1603977104501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term447371;
     Object term447629;

    public FunctionType_supAndInfHelper_1603977104501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term448925 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term448924 = ((Class) term448925).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term448924).setAccessible(true);
        Object enum734 = ((Field) term448924).get((Object) null);
        term447371 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term447371, term447371.getClass(), "kind", enum734);
        Class<? extends Object> term449225 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term449224 = ((Class) term449225).getDeclaredField((String) "ORDINARY");
        ((Field) term449224).setAccessible(true);
        Object enum735 = ((Field) term449224).get((Object) null);
        term447629 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term447629, term447629.getClass(), "kind", enum735);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term447629;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term447371, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


