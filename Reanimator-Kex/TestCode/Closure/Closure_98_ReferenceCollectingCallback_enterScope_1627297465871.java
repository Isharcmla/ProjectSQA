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

public class ReferenceCollectingCallback_enterScope_1627297465871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230270;
     Object term230682;
     Object term231531;
     Object term231538;

    public ReferenceCollectingCallback_enterScope_1627297465871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term230516 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        Object term230554 = newInstance(Class.forName("java.lang.Object"));
        Object term231037 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term230376 = new ArrayList();
        ((ArrayList) term230376).add(term230516);
        ((ArrayList) term230376).add(term230554);
        ((ArrayList) term230376).add(term231037);
        ((ArrayList) term230376).add(term231037);
        ((ArrayList) term230376).add(term231037);
        ((ArrayList) term230376).add(term231037);
        ((ArrayList) term230376).add(term231037);
        ((ArrayList) term230376).add(term231037);
        ArrayDeque term230324 = new ArrayDeque((Collection<? extends Object>) term230376);
        term230270 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term230270, term230270.getClass(), "blockStack", term230324);
        Object term230862 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term230932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term231018 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term230932, term230932.getClass(), "type", 105);
        setField(term230932, term230932.getClass(), "parent", term231018);
        setField(term230862, term230862.getClass(), "rootNode", term230932);
        ArrayList term230788 = new ArrayList();
        ((ArrayList) term230788).add(term230862);
        ((ArrayList) term230788).add(term231037);
        ((ArrayList) term230788).add(term231037);
        ((ArrayList) term230788).add(term231037);
        ((ArrayList) term230788).add(term231037);
        ((ArrayList) term230788).add(term231037);
        ((ArrayList) term230788).add(term231037);
        ((ArrayList) term230788).add(term231037);
        ((ArrayList) term230788).add(term231037);
        ((ArrayList) term230788).add(term231037);
        ((ArrayList) term230788).add(term231037);
        ((ArrayList) term230788).add(term231037);
        ((ArrayList) term230788).add(term231037);
        ((ArrayList) term230788).add(term231037);
        ((ArrayList) term230788).add(term231037);
        ((ArrayList) term230788).add(term231037);
        ((ArrayList) term230788).add(term231037);
        ((ArrayList) term230788).add(term231037);
        ((ArrayList) term230788).add(term231037);
        ((ArrayList) term230788).add(term231037);
        ((ArrayList) term230788).add(term231037);
        ((ArrayList) term230788).add(term231037);
        ((ArrayList) term230788).add(term231037);
        ((ArrayList) term230788).add(term231037);
        ((ArrayList) term230788).add(term231037);
        ((ArrayList) term230788).add(term231037);
        ((ArrayList) term230788).add(term231037);
        ((ArrayList) term230788).add(term231037);
        ((ArrayList) term230788).add(term231037);
        ((ArrayList) term230788).add(term231037);
        ((ArrayList) term230788).add(term231037);
        ((ArrayList) term230788).add(term231037);
        ArrayDeque term230736 = new ArrayDeque((Collection<? extends Object>) term230788);
        ArrayList term231143 = new ArrayList();
        ArrayDeque term231091 = new ArrayDeque((Collection<? extends Object>) term231143);
        term230682 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term230682, term230682.getClass(), "scopes", term230736);
        setField(term230682, term230682.getClass(), "scopeRoots", term231091);
        ArrayDeque term231532 = new ArrayDeque();
        term231531 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term231531, term231531.getClass(), "referenceMap", null);
        setField(term231531, term231531.getClass(), "blockStack", term231532);
        setField(term231531, term231531.getClass(), "behavior", null);
        setField(term231531, term231531.getClass(), "compiler", null);
        setField(term231531, term231531.getClass(), "varFilter", null);
        Object term231541 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term231542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term231541, term231541.getClass(), "vars", null);
        setField(term231541, term231541.getClass(), "parent", null);
        setIntField(term231542, term231542.getClass(), "type", 105);
        setField(term231542, term231542.getClass(), "next", null);
        setField(term231542, term231542.getClass(), "first", null);
        setField(term231542, term231542.getClass(), "last", null);
        setField(term231542, term231542.getClass(), "propListHead", null);
        setIntField(term231542, term231542.getClass(), "sourcePosition", 0);
        setField(term231542, term231542.getClass(), "jsType", null);
        setField(term231542, term231542.getClass(), "parent", null);
        setField(term231541, term231541.getClass(), "rootNode", term231542);
        setField(term231541, term231541.getClass(), "thisType", null);
        setBooleanField(term231541, term231541.getClass(), "isBottom", false);
        Object term231543 = newInstance(Class.forName("java.lang.Object"));
        ArrayDeque term231539 = new ArrayDeque();
        ((ArrayDeque) term231539).add(term231541);
        ((ArrayDeque) term231539).add(term231543);
        ((ArrayDeque) term231539).add(term231543);
        ((ArrayDeque) term231539).add(term231543);
        ((ArrayDeque) term231539).add(term231543);
        ((ArrayDeque) term231539).add(term231543);
        ((ArrayDeque) term231539).add(term231543);
        ((ArrayDeque) term231539).add(term231543);
        ((ArrayDeque) term231539).add(term231543);
        ((ArrayDeque) term231539).add(term231543);
        ((ArrayDeque) term231539).add(term231543);
        ((ArrayDeque) term231539).add(term231543);
        ((ArrayDeque) term231539).add(term231543);
        ((ArrayDeque) term231539).add(term231543);
        ((ArrayDeque) term231539).add(term231543);
        ((ArrayDeque) term231539).add(term231543);
        ((ArrayDeque) term231539).add(term231543);
        ((ArrayDeque) term231539).add(term231543);
        ((ArrayDeque) term231539).add(term231543);
        ((ArrayDeque) term231539).add(term231543);
        ((ArrayDeque) term231539).add(term231543);
        ((ArrayDeque) term231539).add(term231543);
        ((ArrayDeque) term231539).add(term231543);
        ((ArrayDeque) term231539).add(term231543);
        ((ArrayDeque) term231539).add(term231543);
        ((ArrayDeque) term231539).add(term231543);
        ((ArrayDeque) term231539).add(term231543);
        ((ArrayDeque) term231539).add(term231543);
        ((ArrayDeque) term231539).add(term231543);
        ((ArrayDeque) term231539).add(term231543);
        ((ArrayDeque) term231539).add(term231543);
        ((ArrayDeque) term231539).add(term231543);
        ArrayDeque term231544 = new ArrayDeque();
        term231538 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term231538, term231538.getClass(), "compiler", null);
        setField(term231538, term231538.getClass(), "callback", null);
        setField(term231538, term231538.getClass(), "curNode", null);
        setField(term231538, term231538.getClass(), "scopes", term231539);
        setField(term231538, term231538.getClass(), "scopeRoots", term231544);
        setField(term231538, term231538.getClass(), "cfgs", null);
        setField(term231538, term231538.getClass(), "sourceName", null);
        setField(term231538, term231538.getClass(), "scopeCreator", null);
        setField(term231538, term231538.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term230682;
        callMethod(klass, "enterScope", argTypes, term230270, args);
        assertTrue(recursiveEquals(term230270, term231531));
        assertTrue(recursiveEquals(term230682, term231538));
    }

};


