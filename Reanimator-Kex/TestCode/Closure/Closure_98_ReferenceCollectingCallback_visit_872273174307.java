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

public class ReferenceCollectingCallback_visit_872273174307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77729;
     Object term77869;
     Object term77961;

    public ReferenceCollectingCallback_visit_872273174307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term77783 = new ArrayDeque();
        term77729 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term77729, term77729.getClass(), "blockStack", term77783);
        term77869 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term77869, term77869.getClass(), "type", 108);
        term77961 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term78031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term77961, term77961.getClass(), "type", 108);
        setField(term77961, term77961.getClass(), "first", term78031);
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
        args[1] = term77869;
        args[2] = term77961;
        try {
            callMethod(klass, "visit", argTypes, term77729, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


