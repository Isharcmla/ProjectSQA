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

public class FunctionType_getLeastSupertype_418850886303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192214;
     Object term192860;

    public FunctionType_getLeastSupertype_418850886303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term193727 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term193726 = ((Class) term193727).getDeclaredField((String) "INTERFACE");
        ((Field) term193726).setAccessible(true);
        Object enum367 = ((Field) term193726).get((Object) null);
        term192214 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term192750 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term192214, term192214.getClass(), "kind", enum367);
        setField(term192214, term192214.getClass(), "typeOfThis", term192750);
        term192860 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term192860, term192860.getClass(), "kind", enum367);
        setField(term192860, term192860.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term192860;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term192214, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


