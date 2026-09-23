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

public class ReferenceCollectingCallback_enterScope_1627297465878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232018;
     Object term232612;

    public ReferenceCollectingCallback_enterScope_1627297465878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term232264 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        Object term232755 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term232801 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term232847 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term232801, term232801.getClass(), "type", 105);
        setIntField(term232847, term232847.getClass(), "type", 125);
        setField(term232801, term232801.getClass(), "parent", term232847);
        setField(term232755, term232755.getClass(), "rootNode", term232801);
        ArrayList term232124 = new ArrayList();
        ((ArrayList) term232124).add(term232264);
        ((ArrayList) term232124).add(term232755);
        ((ArrayList) term232124).add(term232755);
        ((ArrayList) term232124).add(term232755);
        ArrayDeque term232072 = new ArrayDeque((Collection<? extends Object>) term232124);
        term232018 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term232018, term232018.getClass(), "blockStack", term232072);
        ArrayList term232718 = new ArrayList();
        ((ArrayList) term232718).add(term232755);
        ((ArrayList) term232718).add(term232755);
        ((ArrayList) term232718).add(term232755);
        ((ArrayList) term232718).add(term232755);
        ((ArrayList) term232718).add(term232755);
        ((ArrayList) term232718).add(term232755);
        ((ArrayList) term232718).add(term232755);
        ((ArrayList) term232718).add(term232755);
        ((ArrayList) term232718).add(term232755);
        ((ArrayList) term232718).add(term232755);
        ((ArrayList) term232718).add(term232755);
        ((ArrayList) term232718).add(term232755);
        ((ArrayList) term232718).add(term232755);
        ((ArrayList) term232718).add(term232755);
        ((ArrayList) term232718).add(term232755);
        ((ArrayList) term232718).add(term232755);
        ArrayDeque term232666 = new ArrayDeque((Collection<? extends Object>) term232718);
        ArrayList term232953 = new ArrayList();
        ArrayDeque term232901 = new ArrayDeque((Collection<? extends Object>) term232953);
        term232612 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term232612, term232612.getClass(), "scopes", term232666);
        setField(term232612, term232612.getClass(), "scopeRoots", term232901);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term232612;
        try {
            callMethod(klass, "enterScope", argTypes, term232018, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


