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

public class ReferenceCollectingCallback_visit_872273174482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131388;
     Object term131534;
     Object term131626;

    public ReferenceCollectingCallback_visit_872273174482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term131442 = new ArrayDeque();
        term131388 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term131388, term131388.getClass(), "blockStack", term131442);
        term131534 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term131534, term131534.getClass(), "type", 77);
        term131626 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term131626, term131626.getClass(), "type", 77);
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
        args[1] = term131534;
        args[2] = term131626;
        try {
            callMethod(klass, "visit", argTypes, term131388, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


