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

public class TypeCheck_visitAssign_1165544828386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95302;
     Object term95476;

    public TypeCheck_visitAssign_1165544828386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95302 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term95406 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term95302, term95302.getClass(), "typeRegistry", term95406);
        term95476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term95476, term95476.getClass(), "propListHead", null);
        setIntField(term95546, term95546.getClass(), "type", -34);
        setField(term95546, term95546.getClass(), "jsType", null);
        setField(term95476, term95476.getClass(), "first", term95546);
        setField(term95476, term95476.getClass(), "last", term95616);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term95476;
        try {
            callMethod(klass, "visitAssign", argTypes, term95302, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


