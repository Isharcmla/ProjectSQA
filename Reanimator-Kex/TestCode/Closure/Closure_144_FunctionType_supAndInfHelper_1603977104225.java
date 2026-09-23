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

public class FunctionType_supAndInfHelper_1603977104225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116878;
     Object term117432;

    public FunctionType_supAndInfHelper_1603977104225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term118425 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term118424 = ((Class) term118425).getDeclaredField((String) "ORDINARY");
        ((Field) term118424).setAccessible(true);
        Object enum238 = ((Field) term118424).get((Object) null);
        term116878 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term116878, term116878.getClass(), "kind", enum238);
        Class<? extends Object> term118716 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term118715 = ((Class) term118716).getDeclaredField((String) "INTERFACE");
        ((Field) term118715).setAccessible(true);
        Object enum239 = ((Field) term118715).get((Object) null);
        term117432 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term117432, term117432.getClass(), "kind", enum239);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term117432;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term116878, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


