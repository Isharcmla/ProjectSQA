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

public class FunctionType_getLeastSupertype_418850886697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term732718;
     Object term733541;

    public FunctionType_getLeastSupertype_418850886697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term734655 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term734654 = ((Class) term734655).getDeclaredField((String) "INTERFACE");
        ((Field) term734654).setAccessible(true);
        Object enum1319 = ((Field) term734654).get((Object) null);
        Class<? extends Object> term734949 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term734948 = ((Class) term734949).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term734948).setAccessible(true);
        Object enum1320 = ((Field) term734948).get((Object) null);
        term732718 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        term733541 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term733670 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term733486 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term732718, term732718.getClass(), "kind", enum1319);
        setField(term733541, term733541.getClass(), "kind", enum1320);
        setField(term733541, term733541.getClass(), "typeOfThis", term733670);
        setField(term732718, term732718.getClass(), "typeOfThis", term733541);
        setField(term732718, term732718.getClass(), "registry", term733486);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term733541;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term732718, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


