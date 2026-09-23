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

public class FunctionType_getLeastSupertype_418850886309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198413;
     Object term198671;

    public FunctionType_getLeastSupertype_418850886309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term199275 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term199274 = ((Class) term199275).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term199274).setAccessible(true);
        Object enum377 = ((Field) term199274).get((Object) null);
        term198413 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term198413, term198413.getClass(), "kind", enum377);
        term198671 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term198671;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term198413, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


