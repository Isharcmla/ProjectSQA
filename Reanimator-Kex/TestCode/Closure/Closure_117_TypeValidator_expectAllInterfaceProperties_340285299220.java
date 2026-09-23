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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class TypeValidator_expectAllInterfaceProperties_340285299220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80268;
     Object term80368;

    public TypeValidator_expectAllInterfaceProperties_340285299220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80268 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Class<? extends Object> term80518 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term80517 = ((Class) term80518).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term80517).setAccessible(true);
        Object enum80 = ((Field) term80517).get((Object) null);
        term80368 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term80368, term80368.getClass(), "kind", enum80);
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
        args[2] = term80368;
        callMethod(klass, "expectAllInterfaceProperties", argTypes, term80268, args);
    }

};


