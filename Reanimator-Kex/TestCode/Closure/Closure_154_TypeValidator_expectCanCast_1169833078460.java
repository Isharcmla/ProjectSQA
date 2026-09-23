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

public class TypeValidator_expectCanCast_1169833078460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228366;
     Object term228476;
     Object term228734;

    public TypeValidator_expectCanCast_1169833078460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term228366 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Class<? extends Object> term229479 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term229478 = ((Class) term229479).getDeclaredField((String) "INTERFACE");
        ((Field) term229478).setAccessible(true);
        Object enum119 = ((Field) term229478).get((Object) null);
        term228476 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term228476, term228476.getClass(), "kind", enum119);
        setBooleanField(term228476, term228476.getClass(), "unknown", false);
        term228734 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setBooleanField(term228734, term228734.getClass(), "unknown", true);
        setField(term228734, term228734.getClass(), "implicitPrototypeFallback", null);
        setField(term228734, term228734.getClass(), "kind", enum119);
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
        args[2] = term228476;
        args[3] = term228734;
        try {
            callMethod(klass, "expectCanCast", argTypes, term228366, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


