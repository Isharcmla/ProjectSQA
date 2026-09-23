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

public class TypeInference_traverseReturn_1142297770314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term677072;
     Object term677142;

    public TypeInference_traverseReturn_1142297770314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term677072 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term677142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term677212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term677282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term677352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term677422 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term677492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term677562 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term677632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term677702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term677772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term677842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term677912 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term677982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term677212, term677212.getClass(), "type", 29);
        setIntField(term677282, term677282.getClass(), "type", 29);
        setIntField(term677352, term677352.getClass(), "type", 29);
        setIntField(term677422, term677422.getClass(), "type", 29);
        setIntField(term677492, term677492.getClass(), "type", 29);
        setIntField(term677562, term677562.getClass(), "type", 29);
        setIntField(term677632, term677632.getClass(), "type", 29);
        setIntField(term677702, term677702.getClass(), "type", 29);
        setIntField(term677772, term677772.getClass(), "type", 29);
        setIntField(term677842, term677842.getClass(), "type", 29);
        setIntField(term677912, term677912.getClass(), "type", 29);
        setIntField(term677982, term677982.getClass(), "type", 25);
        setField(term677912, term677912.getClass(), "first", term677982);
        setField(term677842, term677842.getClass(), "first", term677912);
        setField(term677772, term677772.getClass(), "first", term677842);
        setField(term677702, term677702.getClass(), "first", term677772);
        setField(term677632, term677632.getClass(), "first", term677702);
        setField(term677562, term677562.getClass(), "first", term677632);
        setField(term677492, term677492.getClass(), "first", term677562);
        setField(term677422, term677422.getClass(), "first", term677492);
        setField(term677352, term677352.getClass(), "first", term677422);
        setField(term677282, term677282.getClass(), "first", term677352);
        setField(term677212, term677212.getClass(), "first", term677282);
        setField(term677142, term677142.getClass(), "first", term677212);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term677142;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term677072, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


