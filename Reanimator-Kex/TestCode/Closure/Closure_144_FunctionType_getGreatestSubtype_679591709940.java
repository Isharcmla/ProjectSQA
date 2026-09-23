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

public class FunctionType_getGreatestSubtype_679591709940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1155024;
     Object term1155500;

    public FunctionType_getGreatestSubtype_679591709940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1158639 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1158638 = ((Class) term1158639).getDeclaredField((String) "ORDINARY");
        ((Field) term1158638).setAccessible(true);
        Object enum2081 = ((Field) term1158638).get((Object) null);
        term1155024 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1155282 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1155390 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1155024, term1155024.getClass(), "kind", enum2081);
        setField(term1155282, term1155282.getClass(), "kind", enum2081);
        setField(term1155282, term1155282.getClass(), "typeOfThis", term1155390);
        setField(term1155024, term1155024.getClass(), "typeOfThis", term1155282);
        Class<? extends Object> term1158930 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1158929 = ((Class) term1158930).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1158929).setAccessible(true);
        Object enum2082 = ((Field) term1158929).get((Object) null);
        term1155500 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1155674 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1155922 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1155500, term1155500.getClass(), "kind", enum2081);
        setField(term1155674, term1155674.getClass(), "kind", enum2082);
        setField(term1155674, term1155674.getClass(), "typeOfThis", term1155922);
        setField(term1155500, term1155500.getClass(), "typeOfThis", term1155674);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1155500;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1155024, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


