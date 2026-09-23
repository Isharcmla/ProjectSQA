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

public class ReferenceCollectingCallback_visit_872273174520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131374;
     Object term131464;
     Object term131694;

    public ReferenceCollectingCallback_visit_872273174520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131374 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ArrayList term131570 = new ArrayList();
        ArrayDeque term131518 = new ArrayDeque((Collection<? extends Object>) term131570);
        ArrayDeque term131624 = new ArrayDeque();
        term131464 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term131464, term131464.getClass(), "scopes", term131518);
        setField(term131464, term131464.getClass(), "scopeRoots", term131624);
        term131694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term131694, term131694.getClass(), "type", 38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term131464;
        args[1] = term131694;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term131374, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


