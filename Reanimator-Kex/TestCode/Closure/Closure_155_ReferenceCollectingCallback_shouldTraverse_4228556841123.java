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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ReferenceCollectingCallback_shouldTraverse_4228556841123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293818;
     Object term293910;
     Object term294002;

    public ReferenceCollectingCallback_shouldTraverse_4228556841123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293818 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term293910 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term293910, term293910.getClass(), "type", 111);
        term294002 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term294002, term294002.getClass(), "type", 12);
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
        args[1] = term293910;
        args[2] = term294002;
        try {
            callMethod(klass, "shouldTraverse", argTypes, term293818, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


