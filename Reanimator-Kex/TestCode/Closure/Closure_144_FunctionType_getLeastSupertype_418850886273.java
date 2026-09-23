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

public class FunctionType_getLeastSupertype_418850886273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160866;
     Object term161530;

    public FunctionType_getLeastSupertype_418850886273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term163749 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term163748 = ((Class) term163749).getDeclaredField((String) "ORDINARY");
        ((Field) term163748).setAccessible(true);
        Object enum318 = ((Field) term163748).get((Object) null);
        term160866 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term161420 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term160866, term160866.getClass(), "kind", enum318);
        setField(term160866, term160866.getClass(), "typeOfThis", term161420);
        Class<? extends Object> term164040 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term164039 = ((Class) term164040).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term164039).setAccessible(true);
        Object enum319 = ((Field) term164039).get((Object) null);
        term161530 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term161530, term161530.getClass(), "kind", enum319);
        setField(term161530, term161530.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term161530;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term160866, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


