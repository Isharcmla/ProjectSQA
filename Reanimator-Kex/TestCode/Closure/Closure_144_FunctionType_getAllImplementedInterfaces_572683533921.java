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

public class FunctionType_getAllImplementedInterfaces_572683533921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1127191;

    public FunctionType_getAllImplementedInterfaces_572683533921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1128167 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1128166 = ((Class) term1128167).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1128166).setAccessible(true);
        Object enum2028 = ((Field) term1128166).get((Object) null);
        Object term1127547 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term1127509 = new ArrayList();
        ((ArrayList) term1127509).add((Object)null);
        ((ArrayList) term1127509).add(term1127547);
        term1127191 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1127457 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term1127191, term1127191.getClass(), "kind", enum2028);
        setField(term1127457, term1127457.getClass(), "implicitPrototype", null);
        setField(term1127191, term1127191.getClass(), "prototype", term1127457);
        setField(term1127191, term1127191.getClass(), "implementedInterfaces", term1127509);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllImplementedInterfaces", argTypes, term1127191, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


