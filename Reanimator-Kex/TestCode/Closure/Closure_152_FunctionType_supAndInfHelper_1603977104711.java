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

public class FunctionType_supAndInfHelper_1603977104711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term755971;
     Object term756339;

    public FunctionType_supAndInfHelper_1603977104711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term757555 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term757554 = ((Class) term757555).getDeclaredField((String) "ORDINARY");
        ((Field) term757554).setAccessible(true);
        Object enum1145 = ((Field) term757554).get((Object) null);
        term755971 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term756229 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term755971, term755971.getClass(), "kind", enum1145);
        setField(term755971, term755971.getClass(), "typeOfThis", term756229);
        Class<? extends Object> term757846 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term757845 = ((Class) term757846).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term757845).setAccessible(true);
        Object enum1146 = ((Field) term757845).get((Object) null);
        term756339 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term756587 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term756339, term756339.getClass(), "kind", enum1146);
        setField(term756339, term756339.getClass(), "typeOfThis", term756587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term756339;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term755971, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


