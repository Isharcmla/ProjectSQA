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

public class ReferenceCollectingCallback_visit_872273174169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38026;
     Object term38172;
     Object term38264;

    public ReferenceCollectingCallback_visit_872273174169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term38080 = new ArrayDeque();
        term38026 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term38026, term38026.getClass(), "blockStack", term38080);
        term38172 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term38172, term38172.getClass(), "type", 100);
        term38264 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term38264, term38264.getClass(), "type", 100);
        setField(term38264, term38264.getClass(), "first", null);
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
        args[1] = term38172;
        args[2] = term38264;
        try {
            callMethod(klass, "visit", argTypes, term38026, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


