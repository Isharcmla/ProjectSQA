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

public class FunctionType_getGreatestSubtype_679591709944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1161976;
     Object term1162622;

    public FunctionType_getGreatestSubtype_679591709944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1165886 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1165885 = ((Class) term1165886).getDeclaredField((String) "INTERFACE");
        ((Field) term1165885).setAccessible(true);
        Object enum2095 = ((Field) term1165885).get((Object) null);
        term1161976 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1162512 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term1161976, term1161976.getClass(), "kind", enum2095);
        setField(term1161976, term1161976.getClass(), "typeOfThis", term1162512);
        Class<? extends Object> term1166180 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1166179 = ((Class) term1166180).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1166179).setAccessible(true);
        Object enum2096 = ((Field) term1166179).get((Object) null);
        term1162622 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1162804 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1162622, term1162622.getClass(), "kind", enum2096);
        setField(term1162804, term1162804.getClass(), "kind", enum2095);
        setField(term1162804, term1162804.getClass(), "typeOfThis", null);
        setField(term1162622, term1162622.getClass(), "typeOfThis", term1162804);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1162622;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1161976, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


