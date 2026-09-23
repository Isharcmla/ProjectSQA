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

public class TypeValidator_expectCanCast_1169833078300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103432;
     Object term103542;
     Object term103908;

    public TypeValidator_expectCanCast_1169833078300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103432 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Class<? extends Object> term105110 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term105109 = ((Class) term105110).getDeclaredField((String) "ORDINARY");
        ((Field) term105109).setAccessible(true);
        Object enum30 = ((Field) term105109).get((Object) null);
        term103542 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term103798 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term103542, term103542.getClass(), "kind", enum30);
        setField(term103542, term103542.getClass(), "typeOfThis", term103798);
        Class<? extends Object> term105401 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term105400 = ((Class) term105401).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term105400).setAccessible(true);
        Object enum31 = ((Field) term105400).get((Object) null);
        term103908 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setBooleanField(term103908, term103908.getClass(), "unknown", true);
        setField(term103908, term103908.getClass(), "implicitPrototypeFallback", null);
        setField(term103908, term103908.getClass(), "kind", enum31);
        setField(term103908, term103908.getClass(), "typeOfThis", null);
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
        args[2] = term103542;
        args[3] = term103908;
        try {
            callMethod(klass, "expectCanCast", argTypes, term103432, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


