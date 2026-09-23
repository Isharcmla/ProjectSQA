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

public class NodeTraversal_traverseAtScope_258558638196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45550;
     Object term45624;

    public NodeTraversal_traverseAtScope_258558638196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45550 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term45624 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term45694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term45624, term45624.getClass(), "rootNode", term45694);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[1];
        args[0] = term45624;
        try {
            callMethod(klass, "traverseAtScope", argTypes, term45550, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


