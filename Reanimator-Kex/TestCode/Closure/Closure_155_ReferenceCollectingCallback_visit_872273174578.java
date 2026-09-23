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

public class ReferenceCollectingCallback_visit_872273174578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149242;
     Object term149388;
     Object term149480;

    public ReferenceCollectingCallback_visit_872273174578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term149296 = new ArrayDeque();
        term149242 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term149242, term149242.getClass(), "blockStack", term149296);
        term149388 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term149388, term149388.getClass(), "type", 100);
        term149480 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term149550 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term149480, term149480.getClass(), "type", 100);
        setField(term149480, term149480.getClass(), "first", term149550);
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
        args[1] = term149388;
        args[2] = term149480;
        try {
            callMethod(klass, "visit", argTypes, term149242, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


