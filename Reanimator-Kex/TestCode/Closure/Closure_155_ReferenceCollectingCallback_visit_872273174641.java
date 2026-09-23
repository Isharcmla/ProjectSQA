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
import java.util.ArrayDeque;
import java.lang.Object;

public class ReferenceCollectingCallback_visit_872273174641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168271;
     Object term168417;
     Object term168503;

    public ReferenceCollectingCallback_visit_872273174641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term168325 = new ArrayDeque();
        term168271 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term168271, term168271.getClass(), "blockStack", term168325);
        term168417 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term168417, term168417.getClass(), "type", 101);
        term168503 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term168573 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term168503, term168503.getClass(), "type", 101);
        setField(term168503, term168503.getClass(), "first", term168573);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term168417;
        args[2] = term168503;
        try {
            callMethod(klass, "visit", argTypes, term168271, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


