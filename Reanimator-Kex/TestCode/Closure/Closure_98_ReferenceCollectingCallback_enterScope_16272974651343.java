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

public class ReferenceCollectingCallback_enterScope_16272974651343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term412843;
     Object term413179;

    public ReferenceCollectingCallback_enterScope_16272974651343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term413089 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        ArrayList term412949 = new ArrayList();
        ((ArrayList) term412949).add(term413089);
        ArrayDeque term412897 = new ArrayDeque((Collection<? extends Object>) term412949);
        term412843 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term412843, term412843.getClass(), "blockStack", term412897);
        Object term413359 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term413445 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term413531 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term413445, term413445.getClass(), "type", 105);
        setIntField(term413531, term413531.getClass(), "type", 125);
        setField(term413445, term413445.getClass(), "parent", term413531);
        setField(term413359, term413359.getClass(), "rootNode", term413445);
        ArrayList term413285 = new ArrayList();
        ((ArrayList) term413285).add(term413359);
        ((ArrayList) term413285).add(term413359);
        ((ArrayList) term413285).add(term413359);
        ((ArrayList) term413285).add(term413359);
        ((ArrayList) term413285).add(term413359);
        ((ArrayList) term413285).add(term413359);
        ((ArrayList) term413285).add(term413359);
        ((ArrayList) term413285).add(term413359);
        ((ArrayList) term413285).add(term413359);
        ArrayDeque term413233 = new ArrayDeque((Collection<? extends Object>) term413285);
        ArrayList term413637 = new ArrayList();
        ArrayDeque term413585 = new ArrayDeque((Collection<? extends Object>) term413637);
        term413179 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term413179, term413179.getClass(), "scopes", term413233);
        setField(term413179, term413179.getClass(), "scopeRoots", term413585);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term413179;
        try {
            callMethod(klass, "enterScope", argTypes, term412843, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


