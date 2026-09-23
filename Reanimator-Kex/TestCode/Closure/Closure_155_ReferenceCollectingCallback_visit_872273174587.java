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

public class ReferenceCollectingCallback_visit_872273174587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152525;
     Object term152671;
     Object term152763;

    public ReferenceCollectingCallback_visit_872273174587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term152579 = new ArrayDeque();
        term152525 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term152525, term152525.getClass(), "blockStack", term152579);
        term152671 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term152671, term152671.getClass(), "type", 100);
        term152763 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term152833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term152763, term152763.getClass(), "type", 100);
        setField(term152763, term152763.getClass(), "first", term152833);
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
        args[1] = term152671;
        args[2] = term152763;
        try {
            callMethod(klass, "visit", argTypes, term152525, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


