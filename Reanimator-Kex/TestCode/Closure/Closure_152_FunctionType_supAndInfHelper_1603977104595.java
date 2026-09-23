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

public class FunctionType_supAndInfHelper_1603977104595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term578735;
     Object term579103;

    public FunctionType_supAndInfHelper_1603977104595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term580400 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term580399 = ((Class) term580400).getDeclaredField((String) "ORDINARY");
        ((Field) term580399).setAccessible(true);
        Object enum898 = ((Field) term580399).get((Object) null);
        term578735 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term578993 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term578735, term578735.getClass(), "kind", enum898);
        setField(term578993, term578993.getClass(), "kind", enum898);
        setField(term578993, term578993.getClass(), "typeOfThis", term578993);
        setField(term578735, term578735.getClass(), "typeOfThis", term578993);
        Class<? extends Object> term580691 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term580690 = ((Class) term580691).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term580690).setAccessible(true);
        Object enum899 = ((Field) term580690).get((Object) null);
        term579103 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term579351 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term579103, term579103.getClass(), "kind", enum899);
        setField(term579351, term579351.getClass(), "kind", enum899);
        setField(term579351, term579351.getClass(), "typeOfThis", null);
        setField(term579103, term579103.getClass(), "typeOfThis", term579351);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term579103;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term578735, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


