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

public class TypeValidator_expectCanCast_1169833078442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212123;
     Object term212233;
     Object term212911;

    public TypeValidator_expectCanCast_1169833078442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term212123 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Class<? extends Object> term213874 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term213873 = ((Class) term213874).getDeclaredField((String) "INTERFACE");
        ((Field) term213873).setAccessible(true);
        Object enum97 = ((Field) term213873).get((Object) null);
        term212233 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term212801 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term212233, term212233.getClass(), "kind", enum97);
        setField(term212233, term212233.getClass(), "typeOfThis", term212801);
        term212911 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setBooleanField(term212911, term212911.getClass(), "unknown", true);
        setField(term212911, term212911.getClass(), "implicitPrototypeFallback", null);
        setField(term212911, term212911.getClass(), "kind", enum97);
        setField(term212911, term212911.getClass(), "typeOfThis", null);
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
        args[2] = term212233;
        args[3] = term212911;
        try {
            callMethod(klass, "expectCanCast", argTypes, term212123, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


