package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class TypeValidator_expectCanCast_1169833078398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175818;
     Object term175928;
     Object term176592;

    public TypeValidator_expectCanCast_1169833078398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175818 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Class<? extends Object> term177496 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term177495 = ((Class) term177496).getDeclaredField((String) "INTERFACE");
        ((Field) term177495).setAccessible(true);
        Object enum65 = ((Field) term177495).get((Object) null);
        term175928 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term176482 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term175928, term175928.getClass(), "kind", enum65);
        setField(term175928, term175928.getClass(), "typeOfThis", term176482);
        term176592 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setBooleanField(term176592, term176592.getClass(), "unknown", true);
        setField(term176592, term176592.getClass(), "implicitPrototypeFallback", null);
        setField(term176592, term176592.getClass(), "kind", enum65);
        setField(term176592, term176592.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term175928;
        args[3] = term176592;
        try {
            callMethod(klass, "expectCanCast", argTypes, term175818, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


