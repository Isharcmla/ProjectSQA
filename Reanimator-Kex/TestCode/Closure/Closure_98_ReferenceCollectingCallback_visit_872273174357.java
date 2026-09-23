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
import java.util.NoSuchElementException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayDeque;
import java.lang.Object;

public class ReferenceCollectingCallback_visit_872273174357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92462;
     Object term92608;
     Object term92694;

    public ReferenceCollectingCallback_visit_872273174357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term92516 = new ArrayDeque();
        term92462 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term92462, term92462.getClass(), "blockStack", term92516);
        term92608 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term92608, term92608.getClass(), "type", 100);
        term92694 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term92764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term92694, term92694.getClass(), "type", 100);
        setField(term92694, term92694.getClass(), "first", term92764);
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
        args[1] = term92608;
        args[2] = term92694;
        try {
            callMethod(klass, "visit", argTypes, term92462, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


