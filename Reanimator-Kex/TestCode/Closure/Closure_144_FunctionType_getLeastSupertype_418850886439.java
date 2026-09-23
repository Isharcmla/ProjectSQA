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

public class FunctionType_getLeastSupertype_418850886439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term352070;
     Object term352328;

    public FunctionType_getLeastSupertype_418850886439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term352929 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term352928 = ((Class) term352929).getDeclaredField((String) "INTERFACE");
        ((Field) term352928).setAccessible(true);
        Object enum641 = ((Field) term352928).get((Object) null);
        term352070 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term352070, term352070.getClass(), "kind", enum641);
        term352328 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term352328;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term352070, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


