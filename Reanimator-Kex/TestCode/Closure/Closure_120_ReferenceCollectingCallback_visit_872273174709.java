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

public class ReferenceCollectingCallback_visit_872273174709 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251474;
     Object term251620;
     Object term251712;

    public ReferenceCollectingCallback_visit_872273174709() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term251528 = new ArrayDeque();
        term251474 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term251474, term251474.getClass(), "blockStack", term251528);
        term251620 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term251620, term251620.getClass(), "type", 0);
        term251712 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term251712, term251712.getClass(), "type", 119);
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
        args[1] = term251620;
        args[2] = term251712;
        try {
            callMethod(klass, "visit", argTypes, term251474, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


