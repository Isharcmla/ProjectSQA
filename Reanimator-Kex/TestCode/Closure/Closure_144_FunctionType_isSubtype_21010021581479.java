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

public class FunctionType_isSubtype_21010021581479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2137762;
     Object term2138310;

    public FunctionType_isSubtype_21010021581479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2140060 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2140059 = ((Class) term2140060).getDeclaredField((String) "ORDINARY");
        ((Field) term2140059).setAccessible(true);
        Object enum3810 = ((Field) term2140059).get((Object) null);
        term2137762 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2138010 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2138106 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term2138200 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2137762, term2137762.getClass(), "kind", enum3810);
        setField(term2138010, term2138010.getClass(), "kind", enum3810);
        setField(term2138010, term2138010.getClass(), "typeOfThis", term2138106);
        setField(term2138010, term2138010.getClass(), "call", term2138200);
        setField(term2137762, term2137762.getClass(), "typeOfThis", term2138010);
        Class<? extends Object> term2140351 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2140350 = ((Class) term2140351).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2140350).setAccessible(true);
        Object enum3811 = ((Field) term2140350).get((Object) null);
        term2138310 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2138494 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2138736 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2138310, term2138310.getClass(), "kind", enum3810);
        setField(term2138494, term2138494.getClass(), "kind", enum3811);
        setField(term2138494, term2138494.getClass(), "typeOfThis", null);
        setField(term2138494, term2138494.getClass(), "call", term2138736);
        setField(term2138310, term2138310.getClass(), "typeOfThis", term2138494);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2138310;
        try {
            callMethod(klass, "isSubtype", argTypes, term2137762, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


