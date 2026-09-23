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

public class FunctionType_getLeastSupertype_418850886563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term518317;
     Object term518871;

    public FunctionType_getLeastSupertype_418850886563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term519866 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term519865 = ((Class) term519866).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term519865).setAccessible(true);
        Object enum948 = ((Field) term519865).get((Object) null);
        term518317 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term518317, term518317.getClass(), "kind", enum948);
        Class<? extends Object> term520166 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term520165 = ((Class) term520166).getDeclaredField((String) "INTERFACE");
        ((Field) term520165).setAccessible(true);
        Object enum949 = ((Field) term520165).get((Object) null);
        term518871 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term518871, term518871.getClass(), "kind", enum949);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term518871;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term518317, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


