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

public class FunctionType_isSubtype_2101002158541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term486867;
     Object term487531;

    public FunctionType_isSubtype_2101002158541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term488356 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term488355 = ((Class) term488356).getDeclaredField((String) "ORDINARY");
        ((Field) term488355).setAccessible(true);
        Object enum887 = ((Field) term488355).get((Object) null);
        term486867 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term487421 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term486867, term486867.getClass(), "kind", enum887);
        setField(term486867, term486867.getClass(), "typeOfThis", term487421);
        term487531 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term487531, term487531.getClass(), "kind", enum887);
        setField(term487531, term487531.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term487531;
        try {
            callMethod(klass, "isSubtype", argTypes, term486867, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


