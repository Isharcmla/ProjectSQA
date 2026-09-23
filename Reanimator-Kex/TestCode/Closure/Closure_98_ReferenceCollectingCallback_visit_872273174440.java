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

public class ReferenceCollectingCallback_visit_872273174440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117528;
     Object term117674;
     Object term117766;

    public ReferenceCollectingCallback_visit_872273174440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term117582 = new ArrayDeque();
        term117528 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term117528, term117528.getClass(), "blockStack", term117582);
        term117674 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term117674, term117674.getClass(), "type", 101);
        term117766 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term117836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term117766, term117766.getClass(), "type", 101);
        setField(term117766, term117766.getClass(), "first", term117836);
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
        args[1] = term117674;
        args[2] = term117766;
        try {
            callMethod(klass, "visit", argTypes, term117528, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


