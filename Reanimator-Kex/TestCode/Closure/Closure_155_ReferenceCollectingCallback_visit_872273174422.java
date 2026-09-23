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

public class ReferenceCollectingCallback_visit_872273174422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102385;
     Object term102531;
     Object term102617;

    public ReferenceCollectingCallback_visit_872273174422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term102439 = new ArrayDeque();
        term102385 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term102385, term102385.getClass(), "blockStack", term102439);
        term102531 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term102531, term102531.getClass(), "type", 101);
        term102617 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term102687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term102617, term102617.getClass(), "type", 101);
        setField(term102617, term102617.getClass(), "first", term102687);
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
        args[1] = term102531;
        args[2] = term102617;
        try {
            callMethod(klass, "visit", argTypes, term102385, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


