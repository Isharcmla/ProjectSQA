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

public class FunctionType_getAllImplementedInterfaces_572683533530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term497932;

    public FunctionType_getAllImplementedInterfaces_572683533530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term498922 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term498921 = ((Class) term498922).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term498921).setAccessible(true);
        Object enum814 = ((Field) term498921).get((Object) null);
        term497932 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term498194 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term498294 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term497932, term497932.getClass(), "kind", enum814);
        setField(term498194, term498194.getClass(), "type", term498294);
        setField(term497932, term497932.getClass(), "prototypeSlot", term498194);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllImplementedInterfaces", argTypes, term497932, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


