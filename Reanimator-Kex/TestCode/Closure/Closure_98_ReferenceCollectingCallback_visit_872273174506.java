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

public class ReferenceCollectingCallback_visit_872273174506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137948;
     Object term138094;
     Object term138186;

    public ReferenceCollectingCallback_visit_872273174506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term138002 = new ArrayDeque();
        term137948 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term137948, term137948.getClass(), "blockStack", term138002);
        term138094 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term138094, term138094.getClass(), "type", 98);
        term138186 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term138186, term138186.getClass(), "type", 98);
        setField(term138186, term138186.getClass(), "first", null);
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
        args[1] = term138094;
        args[2] = term138186;
        try {
            callMethod(klass, "visit", argTypes, term137948, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


