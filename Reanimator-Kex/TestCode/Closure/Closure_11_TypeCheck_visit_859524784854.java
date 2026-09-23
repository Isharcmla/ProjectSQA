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

public class TypeCheck_visit_859524784854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219263;
     Object term219333;

    public TypeCheck_visit_859524784854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term219263 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term219263, term219263.getClass(), "validator", null);
        term219333 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term219403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term219473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term219577 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setIntField(term219333, term219333.getClass(), "type", 52);
        setField(term219333, term219333.getClass(), "first", term219403);
        setField(term219473, term219473.getClass(), "jsType", term219577);
        setField(term219333, term219333.getClass(), "last", term219473);
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
        args[1] = term219333;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term219263, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


