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

public class FunctionType_isSubtype_21010021581563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2287626;
     Object term2288280;

    public FunctionType_isSubtype_21010021581563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2289920 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2289919 = ((Class) term2289920).getDeclaredField((String) "INTERFACE");
        ((Field) term2289919).setAccessible(true);
        Object enum4085 = ((Field) term2289919).get((Object) null);
        Class<? extends Object> term2290214 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2290213 = ((Class) term2290214).getDeclaredField((String) "INTERFACE");
        ((Field) term2290213).setAccessible(true);
        Object enum4086 = ((Field) term2290213).get((Object) null);
        term2287626 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2288170 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2287626, term2287626.getClass(), "kind", enum4085);
        setField(term2288170, term2288170.getClass(), "kind", enum4086);
        setField(term2287626, term2287626.getClass(), "typeOfThis", term2288170);
        Class<? extends Object> term2290508 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2290507 = ((Class) term2290508).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2290507).setAccessible(true);
        Object enum4087 = ((Field) term2290507).get((Object) null);
        term2288280 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2288612 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2288280, term2288280.getClass(), "kind", enum4085);
        setField(term2288612, term2288612.getClass(), "kind", enum4087);
        setField(term2288280, term2288280.getClass(), "typeOfThis", term2288612);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2288280;
        try {
            callMethod(klass, "isSubtype", argTypes, term2287626, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


