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

public class ReferenceCollectingCallback_visit_872273174389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102081;
     Object term102171;
     Object term102423;

    public ReferenceCollectingCallback_visit_872273174389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102081 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ArrayList term102277 = new ArrayList();
        ArrayDeque term102225 = new ArrayDeque((Collection<? extends Object>) term102277);
        ArrayDeque term102331 = new ArrayDeque();
        term102171 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term102171, term102171.getClass(), "scopes", term102225);
        setField(term102171, term102171.getClass(), "scopeRoots", term102331);
        term102423 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term102423, term102423.getClass(), "type", 38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term102171;
        args[1] = term102423;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term102081, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


