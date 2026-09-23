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
import java.lang.Object;

public class NodeTraversal_traverseRoots_202268810135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26175;
     Object term26339;
     Object term25951;

    public NodeTraversal_traverseRoots_202268810135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26175 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        term26339 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties$ProcessExternProperties"));
        term25951 = (Object[]) newArray("com.google.javascript.rhino.Node", 6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal$Callback");
        argTypes[2] = Array.newInstance(Class.forName("com.google.javascript.rhino.Node"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term26175;
        args[1] = term26339;
        args[2] = term25951;
        try {
            callMethod(klass, "traverseRoots", argTypes, null, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


