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

public class TypeCheck_visit_8595247841020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289678;
     Object term289770;

    public TypeCheck_visit_8595247841020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289678 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term289770 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term289862 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term289954 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term289770, term289770.getClass(), "type", 45);
        setIntField(term289862, term289862.getClass(), "type", 45);
        setField(term289770, term289770.getClass(), "first", term289862);
        setField(term289770, term289770.getClass(), "last", term289954);
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
        args[1] = term289770;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term289678, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


