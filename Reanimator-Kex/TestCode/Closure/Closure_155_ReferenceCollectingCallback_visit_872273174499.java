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

public class ReferenceCollectingCallback_visit_872273174499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124451;
     Object term124597;
     Object term124683;

    public ReferenceCollectingCallback_visit_872273174499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term124505 = new ArrayDeque();
        term124451 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term124451, term124451.getClass(), "blockStack", term124505);
        term124597 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term124597, term124597.getClass(), "type", 98);
        term124683 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term124753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term124683, term124683.getClass(), "type", 98);
        setField(term124683, term124683.getClass(), "first", term124753);
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
        args[1] = term124597;
        args[2] = term124683;
        try {
            callMethod(klass, "visit", argTypes, term124451, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


