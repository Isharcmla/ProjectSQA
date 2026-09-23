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

public class FunctionType_getAllImplementedInterfaces_572683533405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307421;

    public FunctionType_getAllImplementedInterfaces_572683533405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term308429 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term308428 = ((Class) term308429).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term308428).setAccessible(true);
        Object enum562 = ((Field) term308428).get((Object) null);
        term307421 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term307687 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term307787 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term307421, term307421.getClass(), "kind", enum562);
        setField(term307687, term307687.getClass(), "implicitPrototype", term307787);
        setField(term307421, term307421.getClass(), "prototype", term307687);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllImplementedInterfaces", argTypes, term307421, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


