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

public class FunctionType_getLeastSupertype_418850886291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151092;
     Object term151754;

    public FunctionType_getLeastSupertype_418850886291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term152764 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term152763 = ((Class) term152764).getDeclaredField((String) "ORDINARY");
        ((Field) term152763).setAccessible(true);
        Object enum278 = ((Field) term152763).get((Object) null);
        term151092 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term151646 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term151092, term151092.getClass(), "kind", enum278);
        setField(term151092, term151092.getClass(), "typeOfThis", term151646);
        Class<? extends Object> term153055 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term153054 = ((Class) term153055).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term153054).setAccessible(true);
        Object enum279 = ((Field) term153054).get((Object) null);
        term151754 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term151754, term151754.getClass(), "kind", enum279);
        setField(term151754, term151754.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term151754;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term151092, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


