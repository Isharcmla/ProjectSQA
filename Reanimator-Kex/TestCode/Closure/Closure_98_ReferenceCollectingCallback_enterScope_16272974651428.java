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

public class ReferenceCollectingCallback_enterScope_16272974651428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term453443;
     Object term454037;
     Object term456190;
     Object term456197;

    public ReferenceCollectingCallback_enterScope_16272974651428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term453689 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        Object term454180 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term454226 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term454272 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term454226, term454226.getClass(), "type", 105);
        setIntField(term454272, term454272.getClass(), "type", 132);
        setField(term454226, term454226.getClass(), "parent", term454272);
        setField(term454180, term454180.getClass(), "rootNode", term454226);
        ArrayList term453549 = new ArrayList();
        ((ArrayList) term453549).add(term453689);
        ((ArrayList) term453549).add(term454180);
        ((ArrayList) term453549).add(term454180);
        ((ArrayList) term453549).add(term454180);
        ArrayDeque term453497 = new ArrayDeque((Collection<? extends Object>) term453549);
        term453443 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term453443, term453443.getClass(), "blockStack", term453497);
        ArrayList term454143 = new ArrayList();
        ((ArrayList) term454143).add(term454180);
        ((ArrayList) term454143).add(term454180);
        ((ArrayList) term454143).add(term454180);
        ((ArrayList) term454143).add(term454180);
        ArrayDeque term454091 = new ArrayDeque((Collection<? extends Object>) term454143);
        ArrayList term454378 = new ArrayList();
        ArrayDeque term454326 = new ArrayDeque((Collection<? extends Object>) term454378);
        term454037 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term454037, term454037.getClass(), "scopes", term454091);
        setField(term454037, term454037.getClass(), "scopeRoots", term454326);
        ArrayDeque term456191 = new ArrayDeque();
        term456190 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term456190, term456190.getClass(), "referenceMap", null);
        setField(term456190, term456190.getClass(), "blockStack", term456191);
        setField(term456190, term456190.getClass(), "behavior", null);
        setField(term456190, term456190.getClass(), "compiler", null);
        setField(term456190, term456190.getClass(), "varFilter", null);
        Object term456200 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term456201 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term456200, term456200.getClass(), "vars", null);
        setField(term456200, term456200.getClass(), "parent", null);
        setField(term456201, term456201.getClass(), "str", null);
        setIntField(term456201, term456201.getClass(), "type", 105);
        setField(term456201, term456201.getClass(), "next", null);
        setField(term456201, term456201.getClass(), "first", null);
        setField(term456201, term456201.getClass(), "last", null);
        setField(term456201, term456201.getClass(), "propListHead", null);
        setIntField(term456201, term456201.getClass(), "sourcePosition", 0);
        setField(term456201, term456201.getClass(), "jsType", null);
        setField(term456201, term456201.getClass(), "parent", null);
        setField(term456200, term456200.getClass(), "rootNode", term456201);
        setField(term456200, term456200.getClass(), "thisType", null);
        setBooleanField(term456200, term456200.getClass(), "isBottom", false);
        ArrayDeque term456198 = new ArrayDeque();
        ((ArrayDeque) term456198).add(term456200);
        ((ArrayDeque) term456198).add(term456200);
        ((ArrayDeque) term456198).add(term456200);
        ((ArrayDeque) term456198).add(term456200);
        ArrayDeque term456202 = new ArrayDeque();
        term456197 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term456197, term456197.getClass(), "compiler", null);
        setField(term456197, term456197.getClass(), "callback", null);
        setField(term456197, term456197.getClass(), "curNode", null);
        setField(term456197, term456197.getClass(), "scopes", term456198);
        setField(term456197, term456197.getClass(), "scopeRoots", term456202);
        setField(term456197, term456197.getClass(), "cfgs", null);
        setField(term456197, term456197.getClass(), "sourceName", null);
        setField(term456197, term456197.getClass(), "scopeCreator", null);
        setField(term456197, term456197.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term454037;
        callMethod(klass, "enterScope", argTypes, term453443, args);
        assertTrue(recursiveEquals(term453443, term456190));
        assertTrue(recursiveEquals(term454037, term456197));
    }

};


