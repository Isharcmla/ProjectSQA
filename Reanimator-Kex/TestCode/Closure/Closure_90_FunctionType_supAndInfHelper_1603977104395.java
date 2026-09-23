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

public class FunctionType_supAndInfHelper_1603977104395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297902;
     Object term298270;

    public FunctionType_supAndInfHelper_1603977104395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term299367 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term299366 = ((Class) term299367).getDeclaredField((String) "ORDINARY");
        ((Field) term299366).setAccessible(true);
        Object enum520 = ((Field) term299366).get((Object) null);
        term297902 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term298160 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term297902, term297902.getClass(), "kind", enum520);
        setField(term297902, term297902.getClass(), "typeOfThis", term298160);
        Class<? extends Object> term299658 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term299657 = ((Class) term299658).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term299657).setAccessible(true);
        Object enum521 = ((Field) term299657).get((Object) null);
        term298270 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term298270, term298270.getClass(), "kind", enum521);
        setField(term298270, term298270.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term298270;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term297902, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


