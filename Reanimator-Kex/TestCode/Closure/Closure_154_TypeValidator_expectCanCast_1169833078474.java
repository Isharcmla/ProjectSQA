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

public class TypeValidator_expectCanCast_1169833078474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241480;
     Object term241590;
     Object term241946;

    public TypeValidator_expectCanCast_1169833078474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term241480 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Class<? extends Object> term242806 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term242805 = ((Class) term242806).getDeclaredField((String) "ORDINARY");
        ((Field) term242805).setAccessible(true);
        Object enum138 = ((Field) term242805).get((Object) null);
        term241590 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term241836 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term241590, term241590.getClass(), "kind", enum138);
        setField(term241590, term241590.getClass(), "typeOfThis", term241836);
        term241946 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term242118 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setBooleanField(term241946, term241946.getClass(), "unknown", false);
        setField(term241946, term241946.getClass(), "kind", enum138);
        setField(term241946, term241946.getClass(), "typeOfThis", term242118);
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
        args[2] = term241590;
        args[3] = term241946;
        try {
            callMethod(klass, "expectCanCast", argTypes, term241480, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


