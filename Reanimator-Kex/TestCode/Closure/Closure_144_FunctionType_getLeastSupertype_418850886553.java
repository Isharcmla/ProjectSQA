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

public class FunctionType_getLeastSupertype_418850886553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term500156;
     Object term500820;

    public FunctionType_getLeastSupertype_418850886553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term503557 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term503556 = ((Class) term503557).getDeclaredField((String) "INTERFACE");
        ((Field) term503556).setAccessible(true);
        Object enum915 = ((Field) term503556).get((Object) null);
        Class<? extends Object> term503851 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term503850 = ((Class) term503851).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term503850).setAccessible(true);
        Object enum916 = ((Field) term503850).get((Object) null);
        term500156 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term500710 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term500156, term500156.getClass(), "kind", enum915);
        setField(term500710, term500710.getClass(), "kind", enum916);
        setField(term500156, term500156.getClass(), "typeOfThis", term500710);
        term500820 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term500994 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term500820, term500820.getClass(), "kind", enum916);
        setField(term500820, term500820.getClass(), "typeOfThis", term500994);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term500820;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term500156, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


