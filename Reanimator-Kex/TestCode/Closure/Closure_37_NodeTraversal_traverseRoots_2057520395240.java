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

public class NodeTraversal_traverseRoots_2057520395240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61673;
     Object term61727;

    public NodeTraversal_traverseRoots_2057520395240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61673 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term61871 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term61963 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term61963, term61963.getClass(), "type", 0);
        setField(term61963, term61963.getClass(), "parent", null);
        setField(term61871, term61871.getClass(), "parent", term61963);
        setIntField(term61871, term61871.getClass(), "type", 0);
        term61727 = new LinkedList();
        ((LinkedList) term61727).add(term61871);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
        ((LinkedList) term61727).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.NodeTraversal$Callback");
        Object[] args = new Object[3];
        args[0] = term61673;
        args[1] = term61727;
        args[2] = null;
        callMethod(klass, "traverseRoots", argTypes, null, args);
    }

};


