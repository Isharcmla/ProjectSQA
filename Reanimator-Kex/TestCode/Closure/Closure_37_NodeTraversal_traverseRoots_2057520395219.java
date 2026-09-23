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

public class NodeTraversal_traverseRoots_2057520395219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53984;
     Object term54266;

    public NodeTraversal_traverseRoots_2057520395219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term54128 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term54128, term54128.getClass(), "parent", null);
        Object term54166 = newInstance(Class.forName("java.lang.Object"));
        term53984 = new LinkedList();
        ((LinkedList) term53984).add(term54128);
        ((LinkedList) term53984).add(term54166);
        term54266 = newInstance(Class.forName("com.google.javascript.jscomp.CheckMissingReturn"));
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
        args[1] = term53984;
        args[2] = term54266;
        callMethod(klass, "traverseRoots", argTypes, null, args);
    }

};


