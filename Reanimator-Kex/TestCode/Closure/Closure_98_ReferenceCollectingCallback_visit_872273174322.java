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

public class ReferenceCollectingCallback_visit_872273174322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82284;
     Object term82424;
     Object term82510;

    public ReferenceCollectingCallback_visit_872273174322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term82338 = new ArrayDeque();
        term82284 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term82284, term82284.getClass(), "blockStack", term82338);
        term82424 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term82424, term82424.getClass(), "type", 98);
        term82510 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term82510, term82510.getClass(), "type", 98);
        setField(term82510, term82510.getClass(), "first", null);
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
        args[1] = term82424;
        args[2] = term82510;
        try {
            callMethod(klass, "visit", argTypes, term82284, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


