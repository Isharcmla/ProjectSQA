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

public class ReferenceCollectingCallback_enterScope_16272974651267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381525;
     Object term382119;

    public ReferenceCollectingCallback_enterScope_16272974651267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term381771 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        Object term382262 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term382308 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term382354 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term382308, term382308.getClass(), "type", 105);
        setIntField(term382354, term382354.getClass(), "type", 125);
        setField(term382308, term382308.getClass(), "parent", term382354);
        setField(term382262, term382262.getClass(), "rootNode", term382308);
        ArrayList term381631 = new ArrayList();
        ((ArrayList) term381631).add(term381771);
        ((ArrayList) term381631).add(term382262);
        ((ArrayList) term381631).add(term382262);
        ((ArrayList) term381631).add(term382262);
        ArrayDeque term381579 = new ArrayDeque((Collection<? extends Object>) term381631);
        term381525 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term381525, term381525.getClass(), "blockStack", term381579);
        ArrayList term382225 = new ArrayList();
        ((ArrayList) term382225).add(term382262);
        ((ArrayList) term382225).add(term382262);
        ((ArrayList) term382225).add(term382262);
        ((ArrayList) term382225).add(term382262);
        ArrayDeque term382173 = new ArrayDeque((Collection<? extends Object>) term382225);
        ArrayList term382460 = new ArrayList();
        ArrayDeque term382408 = new ArrayDeque((Collection<? extends Object>) term382460);
        term382119 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term382119, term382119.getClass(), "scopes", term382173);
        setField(term382119, term382119.getClass(), "scopeRoots", term382408);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term382119;
        try {
            callMethod(klass, "enterScope", argTypes, term381525, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


