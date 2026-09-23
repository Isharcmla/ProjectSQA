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

public class CheckGlobalThis_visit_87391892320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5731;
     Object term5801;
     Object term6354;
     Object term6355;

    public CheckGlobalThis_visit_87391892320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5731 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term5801 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5801, term5801.getClass(), "type", 42);
        term6354 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        setField(term6354, term6354.getClass(), "compiler", null);
        setField(term6354, term6354.getClass(), "level", null);
        setField(term6354, term6354.getClass(), "assignLhsChild", null);
        term6355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6355, term6355.getClass(), "type", 42);
        setField(term6355, term6355.getClass(), "next", null);
        setField(term6355, term6355.getClass(), "first", null);
        setField(term6355, term6355.getClass(), "last", null);
        setField(term6355, term6355.getClass(), "propListHead", null);
        setIntField(term6355, term6355.getClass(), "sourcePosition", 0);
        setField(term6355, term6355.getClass(), "jsType", null);
        setField(term6355, term6355.getClass(), "parent", null);
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
        args[1] = term5801;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term5731, args);
        assertTrue(recursiveEquals(term5731, term6354));
        assertTrue(recursiveEquals(term5801, null));
    }

};


