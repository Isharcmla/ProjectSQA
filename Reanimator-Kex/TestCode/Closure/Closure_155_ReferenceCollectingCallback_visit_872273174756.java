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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.Collection;
import java.util.ArrayDeque;

public class ReferenceCollectingCallback_visit_872273174756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196524;
     Object term196614;
     Object term196860;

    public ReferenceCollectingCallback_visit_872273174756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196524 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ArrayList term196720 = new ArrayList();
        ArrayDeque term196668 = new ArrayDeque((Collection<? extends Object>) term196720);
        ArrayDeque term196774 = new ArrayDeque();
        term196614 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term196614, term196614.getClass(), "scopes", term196668);
        setField(term196614, term196614.getClass(), "scopeRoots", term196774);
        term196860 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term196860, term196860.getClass(), "type", 38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term196614;
        args[1] = term196860;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term196524, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


