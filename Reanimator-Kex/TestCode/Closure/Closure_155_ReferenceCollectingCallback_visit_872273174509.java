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

public class ReferenceCollectingCallback_visit_872273174509 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127628;
     Object term127768;
     Object term127854;

    public ReferenceCollectingCallback_visit_872273174509() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term127682 = new ArrayDeque();
        term127628 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term127628, term127628.getClass(), "blockStack", term127682);
        term127768 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term127768, term127768.getClass(), "type", 101);
        term127854 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term127854, term127854.getClass(), "type", 101);
        setField(term127854, term127854.getClass(), "first", null);
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
        args[1] = term127768;
        args[2] = term127854;
        try {
            callMethod(klass, "visit", argTypes, term127628, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


