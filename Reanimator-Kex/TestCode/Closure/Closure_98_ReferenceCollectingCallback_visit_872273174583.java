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

public class ReferenceCollectingCallback_visit_872273174583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157633;
     Object term157779;
     Object term157865;

    public ReferenceCollectingCallback_visit_872273174583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term157687 = new ArrayDeque();
        term157633 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term157633, term157633.getClass(), "blockStack", term157687);
        term157779 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term157779, term157779.getClass(), "type", 101);
        term157865 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term157935 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term157865, term157865.getClass(), "type", 101);
        setField(term157865, term157865.getClass(), "first", term157935);
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
        args[1] = term157779;
        args[2] = term157865;
        try {
            callMethod(klass, "visit", argTypes, term157633, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


