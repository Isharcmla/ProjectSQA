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
import java.util.ArrayList;
import java.lang.Object;
import java.util.Collection;
import java.util.ArrayDeque;

public class ReferenceCollectingCallback_enterScope_16272974651412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term447794;
     Object term448388;

    public ReferenceCollectingCallback_enterScope_16272974651412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term448040 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        Object term448531 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term448577 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term448623 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term448577, term448577.getClass(), "type", 105);
        setIntField(term448623, term448623.getClass(), "type", 125);
        setField(term448577, term448577.getClass(), "parent", term448623);
        setField(term448531, term448531.getClass(), "rootNode", term448577);
        ArrayList term447900 = new ArrayList();
        ((ArrayList) term447900).add(term448040);
        ((ArrayList) term447900).add(term448531);
        ((ArrayList) term447900).add(term448531);
        ((ArrayList) term447900).add(term448531);
        ArrayDeque term447848 = new ArrayDeque((Collection<? extends Object>) term447900);
        term447794 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term447794, term447794.getClass(), "blockStack", term447848);
        ArrayList term448494 = new ArrayList();
        ((ArrayList) term448494).add(term448531);
        ((ArrayList) term448494).add(term448531);
        ((ArrayList) term448494).add(term448531);
        ((ArrayList) term448494).add(term448531);
        ArrayDeque term448442 = new ArrayDeque((Collection<? extends Object>) term448494);
        ArrayList term448729 = new ArrayList();
        ArrayDeque term448677 = new ArrayDeque((Collection<? extends Object>) term448729);
        term448388 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term448388, term448388.getClass(), "scopes", term448442);
        setField(term448388, term448388.getClass(), "scopeRoots", term448677);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term448388;
        try {
            callMethod(klass, "enterScope", argTypes, term447794, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


