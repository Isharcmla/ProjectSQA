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

public class FunctionType_getLeastSupertype_418850886557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term439538;
     Object term440200;

    public FunctionType_getLeastSupertype_418850886557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term441778 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term441777 = ((Class) term441778).getDeclaredField((String) "ORDINARY");
        ((Field) term441777).setAccessible(true);
        Object enum816 = ((Field) term441777).get((Object) null);
        term439538 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term440092 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term439538, term439538.getClass(), "kind", enum816);
        setField(term440092, term440092.getClass(), "kind", enum816);
        setField(term439538, term439538.getClass(), "typeOfThis", term440092);
        Class<? extends Object> term442069 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term442068 = ((Class) term442069).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term442068).setAccessible(true);
        Object enum817 = ((Field) term442068).get((Object) null);
        Class<? extends Object> term442369 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term442368 = ((Class) term442369).getDeclaredField((String) "INTERFACE");
        ((Field) term442368).setAccessible(true);
        Object enum818 = ((Field) term442368).get((Object) null);
        term440200 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term440374 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term440200, term440200.getClass(), "kind", enum817);
        setField(term440374, term440374.getClass(), "kind", enum818);
        setField(term440200, term440200.getClass(), "typeOfThis", term440374);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term440200;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term439538, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


