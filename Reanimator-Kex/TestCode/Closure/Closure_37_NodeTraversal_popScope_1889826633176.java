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
import java.util.NoSuchElementException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.Collection;
import java.util.ArrayDeque;

public class NodeTraversal_popScope_1889826633176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39463;

    public NodeTraversal_popScope_1889826633176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term39569 = new ArrayList();
        ArrayDeque term39517 = new ArrayDeque((Collection<? extends Object>) term39569);
        ArrayDeque term39623 = new ArrayDeque();
        term39463 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term39463, term39463.getClass(), "scopeCallback", null);
        setField(term39463, term39463.getClass(), "scopeRoots", term39517);
        setField(term39463, term39463.getClass(), "scopes", term39623);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "popScope", argTypes, term39463, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


