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

public class ReferenceCollectingCallback_enterScope_16272974651471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term474063;
     Object term474399;

    public ReferenceCollectingCallback_enterScope_16272974651471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term474309 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        ArrayList term474169 = new ArrayList();
        ((ArrayList) term474169).add(term474309);
        ((ArrayList) term474169).add(term474309);
        ((ArrayList) term474169).add(term474309);
        ((ArrayList) term474169).add(term474309);
        ((ArrayList) term474169).add(term474309);
        ((ArrayList) term474169).add(term474309);
        ((ArrayList) term474169).add(term474309);
        ((ArrayList) term474169).add(term474309);
        ((ArrayList) term474169).add(term474309);
        ((ArrayList) term474169).add(term474309);
        ((ArrayList) term474169).add(term474309);
        ((ArrayList) term474169).add(term474309);
        ((ArrayList) term474169).add(term474309);
        ((ArrayList) term474169).add(term474309);
        ((ArrayList) term474169).add(term474309);
        ((ArrayList) term474169).add(term474309);
        ((ArrayList) term474169).add(term474309);
        ((ArrayList) term474169).add(term474309);
        ((ArrayList) term474169).add(term474309);
        ((ArrayList) term474169).add(term474309);
        ((ArrayList) term474169).add(term474309);
        ((ArrayList) term474169).add(term474309);
        ArrayDeque term474117 = new ArrayDeque((Collection<? extends Object>) term474169);
        term474063 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term474063, term474063.getClass(), "blockStack", term474117);
        Object term474579 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term474665 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term474751 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term474665, term474665.getClass(), "type", 105);
        setIntField(term474751, term474751.getClass(), "type", 125);
        setField(term474665, term474665.getClass(), "parent", term474751);
        setField(term474579, term474579.getClass(), "rootNode", term474665);
        ArrayList term474505 = new ArrayList();
        ((ArrayList) term474505).add(term474579);
        ArrayDeque term474453 = new ArrayDeque((Collection<? extends Object>) term474505);
        ArrayList term474857 = new ArrayList();
        ArrayDeque term474805 = new ArrayDeque((Collection<? extends Object>) term474857);
        term474399 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term474399, term474399.getClass(), "scopes", term474453);
        setField(term474399, term474399.getClass(), "scopeRoots", term474805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term474399;
        try {
            callMethod(klass, "enterScope", argTypes, term474063, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


