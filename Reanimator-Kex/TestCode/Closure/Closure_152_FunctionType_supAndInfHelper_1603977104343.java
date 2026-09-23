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

public class FunctionType_supAndInfHelper_1603977104343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232370;
     Object term232628;

    public FunctionType_supAndInfHelper_1603977104343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term233218 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term233217 = ((Class) term233218).getDeclaredField((String) "ORDINARY");
        ((Field) term233217).setAccessible(true);
        Object enum407 = ((Field) term233217).get((Object) null);
        term232370 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term232370, term232370.getClass(), "kind", enum407);
        term232628 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term232628;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term232370, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


