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

public class FunctionType_getGreatestSubtype_679591709445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term359491;
     Object term360155;

    public FunctionType_getGreatestSubtype_679591709445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term361636 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term361635 = ((Class) term361636).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term361635).setAccessible(true);
        Object enum655 = ((Field) term361635).get((Object) null);
        Class<? extends Object> term361936 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term361935 = ((Class) term361936).getDeclaredField((String) "INTERFACE");
        ((Field) term361935).setAccessible(true);
        Object enum656 = ((Field) term361935).get((Object) null);
        term359491 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term360045 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term359491, term359491.getClass(), "kind", enum655);
        setField(term360045, term360045.getClass(), "kind", enum656);
        setField(term359491, term359491.getClass(), "typeOfThis", term360045);
        Class<? extends Object> term362230 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term362229 = ((Class) term362230).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term362229).setAccessible(true);
        Object enum657 = ((Field) term362229).get((Object) null);
        term360155 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term360329 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term360155, term360155.getClass(), "kind", enum657);
        setField(term360155, term360155.getClass(), "typeOfThis", term360329);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term360155;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term359491, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


