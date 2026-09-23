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

public class FunctionType_isSubtype_2101002158983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1098007;
     Object term1098669;

    public FunctionType_isSubtype_2101002158983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1099843 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1099842 = ((Class) term1099843).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1099842).setAccessible(true);
        Object enum2046 = ((Field) term1099842).get((Object) null);
        term1098007 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1098561 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1098007, term1098007.getClass(), "kind", enum2046);
        setField(term1098007, term1098007.getClass(), "typeOfThis", term1098561);
        Class<? extends Object> term1100143 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1100142 = ((Class) term1100143).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1100142).setAccessible(true);
        Object enum2047 = ((Field) term1100142).get((Object) null);
        term1098669 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1098853 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1098669, term1098669.getClass(), "kind", enum2047);
        setField(term1098669, term1098669.getClass(), "typeOfThis", term1098853);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1098669;
        try {
            callMethod(klass, "isSubtype", argTypes, term1098007, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


