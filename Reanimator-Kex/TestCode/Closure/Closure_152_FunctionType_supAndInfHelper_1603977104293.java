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

public class FunctionType_supAndInfHelper_1603977104293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173661;
     Object term173919;

    public FunctionType_supAndInfHelper_1603977104293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term174618 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term174617 = ((Class) term174618).getDeclaredField((String) "INTERFACE");
        ((Field) term174617).setAccessible(true);
        Object enum314 = ((Field) term174617).get((Object) null);
        term173661 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term173661, term173661.getClass(), "kind", enum314);
        term173919 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term173919, term173919.getClass(), "kind", enum314);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term173919;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term173661, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


