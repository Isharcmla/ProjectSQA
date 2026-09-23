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

public class TypeValidator_expectCanCast_1169833078472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238225;
     Object term238335;
     Object term238593;

    public TypeValidator_expectCanCast_1169833078472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238225 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Class<? extends Object> term239964 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term239963 = ((Class) term239964).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term239963).setAccessible(true);
        Object enum133 = ((Field) term239963).get((Object) null);
        term238335 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term238335, term238335.getClass(), "kind", enum133);
        Class<? extends Object> term240264 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term240263 = ((Class) term240264).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term240263).setAccessible(true);
        Object enum134 = ((Field) term240263).get((Object) null);
        term238593 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setBooleanField(term238593, term238593.getClass(), "unknown", true);
        setField(term238593, term238593.getClass(), "implicitPrototypeFallback", null);
        setField(term238593, term238593.getClass(), "kind", enum134);
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
        args[2] = term238335;
        args[3] = term238593;
        try {
            callMethod(klass, "expectCanCast", argTypes, term238225, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


