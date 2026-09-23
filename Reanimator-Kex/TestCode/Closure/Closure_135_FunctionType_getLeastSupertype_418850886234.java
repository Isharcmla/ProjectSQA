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

public class FunctionType_getLeastSupertype_418850886234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111850;
     Object term112106;

    public FunctionType_getLeastSupertype_418850886234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term113568 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term113567 = ((Class) term113568).getDeclaredField((String) "INTERFACE");
        ((Field) term113567).setAccessible(true);
        Object enum220 = ((Field) term113567).get((Object) null);
        term111850 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term111850, term111850.getClass(), "kind", enum220);
        term112106 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term112106;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term111850, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


