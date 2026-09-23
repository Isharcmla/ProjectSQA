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

public class FunctionType_getAllImplementedInterfaces_572683533331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term303002;

    public FunctionType_getAllImplementedInterfaces_572683533331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term303861 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term303860 = ((Class) term303861).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term303860).setAccessible(true);
        Object enum536 = ((Field) term303860).get((Object) null);
        term303002 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term303264 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term303002, term303002.getClass(), "kind", enum536);
        setField(term303002, term303002.getClass(), "prototypeSlot", term303264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllImplementedInterfaces", argTypes, term303002, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


