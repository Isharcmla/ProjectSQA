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

public class ReferenceCollectingCallback_visit_872273174191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44399;
     Object term44545;
     Object term44637;

    public ReferenceCollectingCallback_visit_872273174191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term44453 = new ArrayDeque();
        term44399 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term44399, term44399.getClass(), "blockStack", term44453);
        term44545 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term44545, term44545.getClass(), "type", 108);
        term44637 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term44637, term44637.getClass(), "type", 108);
        setField(term44637, term44637.getClass(), "first", null);
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
        args[1] = term44545;
        args[2] = term44637;
        try {
            callMethod(klass, "visit", argTypes, term44399, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


