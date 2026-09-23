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

public class ReferenceCollectingCallback_visit_872273174737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196588;
     Object term196734;
     Object term196826;

    public ReferenceCollectingCallback_visit_872273174737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term196642 = new ArrayDeque();
        term196588 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term196588, term196588.getClass(), "blockStack", term196642);
        term196734 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term196734, term196734.getClass(), "type", 100);
        term196826 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term196896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term196826, term196826.getClass(), "type", 100);
        setField(term196826, term196826.getClass(), "first", term196896);
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
        args[1] = term196734;
        args[2] = term196826;
        try {
            callMethod(klass, "visit", argTypes, term196588, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


