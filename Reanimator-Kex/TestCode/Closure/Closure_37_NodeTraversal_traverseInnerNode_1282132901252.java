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
import java.lang.Object;

public class NodeTraversal_traverseInnerNode_1282132901252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67744;
     Object term68000;
     Object term68070;

    public NodeTraversal_traverseInnerNode_1282132901252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67744 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term67814 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67930 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        setField(term67744, term67744.getClass(), "curNode", term67814);
        setField(term67744, term67744.getClass(), "callback", term67930);
        term68000 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term68000, term68000.getClass(), "type", -133);
        term68070 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = term68000;
        args[1] = term68070;
        args[2] = null;
        callMethod(klass, "traverseInnerNode", argTypes, term67744, args);
    }

};


