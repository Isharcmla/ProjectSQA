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
import java.util.ArrayList;

public class FunctionType_getAllImplementedInterfaces_572683533124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66561;

    public FunctionType_getAllImplementedInterfaces_572683533124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term67877 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term67876 = ((Class) term67877).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term67876).setAccessible(true);
        Object enum165 = ((Field) term67876).get((Object) null);
        ArrayList term67057 = new ArrayList();
        term66561 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term66561, term66561.getClass(), "kind", enum165);
        setField(term66561, term66561.getClass(), "implementedInterfaces", term67057);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllImplementedInterfaces", argTypes, term66561, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


