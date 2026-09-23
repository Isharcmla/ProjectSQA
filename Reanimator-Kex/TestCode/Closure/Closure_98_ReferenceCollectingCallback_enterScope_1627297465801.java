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

public class ReferenceCollectingCallback_enterScope_1627297465801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212416;
     Object term212896;
     Object term213504;
     Object term213511;

    public ReferenceCollectingCallback_enterScope_1627297465801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term212662 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        Object term213039 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term213074 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term213074, term213074.getClass(), "type", 105);
        setField(term213074, term213074.getClass(), "parent", term213074);
        setField(term213039, term213039.getClass(), "rootNode", term213074);
        ArrayList term212522 = new ArrayList();
        ((ArrayList) term212522).add(term212662);
        ((ArrayList) term212522).add(term213039);
        ((ArrayList) term212522).add(term213039);
        ((ArrayList) term212522).add(term213039);
        ((ArrayList) term212522).add(term213039);
        ((ArrayList) term212522).add(term213039);
        ((ArrayList) term212522).add(term213039);
        ((ArrayList) term212522).add(term213039);
        ((ArrayList) term212522).add(term213039);
        ((ArrayList) term212522).add(term213039);
        ArrayDeque term212470 = new ArrayDeque((Collection<? extends Object>) term212522);
        term212416 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term212416, term212416.getClass(), "blockStack", term212470);
        ArrayList term213002 = new ArrayList();
        ((ArrayList) term213002).add(term213039);
        ((ArrayList) term213002).add(term213039);
        ((ArrayList) term213002).add(term213039);
        ((ArrayList) term213002).add(term213039);
        ((ArrayList) term213002).add(term213039);
        ((ArrayList) term213002).add(term213039);
        ((ArrayList) term213002).add(term213039);
        ((ArrayList) term213002).add(term213039);
        ((ArrayList) term213002).add(term213039);
        ((ArrayList) term213002).add(term213039);
        ((ArrayList) term213002).add(term213039);
        ((ArrayList) term213002).add(term213039);
        ((ArrayList) term213002).add(term213039);
        ((ArrayList) term213002).add(term213039);
        ((ArrayList) term213002).add(term213039);
        ((ArrayList) term213002).add(term213039);
        ArrayDeque term212950 = new ArrayDeque((Collection<? extends Object>) term213002);
        ArrayList term213180 = new ArrayList();
        ArrayDeque term213128 = new ArrayDeque((Collection<? extends Object>) term213180);
        term212896 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term212896, term212896.getClass(), "scopes", term212950);
        setField(term212896, term212896.getClass(), "scopeRoots", term213128);
        ArrayDeque term213505 = new ArrayDeque();
        term213504 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term213504, term213504.getClass(), "referenceMap", null);
        setField(term213504, term213504.getClass(), "blockStack", term213505);
        setField(term213504, term213504.getClass(), "behavior", null);
        setField(term213504, term213504.getClass(), "compiler", null);
        setField(term213504, term213504.getClass(), "varFilter", null);
        Object term213514 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term213515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term213514, term213514.getClass(), "vars", null);
        setField(term213514, term213514.getClass(), "parent", null);
        setIntField(term213515, term213515.getClass(), "type", 105);
        setField(term213515, term213515.getClass(), "next", null);
        setField(term213515, term213515.getClass(), "first", null);
        setField(term213515, term213515.getClass(), "last", null);
        setField(term213515, term213515.getClass(), "propListHead", null);
        setIntField(term213515, term213515.getClass(), "sourcePosition", 0);
        setField(term213515, term213515.getClass(), "jsType", null);
        setField(term213515, term213515.getClass(), "parent", term213515);
        setField(term213514, term213514.getClass(), "rootNode", term213515);
        setField(term213514, term213514.getClass(), "thisType", null);
        setBooleanField(term213514, term213514.getClass(), "isBottom", false);
        ArrayDeque term213512 = new ArrayDeque();
        ((ArrayDeque) term213512).add(term213514);
        ((ArrayDeque) term213512).add(term213514);
        ((ArrayDeque) term213512).add(term213514);
        ((ArrayDeque) term213512).add(term213514);
        ((ArrayDeque) term213512).add(term213514);
        ((ArrayDeque) term213512).add(term213514);
        ((ArrayDeque) term213512).add(term213514);
        ((ArrayDeque) term213512).add(term213514);
        ((ArrayDeque) term213512).add(term213514);
        ((ArrayDeque) term213512).add(term213514);
        ((ArrayDeque) term213512).add(term213514);
        ((ArrayDeque) term213512).add(term213514);
        ((ArrayDeque) term213512).add(term213514);
        ((ArrayDeque) term213512).add(term213514);
        ((ArrayDeque) term213512).add(term213514);
        ((ArrayDeque) term213512).add(term213514);
        ArrayDeque term213516 = new ArrayDeque();
        term213511 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term213511, term213511.getClass(), "compiler", null);
        setField(term213511, term213511.getClass(), "callback", null);
        setField(term213511, term213511.getClass(), "curNode", null);
        setField(term213511, term213511.getClass(), "scopes", term213512);
        setField(term213511, term213511.getClass(), "scopeRoots", term213516);
        setField(term213511, term213511.getClass(), "cfgs", null);
        setField(term213511, term213511.getClass(), "sourceName", null);
        setField(term213511, term213511.getClass(), "scopeCreator", null);
        setField(term213511, term213511.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term212896;
        callMethod(klass, "enterScope", argTypes, term212416, args);
        assertTrue(recursiveEquals(term212416, term213504));
        assertTrue(recursiveEquals(term212896, term213511));
    }

};


