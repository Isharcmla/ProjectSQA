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

public class FunctionType_getGreatestSubtype_6795917091567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2293315;
     Object term2293979;

    public FunctionType_getGreatestSubtype_6795917091567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2295888 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2295887 = ((Class) term2295888).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2295887).setAccessible(true);
        Object enum4095 = ((Field) term2295887).get((Object) null);
        term2293315 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2293869 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2293315, term2293315.getClass(), "kind", enum4095);
        setField(term2293315, term2293315.getClass(), "typeOfThis", term2293869);
        term2293979 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2294311 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2293979, term2293979.getClass(), "kind", enum4095);
        setField(term2293979, term2293979.getClass(), "typeOfThis", term2294311);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2293979;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term2293315, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


