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

public class ReferenceCollectingCallback_visit_872273174478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129327;
     Object term129473;
     Object term129559;

    public ReferenceCollectingCallback_visit_872273174478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term129381 = new ArrayDeque();
        term129327 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term129327, term129327.getClass(), "blockStack", term129381);
        term129473 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term129473, term129473.getClass(), "type", 98);
        term129559 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term129629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term129559, term129559.getClass(), "type", 98);
        setField(term129559, term129559.getClass(), "first", term129629);
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
        args[1] = term129473;
        args[2] = term129559;
        try {
            callMethod(klass, "visit", argTypes, term129327, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


