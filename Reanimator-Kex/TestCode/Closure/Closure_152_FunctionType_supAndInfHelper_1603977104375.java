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

public class FunctionType_supAndInfHelper_1603977104375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272654;
     Object term273332;

    public FunctionType_supAndInfHelper_1603977104375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term274186 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term274185 = ((Class) term274186).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term274185).setAccessible(true);
        Object enum478 = ((Field) term274185).get((Object) null);
        term272654 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term273222 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term272654, term272654.getClass(), "kind", enum478);
        setField(term272654, term272654.getClass(), "typeOfThis", term273222);
        term273332 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term273332, term273332.getClass(), "kind", enum478);
        setField(term273332, term273332.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term273332;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term272654, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


