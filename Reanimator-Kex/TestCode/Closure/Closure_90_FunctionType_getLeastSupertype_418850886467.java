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

public class FunctionType_getLeastSupertype_418850886467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term389193;
     Object term389651;

    public FunctionType_getLeastSupertype_418850886467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term390949 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term390948 = ((Class) term390949).getDeclaredField((String) "ORDINARY");
        ((Field) term390948).setAccessible(true);
        Object enum661 = ((Field) term390948).get((Object) null);
        term389193 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term389441 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term389541 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term389193, term389193.getClass(), "kind", enum661);
        setField(term389441, term389441.getClass(), "kind", enum661);
        setField(term389441, term389441.getClass(), "typeOfThis", term389541);
        setField(term389193, term389193.getClass(), "typeOfThis", term389441);
        Class<? extends Object> term391240 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term391239 = ((Class) term391240).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term391239).setAccessible(true);
        Object enum662 = ((Field) term391239).get((Object) null);
        term389651 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term389899 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term389651, term389651.getClass(), "kind", enum662);
        setField(term389899, term389899.getClass(), "kind", enum662);
        setField(term389899, term389899.getClass(), "typeOfThis", null);
        setField(term389651, term389651.getClass(), "typeOfThis", term389899);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term389651;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term389193, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


