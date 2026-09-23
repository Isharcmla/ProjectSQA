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

public class ReferenceCollectingCallback_visit_872273174113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24754;
     Object term24840;
     Object term24932;

    public ReferenceCollectingCallback_visit_872273174113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24754 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term24840 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term24840, term24840.getClass(), "type", 0);
        term24932 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term24932, term24932.getClass(), "type", 114);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term24840;
        args[2] = term24932;
        try {
            callMethod(klass, "visit", argTypes, term24754, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


