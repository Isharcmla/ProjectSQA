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
import java.util.ArrayList;
import java.lang.Object;
import java.util.Collection;
import java.util.ArrayDeque;

public class ReferenceCollectingCallback_enterScope_16272974651028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282672;
     Object term283008;

    public ReferenceCollectingCallback_enterScope_16272974651028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term282918 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        ArrayList term282778 = new ArrayList();
        ((ArrayList) term282778).add(term282918);
        ArrayDeque term282726 = new ArrayDeque((Collection<? extends Object>) term282778);
        term282672 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term282672, term282672.getClass(), "blockStack", term282726);
        Object term283188 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term283278 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term283278, term283278.getClass(), "type", 105);
        setField(term283188, term283188.getClass(), "rootNode", term283278);
        Object term283316 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term283114 = new ArrayList();
        ((ArrayList) term283114).add(term283188);
        ((ArrayList) term283114).add(term283316);
        ((ArrayList) term283114).add(term283316);
        ((ArrayList) term283114).add(term283316);
        ArrayDeque term283062 = new ArrayDeque((Collection<? extends Object>) term283114);
        ArrayList term283422 = new ArrayList();
        ArrayDeque term283370 = new ArrayDeque((Collection<? extends Object>) term283422);
        term283008 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term283008, term283008.getClass(), "scopes", term283062);
        setField(term283008, term283008.getClass(), "scopeRoots", term283370);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term283008;
        try {
            callMethod(klass, "enterScope", argTypes, term282672, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


