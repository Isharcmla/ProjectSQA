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

public class FunctionType_isSubtype_21010021581098 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1282073;
     Object term1282725;

    public FunctionType_isSubtype_21010021581098() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1285572 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1285571 = ((Class) term1285572).getDeclaredField((String) "INTERFACE");
        ((Field) term1285571).setAccessible(true);
        Object enum2394 = ((Field) term1285571).get((Object) null);
        term1282073 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1282617 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1282073, term1282073.getClass(), "kind", enum2394);
        setField(term1282073, term1282073.getClass(), "typeOfThis", term1282617);
        Class<? extends Object> term1285866 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1285865 = ((Class) term1285866).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1285865).setAccessible(true);
        Object enum2395 = ((Field) term1285865).get((Object) null);
        term1282725 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1282909 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1282725, term1282725.getClass(), "kind", enum2395);
        setField(term1282725, term1282725.getClass(), "typeOfThis", term1282909);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1282725;
        try {
            callMethod(klass, "isSubtype", argTypes, term1282073, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


