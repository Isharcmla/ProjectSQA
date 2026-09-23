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

public class ReferenceCollectingCallback_visit_872273174621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196112;
     Object term196204;
     Object term196296;

    public ReferenceCollectingCallback_visit_872273174621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196112 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term196204 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term196204, term196204.getClass(), "type", 0);
        term196296 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term196296, term196296.getClass(), "type", 115);
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
        args[1] = term196204;
        args[2] = term196296;
        try {
            callMethod(klass, "visit", argTypes, term196112, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


