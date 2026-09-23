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

public class TypeCheck_visit_8595247841664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term565224;
     Object term565316;

    public TypeCheck_visit_8595247841664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term565224 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term565224, term565224.getClass(), "validator", null);
        term565316 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term565408 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term565500 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term565600 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setIntField(term565316, term565316.getClass(), "type", 51);
        setField(term565316, term565316.getClass(), "first", term565408);
        setField(term565500, term565500.getClass(), "jsType", term565600);
        setField(term565316, term565316.getClass(), "last", term565500);
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
        args[1] = term565316;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term565224, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


