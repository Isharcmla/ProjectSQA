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

public class FunctionType_getLeastSupertype_418850886691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term722707;
     Object term723371;

    public FunctionType_getLeastSupertype_418850886691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term724902 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term724901 = ((Class) term724902).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term724901).setAccessible(true);
        Object enum1302 = ((Field) term724901).get((Object) null);
        term722707 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term723261 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term722707, term722707.getClass(), "kind", enum1302);
        setField(term723261, term723261.getClass(), "kind", enum1302);
        setField(term722707, term722707.getClass(), "typeOfThis", term723261);
        Class<? extends Object> term725202 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term725201 = ((Class) term725202).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term725201).setAccessible(true);
        Object enum1303 = ((Field) term725201).get((Object) null);
        Class<? extends Object> term725502 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term725501 = ((Class) term725502).getDeclaredField((String) "INTERFACE");
        ((Field) term725501).setAccessible(true);
        Object enum1304 = ((Field) term725501).get((Object) null);
        term723371 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term723545 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term723371, term723371.getClass(), "kind", enum1303);
        setField(term723545, term723545.getClass(), "kind", enum1304);
        setField(term723371, term723371.getClass(), "typeOfThis", term723545);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term723371;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term722707, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


