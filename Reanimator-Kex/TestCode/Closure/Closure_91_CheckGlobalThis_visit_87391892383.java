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

public class CheckGlobalThis_visit_87391892383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24839;
     Object term24909;
     Object term24979;

    public CheckGlobalThis_visit_87391892383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24839 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        setField(term24839, term24839.getClass(), "assignLhsChild", null);
        term24909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24909, term24909.getClass(), "type", 42);
        term24979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24979, term24979.getClass(), "type", 35);
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
        args[1] = term24909;
        args[2] = term24979;
        callMethod(klass, "visit", argTypes, term24839, args);
    }

};


