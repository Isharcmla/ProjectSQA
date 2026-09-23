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

public class ReferenceCollectingCallback_visit_872273174546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139182;
     Object term139328;
     Object term139420;

    public ReferenceCollectingCallback_visit_872273174546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term139236 = new ArrayDeque();
        term139182 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term139182, term139182.getClass(), "blockStack", term139236);
        term139328 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term139328, term139328.getClass(), "type", 108);
        term139420 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term139490 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term139420, term139420.getClass(), "type", 108);
        setField(term139420, term139420.getClass(), "first", term139490);
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
        args[1] = term139328;
        args[2] = term139420;
        try {
            callMethod(klass, "visit", argTypes, term139182, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


