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

public class TypeCheck_visitAssign_1165544828272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64565;
     Object term64635;

    public TypeCheck_visitAssign_1165544828272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64565 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term64635 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term64705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term64635, term64635.getClass(), "propListHead", null);
        setField(term64635, term64635.getClass(), "first", term64705);
        setField(term64635, term64635.getClass(), "last", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term64635;
        try {
            callMethod(klass, "visitAssign", argTypes, term64565, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


