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

public class TypeCheck_visit_8595247841625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term546997;
     Object term547193;

    public TypeCheck_visit_8595247841625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term546997 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term547101 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term546997, term546997.getClass(), "typeRegistry", term547101);
        term547193 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term547285 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term547193, term547193.getClass(), "type", 12);
        setIntField(term547285, term547285.getClass(), "type", 0);
        setField(term547285, term547285.getClass(), "jsType", null);
        setField(term547193, term547193.getClass(), "first", term547285);
        setField(term547193, term547193.getClass(), "last", term547285);
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
        args[1] = term547193;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term546997, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


