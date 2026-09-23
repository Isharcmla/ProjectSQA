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

public class FunctionType_isSubtype_21010021581093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1431009;
     Object term1431769;

    public FunctionType_isSubtype_21010021581093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1433126 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1433125 = ((Class) term1433126).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1433125).setAccessible(true);
        Object enum2568 = ((Field) term1433125).get((Object) null);
        Class<? extends Object> term1433426 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1433425 = ((Class) term1433426).getDeclaredField((String) "INTERFACE");
        ((Field) term1433425).setAccessible(true);
        Object enum2569 = ((Field) term1433425).get((Object) null);
        term1431009 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1431553 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1431661 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1431009, term1431009.getClass(), "kind", enum2568);
        setField(term1431553, term1431553.getClass(), "kind", enum2569);
        setField(term1431553, term1431553.getClass(), "typeOfThis", term1431661);
        setField(term1431009, term1431009.getClass(), "typeOfThis", term1431553);
        term1431769 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1432101 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1432197 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term1431769, term1431769.getClass(), "kind", enum2568);
        setField(term1432101, term1432101.getClass(), "kind", enum2568);
        setField(term1432101, term1432101.getClass(), "typeOfThis", term1432197);
        setField(term1431769, term1431769.getClass(), "typeOfThis", term1432101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1431769;
        try {
            callMethod(klass, "isSubtype", argTypes, term1431009, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


