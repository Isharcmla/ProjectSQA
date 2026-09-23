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

public class ReferenceCollectingCallback_visit_872273174731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258935;
     Object term259081;
     Object term259173;

    public ReferenceCollectingCallback_visit_872273174731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term258989 = new ArrayDeque();
        term258935 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term258935, term258935.getClass(), "blockStack", term258989);
        term259081 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term259081, term259081.getClass(), "type", 98);
        term259173 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term259243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term259173, term259173.getClass(), "type", 98);
        setField(term259173, term259173.getClass(), "first", term259243);
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
        args[1] = term259081;
        args[2] = term259173;
        try {
            callMethod(klass, "visit", argTypes, term258935, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


