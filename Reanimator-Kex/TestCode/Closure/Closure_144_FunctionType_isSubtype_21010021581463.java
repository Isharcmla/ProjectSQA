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

public class FunctionType_isSubtype_21010021581463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2108171;
     Object term2108771;

    public FunctionType_isSubtype_21010021581463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2110296 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2110295 = ((Class) term2110296).getDeclaredField((String) "ORDINARY");
        ((Field) term2110295).setAccessible(true);
        Object enum3757 = ((Field) term2110295).get((Object) null);
        Class<? extends Object> term2110587 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2110586 = ((Class) term2110587).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2110586).setAccessible(true);
        Object enum3758 = ((Field) term2110586).get((Object) null);
        term2108171 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2108419 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2108661 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2108171, term2108171.getClass(), "kind", enum3757);
        setField(term2108419, term2108419.getClass(), "kind", enum3758);
        setField(term2108419, term2108419.getClass(), "call", term2108661);
        setField(term2108171, term2108171.getClass(), "typeOfThis", term2108419);
        term2108771 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2108955 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2108771, term2108771.getClass(), "kind", enum3757);
        setField(term2108955, term2108955.getClass(), "kind", enum3758);
        setField(term2108955, term2108955.getClass(), "call", null);
        setField(term2108771, term2108771.getClass(), "typeOfThis", term2108955);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2108771;
        try {
            callMethod(klass, "isSubtype", argTypes, term2108171, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


