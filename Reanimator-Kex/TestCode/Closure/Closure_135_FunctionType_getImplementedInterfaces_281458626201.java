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

public class FunctionType_getImplementedInterfaces_281458626201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93761;

    public FunctionType_getImplementedInterfaces_281458626201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term94508 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term94507 = ((Class) term94508).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term94507).setAccessible(true);
        Object enum195 = ((Field) term94507).get((Object) null);
        term93761 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term93761, term93761.getClass(), "kind", enum195);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getImplementedInterfaces", argTypes, term93761, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


