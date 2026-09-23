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

public class ReferenceCollectingCallback_enterScope_1627297465708 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187416;
     Object term187506;

    public ReferenceCollectingCallback_enterScope_1627297465708() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term187416 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ArrayList term187612 = new ArrayList();
        ArrayDeque term187560 = new ArrayDeque((Collection<? extends Object>) term187612);
        ArrayDeque term187666 = new ArrayDeque();
        term187506 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term187506, term187506.getClass(), "scopes", term187560);
        setField(term187506, term187506.getClass(), "scopeRoots", term187666);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term187506;
        try {
            callMethod(klass, "enterScope", argTypes, term187416, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


