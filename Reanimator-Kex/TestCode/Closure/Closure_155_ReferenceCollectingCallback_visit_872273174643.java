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

public class ReferenceCollectingCallback_visit_872273174643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168723;
     Object term168863;
     Object term168955;

    public ReferenceCollectingCallback_visit_872273174643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term168777 = new ArrayDeque();
        term168723 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term168723, term168723.getClass(), "blockStack", term168777);
        term168863 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term168863, term168863.getClass(), "type", 100);
        term168955 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term169025 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term168955, term168955.getClass(), "type", 100);
        setField(term168955, term168955.getClass(), "first", term169025);
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
        args[1] = term168863;
        args[2] = term168955;
        try {
            callMethod(klass, "visit", argTypes, term168723, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


