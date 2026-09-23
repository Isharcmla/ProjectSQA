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

public class FunctionType_isEquivalentTo_230708275345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235507;
     Object term236171;

    public FunctionType_isEquivalentTo_230708275345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term236994 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term236993 = ((Class) term236994).getDeclaredField((String) "ORDINARY");
        ((Field) term236993).setAccessible(true);
        Object enum415 = ((Field) term236993).get((Object) null);
        term235507 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term236061 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term235507, term235507.getClass(), "kind", enum415);
        setField(term235507, term235507.getClass(), "typeOfThis", term236061);
        term236171 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term236171, term236171.getClass(), "kind", enum415);
        setField(term236171, term236171.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term236171;
        try {
            callMethod(klass, "isEquivalentTo", argTypes, term235507, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


