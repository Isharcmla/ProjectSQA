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

public class ReferenceCollectingCallback_visit_872273174572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147358;
     Object term147504;
     Object term147590;

    public ReferenceCollectingCallback_visit_872273174572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term147412 = new ArrayDeque();
        term147358 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term147358, term147358.getClass(), "blockStack", term147412);
        term147504 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term147504, term147504.getClass(), "type", 100);
        term147590 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term147660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term147590, term147590.getClass(), "type", 100);
        setField(term147590, term147590.getClass(), "first", term147660);
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
        args[1] = term147504;
        args[2] = term147590;
        try {
            callMethod(klass, "visit", argTypes, term147358, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


