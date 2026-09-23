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

public class ReferenceCollectingCallback_enterScope_16272974651029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283637;
     Object term284219;

    public ReferenceCollectingCallback_enterScope_16272974651029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term283883 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        Object term284362 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term284405 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term284448 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term284405, term284405.getClass(), "type", 105);
        setIntField(term284448, term284448.getClass(), "type", 125);
        setField(term284405, term284405.getClass(), "parent", term284448);
        setField(term284362, term284362.getClass(), "rootNode", term284405);
        ArrayList term283743 = new ArrayList();
        ((ArrayList) term283743).add(term283883);
        ((ArrayList) term283743).add(term284362);
        ((ArrayList) term283743).add(term284362);
        ((ArrayList) term283743).add(term284362);
        ArrayDeque term283691 = new ArrayDeque((Collection<? extends Object>) term283743);
        term283637 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term283637, term283637.getClass(), "blockStack", term283691);
        ArrayList term284325 = new ArrayList();
        ((ArrayList) term284325).add(term284362);
        ((ArrayList) term284325).add(term284362);
        ((ArrayList) term284325).add(term284362);
        ((ArrayList) term284325).add(term284362);
        ArrayDeque term284273 = new ArrayDeque((Collection<? extends Object>) term284325);
        ArrayList term284554 = new ArrayList();
        ArrayDeque term284502 = new ArrayDeque((Collection<? extends Object>) term284554);
        term284219 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term284219, term284219.getClass(), "scopes", term284273);
        setField(term284219, term284219.getClass(), "scopeRoots", term284502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term284219;
        try {
            callMethod(klass, "enterScope", argTypes, term283637, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


