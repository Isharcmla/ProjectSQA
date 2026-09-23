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

public class TypeCheck_shouldTraverse_4356040741092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313176;
     Object term313246;

    public TypeCheck_shouldTraverse_4356040741092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313176 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term313176, term313176.getClass(), "validator", null);
        setIntField(term313176, term313176.getClass(), "noTypeCheckSection", -1);
        term313246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term313246, term313246.getClass(), "type", 86);
        setField(term313246, term313246.getClass(), "propListHead", null);
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
        args[1] = term313246;
        args[2] = null;
        try {
            callMethod(klass, "shouldTraverse", argTypes, term313176, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


