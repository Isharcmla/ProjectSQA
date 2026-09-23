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

public class TypeCheck_visit_859524784694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187736;
     Object term187932;

    public TypeCheck_visit_859524784694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term187736 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term187840 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term187736, term187736.getClass(), "typeRegistry", term187840);
        term187932 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term188024 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term187932, term187932.getClass(), "type", 45);
        setIntField(term188024, term188024.getClass(), "type", 0);
        setField(term188024, term188024.getClass(), "jsType", null);
        setField(term187932, term187932.getClass(), "first", term188024);
        setField(term187932, term187932.getClass(), "last", term188024);
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
        args[1] = term187932;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term187736, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


