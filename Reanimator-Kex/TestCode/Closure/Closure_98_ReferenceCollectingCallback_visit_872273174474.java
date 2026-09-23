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

public class ReferenceCollectingCallback_visit_872273174474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128324;
     Object term128464;
     Object term128556;

    public ReferenceCollectingCallback_visit_872273174474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term128378 = new ArrayDeque();
        term128324 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term128324, term128324.getClass(), "blockStack", term128378);
        term128464 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term128464, term128464.getClass(), "type", 101);
        term128556 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term128626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term128556, term128556.getClass(), "type", 101);
        setField(term128556, term128556.getClass(), "first", term128626);
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
        args[1] = term128464;
        args[2] = term128556;
        try {
            callMethod(klass, "visit", argTypes, term128324, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


