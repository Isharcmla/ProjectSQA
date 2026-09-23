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

public class FunctionType_getLeastSupertype_418850886294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184726;
     Object term185088;

    public FunctionType_getLeastSupertype_418850886294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term186371 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term186370 = ((Class) term186371).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term186370).setAccessible(true);
        Object enum337 = ((Field) term186370).get((Object) null);
        term184726 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term184978 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term184726, term184726.getClass(), "kind", enum337);
        setField(term184726, term184726.getClass(), "registry", term184978);
        Class<? extends Object> term186671 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term186670 = ((Class) term186671).getDeclaredField((String) "ORDINARY");
        ((Field) term186670).setAccessible(true);
        Object enum338 = ((Field) term186670).get((Object) null);
        term185088 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term185088, term185088.getClass(), "kind", enum338);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term185088;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term184726, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


