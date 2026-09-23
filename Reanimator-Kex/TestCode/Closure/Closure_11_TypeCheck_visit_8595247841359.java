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

public class TypeCheck_visit_8595247841359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term411957;
     Object term412049;

    public TypeCheck_visit_8595247841359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term411957 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term412049 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term412141 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term412233 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term412049, term412049.getClass(), "type", 45);
        setField(term412049, term412049.getClass(), "first", term412141);
        setField(term412049, term412049.getClass(), "last", term412233);
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
        args[1] = term412049;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term411957, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


