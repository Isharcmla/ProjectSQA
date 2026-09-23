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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class NodeTraversal_traverseRoots_2057520395161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34060;
     Object term34114;

    public NodeTraversal_traverseRoots_2057520395161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34060 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term34258 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term34258, term34258.getClass(), "parent", null);
        Object term34296 = newInstance(Class.forName("java.lang.Object"));
        term34114 = new LinkedList();
        ((LinkedList) term34114).add(term34258);
        ((LinkedList) term34114).add(term34296);
        ((LinkedList) term34114).add((Object)null);
        ((LinkedList) term34114).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.NodeTraversal$Callback");
        Object[] args = new Object[3];
        args[0] = term34060;
        args[1] = term34114;
        args[2] = null;
        try {
            callMethod(klass, "traverseRoots", argTypes, null, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


