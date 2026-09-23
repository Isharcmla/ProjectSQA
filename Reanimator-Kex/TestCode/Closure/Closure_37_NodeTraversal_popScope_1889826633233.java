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
import java.lang.Object;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ArrayDeque;

public class NodeTraversal_popScope_1889826633233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58701;

    public NodeTraversal_popScope_1889826633233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term58911 = new ArrayList();
        ArrayDeque term58859 = new ArrayDeque((Collection<? extends Object>) term58911);
        ArrayDeque term58965 = new ArrayDeque();
        term58701 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term58805 = newInstance(Class.forName("com.google.javascript.jscomp.CheckUnreachableCode"));
        setField(term58701, term58701.getClass(), "scopeCallback", term58805);
        setField(term58701, term58701.getClass(), "scopeRoots", term58859);
        setField(term58701, term58701.getClass(), "scopes", term58965);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "popScope", argTypes, term58701, args);
    }

};


