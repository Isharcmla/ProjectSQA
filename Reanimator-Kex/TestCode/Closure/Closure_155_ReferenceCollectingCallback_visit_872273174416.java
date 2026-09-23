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

public class ReferenceCollectingCallback_visit_872273174416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100339;
     Object term100479;
     Object term100565;

    public ReferenceCollectingCallback_visit_872273174416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term100393 = new ArrayDeque();
        term100339 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term100339, term100339.getClass(), "blockStack", term100393);
        term100479 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term100479, term100479.getClass(), "type", 98);
        term100565 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term100565, term100565.getClass(), "type", 98);
        setField(term100565, term100565.getClass(), "first", null);
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
        args[1] = term100479;
        args[2] = term100565;
        try {
            callMethod(klass, "visit", argTypes, term100339, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


