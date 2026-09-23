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

public class ReferenceCollectingCallback_visit_872273174401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106167;
     Object term106313;
     Object term106405;

    public ReferenceCollectingCallback_visit_872273174401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term106221 = new ArrayDeque();
        term106167 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term106167, term106167.getClass(), "blockStack", term106221);
        term106313 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term106313, term106313.getClass(), "type", 98);
        term106405 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term106475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term106405, term106405.getClass(), "type", 98);
        setField(term106405, term106405.getClass(), "first", term106475);
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
        args[1] = term106313;
        args[2] = term106405;
        try {
            callMethod(klass, "visit", argTypes, term106167, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


