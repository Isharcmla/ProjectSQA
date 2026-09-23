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

public class FunctionType_getLeastSupertype_418850886733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term689343;
     Object term689713;

    public FunctionType_getLeastSupertype_418850886733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term690800 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term690799 = ((Class) term690800).getDeclaredField((String) "ORDINARY");
        ((Field) term690799).setAccessible(true);
        Object enum1281 = ((Field) term690799).get((Object) null);
        term689343 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term689605 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term689343, term689343.getClass(), "kind", enum1281);
        setField(term689343, term689343.getClass(), "typeOfThis", term689605);
        Class<? extends Object> term691091 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term691090 = ((Class) term691091).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term691090).setAccessible(true);
        Object enum1282 = ((Field) term691090).get((Object) null);
        term689713 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term689713, term689713.getClass(), "kind", enum1282);
        setField(term689713, term689713.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term689713;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term689343, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


