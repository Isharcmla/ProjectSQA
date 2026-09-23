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

public class ReferenceCollectingCallback_enterScope_16272974651389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term399032;
     Object term399368;

    public ReferenceCollectingCallback_enterScope_16272974651389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term399278 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        ArrayList term399138 = new ArrayList();
        ((ArrayList) term399138).add(term399278);
        ArrayDeque term399086 = new ArrayDeque((Collection<? extends Object>) term399138);
        term399032 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term399032, term399032.getClass(), "blockStack", term399086);
        Object term399548 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term399638 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term399638, term399638.getClass(), "type", 105);
        setField(term399548, term399548.getClass(), "rootNode", term399638);
        Object term399676 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term399474 = new ArrayList();
        ((ArrayList) term399474).add(term399548);
        ((ArrayList) term399474).add(term399676);
        ((ArrayList) term399474).add(term399676);
        ((ArrayList) term399474).add(term399676);
        ArrayDeque term399422 = new ArrayDeque((Collection<? extends Object>) term399474);
        ArrayList term399782 = new ArrayList();
        ArrayDeque term399730 = new ArrayDeque((Collection<? extends Object>) term399782);
        term399368 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term399368, term399368.getClass(), "scopes", term399422);
        setField(term399368, term399368.getClass(), "scopeRoots", term399730);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term399368;
        try {
            callMethod(klass, "enterScope", argTypes, term399032, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


