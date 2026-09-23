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

public class ReferenceCollectingCallback_visit_872273174336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86241;
     Object term86387;
     Object term86479;

    public ReferenceCollectingCallback_visit_872273174336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term86295 = new ArrayDeque();
        term86241 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term86241, term86241.getClass(), "blockStack", term86295);
        term86387 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term86387, term86387.getClass(), "type", 98);
        term86479 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term86479, term86479.getClass(), "type", 98);
        setField(term86479, term86479.getClass(), "first", null);
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
        args[1] = term86387;
        args[2] = term86479;
        try {
            callMethod(klass, "visit", argTypes, term86241, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


