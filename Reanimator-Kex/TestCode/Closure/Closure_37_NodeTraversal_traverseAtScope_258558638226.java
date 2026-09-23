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
import java.util.ArrayDeque;
import java.lang.Object;

public class NodeTraversal_traverseAtScope_258558638226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56126;
     Object term56254;

    public NodeTraversal_traverseAtScope_258558638226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term56180 = new ArrayDeque();
        term56126 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term56126, term56126.getClass(), "inputId", null);
        setField(term56126, term56126.getClass(), "sourceName", null);
        setField(term56126, term56126.getClass(), "curNode", null);
        setField(term56126, term56126.getClass(), "scopes", term56180);
        term56254 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term56324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term56324, term56324.getClass(), "type", -106);
        setField(term56254, term56254.getClass(), "rootNode", term56324);
        setField(term56254, term56254.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[1];
        args[0] = term56254;
        callMethod(klass, "traverseAtScope", argTypes, term56126, args);
    }

};


