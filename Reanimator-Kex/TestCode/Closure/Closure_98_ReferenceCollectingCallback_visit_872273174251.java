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

public class ReferenceCollectingCallback_visit_872273174251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63287;
     Object term63379;
     Object term63471;

    public ReferenceCollectingCallback_visit_872273174251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63287 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term63379 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term63379, term63379.getClass(), "type", 0);
        term63471 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term63471, term63471.getClass(), "type", 98);
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
        args[1] = term63379;
        args[2] = term63471;
        try {
            callMethod(klass, "visit", argTypes, term63287, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


