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

public class ReferenceCollectingCallback_enterScope_16272974651362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423942;
     Object term424536;
     Object term426137;
     Object term426144;

    public ReferenceCollectingCallback_enterScope_16272974651362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term424188 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        Object term424679 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term424725 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term424771 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term424725, term424725.getClass(), "type", 105);
        setIntField(term424771, term424771.getClass(), "type", 132);
        setField(term424725, term424725.getClass(), "parent", term424771);
        setField(term424679, term424679.getClass(), "rootNode", term424725);
        ArrayList term424048 = new ArrayList();
        ((ArrayList) term424048).add(term424188);
        ((ArrayList) term424048).add(term424679);
        ((ArrayList) term424048).add(term424679);
        ((ArrayList) term424048).add(term424679);
        ArrayDeque term423996 = new ArrayDeque((Collection<? extends Object>) term424048);
        term423942 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term423942, term423942.getClass(), "blockStack", term423996);
        ArrayList term424642 = new ArrayList();
        ((ArrayList) term424642).add(term424679);
        ((ArrayList) term424642).add(term424679);
        ((ArrayList) term424642).add(term424679);
        ((ArrayList) term424642).add(term424679);
        ArrayDeque term424590 = new ArrayDeque((Collection<? extends Object>) term424642);
        ArrayList term424877 = new ArrayList();
        ArrayDeque term424825 = new ArrayDeque((Collection<? extends Object>) term424877);
        term424536 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term424536, term424536.getClass(), "scopes", term424590);
        setField(term424536, term424536.getClass(), "scopeRoots", term424825);
        ArrayDeque term426138 = new ArrayDeque();
        term426137 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term426137, term426137.getClass(), "referenceMap", null);
        setField(term426137, term426137.getClass(), "blockStack", term426138);
        setField(term426137, term426137.getClass(), "behavior", null);
        setField(term426137, term426137.getClass(), "compiler", null);
        setField(term426137, term426137.getClass(), "varFilter", null);
        Object term426147 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term426148 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term426147, term426147.getClass(), "vars", null);
        setField(term426147, term426147.getClass(), "parent", null);
        setDoubleField(term426148, term426148.getClass(), "number", 0.0);
        setIntField(term426148, term426148.getClass(), "type", 105);
        setField(term426148, term426148.getClass(), "next", null);
        setField(term426148, term426148.getClass(), "first", null);
        setField(term426148, term426148.getClass(), "last", null);
        setField(term426148, term426148.getClass(), "propListHead", null);
        setIntField(term426148, term426148.getClass(), "sourcePosition", 0);
        setField(term426148, term426148.getClass(), "jsType", null);
        setField(term426148, term426148.getClass(), "parent", null);
        setField(term426147, term426147.getClass(), "rootNode", term426148);
        setField(term426147, term426147.getClass(), "thisType", null);
        setBooleanField(term426147, term426147.getClass(), "isBottom", false);
        ArrayDeque term426145 = new ArrayDeque();
        ((ArrayDeque) term426145).add(term426147);
        ((ArrayDeque) term426145).add(term426147);
        ((ArrayDeque) term426145).add(term426147);
        ((ArrayDeque) term426145).add(term426147);
        ArrayDeque term426149 = new ArrayDeque();
        term426144 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term426144, term426144.getClass(), "compiler", null);
        setField(term426144, term426144.getClass(), "callback", null);
        setField(term426144, term426144.getClass(), "curNode", null);
        setField(term426144, term426144.getClass(), "scopes", term426145);
        setField(term426144, term426144.getClass(), "scopeRoots", term426149);
        setField(term426144, term426144.getClass(), "cfgs", null);
        setField(term426144, term426144.getClass(), "sourceName", null);
        setField(term426144, term426144.getClass(), "scopeCreator", null);
        setField(term426144, term426144.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term424536;
        callMethod(klass, "enterScope", argTypes, term423942, args);
        assertTrue(recursiveEquals(term423942, term426137));
        assertTrue(recursiveEquals(term424536, term426144));
    }

};


