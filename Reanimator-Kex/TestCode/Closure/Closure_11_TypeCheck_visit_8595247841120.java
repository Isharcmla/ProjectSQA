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

public class TypeCheck_visit_8595247841120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323373;
     Object term323465;

    public TypeCheck_visit_8595247841120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term323373 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term323465 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term323557 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term323651 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setIntField(term323465, term323465.getClass(), "type", 17);
        setField(term323557, term323557.getClass(), "jsType", term323651);
        setField(term323465, term323465.getClass(), "first", term323557);
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
        args[1] = term323465;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term323373, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


