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

public class TypeInference_traverseChildren_1478920219210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176216;
     Object term176286;

    public TypeInference_traverseChildren_1478920219210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176216 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term176286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term176356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term176426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term176496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term176566 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term176636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term176706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term176776 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term176846 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term176916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term176986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term177056 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term177126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term177196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term177266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term176356, term176356.getClass(), "type", 18);
        setIntField(term176426, term176426.getClass(), "type", 18);
        setIntField(term176496, term176496.getClass(), "type", 18);
        setIntField(term176566, term176566.getClass(), "type", 18);
        setIntField(term176636, term176636.getClass(), "type", 18);
        setIntField(term176706, term176706.getClass(), "type", 18);
        setIntField(term176776, term176776.getClass(), "type", 18);
        setIntField(term176846, term176846.getClass(), "type", 18);
        setIntField(term176916, term176916.getClass(), "type", 18);
        setIntField(term176986, term176986.getClass(), "type", 18);
        setIntField(term177056, term177056.getClass(), "type", 18);
        setIntField(term177126, term177126.getClass(), "type", 18);
        setIntField(term177196, term177196.getClass(), "type", 18);
        setIntField(term177266, term177266.getClass(), "type", 123);
        setField(term177196, term177196.getClass(), "first", term177266);
        setField(term177126, term177126.getClass(), "first", term177196);
        setField(term177056, term177056.getClass(), "first", term177126);
        setField(term176986, term176986.getClass(), "first", term177056);
        setField(term176916, term176916.getClass(), "first", term176986);
        setField(term176846, term176846.getClass(), "first", term176916);
        setField(term176776, term176776.getClass(), "first", term176846);
        setField(term176706, term176706.getClass(), "first", term176776);
        setField(term176636, term176636.getClass(), "first", term176706);
        setField(term176566, term176566.getClass(), "first", term176636);
        setField(term176496, term176496.getClass(), "first", term176566);
        setField(term176426, term176426.getClass(), "first", term176496);
        setField(term176356, term176356.getClass(), "first", term176426);
        setField(term176286, term176286.getClass(), "first", term176356);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term176286;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term176216, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


