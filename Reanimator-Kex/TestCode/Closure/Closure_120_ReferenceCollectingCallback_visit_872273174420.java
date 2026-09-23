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
import java.lang.ClassCastException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.Collection;
import java.util.ArrayDeque;

public class ReferenceCollectingCallback_visit_872273174420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101858;
     Object term101948;
     Object term102290;

    public ReferenceCollectingCallback_visit_872273174420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101858 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ArrayList term102054 = new ArrayList();
        ArrayDeque term102002 = new ArrayDeque((Collection<? extends Object>) term102054);
        Object term102198 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term102160 = new ArrayList();
        ((ArrayList) term102160).add(term102198);
        ArrayDeque term102108 = new ArrayDeque((Collection<? extends Object>) term102160);
        term101948 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term101948, term101948.getClass(), "scopes", term102002);
        setField(term101948, term101948.getClass(), "scopeRoots", term102108);
        term102290 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term102290, term102290.getClass(), "type", 38);
        setField(term102290, term102290.getClass(), "str", "                                                                                                                  ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term101948;
        args[1] = term102290;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term101858, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


