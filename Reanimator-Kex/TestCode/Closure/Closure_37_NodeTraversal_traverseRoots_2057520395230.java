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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class NodeTraversal_traverseRoots_2057520395230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57923;

    public NodeTraversal_traverseRoots_2057520395230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term58067 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term58159 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term58159, term58159.getClass(), "type", 0);
        setField(term58159, term58159.getClass(), "parent", null);
        setField(term58067, term58067.getClass(), "parent", term58159);
        setIntField(term58067, term58067.getClass(), "type", 132);
        term57923 = new LinkedList();
        ((LinkedList) term57923).add(term58067);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.NodeTraversal$Callback");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term57923;
        args[2] = null;
        callMethod(klass, "traverseRoots", argTypes, null, args);
    }

};


