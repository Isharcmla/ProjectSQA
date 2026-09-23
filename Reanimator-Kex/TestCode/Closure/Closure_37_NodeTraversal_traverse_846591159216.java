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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeTraversal_traverse_846591159216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52133;
     Object term52351;

    public NodeTraversal_traverse_846591159216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term52133, term52133.getClass(), "type", 0);
        setField(term52133, term52133.getClass(), "parent", null);
        setField(term52203, term52203.getClass(), "next", null);
        setIntField(term52203, term52203.getClass(), "type", 105);
        setField(term52133, term52133.getClass(), "first", term52203);
        term52351 = newInstance(Class.forName("com.google.javascript.jscomp.InlineSimpleMethods$InlineTrivialAccessors"));
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
        args[1] = term52133;
        args[2] = term52351;
        try {
            callMethod(klass, "traverse", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


