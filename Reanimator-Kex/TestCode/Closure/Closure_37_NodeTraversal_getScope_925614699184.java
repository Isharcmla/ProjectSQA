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

public class NodeTraversal_getScope_925614699184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42117;
     Object term42289;

    public NodeTraversal_getScope_925614699184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term42223 = new ArrayList();
        ArrayDeque term42171 = new ArrayDeque((Collection<? extends Object>) term42223);
        ArrayDeque term42277 = new ArrayDeque();
        term42117 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term42117, term42117.getClass(), "scopes", term42171);
        setField(term42117, term42117.getClass(), "scopeRoots", term42277);
        ArrayDeque term42290 = new ArrayDeque();
        ArrayDeque term42292 = new ArrayDeque();
        term42289 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term42289, term42289.getClass(), "compiler", null);
        setField(term42289, term42289.getClass(), "callback", null);
        setField(term42289, term42289.getClass(), "curNode", null);
        setField(term42289, term42289.getClass(), "scopes", term42290);
        setField(term42289, term42289.getClass(), "scopeRoots", term42292);
        setField(term42289, term42289.getClass(), "cfgs", null);
        setField(term42289, term42289.getClass(), "sourceName", null);
        setField(term42289, term42289.getClass(), "inputId", null);
        setField(term42289, term42289.getClass(), "scopeCreator", null);
        setField(term42289, term42289.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getScope", argTypes, term42117, args);
        assertTrue(recursiveEquals(term42117, term42289));
        assertTrue(recursiveEquals(retValue, null));
    }

};


