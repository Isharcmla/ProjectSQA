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

public class ReferenceCollectingCallback_visit_872273174271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69699;
     Object term69845;
     Object term69937;

    public ReferenceCollectingCallback_visit_872273174271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term69753 = new ArrayDeque();
        term69699 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term69699, term69699.getClass(), "blockStack", term69753);
        term69845 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term69845, term69845.getClass(), "type", 101);
        term69937 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term69937, term69937.getClass(), "type", 101);
        setField(term69937, term69937.getClass(), "first", null);
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
        args[1] = term69845;
        args[2] = term69937;
        try {
            callMethod(klass, "visit", argTypes, term69699, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


