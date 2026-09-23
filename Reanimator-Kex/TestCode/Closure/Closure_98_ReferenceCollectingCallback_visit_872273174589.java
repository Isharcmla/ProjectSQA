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

public class ReferenceCollectingCallback_visit_872273174589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160014;
     Object term160160;
     Object term160246;

    public ReferenceCollectingCallback_visit_872273174589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term160068 = new ArrayDeque();
        term160014 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term160014, term160014.getClass(), "blockStack", term160068);
        term160160 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term160160, term160160.getClass(), "type", 108);
        term160246 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term160316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term160246, term160246.getClass(), "type", 108);
        setField(term160246, term160246.getClass(), "first", term160316);
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
        args[1] = term160160;
        args[2] = term160246;
        try {
            callMethod(klass, "visit", argTypes, term160014, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


