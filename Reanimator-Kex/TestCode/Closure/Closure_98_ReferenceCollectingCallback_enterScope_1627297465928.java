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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;
import java.util.Collection;
import java.util.ArrayDeque;

public class ReferenceCollectingCallback_enterScope_1627297465928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249257;
     Object term249669;
     Object term250273;
     Object term250280;

    public ReferenceCollectingCallback_enterScope_1627297465928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term249503 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        Object term249541 = newInstance(Class.forName("java.lang.Object"));
        Object term250030 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term249363 = new ArrayList();
        ((ArrayList) term249363).add(term249503);
        ((ArrayList) term249363).add(term249541);
        ((ArrayList) term249363).add(term250030);
        ((ArrayList) term249363).add(term250030);
        ((ArrayList) term249363).add(term250030);
        ((ArrayList) term249363).add(term250030);
        ((ArrayList) term249363).add(term250030);
        ((ArrayList) term249363).add(term250030);
        ArrayDeque term249311 = new ArrayDeque((Collection<? extends Object>) term249363);
        term249257 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term249257, term249257.getClass(), "blockStack", term249311);
        Object term249849 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term249919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term250011 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term249919, term249919.getClass(), "type", 105);
        setField(term249919, term249919.getClass(), "parent", term250011);
        setField(term249849, term249849.getClass(), "rootNode", term249919);
        ArrayList term249775 = new ArrayList();
        ((ArrayList) term249775).add(term249849);
        ((ArrayList) term249775).add(term250030);
        ((ArrayList) term249775).add(term250030);
        ((ArrayList) term249775).add(term250030);
        ((ArrayList) term249775).add(term250030);
        ((ArrayList) term249775).add(term250030);
        ((ArrayList) term249775).add(term250030);
        ((ArrayList) term249775).add(term250030);
        ((ArrayList) term249775).add(term250030);
        ((ArrayList) term249775).add(term250030);
        ((ArrayList) term249775).add(term250030);
        ((ArrayList) term249775).add(term250030);
        ((ArrayList) term249775).add(term250030);
        ((ArrayList) term249775).add(term250030);
        ((ArrayList) term249775).add(term250030);
        ((ArrayList) term249775).add(term250030);
        ((ArrayList) term249775).add(term250030);
        ((ArrayList) term249775).add(term250030);
        ((ArrayList) term249775).add(term250030);
        ((ArrayList) term249775).add(term250030);
        ((ArrayList) term249775).add(term250030);
        ((ArrayList) term249775).add(term250030);
        ((ArrayList) term249775).add(term250030);
        ((ArrayList) term249775).add(term250030);
        ((ArrayList) term249775).add(term250030);
        ((ArrayList) term249775).add(term250030);
        ((ArrayList) term249775).add(term250030);
        ((ArrayList) term249775).add(term250030);
        ((ArrayList) term249775).add(term250030);
        ((ArrayList) term249775).add(term250030);
        ((ArrayList) term249775).add(term250030);
        ((ArrayList) term249775).add(term250030);
        ArrayDeque term249723 = new ArrayDeque((Collection<? extends Object>) term249775);
        ArrayList term250136 = new ArrayList();
        ArrayDeque term250084 = new ArrayDeque((Collection<? extends Object>) term250136);
        term249669 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term249669, term249669.getClass(), "scopes", term249723);
        setField(term249669, term249669.getClass(), "scopeRoots", term250084);
        ArrayDeque term250274 = new ArrayDeque();
        term250273 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term250273, term250273.getClass(), "referenceMap", null);
        setField(term250273, term250273.getClass(), "blockStack", term250274);
        setField(term250273, term250273.getClass(), "behavior", null);
        setField(term250273, term250273.getClass(), "compiler", null);
        setField(term250273, term250273.getClass(), "varFilter", null);
        Object term250283 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term250284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term250283, term250283.getClass(), "vars", null);
        setField(term250283, term250283.getClass(), "parent", null);
        setIntField(term250284, term250284.getClass(), "type", 105);
        setField(term250284, term250284.getClass(), "next", null);
        setField(term250284, term250284.getClass(), "first", null);
        setField(term250284, term250284.getClass(), "last", null);
        setField(term250284, term250284.getClass(), "propListHead", null);
        setIntField(term250284, term250284.getClass(), "sourcePosition", 0);
        setField(term250284, term250284.getClass(), "jsType", null);
        setField(term250284, term250284.getClass(), "parent", null);
        setField(term250283, term250283.getClass(), "rootNode", term250284);
        setField(term250283, term250283.getClass(), "thisType", null);
        setBooleanField(term250283, term250283.getClass(), "isBottom", false);
        Object term250285 = newInstance(Class.forName("java.lang.Object"));
        ArrayDeque term250281 = new ArrayDeque();
        ((ArrayDeque) term250281).add(term250283);
        ((ArrayDeque) term250281).add(term250285);
        ((ArrayDeque) term250281).add(term250285);
        ((ArrayDeque) term250281).add(term250285);
        ((ArrayDeque) term250281).add(term250285);
        ((ArrayDeque) term250281).add(term250285);
        ((ArrayDeque) term250281).add(term250285);
        ((ArrayDeque) term250281).add(term250285);
        ((ArrayDeque) term250281).add(term250285);
        ((ArrayDeque) term250281).add(term250285);
        ((ArrayDeque) term250281).add(term250285);
        ((ArrayDeque) term250281).add(term250285);
        ((ArrayDeque) term250281).add(term250285);
        ((ArrayDeque) term250281).add(term250285);
        ((ArrayDeque) term250281).add(term250285);
        ((ArrayDeque) term250281).add(term250285);
        ((ArrayDeque) term250281).add(term250285);
        ((ArrayDeque) term250281).add(term250285);
        ((ArrayDeque) term250281).add(term250285);
        ((ArrayDeque) term250281).add(term250285);
        ((ArrayDeque) term250281).add(term250285);
        ((ArrayDeque) term250281).add(term250285);
        ((ArrayDeque) term250281).add(term250285);
        ((ArrayDeque) term250281).add(term250285);
        ((ArrayDeque) term250281).add(term250285);
        ((ArrayDeque) term250281).add(term250285);
        ((ArrayDeque) term250281).add(term250285);
        ((ArrayDeque) term250281).add(term250285);
        ((ArrayDeque) term250281).add(term250285);
        ((ArrayDeque) term250281).add(term250285);
        ((ArrayDeque) term250281).add(term250285);
        ((ArrayDeque) term250281).add(term250285);
        ArrayDeque term250286 = new ArrayDeque();
        term250280 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term250280, term250280.getClass(), "compiler", null);
        setField(term250280, term250280.getClass(), "callback", null);
        setField(term250280, term250280.getClass(), "curNode", null);
        setField(term250280, term250280.getClass(), "scopes", term250281);
        setField(term250280, term250280.getClass(), "scopeRoots", term250286);
        setField(term250280, term250280.getClass(), "cfgs", null);
        setField(term250280, term250280.getClass(), "sourceName", null);
        setField(term250280, term250280.getClass(), "scopeCreator", null);
        setField(term250280, term250280.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term249669;
        callMethod(klass, "enterScope", argTypes, term249257, args);
        assertTrue(recursiveEquals(term249257, term250273));
        assertTrue(recursiveEquals(term249669, term250280));
    }

};


