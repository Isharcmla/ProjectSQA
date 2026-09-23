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

public class FunctionType_supAndInfHelper_1603977104449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term370625;
     Object term371069;

    public FunctionType_supAndInfHelper_1603977104449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term371919 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term371918 = ((Class) term371919).getDeclaredField((String) "ORDINARY");
        ((Field) term371918).setAccessible(true);
        Object enum631 = ((Field) term371918).get((Object) null);
        term370625 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term370865 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        Object term370959 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term370625, term370625.getClass(), "kind", enum631);
        setField(term370625, term370625.getClass(), "typeOfThis", term370865);
        setField(term370625, term370625.getClass(), "call", term370959);
        term371069 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term371243 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term371069, term371069.getClass(), "kind", enum631);
        setField(term371069, term371069.getClass(), "typeOfThis", term371243);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term371069;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term370625, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


