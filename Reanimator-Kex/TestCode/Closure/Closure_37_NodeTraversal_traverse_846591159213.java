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

public class NodeTraversal_traverse_846591159213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50759;
     Object term50829;
     Object term50977;

    public NodeTraversal_traverse_846591159213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50759 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        term50829 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50829, term50829.getClass(), "type", 105);
        setField(term50829, term50829.getClass(), "parent", null);
        setField(term50829, term50829.getClass(), "first", null);
        term50977 = newInstance(Class.forName("com.google.javascript.jscomp.InlineSimpleMethods$InlineTrivialAccessors"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.NodeTraversal$Callback");
        Object[] args = new Object[3];
        args[0] = term50759;
        args[1] = term50829;
        args[2] = term50977;
        try {
            callMethod(klass, "traverse", argTypes, null, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


