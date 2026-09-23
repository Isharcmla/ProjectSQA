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

public class TypeValidator_expectAllInterfaceProperties_340285299402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180043;
     Object term180147;

    public TypeValidator_expectAllInterfaceProperties_340285299402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180043 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Class<? extends Object> term180909 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term180908 = ((Class) term180909).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term180908).setAccessible(true);
        Object enum69 = ((Field) term180908).get((Object) null);
        term180147 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term180147, term180147.getClass(), "kind", enum69);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term180147;
        try {
            callMethod(klass, "expectAllInterfaceProperties", argTypes, term180043, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


