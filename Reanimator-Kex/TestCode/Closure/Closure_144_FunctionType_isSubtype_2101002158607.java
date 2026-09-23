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

public class FunctionType_isSubtype_2101002158607 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term585914;
     Object term586568;

    public FunctionType_isSubtype_2101002158607() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term587570 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term587569 = ((Class) term587570).getDeclaredField((String) "INTERFACE");
        ((Field) term587569).setAccessible(true);
        Object enum1065 = ((Field) term587569).get((Object) null);
        term585914 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term586458 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term585914, term585914.getClass(), "kind", enum1065);
        setField(term585914, term585914.getClass(), "typeOfThis", term586458);
        term586568 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term586878 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term586568, term586568.getClass(), "kind", enum1065);
        setField(term586568, term586568.getClass(), "typeOfThis", term586878);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term586568;
        try {
            callMethod(klass, "isSubtype", argTypes, term585914, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


