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

public class ReferenceCollectingCallback_enterScope_1627297465885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235432;
     Object term236014;

    public ReferenceCollectingCallback_enterScope_1627297465885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term235678 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        Object term236157 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term236200 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term236243 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term236200, term236200.getClass(), "type", 105);
        setIntField(term236243, term236243.getClass(), "type", 125);
        setField(term236200, term236200.getClass(), "parent", term236243);
        setField(term236157, term236157.getClass(), "rootNode", term236200);
        ArrayList term235538 = new ArrayList();
        ((ArrayList) term235538).add(term235678);
        ((ArrayList) term235538).add(term236157);
        ((ArrayList) term235538).add(term236157);
        ((ArrayList) term235538).add(term236157);
        ArrayDeque term235486 = new ArrayDeque((Collection<? extends Object>) term235538);
        term235432 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term235432, term235432.getClass(), "blockStack", term235486);
        ArrayList term236120 = new ArrayList();
        ((ArrayList) term236120).add(term236157);
        ((ArrayList) term236120).add(term236157);
        ((ArrayList) term236120).add(term236157);
        ((ArrayList) term236120).add(term236157);
        ArrayDeque term236068 = new ArrayDeque((Collection<? extends Object>) term236120);
        ArrayList term236349 = new ArrayList();
        ArrayDeque term236297 = new ArrayDeque((Collection<? extends Object>) term236349);
        term236014 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term236014, term236014.getClass(), "scopes", term236068);
        setField(term236014, term236014.getClass(), "scopeRoots", term236297);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term236014;
        try {
            callMethod(klass, "enterScope", argTypes, term235432, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


