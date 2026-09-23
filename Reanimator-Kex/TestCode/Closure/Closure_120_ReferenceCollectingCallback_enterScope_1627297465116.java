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
import java.util.ArrayDeque;

public class ReferenceCollectingCallback_enterScope_1627297465116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15667;
     Object term15757;

    public ReferenceCollectingCallback_enterScope_1627297465116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15667 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ArrayDeque term15811 = new ArrayDeque();
        term15757 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term15757, term15757.getClass(), "scopes", term15811);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term15757;
        try {
            callMethod(klass, "enterScope", argTypes, term15667, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


