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

public class TypeCheck_visit_859524784844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228581;
     Object term228777;

    public TypeCheck_visit_859524784844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term228581 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term228685 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term228581, term228581.getClass(), "typeRegistry", term228685);
        term228777 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term228869 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term228777, term228777.getClass(), "type", 45);
        setIntField(term228869, term228869.getClass(), "type", 0);
        setField(term228869, term228869.getClass(), "jsType", null);
        setField(term228777, term228777.getClass(), "first", term228869);
        setField(term228777, term228777.getClass(), "last", term228869);
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
        args[1] = term228777;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term228581, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


