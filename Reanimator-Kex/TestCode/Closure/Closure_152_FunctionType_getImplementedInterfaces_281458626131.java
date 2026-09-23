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

public class FunctionType_getImplementedInterfaces_281458626131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67801;

    public FunctionType_getImplementedInterfaces_281458626131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term69249 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term69248 = ((Class) term69249).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term69248).setAccessible(true);
        Object enum168 = ((Field) term69248).get((Object) null);
        term67801 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term67801, term67801.getClass(), "kind", enum168);
        setField(term67801, term67801.getClass(), "prototype", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getImplementedInterfaces", argTypes, term67801, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


