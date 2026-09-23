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

public class NodeTraversal_traverse_846591159251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67201;
     Object term67271;
     Object term67629;

    public NodeTraversal_traverse_846591159251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67201 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        term67271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term67271, term67271.getClass(), "type", 0);
        setField(term67271, term67271.getClass(), "parent", null);
        setField(term67341, term67341.getClass(), "next", term67411);
        setIntField(term67341, term67341.getClass(), "type", 0);
        setField(term67341, term67341.getClass(), "first", term67481);
        setField(term67271, term67271.getClass(), "first", term67341);
        term67629 = newInstance(Class.forName("com.google.javascript.jscomp.InlineSimpleMethods$InlineTrivialAccessors"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.NodeTraversal$Callback");
        Object[] args = new Object[3];
        args[0] = term67201;
        args[1] = term67271;
        args[2] = term67629;
        callMethod(klass, "traverse", argTypes, null, args);
    }

};


