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

public class ReferenceCollectingCallback_visit_872273174576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148397;
     Object term148543;
     Object term148635;

    public ReferenceCollectingCallback_visit_872273174576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term148451 = new ArrayDeque();
        term148397 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term148397, term148397.getClass(), "blockStack", term148451);
        term148543 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term148543, term148543.getClass(), "type", 101);
        term148635 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term148705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term148635, term148635.getClass(), "type", 101);
        setField(term148635, term148635.getClass(), "first", term148705);
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
        args[1] = term148543;
        args[2] = term148635;
        try {
            callMethod(klass, "visit", argTypes, term148397, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


