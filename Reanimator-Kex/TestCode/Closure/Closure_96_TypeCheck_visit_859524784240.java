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

public class TypeCheck_visit_859524784240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107181;
     Object term107251;

    public TypeCheck_visit_859524784240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107181 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term107251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term107321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term107415 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setIntField(term107251, term107251.getClass(), "type", 16);
        setField(term107321, term107321.getClass(), "jsType", term107415);
        setField(term107251, term107251.getClass(), "first", term107321);
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
        args[1] = term107251;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term107181, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


