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

public class TypeCheck_visit_8595247841219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term353934;
     Object term354026;

    public TypeCheck_visit_8595247841219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term353934 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term354026 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term354118 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term354228 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setIntField(term354026, term354026.getClass(), "type", 85);
        setField(term354118, term354118.getClass(), "jsType", term354228);
        setField(term354026, term354026.getClass(), "last", term354118);
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
        args[1] = term354026;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term353934, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


