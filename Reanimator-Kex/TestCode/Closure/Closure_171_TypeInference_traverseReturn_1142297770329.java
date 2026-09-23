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

public class TypeInference_traverseReturn_1142297770329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term745029;
     Object term745099;

    public TypeInference_traverseReturn_1142297770329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term745029 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term745099 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term745169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term745239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term745309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term745379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term745449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term745519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term745589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term745169, term745169.getClass(), "type", 29);
        setIntField(term745239, term745239.getClass(), "type", 29);
        setIntField(term745309, term745309.getClass(), "type", 29);
        setIntField(term745379, term745379.getClass(), "type", 29);
        setIntField(term745449, term745449.getClass(), "type", 29);
        setIntField(term745519, term745519.getClass(), "type", 29);
        setIntField(term745589, term745589.getClass(), "type", 76);
        setField(term745519, term745519.getClass(), "first", term745589);
        setField(term745449, term745449.getClass(), "first", term745519);
        setField(term745379, term745379.getClass(), "first", term745449);
        setField(term745309, term745309.getClass(), "first", term745379);
        setField(term745239, term745239.getClass(), "first", term745309);
        setField(term745169, term745169.getClass(), "first", term745239);
        setField(term745099, term745099.getClass(), "first", term745169);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term745099;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term745029, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


