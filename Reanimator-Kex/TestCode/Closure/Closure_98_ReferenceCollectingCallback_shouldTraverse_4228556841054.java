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
import java.lang.Object;

public class ReferenceCollectingCallback_shouldTraverse_4228556841054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292898;
     Object term292990;
     Object term293082;

    public ReferenceCollectingCallback_shouldTraverse_4228556841054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292898 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term292990 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term293082 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term293174 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term293082, term293082.getClass(), "type", 101);
        setField(term293082, term293082.getClass(), "first", term293174);
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
        args[1] = term292990;
        args[2] = term293082;
        try {
            callMethod(klass, "shouldTraverse", argTypes, term292898, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


