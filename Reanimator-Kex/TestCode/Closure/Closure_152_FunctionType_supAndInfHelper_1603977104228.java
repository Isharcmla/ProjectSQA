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

public class FunctionType_supAndInfHelper_1603977104228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115330;
     Object term115588;

    public FunctionType_supAndInfHelper_1603977104228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term116946 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term116945 = ((Class) term116946).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term116945).setAccessible(true);
        Object enum217 = ((Field) term116945).get((Object) null);
        term115330 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term115330, term115330.getClass(), "kind", enum217);
        term115588 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term115588;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term115330, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


