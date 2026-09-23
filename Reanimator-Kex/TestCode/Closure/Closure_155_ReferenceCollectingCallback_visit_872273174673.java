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

public class ReferenceCollectingCallback_visit_872273174673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177319;
     Object term177459;
     Object term177551;

    public ReferenceCollectingCallback_visit_872273174673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term177373 = new ArrayDeque();
        term177319 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term177319, term177319.getClass(), "blockStack", term177373);
        term177459 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term177459, term177459.getClass(), "type", 108);
        term177551 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term177621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term177551, term177551.getClass(), "type", 108);
        setField(term177551, term177551.getClass(), "first", term177621);
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
        args[1] = term177459;
        args[2] = term177551;
        try {
            callMethod(klass, "visit", argTypes, term177319, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


