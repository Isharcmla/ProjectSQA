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

public class FunctionType_supAndInfHelper_1603977104643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term646751;
     Object term647305;

    public FunctionType_supAndInfHelper_1603977104643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term648321 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term648320 = ((Class) term648321).getDeclaredField((String) "INTERFACE");
        ((Field) term648320).setAccessible(true);
        Object enum995 = ((Field) term648320).get((Object) null);
        term646751 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term646751, term646751.getClass(), "kind", enum995);
        setField(term646751, term646751.getClass(), "typeOfThis", term646751);
        Class<? extends Object> term648615 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term648614 = ((Class) term648615).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term648614).setAccessible(true);
        Object enum996 = ((Field) term648614).get((Object) null);
        term647305 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term647305, term647305.getClass(), "kind", enum996);
        setField(term647305, term647305.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term647305;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term646751, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


