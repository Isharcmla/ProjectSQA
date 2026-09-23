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

public class ReferenceCollectingCallback_visit_872273174566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145571;
     Object term145717;
     Object term145809;

    public ReferenceCollectingCallback_visit_872273174566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term145625 = new ArrayDeque();
        term145571 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term145571, term145571.getClass(), "blockStack", term145625);
        term145717 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term145717, term145717.getClass(), "type", 98);
        term145809 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term145879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term145809, term145809.getClass(), "type", 98);
        setField(term145809, term145809.getClass(), "first", term145879);
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
        args[1] = term145717;
        args[2] = term145809;
        try {
            callMethod(klass, "visit", argTypes, term145571, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


