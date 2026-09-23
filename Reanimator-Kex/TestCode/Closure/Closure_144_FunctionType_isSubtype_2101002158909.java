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

public class FunctionType_isSubtype_2101002158909 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1106595;
     Object term1107337;

    public FunctionType_isSubtype_2101002158909() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1108951 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1108950 = ((Class) term1108951).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1108950).setAccessible(true);
        Object enum1994 = ((Field) term1108950).get((Object) null);
        Class<? extends Object> term1109251 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1109250 = ((Class) term1109251).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1109250).setAccessible(true);
        Object enum1995 = ((Field) term1109250).get((Object) null);
        term1106595 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1107139 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1107227 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1106595, term1106595.getClass(), "kind", enum1994);
        setField(term1107139, term1107139.getClass(), "kind", enum1995);
        setField(term1107139, term1107139.getClass(), "typeOfThis", term1107227);
        setField(term1106595, term1106595.getClass(), "typeOfThis", term1107139);
        term1107337 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1107669 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1107337, term1107337.getClass(), "kind", enum1994);
        setField(term1107669, term1107669.getClass(), "kind", enum1995);
        setField(term1107669, term1107669.getClass(), "typeOfThis", null);
        setField(term1107337, term1107337.getClass(), "typeOfThis", term1107669);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1107337;
        try {
            callMethod(klass, "isSubtype", argTypes, term1106595, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


