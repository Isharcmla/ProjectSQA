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

public class TypeCheck_visitCall_361944333300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71378;
     Object term71448;

    public TypeCheck_visitCall_361944333300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71378 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term71448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71544 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setField(term71448, term71448.getClass(), "first", term71448);
        setField(term71448, term71448.getClass(), "jsType", term71544);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term71448;
        try {
            callMethod(klass, "visitCall", argTypes, term71378, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


