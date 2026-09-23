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

public class TypeCheck_visitNew_25630207561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150210;
     Object term150384;

    public TypeCheck_visitNew_25630207561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150210 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term150314 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term150210, term150210.getClass(), "typeRegistry", term150314);
        term150384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term150454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term150454, term150454.getClass(), "jsType", null);
        setField(term150384, term150384.getClass(), "first", term150454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term150384;
        try {
            callMethod(klass, "visitNew", argTypes, term150210, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


