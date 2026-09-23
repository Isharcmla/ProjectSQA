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

public class TypeCheck_visit_859524784881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228841;
     Object term228933;

    public TypeCheck_visit_859524784881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term228841 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term228841, term228841.getClass(), "validator", null);
        term228933 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term229025 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term229117 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setIntField(term228933, term228933.getClass(), "type", 35);
        setField(term229025, term229025.getClass(), "jsType", term229117);
        setField(term228933, term228933.getClass(), "first", term229025);
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
        args[1] = term228933;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term228841, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


