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

public class ReferenceCollectingCallback_visit_872273174230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55349;
     Object term55495;
     Object term55587;

    public ReferenceCollectingCallback_visit_872273174230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term55403 = new ArrayDeque();
        term55349 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term55349, term55349.getClass(), "blockStack", term55403);
        term55495 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term55495, term55495.getClass(), "type", 100);
        term55587 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term55587, term55587.getClass(), "type", 100);
        setField(term55587, term55587.getClass(), "first", null);
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
        args[1] = term55495;
        args[2] = term55587;
        try {
            callMethod(klass, "visit", argTypes, term55349, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


