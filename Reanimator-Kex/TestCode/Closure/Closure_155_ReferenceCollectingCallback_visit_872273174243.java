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

public class ReferenceCollectingCallback_visit_872273174243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58349;
     Object term58495;
     Object term58587;

    public ReferenceCollectingCallback_visit_872273174243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term58403 = new ArrayDeque();
        term58349 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term58349, term58349.getClass(), "blockStack", term58403);
        term58495 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term58495, term58495.getClass(), "type", 115);
        term58587 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term58587, term58587.getClass(), "type", 115);
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
        args[1] = term58495;
        args[2] = term58587;
        try {
            callMethod(klass, "visit", argTypes, term58349, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


