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

public class ReferenceCollectingCallback_visit_872273174214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52882;
     Object term53028;
     Object term53120;

    public ReferenceCollectingCallback_visit_872273174214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term52936 = new ArrayDeque();
        term52882 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term52882, term52882.getClass(), "blockStack", term52936);
        term53028 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term53028, term53028.getClass(), "type", 108);
        term53120 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term53190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53120, term53120.getClass(), "type", 108);
        setField(term53120, term53120.getClass(), "first", term53190);
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
        args[1] = term53028;
        args[2] = term53120;
        try {
            callMethod(klass, "visit", argTypes, term52882, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


