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

public class FunctionType_isSubtype_21010021581104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1449246;
     Object term1449900;

    public FunctionType_isSubtype_21010021581104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1452990 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1452989 = ((Class) term1452990).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1452989).setAccessible(true);
        Object enum2598 = ((Field) term1452989).get((Object) null);
        Class<? extends Object> term1453290 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1453289 = ((Class) term1453290).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1453289).setAccessible(true);
        Object enum2599 = ((Field) term1453289).get((Object) null);
        term1449246 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1449790 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1449246, term1449246.getClass(), "kind", enum2598);
        setField(term1449790, term1449790.getClass(), "kind", enum2599);
        setField(term1449246, term1449246.getClass(), "typeOfThis", term1449790);
        term1449900 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1450232 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1449900, term1449900.getClass(), "kind", enum2598);
        setField(term1450232, term1450232.getClass(), "kind", enum2598);
        setField(term1449900, term1449900.getClass(), "typeOfThis", term1450232);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1449900;
        try {
            callMethod(klass, "isSubtype", argTypes, term1449246, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


