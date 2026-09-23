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

public class FunctionType_supAndInfHelper_1603977104671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term688457;
     Object term689099;

    public FunctionType_supAndInfHelper_1603977104671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term689955 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term689954 = ((Class) term689955).getDeclaredField((String) "INTERFACE");
        ((Field) term689954).setAccessible(true);
        Object enum1048 = ((Field) term689954).get((Object) null);
        term688457 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term688989 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term688457, term688457.getClass(), "kind", enum1048);
        setField(term688457, term688457.getClass(), "typeOfThis", term688989);
        term689099 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term689099, term689099.getClass(), "kind", enum1048);
        setField(term689099, term689099.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term689099;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term688457, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


