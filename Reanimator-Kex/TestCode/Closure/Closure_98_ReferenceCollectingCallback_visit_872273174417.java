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

public class ReferenceCollectingCallback_visit_872273174417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110594;
     Object term110740;
     Object term110826;

    public ReferenceCollectingCallback_visit_872273174417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term110648 = new ArrayDeque();
        term110594 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term110594, term110594.getClass(), "blockStack", term110648);
        term110740 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term110740, term110740.getClass(), "type", 101);
        term110826 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term110896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term110826, term110826.getClass(), "type", 101);
        setField(term110826, term110826.getClass(), "first", term110896);
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
        args[1] = term110740;
        args[2] = term110826;
        try {
            callMethod(klass, "visit", argTypes, term110594, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


