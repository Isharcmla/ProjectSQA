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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.Collection;
import java.util.ArrayDeque;

public class ReferenceCollectingCallback_visit_872273174426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105875;
     Object term105965;
     Object term106217;

    public ReferenceCollectingCallback_visit_872273174426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105875 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ArrayList term106071 = new ArrayList();
        ArrayDeque term106019 = new ArrayDeque((Collection<? extends Object>) term106071);
        ArrayDeque term106125 = new ArrayDeque();
        term105965 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term105965, term105965.getClass(), "scopes", term106019);
        setField(term105965, term105965.getClass(), "scopeRoots", term106125);
        term106217 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term106217, term106217.getClass(), "type", 38);
        setField(term106217, term106217.getClass(), "str", "arguments");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term105965;
        args[1] = term106217;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term105875, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


