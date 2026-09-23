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

public class FunctionType_getGreatestSubtype_679591709888 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1071171;
     Object term1071825;

    public FunctionType_getGreatestSubtype_679591709888() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1075195 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1075194 = ((Class) term1075195).getDeclaredField((String) "INTERFACE");
        ((Field) term1075194).setAccessible(true);
        Object enum1938 = ((Field) term1075194).get((Object) null);
        Class<? extends Object> term1075489 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1075488 = ((Class) term1075489).getDeclaredField((String) "ORDINARY");
        ((Field) term1075488).setAccessible(true);
        Object enum1939 = ((Field) term1075488).get((Object) null);
        term1071171 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1071419 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1071171, term1071171.getClass(), "kind", enum1938);
        setField(term1071419, term1071419.getClass(), "kind", enum1939);
        setField(term1071419, term1071419.getClass(), "typeOfThis", term1071171);
        setField(term1071171, term1071171.getClass(), "typeOfThis", term1071419);
        Class<? extends Object> term1075780 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1075779 = ((Class) term1075780).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1075779).setAccessible(true);
        Object enum1940 = ((Field) term1075779).get((Object) null);
        term1071825 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1071999 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1072257 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1071825, term1071825.getClass(), "kind", enum1940);
        setField(term1071999, term1071999.getClass(), "kind", enum1939);
        setField(term1071999, term1071999.getClass(), "typeOfThis", term1072257);
        setField(term1071825, term1071825.getClass(), "typeOfThis", term1071999);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1071825;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1071171, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


