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

public class FunctionType_supAndInfHelper_1603977104572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term532402;
     Object term532764;

    public FunctionType_supAndInfHelper_1603977104572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term535322 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term535321 = ((Class) term535322).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term535321).setAccessible(true);
        Object enum973 = ((Field) term535321).get((Object) null);
        term532402 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term532654 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term532402, term532402.getClass(), "kind", enum973);
        setField(term532402, term532402.getClass(), "registry", term532654);
        Class<? extends Object> term535622 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term535621 = ((Class) term535622).getDeclaredField((String) "ORDINARY");
        ((Field) term535621).setAccessible(true);
        Object enum974 = ((Field) term535621).get((Object) null);
        term532764 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term532764, term532764.getClass(), "kind", enum974);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term532764;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term532402, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


