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

public class FunctionType_getAllImplementedInterfaces_572683533180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80795;

    public FunctionType_getAllImplementedInterfaces_572683533180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term82164 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term82163 = ((Class) term82164).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term82163).setAccessible(true);
        Object enum172 = ((Field) term82163).get((Object) null);
        term80795 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term80795, term80795.getClass(), "kind", enum172);
        setField(term80795, term80795.getClass(), "prototype", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllImplementedInterfaces", argTypes, term80795, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


