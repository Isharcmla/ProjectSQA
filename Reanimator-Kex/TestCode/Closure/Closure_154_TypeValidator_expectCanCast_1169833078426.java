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

public class TypeValidator_expectCanCast_1169833078426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202637;
     Object term202747;
     Object term203393;

    public TypeValidator_expectCanCast_1169833078426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202637 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Class<? extends Object> term204349 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term204348 = ((Class) term204349).getDeclaredField((String) "ORDINARY");
        ((Field) term204348).setAccessible(true);
        Object enum90 = ((Field) term204348).get((Object) null);
        term202747 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term203283 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term202747, term202747.getClass(), "kind", enum90);
        setField(term202747, term202747.getClass(), "typeOfThis", term203283);
        term203393 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setBooleanField(term203393, term203393.getClass(), "unknown", true);
        setField(term203393, term203393.getClass(), "implicitPrototypeFallback", null);
        setField(term203393, term203393.getClass(), "kind", enum90);
        setField(term203393, term203393.getClass(), "typeOfThis", null);
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
        args[2] = term202747;
        args[3] = term203393;
        try {
            callMethod(klass, "expectCanCast", argTypes, term202637, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


