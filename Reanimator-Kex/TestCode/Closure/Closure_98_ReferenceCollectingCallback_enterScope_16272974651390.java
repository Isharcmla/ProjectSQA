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

public class ReferenceCollectingCallback_enterScope_16272974651390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term437019;
     Object term437601;

    public ReferenceCollectingCallback_enterScope_16272974651390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term437265 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        Object term437744 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term437787 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term437830 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term437787, term437787.getClass(), "type", 105);
        setIntField(term437830, term437830.getClass(), "type", 125);
        setField(term437787, term437787.getClass(), "parent", term437830);
        setField(term437744, term437744.getClass(), "rootNode", term437787);
        ArrayList term437125 = new ArrayList();
        ((ArrayList) term437125).add(term437265);
        ((ArrayList) term437125).add(term437744);
        ((ArrayList) term437125).add(term437744);
        ((ArrayList) term437125).add(term437744);
        ArrayDeque term437073 = new ArrayDeque((Collection<? extends Object>) term437125);
        term437019 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term437019, term437019.getClass(), "blockStack", term437073);
        ArrayList term437707 = new ArrayList();
        ((ArrayList) term437707).add(term437744);
        ((ArrayList) term437707).add(term437744);
        ((ArrayList) term437707).add(term437744);
        ((ArrayList) term437707).add(term437744);
        ((ArrayList) term437707).add(term437744);
        ((ArrayList) term437707).add(term437744);
        ((ArrayList) term437707).add(term437744);
        ((ArrayList) term437707).add(term437744);
        ((ArrayList) term437707).add(term437744);
        ((ArrayList) term437707).add(term437744);
        ((ArrayList) term437707).add(term437744);
        ((ArrayList) term437707).add(term437744);
        ((ArrayList) term437707).add(term437744);
        ((ArrayList) term437707).add(term437744);
        ((ArrayList) term437707).add(term437744);
        ((ArrayList) term437707).add(term437744);
        ArrayDeque term437655 = new ArrayDeque((Collection<? extends Object>) term437707);
        ArrayList term437936 = new ArrayList();
        ArrayDeque term437884 = new ArrayDeque((Collection<? extends Object>) term437936);
        term437601 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term437601, term437601.getClass(), "scopes", term437655);
        setField(term437601, term437601.getClass(), "scopeRoots", term437884);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term437601;
        try {
            callMethod(klass, "enterScope", argTypes, term437019, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


