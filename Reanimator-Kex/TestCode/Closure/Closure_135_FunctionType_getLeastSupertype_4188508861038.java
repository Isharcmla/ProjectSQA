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

public class FunctionType_getLeastSupertype_4188508861038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1181769;
     Object term1182429;

    public FunctionType_getLeastSupertype_4188508861038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1185202 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1185201 = ((Class) term1185202).getDeclaredField((String) "ORDINARY");
        ((Field) term1185201).setAccessible(true);
        Object enum2205 = ((Field) term1185201).get((Object) null);
        term1181769 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1182321 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1181769, term1181769.getClass(), "kind", enum2205);
        setField(term1181769, term1181769.getClass(), "typeOfThis", term1182321);
        term1182429 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1182429, term1182429.getClass(), "kind", enum2205);
        setField(term1182429, term1182429.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1182429;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term1181769, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


