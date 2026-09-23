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

public class TypeInference_traverseChildren_1478920219346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term986562;
     Object term986632;

    public TypeInference_traverseChildren_1478920219346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term986562 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term986632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term986702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term986772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term986842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term986912 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term986982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term986702, term986702.getClass(), "type", 18);
        setIntField(term986772, term986772.getClass(), "type", 18);
        setIntField(term986842, term986842.getClass(), "type", 18);
        setIntField(term986912, term986912.getClass(), "type", 18);
        setIntField(term986982, term986982.getClass(), "type", 15);
        setField(term986912, term986912.getClass(), "first", term986982);
        setField(term986842, term986842.getClass(), "first", term986912);
        setField(term986772, term986772.getClass(), "first", term986842);
        setField(term986702, term986702.getClass(), "first", term986772);
        setField(term986632, term986632.getClass(), "first", term986702);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term986632;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term986562, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


