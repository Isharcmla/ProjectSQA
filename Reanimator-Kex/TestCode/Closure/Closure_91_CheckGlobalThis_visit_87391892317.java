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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class CheckGlobalThis_visit_87391892317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5860;
     Object term5930;
     Object term6206;
     Object term6207;

    public CheckGlobalThis_visit_87391892317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5860 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term5930 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5930, term5930.getClass(), "type", 42);
        term6206 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        setField(term6206, term6206.getClass(), "compiler", null);
        setField(term6206, term6206.getClass(), "level", null);
        setField(term6206, term6206.getClass(), "assignLhsChild", null);
        term6207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6207, term6207.getClass(), "type", 42);
        setField(term6207, term6207.getClass(), "next", null);
        setField(term6207, term6207.getClass(), "first", null);
        setField(term6207, term6207.getClass(), "last", null);
        setField(term6207, term6207.getClass(), "propListHead", null);
        setIntField(term6207, term6207.getClass(), "sourcePosition", 0);
        setField(term6207, term6207.getClass(), "jsType", null);
        setField(term6207, term6207.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term5930;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term5860, args);
        assertTrue(recursiveEquals(term5860, term6206));
        assertTrue(recursiveEquals(term5930, null));
    }

};


