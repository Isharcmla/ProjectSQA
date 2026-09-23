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

public class FunctionType_getLeastSupertype_418850886809 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term929653;
     Object term930207;

    public FunctionType_getLeastSupertype_418850886809() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term931897 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term931896 = ((Class) term931897).getDeclaredField((String) "ORDINARY");
        ((Field) term931896).setAccessible(true);
        Object enum1685 = ((Field) term931896).get((Object) null);
        term929653 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term929653, term929653.getClass(), "kind", enum1685);
        setField(term929653, term929653.getClass(), "typeOfThis", term929653);
        Class<? extends Object> term932188 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term932187 = ((Class) term932188).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term932187).setAccessible(true);
        Object enum1686 = ((Field) term932187).get((Object) null);
        Class<? extends Object> term932488 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term932487 = ((Class) term932488).getDeclaredField((String) "INTERFACE");
        ((Field) term932487).setAccessible(true);
        Object enum1687 = ((Field) term932487).get((Object) null);
        term930207 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term930381 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term930629 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term930207, term930207.getClass(), "kind", enum1686);
        setField(term930381, term930381.getClass(), "kind", enum1685);
        setField(term930629, term930629.getClass(), "kind", enum1687);
        setField(term930381, term930381.getClass(), "typeOfThis", term930629);
        setField(term930207, term930207.getClass(), "typeOfThis", term930381);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term930207;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term929653, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


