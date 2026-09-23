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

public class ReferenceCollectingCallback_enterScope_16272974651196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354862;
     Object term355274;
     Object term355818;
     Object term355825;

    public ReferenceCollectingCallback_enterScope_16272974651196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term355108 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        Object term355146 = newInstance(Class.forName("java.lang.Object"));
        Object term355635 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term354968 = new ArrayList();
        ((ArrayList) term354968).add(term355108);
        ((ArrayList) term354968).add(term355146);
        ((ArrayList) term354968).add(term355635);
        ((ArrayList) term354968).add(term355635);
        ((ArrayList) term354968).add(term355635);
        ((ArrayList) term354968).add(term355635);
        ((ArrayList) term354968).add(term355635);
        ((ArrayList) term354968).add(term355635);
        ArrayDeque term354916 = new ArrayDeque((Collection<? extends Object>) term354968);
        term354862 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term354862, term354862.getClass(), "blockStack", term354916);
        Object term355454 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term355524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term355616 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term355524, term355524.getClass(), "type", 105);
        setField(term355524, term355524.getClass(), "parent", term355616);
        setField(term355454, term355454.getClass(), "rootNode", term355524);
        ArrayList term355380 = new ArrayList();
        ((ArrayList) term355380).add(term355454);
        ((ArrayList) term355380).add(term355635);
        ((ArrayList) term355380).add(term355635);
        ((ArrayList) term355380).add(term355635);
        ((ArrayList) term355380).add(term355635);
        ((ArrayList) term355380).add(term355635);
        ((ArrayList) term355380).add(term355635);
        ((ArrayList) term355380).add(term355635);
        ((ArrayList) term355380).add(term355635);
        ((ArrayList) term355380).add(term355635);
        ((ArrayList) term355380).add(term355635);
        ((ArrayList) term355380).add(term355635);
        ((ArrayList) term355380).add(term355635);
        ((ArrayList) term355380).add(term355635);
        ((ArrayList) term355380).add(term355635);
        ((ArrayList) term355380).add(term355635);
        ((ArrayList) term355380).add(term355635);
        ((ArrayList) term355380).add(term355635);
        ((ArrayList) term355380).add(term355635);
        ((ArrayList) term355380).add(term355635);
        ((ArrayList) term355380).add(term355635);
        ((ArrayList) term355380).add(term355635);
        ((ArrayList) term355380).add(term355635);
        ((ArrayList) term355380).add(term355635);
        ((ArrayList) term355380).add(term355635);
        ((ArrayList) term355380).add(term355635);
        ((ArrayList) term355380).add(term355635);
        ((ArrayList) term355380).add(term355635);
        ((ArrayList) term355380).add(term355635);
        ((ArrayList) term355380).add(term355635);
        ((ArrayList) term355380).add(term355635);
        ((ArrayList) term355380).add(term355635);
        ArrayDeque term355328 = new ArrayDeque((Collection<? extends Object>) term355380);
        ArrayList term355741 = new ArrayList();
        ArrayDeque term355689 = new ArrayDeque((Collection<? extends Object>) term355741);
        term355274 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term355274, term355274.getClass(), "scopes", term355328);
        setField(term355274, term355274.getClass(), "scopeRoots", term355689);
        ArrayDeque term355819 = new ArrayDeque();
        term355818 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term355818, term355818.getClass(), "referenceMap", null);
        setField(term355818, term355818.getClass(), "blockStack", term355819);
        setField(term355818, term355818.getClass(), "behavior", null);
        setField(term355818, term355818.getClass(), "compiler", null);
        setField(term355818, term355818.getClass(), "varFilter", null);
        Object term355828 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term355829 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term355828, term355828.getClass(), "vars", null);
        setField(term355828, term355828.getClass(), "parent", null);
        setIntField(term355829, term355829.getClass(), "type", 105);
        setField(term355829, term355829.getClass(), "next", null);
        setField(term355829, term355829.getClass(), "first", null);
        setField(term355829, term355829.getClass(), "last", null);
        setField(term355829, term355829.getClass(), "propListHead", null);
        setIntField(term355829, term355829.getClass(), "sourcePosition", 0);
        setField(term355829, term355829.getClass(), "jsType", null);
        setField(term355829, term355829.getClass(), "parent", null);
        setField(term355828, term355828.getClass(), "rootNode", term355829);
        setField(term355828, term355828.getClass(), "thisType", null);
        setBooleanField(term355828, term355828.getClass(), "isBottom", false);
        Object term355830 = newInstance(Class.forName("java.lang.Object"));
        ArrayDeque term355826 = new ArrayDeque();
        ((ArrayDeque) term355826).add(term355828);
        ((ArrayDeque) term355826).add(term355830);
        ((ArrayDeque) term355826).add(term355830);
        ((ArrayDeque) term355826).add(term355830);
        ((ArrayDeque) term355826).add(term355830);
        ((ArrayDeque) term355826).add(term355830);
        ((ArrayDeque) term355826).add(term355830);
        ((ArrayDeque) term355826).add(term355830);
        ((ArrayDeque) term355826).add(term355830);
        ((ArrayDeque) term355826).add(term355830);
        ((ArrayDeque) term355826).add(term355830);
        ((ArrayDeque) term355826).add(term355830);
        ((ArrayDeque) term355826).add(term355830);
        ((ArrayDeque) term355826).add(term355830);
        ((ArrayDeque) term355826).add(term355830);
        ((ArrayDeque) term355826).add(term355830);
        ((ArrayDeque) term355826).add(term355830);
        ((ArrayDeque) term355826).add(term355830);
        ((ArrayDeque) term355826).add(term355830);
        ((ArrayDeque) term355826).add(term355830);
        ((ArrayDeque) term355826).add(term355830);
        ((ArrayDeque) term355826).add(term355830);
        ((ArrayDeque) term355826).add(term355830);
        ((ArrayDeque) term355826).add(term355830);
        ((ArrayDeque) term355826).add(term355830);
        ((ArrayDeque) term355826).add(term355830);
        ((ArrayDeque) term355826).add(term355830);
        ((ArrayDeque) term355826).add(term355830);
        ((ArrayDeque) term355826).add(term355830);
        ((ArrayDeque) term355826).add(term355830);
        ((ArrayDeque) term355826).add(term355830);
        ((ArrayDeque) term355826).add(term355830);
        ArrayDeque term355831 = new ArrayDeque();
        term355825 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term355825, term355825.getClass(), "compiler", null);
        setField(term355825, term355825.getClass(), "callback", null);
        setField(term355825, term355825.getClass(), "curNode", null);
        setField(term355825, term355825.getClass(), "scopes", term355826);
        setField(term355825, term355825.getClass(), "scopeRoots", term355831);
        setField(term355825, term355825.getClass(), "cfgs", null);
        setField(term355825, term355825.getClass(), "sourceName", null);
        setField(term355825, term355825.getClass(), "scopeCreator", null);
        setField(term355825, term355825.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term355274;
        callMethod(klass, "enterScope", argTypes, term354862, args);
        assertTrue(recursiveEquals(term354862, term355818));
        assertTrue(recursiveEquals(term355274, term355825));
    }

};


