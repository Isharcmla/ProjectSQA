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

public class ReferenceCollectingCallback_enterScope_16272974651011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275827;
     Object term276409;

    public ReferenceCollectingCallback_enterScope_16272974651011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term276073 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        Object term276552 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term276595 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term276638 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term276595, term276595.getClass(), "type", 105);
        setIntField(term276638, term276638.getClass(), "type", 125);
        setField(term276595, term276595.getClass(), "parent", term276638);
        setField(term276552, term276552.getClass(), "rootNode", term276595);
        ArrayList term275933 = new ArrayList();
        ((ArrayList) term275933).add(term276073);
        ((ArrayList) term275933).add(term276552);
        ((ArrayList) term275933).add(term276552);
        ((ArrayList) term275933).add(term276552);
        ArrayDeque term275881 = new ArrayDeque((Collection<? extends Object>) term275933);
        term275827 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term275827, term275827.getClass(), "blockStack", term275881);
        ArrayList term276515 = new ArrayList();
        ((ArrayList) term276515).add(term276552);
        ((ArrayList) term276515).add(term276552);
        ((ArrayList) term276515).add(term276552);
        ((ArrayList) term276515).add(term276552);
        ((ArrayList) term276515).add(term276552);
        ((ArrayList) term276515).add(term276552);
        ((ArrayList) term276515).add(term276552);
        ((ArrayList) term276515).add(term276552);
        ((ArrayList) term276515).add(term276552);
        ((ArrayList) term276515).add(term276552);
        ((ArrayList) term276515).add(term276552);
        ((ArrayList) term276515).add(term276552);
        ((ArrayList) term276515).add(term276552);
        ((ArrayList) term276515).add(term276552);
        ((ArrayList) term276515).add(term276552);
        ((ArrayList) term276515).add(term276552);
        ArrayDeque term276463 = new ArrayDeque((Collection<? extends Object>) term276515);
        ArrayList term276744 = new ArrayList();
        ArrayDeque term276692 = new ArrayDeque((Collection<? extends Object>) term276744);
        term276409 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term276409, term276409.getClass(), "scopes", term276463);
        setField(term276409, term276409.getClass(), "scopeRoots", term276692);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term276409;
        try {
            callMethod(klass, "enterScope", argTypes, term275827, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


