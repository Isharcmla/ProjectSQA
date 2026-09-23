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

public class FunctionType_getLeastSupertype_418850886337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225876;
     Object term226530;

    public FunctionType_getLeastSupertype_418850886337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term227513 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term227512 = ((Class) term227513).getDeclaredField((String) "INTERFACE");
        ((Field) term227512).setAccessible(true);
        Object enum397 = ((Field) term227512).get((Object) null);
        term225876 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term226420 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term225876, term225876.getClass(), "kind", enum397);
        setField(term225876, term225876.getClass(), "typeOfThis", term226420);
        term226530 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term226848 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term226530, term226530.getClass(), "kind", enum397);
        setField(term226530, term226530.getClass(), "typeOfThis", term226848);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term226530;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term225876, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


