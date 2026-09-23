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

public class ReferenceCollectingCallback_visit_872273174558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143124;
     Object term143270;
     Object term143356;

    public ReferenceCollectingCallback_visit_872273174558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term143178 = new ArrayDeque();
        term143124 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term143124, term143124.getClass(), "blockStack", term143178);
        term143270 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term143270, term143270.getClass(), "type", 98);
        term143356 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term143426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term143356, term143356.getClass(), "type", 98);
        setField(term143356, term143356.getClass(), "first", term143426);
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
        args[1] = term143270;
        args[2] = term143356;
        try {
            callMethod(klass, "visit", argTypes, term143124, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


