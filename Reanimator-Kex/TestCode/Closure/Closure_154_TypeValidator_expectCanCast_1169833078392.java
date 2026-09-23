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

public class TypeValidator_expectCanCast_1169833078392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168308;
     Object term168418;
     Object term168774;

    public TypeValidator_expectCanCast_1169833078392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168308 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Class<? extends Object> term169973 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term169972 = ((Class) term169973).getDeclaredField((String) "ORDINARY");
        ((Field) term169972).setAccessible(true);
        Object enum56 = ((Field) term169972).get((Object) null);
        term168418 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term168664 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term168418, term168418.getClass(), "kind", enum56);
        setField(term168418, term168418.getClass(), "typeOfThis", term168664);
        Class<? extends Object> term170264 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term170263 = ((Class) term170264).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term170263).setAccessible(true);
        Object enum57 = ((Field) term170263).get((Object) null);
        term168774 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setBooleanField(term168774, term168774.getClass(), "unknown", false);
        setField(term168774, term168774.getClass(), "kind", enum57);
        setField(term168774, term168774.getClass(), "typeOfThis", null);
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
        args[2] = term168418;
        args[3] = term168774;
        try {
            callMethod(klass, "expectCanCast", argTypes, term168308, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


