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

public class ReferenceCollectingCallback_visit_872273174743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198101;
     Object term198247;
     Object term198339;

    public ReferenceCollectingCallback_visit_872273174743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term198155 = new ArrayDeque();
        term198101 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term198101, term198101.getClass(), "blockStack", term198155);
        term198247 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term198247, term198247.getClass(), "type", 108);
        term198339 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term198409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term198339, term198339.getClass(), "type", 108);
        setField(term198339, term198339.getClass(), "first", term198409);
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
        args[1] = term198247;
        args[2] = term198339;
        try {
            callMethod(klass, "visit", argTypes, term198101, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


