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

public class ReferenceCollectingCallback_visit_872273174556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142303;
     Object term142449;
     Object term142541;

    public ReferenceCollectingCallback_visit_872273174556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term142357 = new ArrayDeque();
        term142303 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term142303, term142303.getClass(), "blockStack", term142357);
        term142449 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term142449, term142449.getClass(), "type", 101);
        term142541 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term142611 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term142541, term142541.getClass(), "type", 101);
        setField(term142541, term142541.getClass(), "first", term142611);
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
        args[1] = term142449;
        args[2] = term142541;
        try {
            callMethod(klass, "visit", argTypes, term142303, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


