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

public class FunctionType_getLeastSupertype_418850886473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term397794;
     Object term398270;

    public FunctionType_getLeastSupertype_418850886473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term399669 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term399668 = ((Class) term399669).getDeclaredField((String) "ORDINARY");
        ((Field) term399668).setAccessible(true);
        Object enum675 = ((Field) term399668).get((Object) null);
        term397794 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term398052 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term398160 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term397794, term397794.getClass(), "kind", enum675);
        setField(term398052, term398052.getClass(), "kind", enum675);
        setField(term398052, term398052.getClass(), "typeOfThis", term398160);
        setField(term397794, term397794.getClass(), "typeOfThis", term398052);
        Class<? extends Object> term399960 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term399959 = ((Class) term399960).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term399959).setAccessible(true);
        Object enum676 = ((Field) term399959).get((Object) null);
        term398270 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term398444 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term398270, term398270.getClass(), "kind", enum675);
        setField(term398444, term398444.getClass(), "kind", enum676);
        setField(term398444, term398444.getClass(), "typeOfThis", null);
        setField(term398270, term398270.getClass(), "typeOfThis", term398444);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term398270;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term397794, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


