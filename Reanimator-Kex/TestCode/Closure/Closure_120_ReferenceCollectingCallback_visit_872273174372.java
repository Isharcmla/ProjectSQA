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

public class ReferenceCollectingCallback_visit_872273174372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82925;
     Object term83071;
     Object term83163;

    public ReferenceCollectingCallback_visit_872273174372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term82979 = new ArrayDeque();
        term82925 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term82925, term82925.getClass(), "blockStack", term82979);
        term83071 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term83071, term83071.getClass(), "type", 101);
        term83163 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term83163, term83163.getClass(), "type", 101);
        setField(term83163, term83163.getClass(), "first", null);
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
        args[1] = term83071;
        args[2] = term83163;
        try {
            callMethod(klass, "visit", argTypes, term82925, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


