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

public class ReferenceCollectingCallback_enterScope_1627297465524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132490;
     Object term132580;

    public ReferenceCollectingCallback_enterScope_1627297465524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132490 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ArrayList term132686 = new ArrayList();
        ArrayDeque term132634 = new ArrayDeque((Collection<? extends Object>) term132686);
        ArrayDeque term132740 = new ArrayDeque();
        term132580 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term132580, term132580.getClass(), "scopes", term132634);
        setField(term132580, term132580.getClass(), "scopeRoots", term132740);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term132580;
        try {
            callMethod(klass, "enterScope", argTypes, term132490, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


