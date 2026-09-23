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

public class FunctionType_supAndInfHelper_1603977104311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203237;
     Object term203791;

    public FunctionType_supAndInfHelper_1603977104311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term204805 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term204804 = ((Class) term204805).getDeclaredField((String) "INTERFACE");
        ((Field) term204804).setAccessible(true);
        Object enum364 = ((Field) term204804).get((Object) null);
        term203237 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term203237, term203237.getClass(), "kind", enum364);
        Class<? extends Object> term205099 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term205098 = ((Class) term205099).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term205098).setAccessible(true);
        Object enum365 = ((Field) term205098).get((Object) null);
        term203791 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term203791, term203791.getClass(), "kind", enum365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term203791;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term203237, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


