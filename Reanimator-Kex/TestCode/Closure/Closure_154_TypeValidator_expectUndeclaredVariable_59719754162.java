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

public class TypeValidator_expectUndeclaredVariable_59719754162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44754;
     Object term44846;

    public TypeValidator_expectUndeclaredVariable_59719754162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44754 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term44846 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term44846, term44846.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("com.google.javascript.jscomp.Scope$Var");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = term44846;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        try {
            callMethod(klass, "expectUndeclaredVariable", argTypes, term44754, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


