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

public class ReferenceCollectingCallback_visit_872273174163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36370;
     Object term36494;
     Object term36564;

    public ReferenceCollectingCallback_visit_872273174163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term36424 = new ArrayDeque();
        term36370 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term36370, term36370.getClass(), "blockStack", term36424);
        term36494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36494, term36494.getClass(), "type", 101);
        term36564 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36564, term36564.getClass(), "type", 101);
        setField(term36564, term36564.getClass(), "first", null);
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
        args[1] = term36494;
        args[2] = term36564;
        try {
            callMethod(klass, "visit", argTypes, term36370, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


