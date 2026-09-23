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

public class NodeTraversal_traverse_846591159229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57387;
     Object term57675;

    public NodeTraversal_traverse_846591159229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57387, term57387.getClass(), "type", 0);
        setField(term57387, term57387.getClass(), "parent", null);
        setField(term57457, term57457.getClass(), "next", term57527);
        setIntField(term57457, term57457.getClass(), "type", 0);
        setField(term57457, term57457.getClass(), "first", null);
        setField(term57387, term57387.getClass(), "first", term57457);
        term57675 = newInstance(Class.forName("com.google.javascript.jscomp.InlineSimpleMethods$InlineTrivialAccessors"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.NodeTraversal$Callback");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term57387;
        args[2] = term57675;
        callMethod(klass, "traverse", argTypes, null, args);
    }

};


