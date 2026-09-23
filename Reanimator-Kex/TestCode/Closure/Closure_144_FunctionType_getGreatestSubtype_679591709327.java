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

public class FunctionType_getGreatestSubtype_679591709327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217253;
     Object term217807;

    public FunctionType_getGreatestSubtype_679591709327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term218833 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term218832 = ((Class) term218833).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term218832).setAccessible(true);
        Object enum413 = ((Field) term218832).get((Object) null);
        term217253 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term217253, term217253.getClass(), "kind", enum413);
        setField(term217253, term217253.getClass(), "typeOfThis", term217253);
        Class<? extends Object> term219133 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term219132 = ((Class) term219133).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term219132).setAccessible(true);
        Object enum414 = ((Field) term219132).get((Object) null);
        term217807 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term217807, term217807.getClass(), "kind", enum414);
        setField(term217807, term217807.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term217807;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term217253, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


