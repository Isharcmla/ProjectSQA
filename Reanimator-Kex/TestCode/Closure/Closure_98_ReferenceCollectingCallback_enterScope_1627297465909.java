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

public class ReferenceCollectingCallback_enterScope_1627297465909 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243013;
     Object term243607;

    public ReferenceCollectingCallback_enterScope_1627297465909() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term243259 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        Object term243750 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term243796 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term243842 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term243796, term243796.getClass(), "type", 105);
        setIntField(term243842, term243842.getClass(), "type", 125);
        setField(term243796, term243796.getClass(), "parent", term243842);
        setField(term243750, term243750.getClass(), "rootNode", term243796);
        ArrayList term243119 = new ArrayList();
        ((ArrayList) term243119).add(term243259);
        ((ArrayList) term243119).add(term243750);
        ((ArrayList) term243119).add(term243750);
        ((ArrayList) term243119).add(term243750);
        ArrayDeque term243067 = new ArrayDeque((Collection<? extends Object>) term243119);
        term243013 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term243013, term243013.getClass(), "blockStack", term243067);
        ArrayList term243713 = new ArrayList();
        ((ArrayList) term243713).add(term243750);
        ((ArrayList) term243713).add(term243750);
        ((ArrayList) term243713).add(term243750);
        ((ArrayList) term243713).add(term243750);
        ((ArrayList) term243713).add(term243750);
        ((ArrayList) term243713).add(term243750);
        ((ArrayList) term243713).add(term243750);
        ((ArrayList) term243713).add(term243750);
        ((ArrayList) term243713).add(term243750);
        ((ArrayList) term243713).add(term243750);
        ((ArrayList) term243713).add(term243750);
        ((ArrayList) term243713).add(term243750);
        ((ArrayList) term243713).add(term243750);
        ((ArrayList) term243713).add(term243750);
        ((ArrayList) term243713).add(term243750);
        ((ArrayList) term243713).add(term243750);
        ArrayDeque term243661 = new ArrayDeque((Collection<? extends Object>) term243713);
        ArrayList term243948 = new ArrayList();
        ArrayDeque term243896 = new ArrayDeque((Collection<? extends Object>) term243948);
        term243607 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term243607, term243607.getClass(), "scopes", term243661);
        setField(term243607, term243607.getClass(), "scopeRoots", term243896);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term243607;
        try {
            callMethod(klass, "enterScope", argTypes, term243013, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


