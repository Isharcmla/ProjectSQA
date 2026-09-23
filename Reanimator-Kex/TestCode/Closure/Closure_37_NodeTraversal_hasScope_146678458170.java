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

public class NodeTraversal_hasScope_146678458170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37520;
     Object term37693;

    public NodeTraversal_hasScope_146678458170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term37626 = new ArrayList();
        ArrayDeque term37574 = new ArrayDeque((Collection<? extends Object>) term37626);
        ArrayDeque term37680 = new ArrayDeque();
        term37520 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term37520, term37520.getClass(), "scopes", term37574);
        setField(term37520, term37520.getClass(), "scopeRoots", term37680);
        ArrayDeque term37694 = new ArrayDeque();
        ArrayDeque term37696 = new ArrayDeque();
        term37693 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term37693, term37693.getClass(), "compiler", null);
        setField(term37693, term37693.getClass(), "callback", null);
        setField(term37693, term37693.getClass(), "curNode", null);
        setField(term37693, term37693.getClass(), "scopes", term37694);
        setField(term37693, term37693.getClass(), "scopeRoots", term37696);
        setField(term37693, term37693.getClass(), "cfgs", null);
        setField(term37693, term37693.getClass(), "sourceName", null);
        setField(term37693, term37693.getClass(), "inputId", null);
        setField(term37693, term37693.getClass(), "scopeCreator", null);
        setField(term37693, term37693.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasScope", argTypes, term37520, args);
        assertTrue(recursiveEquals(term37520, term37693));
        assertTrue(recursiveEquals(retValue, false));
    }

};


