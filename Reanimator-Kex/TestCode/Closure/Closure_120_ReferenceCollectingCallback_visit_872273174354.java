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

public class ReferenceCollectingCallback_visit_872273174354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77749;
     Object term77895;
     Object term77987;

    public ReferenceCollectingCallback_visit_872273174354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term77803 = new ArrayDeque();
        term77749 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term77749, term77749.getClass(), "blockStack", term77803);
        term77895 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term77895, term77895.getClass(), "type", 100);
        term77987 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term77987, term77987.getClass(), "type", 100);
        setField(term77987, term77987.getClass(), "first", null);
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
        args[1] = term77895;
        args[2] = term77987;
        try {
            callMethod(klass, "visit", argTypes, term77749, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


