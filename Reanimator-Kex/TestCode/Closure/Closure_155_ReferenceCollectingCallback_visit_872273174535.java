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

public class ReferenceCollectingCallback_visit_872273174535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135652;
     Object term135798;
     Object term135890;

    public ReferenceCollectingCallback_visit_872273174535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term135706 = new ArrayDeque();
        term135652 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term135652, term135652.getClass(), "blockStack", term135706);
        term135798 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term135798, term135798.getClass(), "type", 101);
        term135890 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term135890, term135890.getClass(), "type", 101);
        setField(term135890, term135890.getClass(), "first", null);
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
        args[1] = term135798;
        args[2] = term135890;
        try {
            callMethod(klass, "visit", argTypes, term135652, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


