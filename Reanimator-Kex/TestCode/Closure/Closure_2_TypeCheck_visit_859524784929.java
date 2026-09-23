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

public class TypeCheck_visit_859524784929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259345;
     Object term259437;

    public TypeCheck_visit_859524784929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term259345 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term259437 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term259529 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term259623 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term259715 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term259437, term259437.getClass(), "type", 45);
        setIntField(term259529, term259529.getClass(), "type", 5);
        setField(term259529, term259529.getClass(), "jsType", term259623);
        setField(term259437, term259437.getClass(), "first", term259529);
        setIntField(term259715, term259715.getClass(), "type", 1);
        setField(term259437, term259437.getClass(), "last", term259715);
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
        args[1] = term259437;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term259345, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


