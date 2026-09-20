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

public class RemoveUnusedVars_traverseNode_121208155156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15456;
     Object term15548;

    public RemoveUnusedVars_traverseNode_121208155156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15456 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        term15548 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term15640 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term15548, term15548.getClass(), "type", -620890193);
        setIntField(term15640, term15640.getClass(), "type", 620890192);
        setField(term15640, term15640.getClass(), "first", term15640);
        setField(term15548, term15548.getClass(), "first", term15640);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = term15548;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "traverseNode", argTypes, term15456, args);
    }

};
