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

public class FunctionType_isSubtype_21010021581453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2086247;
     Object term2086911;

    public FunctionType_isSubtype_21010021581453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2088467 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2088466 = ((Class) term2088467).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2088466).setAccessible(true);
        Object enum3715 = ((Field) term2088466).get((Object) null);
        Class<? extends Object> term2088767 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2088766 = ((Class) term2088767).getDeclaredField((String) "INTERFACE");
        ((Field) term2088766).setAccessible(true);
        Object enum3716 = ((Field) term2088766).get((Object) null);
        term2086247 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2086801 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2086247, term2086247.getClass(), "kind", enum3715);
        setField(term2086801, term2086801.getClass(), "kind", enum3716);
        setField(term2086247, term2086247.getClass(), "typeOfThis", term2086801);
        Class<? extends Object> term2089061 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2089060 = ((Class) term2089061).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2089060).setAccessible(true);
        Object enum3717 = ((Field) term2089060).get((Object) null);
        term2086911 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2087095 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2086911, term2086911.getClass(), "kind", enum3717);
        setField(term2086911, term2086911.getClass(), "typeOfThis", term2087095);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2086911;
        try {
            callMethod(klass, "isSubtype", argTypes, term2086247, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


