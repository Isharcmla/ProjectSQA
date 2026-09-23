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

public class FunctionType_supAndInfHelper_1603977104260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148563;
     Object term149223;

    public FunctionType_supAndInfHelper_1603977104260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term150397 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term150396 = ((Class) term150397).getDeclaredField((String) "INTERFACE");
        ((Field) term150396).setAccessible(true);
        Object enum293 = ((Field) term150396).get((Object) null);
        term148563 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term149113 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term148563, term148563.getClass(), "kind", enum293);
        setField(term148563, term148563.getClass(), "typeOfThis", term149113);
        term149223 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term149223, term149223.getClass(), "kind", enum293);
        setField(term149223, term149223.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term149223;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term148563, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


