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

public class TypeInference_traverseReturn_1142297770440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1203497;
     Object term1203567;

    public TypeInference_traverseReturn_1142297770440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1203497 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1203567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1203637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1203707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1203777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1203847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1203917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1203987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1204057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1204127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1204197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1204267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1204337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1204407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1204477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1204547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1204617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1204687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1203637, term1203637.getClass(), "type", 92);
        setIntField(term1203707, term1203707.getClass(), "type", 92);
        setIntField(term1203777, term1203777.getClass(), "type", 92);
        setIntField(term1203847, term1203847.getClass(), "type", 92);
        setIntField(term1203917, term1203917.getClass(), "type", 92);
        setIntField(term1203987, term1203987.getClass(), "type", 92);
        setIntField(term1204057, term1204057.getClass(), "type", 92);
        setIntField(term1204127, term1204127.getClass(), "type", 92);
        setIntField(term1204197, term1204197.getClass(), "type", 92);
        setIntField(term1204267, term1204267.getClass(), "type", 92);
        setIntField(term1204337, term1204337.getClass(), "type", 92);
        setIntField(term1204407, term1204407.getClass(), "type", 92);
        setIntField(term1204477, term1204477.getClass(), "type", 92);
        setIntField(term1204547, term1204547.getClass(), "type", 92);
        setIntField(term1204617, term1204617.getClass(), "type", 92);
        setIntField(term1204687, term1204687.getClass(), "type", 120);
        setField(term1204617, term1204617.getClass(), "first", term1204687);
        setField(term1204547, term1204547.getClass(), "first", term1204617);
        setField(term1204477, term1204477.getClass(), "first", term1204547);
        setField(term1204407, term1204407.getClass(), "first", term1204477);
        setField(term1204337, term1204337.getClass(), "first", term1204407);
        setField(term1204267, term1204267.getClass(), "first", term1204337);
        setField(term1204197, term1204197.getClass(), "first", term1204267);
        setField(term1204127, term1204127.getClass(), "first", term1204197);
        setField(term1204057, term1204057.getClass(), "first", term1204127);
        setField(term1203987, term1203987.getClass(), "first", term1204057);
        setField(term1203917, term1203917.getClass(), "first", term1203987);
        setField(term1203847, term1203847.getClass(), "first", term1203917);
        setField(term1203777, term1203777.getClass(), "first", term1203847);
        setField(term1203707, term1203707.getClass(), "first", term1203777);
        setField(term1203637, term1203637.getClass(), "first", term1203707);
        setField(term1203567, term1203567.getClass(), "first", term1203637);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1203567;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term1203497, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


