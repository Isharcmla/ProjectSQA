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

public class FunctionType_supAndInfHelper_1603977104425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331969;
     Object term332331;

    public FunctionType_supAndInfHelper_1603977104425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term333051 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term333050 = ((Class) term333051).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term333050).setAccessible(true);
        Object enum572 = ((Field) term333050).get((Object) null);
        term331969 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term332221 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term331969, term331969.getClass(), "kind", enum572);
        setField(term331969, term331969.getClass(), "registry", term332221);
        term332331 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term332331, term332331.getClass(), "kind", enum572);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term332331;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term331969, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


