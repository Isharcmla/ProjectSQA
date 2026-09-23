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

public class FunctionType_getLeastSupertype_418850886206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110015;
     Object term110273;

    public FunctionType_getLeastSupertype_418850886206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term111669 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term111668 = ((Class) term111669).getDeclaredField((String) "INTERFACE");
        ((Field) term111668).setAccessible(true);
        Object enum220 = ((Field) term111668).get((Object) null);
        term110015 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term110015, term110015.getClass(), "kind", enum220);
        term110273 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term110273;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term110015, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


