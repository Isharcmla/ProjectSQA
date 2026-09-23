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

public class ReferenceCollectingCallback_visit_872273174259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66193;
     Object term66339;
     Object term66431;

    public ReferenceCollectingCallback_visit_872273174259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term66247 = new ArrayDeque();
        term66193 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term66193, term66193.getClass(), "blockStack", term66247);
        term66339 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term66339, term66339.getClass(), "type", 100);
        term66431 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term66501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term66431, term66431.getClass(), "type", 100);
        setField(term66431, term66431.getClass(), "first", term66501);
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
        args[1] = term66339;
        args[2] = term66431;
        try {
            callMethod(klass, "visit", argTypes, term66193, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


