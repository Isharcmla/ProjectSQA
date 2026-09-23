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

public class FunctionType_supAndInfHelper_1603977104407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308803;
     Object term309175;

    public FunctionType_supAndInfHelper_1603977104407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term310273 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term310272 = ((Class) term310273).getDeclaredField((String) "ORDINARY");
        ((Field) term310272).setAccessible(true);
        Object enum535 = ((Field) term310272).get((Object) null);
        term308803 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term309065 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term308803, term308803.getClass(), "kind", enum535);
        setField(term308803, term308803.getClass(), "typeOfThis", term309065);
        Class<? extends Object> term310564 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term310563 = ((Class) term310564).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term310563).setAccessible(true);
        Object enum536 = ((Field) term310563).get((Object) null);
        term309175 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term309175, term309175.getClass(), "kind", enum536);
        setField(term309175, term309175.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term309175;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term308803, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


