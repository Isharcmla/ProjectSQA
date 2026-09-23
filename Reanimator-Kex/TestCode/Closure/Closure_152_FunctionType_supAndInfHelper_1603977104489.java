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

public class FunctionType_supAndInfHelper_1603977104489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term424405;
     Object term425069;

    public FunctionType_supAndInfHelper_1603977104489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term426493 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term426492 = ((Class) term426493).getDeclaredField((String) "INTERFACE");
        ((Field) term426492).setAccessible(true);
        Object enum698 = ((Field) term426492).get((Object) null);
        Class<? extends Object> term426787 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term426786 = ((Class) term426787).getDeclaredField((String) "INTERFACE");
        ((Field) term426786).setAccessible(true);
        Object enum699 = ((Field) term426786).get((Object) null);
        term424405 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term424959 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term424405, term424405.getClass(), "kind", enum698);
        setField(term424959, term424959.getClass(), "kind", enum699);
        setField(term424405, term424405.getClass(), "typeOfThis", term424959);
        Class<? extends Object> term427081 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term427080 = ((Class) term427081).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term427080).setAccessible(true);
        Object enum700 = ((Field) term427080).get((Object) null);
        term425069 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term425243 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term425069, term425069.getClass(), "kind", enum700);
        setField(term425069, term425069.getClass(), "typeOfThis", term425243);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term425069;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term424405, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


