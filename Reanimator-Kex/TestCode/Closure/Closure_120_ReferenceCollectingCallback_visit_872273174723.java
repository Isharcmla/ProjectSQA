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

public class ReferenceCollectingCallback_visit_872273174723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256641;
     Object term256787;
     Object term256879;

    public ReferenceCollectingCallback_visit_872273174723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term256695 = new ArrayDeque();
        term256641 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term256641, term256641.getClass(), "blockStack", term256695);
        term256787 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term256787, term256787.getClass(), "type", 101);
        term256879 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term256949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term256879, term256879.getClass(), "type", 101);
        setField(term256879, term256879.getClass(), "first", term256949);
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
        args[1] = term256787;
        args[2] = term256879;
        try {
            callMethod(klass, "visit", argTypes, term256641, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


