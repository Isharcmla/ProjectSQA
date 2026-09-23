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

public class ReferenceCollectingCallback_visit_872273174462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124571;
     Object term124711;
     Object term124803;

    public ReferenceCollectingCallback_visit_872273174462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term124625 = new ArrayDeque();
        term124571 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term124571, term124571.getClass(), "blockStack", term124625);
        term124711 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term124711, term124711.getClass(), "type", 98);
        term124803 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term124873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term124803, term124803.getClass(), "type", 98);
        setField(term124803, term124803.getClass(), "first", term124873);
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
        args[1] = term124711;
        args[2] = term124803;
        try {
            callMethod(klass, "visit", argTypes, term124571, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


