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

public class FunctionType_isSubtype_21010021581525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2224041;
     Object term2224695;

    public FunctionType_isSubtype_21010021581525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2226667 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2226666 = ((Class) term2226667).getDeclaredField((String) "INTERFACE");
        ((Field) term2226666).setAccessible(true);
        Object enum3971 = ((Field) term2226666).get((Object) null);
        Class<? extends Object> term2226961 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2226960 = ((Class) term2226961).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2226960).setAccessible(true);
        Object enum3972 = ((Field) term2226960).get((Object) null);
        term2224041 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2224585 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2224041, term2224041.getClass(), "kind", enum3971);
        setField(term2224585, term2224585.getClass(), "kind", enum3972);
        setField(term2224041, term2224041.getClass(), "typeOfThis", term2224585);
        Class<? extends Object> term2227261 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2227260 = ((Class) term2227261).getDeclaredField((String) "INTERFACE");
        ((Field) term2227260).setAccessible(true);
        Object enum3973 = ((Field) term2227260).get((Object) null);
        term2224695 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2225027 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2224695, term2224695.getClass(), "kind", enum3971);
        setField(term2225027, term2225027.getClass(), "kind", enum3973);
        setField(term2224695, term2224695.getClass(), "typeOfThis", term2225027);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2224695;
        try {
            callMethod(klass, "isSubtype", argTypes, term2224041, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


