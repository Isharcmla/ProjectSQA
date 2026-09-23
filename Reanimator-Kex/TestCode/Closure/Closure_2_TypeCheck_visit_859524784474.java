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

public class TypeCheck_visit_859524784474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120344;
     Object term120518;

    public TypeCheck_visit_859524784474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120344 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term120448 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term120344, term120344.getClass(), "typeRegistry", term120448);
        term120518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term120588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term120658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term120518, term120518.getClass(), "type", 45);
        setIntField(term120588, term120588.getClass(), "type", 0);
        setField(term120588, term120588.getClass(), "jsType", null);
        setField(term120518, term120518.getClass(), "first", term120588);
        setIntField(term120658, term120658.getClass(), "type", 0);
        setField(term120518, term120518.getClass(), "last", term120658);
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
        args[1] = term120518;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term120344, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


