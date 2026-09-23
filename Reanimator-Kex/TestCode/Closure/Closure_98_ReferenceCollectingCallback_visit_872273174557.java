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

public class ReferenceCollectingCallback_visit_872273174557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150663;
     Object term150809;
     Object term150895;

    public ReferenceCollectingCallback_visit_872273174557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term150717 = new ArrayDeque();
        term150663 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term150663, term150663.getClass(), "blockStack", term150717);
        term150809 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term150809, term150809.getClass(), "type", 100);
        term150895 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term150965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term150895, term150895.getClass(), "type", 100);
        setField(term150895, term150895.getClass(), "first", term150965);
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
        args[1] = term150809;
        args[2] = term150895;
        try {
            callMethod(klass, "visit", argTypes, term150663, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


