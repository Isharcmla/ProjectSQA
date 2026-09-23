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
import java.lang.Object;

public class TypeCheck_visitCall_361944333402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118927;
     Object term118997;

    public TypeCheck_visitCall_361944333402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118927 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term118997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term119103 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term118997, term118997.getClass(), "first", term118997);
        setField(term118997, term118997.getClass(), "jsType", term119103);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term118997;
        try {
            callMethod(klass, "visitCall", argTypes, term118927, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


