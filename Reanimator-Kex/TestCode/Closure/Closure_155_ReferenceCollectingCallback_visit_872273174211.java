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

public class ReferenceCollectingCallback_visit_872273174211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49509;
     Object term49655;
     Object term49747;

    public ReferenceCollectingCallback_visit_872273174211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term49563 = new ArrayDeque();
        term49509 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term49509, term49509.getClass(), "blockStack", term49563);
        term49655 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term49655, term49655.getClass(), "type", 98);
        term49747 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term49747, term49747.getClass(), "type", 98);
        setField(term49747, term49747.getClass(), "first", null);
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
        args[1] = term49655;
        args[2] = term49747;
        try {
            callMethod(klass, "visit", argTypes, term49509, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


