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
import java.util.ArrayDeque;

public class NodeTraversal_traverseInnerNode_1282132901218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53593;
     Object term53717;
     Object term53791;

    public NodeTraversal_traverseInnerNode_1282132901218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term53647 = new ArrayDeque();
        term53593 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term53593, term53593.getClass(), "scopes", term53647);
        term53717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term53791 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term53717;
        args[2] = term53791;
        callMethod(klass, "traverseInnerNode", argTypes, term53593, args);
    }

};


