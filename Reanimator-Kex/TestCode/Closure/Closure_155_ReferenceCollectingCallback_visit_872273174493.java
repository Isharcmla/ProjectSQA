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

public class ReferenceCollectingCallback_visit_872273174493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122621;
     Object term122767;
     Object term122853;

    public ReferenceCollectingCallback_visit_872273174493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term122675 = new ArrayDeque();
        term122621 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term122621, term122621.getClass(), "blockStack", term122675);
        term122767 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term122767, term122767.getClass(), "type", 100);
        term122853 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term122923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term122853, term122853.getClass(), "type", 100);
        setField(term122853, term122853.getClass(), "first", term122923);
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
        args[1] = term122767;
        args[2] = term122853;
        try {
            callMethod(klass, "visit", argTypes, term122621, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


