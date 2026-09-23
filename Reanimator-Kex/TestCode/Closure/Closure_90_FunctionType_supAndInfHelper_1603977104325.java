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

public class FunctionType_supAndInfHelper_1603977104325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216193;
     Object term216451;

    public FunctionType_supAndInfHelper_1603977104325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term217041 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term217040 = ((Class) term217041).getDeclaredField((String) "ORDINARY");
        ((Field) term217040).setAccessible(true);
        Object enum379 = ((Field) term217040).get((Object) null);
        term216193 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term216193, term216193.getClass(), "kind", enum379);
        term216451 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term216451;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term216193, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


