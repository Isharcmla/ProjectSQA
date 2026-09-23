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

public class FunctionType_supAndInfHelper_1603977104533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term487039;
     Object term487517;

    public FunctionType_supAndInfHelper_1603977104533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term488870 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term488869 = ((Class) term488870).getDeclaredField((String) "ORDINARY");
        ((Field) term488869).setAccessible(true);
        Object enum784 = ((Field) term488869).get((Object) null);
        term487039 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term487297 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term487407 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term487039, term487039.getClass(), "kind", enum784);
        setField(term487297, term487297.getClass(), "kind", enum784);
        setField(term487297, term487297.getClass(), "typeOfThis", term487407);
        setField(term487039, term487039.getClass(), "typeOfThis", term487297);
        Class<? extends Object> term489161 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term489160 = ((Class) term489161).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term489160).setAccessible(true);
        Object enum785 = ((Field) term489160).get((Object) null);
        term487517 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term487765 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term487517, term487517.getClass(), "kind", enum785);
        setField(term487765, term487765.getClass(), "kind", enum784);
        setField(term487765, term487765.getClass(), "typeOfThis", null);
        setField(term487517, term487517.getClass(), "typeOfThis", term487765);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term487517;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term487039, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


