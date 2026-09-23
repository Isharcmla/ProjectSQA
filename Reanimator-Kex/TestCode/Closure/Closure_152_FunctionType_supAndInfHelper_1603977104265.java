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

public class FunctionType_supAndInfHelper_1603977104265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146376;
     Object term146734;

    public FunctionType_supAndInfHelper_1603977104265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term147837 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term147836 = ((Class) term147837).getDeclaredField((String) "ORDINARY");
        ((Field) term147836).setAccessible(true);
        Object enum271 = ((Field) term147836).get((Object) null);
        term146376 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term146624 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term146376, term146376.getClass(), "kind", enum271);
        setField(term146376, term146376.getClass(), "typeOfThis", term146624);
        Class<? extends Object> term148128 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term148127 = ((Class) term148128).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term148127).setAccessible(true);
        Object enum272 = ((Field) term148127).get((Object) null);
        term146734 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term146734, term146734.getClass(), "kind", enum272);
        setField(term146734, term146734.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term146734;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term146376, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


