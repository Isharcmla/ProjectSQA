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

public class TypeCheck_visit_859524784922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257392;
     Object term257484;

    public TypeCheck_visit_859524784922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term257392 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term257392, term257392.getClass(), "validator", null);
        term257484 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term257576 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term257484, term257484.getClass(), "type", 29);
        setField(term257484, term257484.getClass(), "first", term257576);
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
        args[1] = term257484;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term257392, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


