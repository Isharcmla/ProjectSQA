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

public class TypeCheck_visit_8595247841325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401487;
     Object term401661;

    public TypeCheck_visit_8595247841325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term401487 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term401591 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term401487, term401487.getClass(), "typeRegistry", term401591);
        term401661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term401731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term401825 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setIntField(term401661, term401661.getClass(), "type", 92);
        setIntField(term401731, term401731.getClass(), "type", 0);
        setField(term401731, term401731.getClass(), "jsType", term401825);
        setField(term401661, term401661.getClass(), "first", term401731);
        setField(term401661, term401661.getClass(), "last", term401661);
        setField(term401661, term401661.getClass(), "jsType", null);
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
        args[1] = term401661;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term401487, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


