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

public class FunctionType_supAndInfHelper_1603977104477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401965;
     Object term402619;

    public FunctionType_supAndInfHelper_1603977104477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term405039 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term405038 = ((Class) term405039).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term405038).setAccessible(true);
        Object enum732 = ((Field) term405038).get((Object) null);
        term401965 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term402509 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term401965, term401965.getClass(), "kind", enum732);
        setField(term401965, term401965.getClass(), "typeOfThis", term402509);
        term402619 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term402619, term402619.getClass(), "kind", enum732);
        setField(term402619, term402619.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term402619;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term401965, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


