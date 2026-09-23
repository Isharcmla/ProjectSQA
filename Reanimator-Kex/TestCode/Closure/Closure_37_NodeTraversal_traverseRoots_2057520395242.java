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

public class NodeTraversal_traverseRoots_2057520395242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62926;
     Object term63350;

    public NodeTraversal_traverseRoots_2057520395242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term63048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63140 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term63232 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term63140, term63140.getClass(), "type", -133);
        setField(term63140, term63140.getClass(), "parent", term63232);
        setField(term63048, term63048.getClass(), "parent", term63140);
        term62926 = new LinkedList();
        ((LinkedList) term62926).add(term63048);
        term63350 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions$CallVisitor"));
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
        args[1] = term62926;
        args[2] = term63350;
        callMethod(klass, "traverseRoots", argTypes, null, args);
    }

};


