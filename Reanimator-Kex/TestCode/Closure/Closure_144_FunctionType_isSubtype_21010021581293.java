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

public class FunctionType_isSubtype_21010021581293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1792642;
     Object term1793296;

    public FunctionType_isSubtype_21010021581293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1794259 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1794258 = ((Class) term1794259).getDeclaredField((String) "INTERFACE");
        ((Field) term1794258).setAccessible(true);
        Object enum3188 = ((Field) term1794258).get((Object) null);
        term1792642 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1793186 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1792642, term1792642.getClass(), "kind", enum3188);
        setField(term1792642, term1792642.getClass(), "typeOfThis", term1793186);
        term1793296 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1793628 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1793296, term1793296.getClass(), "kind", enum3188);
        setField(term1793296, term1793296.getClass(), "typeOfThis", term1793628);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1793296;
        try {
            callMethod(klass, "isSubtype", argTypes, term1792642, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


