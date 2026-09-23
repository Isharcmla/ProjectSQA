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

public class FunctionType_isSubtype_21010021581172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1566989;
     Object term1567643;

    public FunctionType_isSubtype_21010021581172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1571323 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1571322 = ((Class) term1571323).getDeclaredField((String) "ORDINARY");
        ((Field) term1571322).setAccessible(true);
        Object enum2800 = ((Field) term1571322).get((Object) null);
        Class<? extends Object> term1571614 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1571613 = ((Class) term1571614).getDeclaredField((String) "INTERFACE");
        ((Field) term1571613).setAccessible(true);
        Object enum2801 = ((Field) term1571613).get((Object) null);
        term1566989 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1567533 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1566989, term1566989.getClass(), "kind", enum2800);
        setField(term1567533, term1567533.getClass(), "kind", enum2801);
        setField(term1566989, term1566989.getClass(), "typeOfThis", term1567533);
        term1567643 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1567975 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1567643, term1567643.getClass(), "kind", enum2800);
        setField(term1567975, term1567975.getClass(), "kind", enum2800);
        setField(term1567643, term1567643.getClass(), "typeOfThis", term1567975);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1567643;
        try {
            callMethod(klass, "isSubtype", argTypes, term1566989, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


