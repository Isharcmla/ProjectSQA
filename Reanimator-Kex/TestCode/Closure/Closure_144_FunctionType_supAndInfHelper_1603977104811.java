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

public class FunctionType_supAndInfHelper_1603977104811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term935392;
     Object term935754;

    public FunctionType_supAndInfHelper_1603977104811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term936474 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term936473 = ((Class) term936474).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term936473).setAccessible(true);
        Object enum1692 = ((Field) term936473).get((Object) null);
        term935392 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term935644 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term935392, term935392.getClass(), "kind", enum1692);
        setField(term935392, term935392.getClass(), "registry", term935644);
        term935754 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term935754, term935754.getClass(), "kind", enum1692);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term935754;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term935392, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


