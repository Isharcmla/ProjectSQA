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

public class ReferenceCollectingCallback_visit_872273174631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171775;
     Object term171921;
     Object term172007;

    public ReferenceCollectingCallback_visit_872273174631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term171829 = new ArrayDeque();
        term171775 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term171775, term171775.getClass(), "blockStack", term171829);
        term171921 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term171921, term171921.getClass(), "type", 98);
        term172007 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term172077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term172007, term172007.getClass(), "type", 98);
        setField(term172007, term172007.getClass(), "first", term172077);
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
        args[1] = term171921;
        args[2] = term172007;
        try {
            callMethod(klass, "visit", argTypes, term171775, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


