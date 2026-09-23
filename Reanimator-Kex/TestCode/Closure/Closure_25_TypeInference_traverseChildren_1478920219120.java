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

public class TypeInference_traverseChildren_1478920219120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36421;
     Object term36491;

    public TypeInference_traverseChildren_1478920219120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36421 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term36491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36561, term36561.getClass(), "type", 1241164745);
        setField(term36561, term36561.getClass(), "propListHead", null);
        setIntField(term36631, term36631.getClass(), "type", 98);
        setField(term36561, term36561.getClass(), "next", term36631);
        setField(term36491, term36491.getClass(), "first", term36561);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term36491;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term36421, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


