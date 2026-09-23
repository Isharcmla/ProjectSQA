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

public class FunctionType_supAndInfHelper_1603977104329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221777;
     Object term222245;

    public FunctionType_supAndInfHelper_1603977104329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term223346 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term223345 = ((Class) term223346).getDeclaredField((String) "ORDINARY");
        ((Field) term223345).setAccessible(true);
        Object enum419 = ((Field) term223345).get((Object) null);
        term221777 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term222031 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        Object term222135 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term221777, term221777.getClass(), "kind", enum419);
        setField(term221777, term221777.getClass(), "typeOfThis", term222031);
        setField(term221777, term221777.getClass(), "registry", term222135);
        Class<? extends Object> term223637 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term223636 = ((Class) term223637).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term223636).setAccessible(true);
        Object enum420 = ((Field) term223636).get((Object) null);
        term222245 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term222245, term222245.getClass(), "kind", enum420);
        setField(term222245, term222245.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term222245;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term221777, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


