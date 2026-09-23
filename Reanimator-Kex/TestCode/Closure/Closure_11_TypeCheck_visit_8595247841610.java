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

public class TypeCheck_visit_8595247841610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term511606;
     Object term511698;

    public TypeCheck_visit_8595247841610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term511606 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term511606, term511606.getClass(), "validator", null);
        term511698 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term511790 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term511882 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term511976 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setIntField(term511698, term511698.getClass(), "type", 52);
        setField(term511698, term511698.getClass(), "first", term511790);
        setField(term511882, term511882.getClass(), "jsType", term511976);
        setField(term511698, term511698.getClass(), "last", term511882);
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
        args[1] = term511698;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term511606, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


