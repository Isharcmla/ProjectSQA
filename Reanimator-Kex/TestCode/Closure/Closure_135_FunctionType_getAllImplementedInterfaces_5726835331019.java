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

public class FunctionType_getAllImplementedInterfaces_5726835331019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1154611;

    public FunctionType_getAllImplementedInterfaces_5726835331019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1157068 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1157067 = ((Class) term1157068).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1157067).setAccessible(true);
        Object enum2154 = ((Field) term1157067).get((Object) null);
        term1154611 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1154877 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term1154611, term1154611.getClass(), "kind", enum2154);
        setField(term1154877, term1154877.getClass(), "implicitPrototype", null);
        setField(term1154611, term1154611.getClass(), "prototype", term1154877);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllImplementedInterfaces", argTypes, term1154611, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


