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

public class FunctionType_getGreatestSubtype_6795917091309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1819985;
     Object term1820739;

    public FunctionType_getGreatestSubtype_6795917091309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1822091 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1822090 = ((Class) term1822091).getDeclaredField((String) "INTERFACE");
        ((Field) term1822090).setAccessible(true);
        Object enum3236 = ((Field) term1822090).get((Object) null);
        term1819985 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1820529 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1821111 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1819985, term1819985.getClass(), "kind", enum3236);
        setField(term1820529, term1820529.getClass(), "kind", enum3236);
        setField(term1821111, term1821111.getClass(), "kind", enum3236);
        setField(term1820529, term1820529.getClass(), "typeOfThis", term1821111);
        setField(term1819985, term1819985.getClass(), "typeOfThis", term1820529);
        Class<? extends Object> term1822385 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1822384 = ((Class) term1822385).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1822384).setAccessible(true);
        Object enum3237 = ((Field) term1822384).get((Object) null);
        term1820739 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1820913 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1820739, term1820739.getClass(), "kind", enum3237);
        setField(term1820913, term1820913.getClass(), "kind", enum3236);
        setField(term1820913, term1820913.getClass(), "typeOfThis", term1821111);
        setField(term1820739, term1820739.getClass(), "typeOfThis", term1820913);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1820739;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1819985, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


