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

public class ReferenceCollectingCallback_visit_872273174747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199115;
     Object term199261;
     Object term199353;

    public ReferenceCollectingCallback_visit_872273174747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term199169 = new ArrayDeque();
        term199115 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term199115, term199115.getClass(), "blockStack", term199169);
        term199261 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term199261, term199261.getClass(), "type", 98);
        term199353 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term199423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term199353, term199353.getClass(), "type", 98);
        setField(term199353, term199353.getClass(), "first", term199423);
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
        args[1] = term199261;
        args[2] = term199353;
        try {
            callMethod(klass, "visit", argTypes, term199115, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


