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

public class NodeTraversal_traverseWithScope_1645536304191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44009;
     Object term44079;
     Object term44153;

    public NodeTraversal_traverseWithScope_1645536304191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44009 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term44009, term44009.getClass(), "inputId", null);
        setField(term44009, term44009.getClass(), "sourceName", null);
        setField(term44009, term44009.getClass(), "curNode", null);
        term44079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term44153 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term44153, term44153.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term44079;
        args[1] = term44153;
        try {
            callMethod(klass, "traverseWithScope", argTypes, term44009, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


