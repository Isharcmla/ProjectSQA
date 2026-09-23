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

public class FunctionType_getLeastSupertype_418850886391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293629;
     Object term294183;

    public FunctionType_getLeastSupertype_418850886391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term295176 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term295175 = ((Class) term295176).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term295175).setAccessible(true);
        Object enum510 = ((Field) term295175).get((Object) null);
        term293629 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term293629, term293629.getClass(), "kind", enum510);
        Class<? extends Object> term295476 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term295475 = ((Class) term295476).getDeclaredField((String) "INTERFACE");
        ((Field) term295475).setAccessible(true);
        Object enum511 = ((Field) term295475).get((Object) null);
        term294183 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term294183, term294183.getClass(), "kind", enum511);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term294183;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term293629, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


