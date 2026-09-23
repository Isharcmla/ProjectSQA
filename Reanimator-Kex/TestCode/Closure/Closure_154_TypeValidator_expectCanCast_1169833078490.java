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

public class TypeValidator_expectCanCast_1169833078490 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254001;
     Object term254111;
     Object term254775;

    public TypeValidator_expectCanCast_1169833078490() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term254001 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Class<? extends Object> term255680 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term255679 = ((Class) term255680).getDeclaredField((String) "INTERFACE");
        ((Field) term255679).setAccessible(true);
        Object enum151 = ((Field) term255679).get((Object) null);
        term254111 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term254665 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term254111, term254111.getClass(), "kind", enum151);
        setField(term254111, term254111.getClass(), "typeOfThis", term254665);
        term254775 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setBooleanField(term254775, term254775.getClass(), "unknown", false);
        setField(term254775, term254775.getClass(), "kind", enum151);
        setField(term254775, term254775.getClass(), "typeOfThis", null);
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
        args[2] = term254111;
        args[3] = term254775;
        try {
            callMethod(klass, "expectCanCast", argTypes, term254001, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


