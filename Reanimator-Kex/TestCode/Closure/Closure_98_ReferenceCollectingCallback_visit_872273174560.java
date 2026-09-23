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

public class ReferenceCollectingCallback_visit_872273174560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152075;
     Object term152215;
     Object term152307;

    public ReferenceCollectingCallback_visit_872273174560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term152129 = new ArrayDeque();
        term152075 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term152075, term152075.getClass(), "blockStack", term152129);
        term152215 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term152215, term152215.getClass(), "type", 108);
        term152307 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term152377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term152307, term152307.getClass(), "type", 108);
        setField(term152307, term152307.getClass(), "first", term152377);
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
        args[1] = term152215;
        args[2] = term152307;
        try {
            callMethod(klass, "visit", argTypes, term152075, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


