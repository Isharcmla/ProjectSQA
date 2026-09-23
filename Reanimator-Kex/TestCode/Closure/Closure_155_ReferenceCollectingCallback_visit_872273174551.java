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

public class ReferenceCollectingCallback_visit_872273174551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140567;
     Object term140707;
     Object term140799;

    public ReferenceCollectingCallback_visit_872273174551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term140621 = new ArrayDeque();
        term140567 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term140567, term140567.getClass(), "blockStack", term140621);
        term140707 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term140707, term140707.getClass(), "type", 98);
        term140799 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term140869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term140799, term140799.getClass(), "type", 98);
        setField(term140799, term140799.getClass(), "first", term140869);
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
        args[1] = term140707;
        args[2] = term140799;
        try {
            callMethod(klass, "visit", argTypes, term140567, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


