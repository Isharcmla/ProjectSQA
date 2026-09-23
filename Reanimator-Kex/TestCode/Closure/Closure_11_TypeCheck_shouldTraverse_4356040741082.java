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

public class TypeCheck_shouldTraverse_4356040741082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308787;
     Object term308947;

    public TypeCheck_shouldTraverse_4356040741082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term308787 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term308877 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term308787, term308787.getClass(), "validator", term308877);
        setIntField(term308787, term308787.getClass(), "noTypeCheckSection", 0);
        term308947 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term308947, term308947.getClass(), "type", 105);
        setField(term308947, term308947.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term308947;
        args[2] = null;
        try {
            callMethod(klass, "shouldTraverse", argTypes, term308787, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


