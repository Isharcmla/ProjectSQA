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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ReferenceCollectingCallback_visit_872273174403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96576;
     Object term96668;
     Object term96760;

    public ReferenceCollectingCallback_visit_872273174403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96576 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term96668 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term96668, term96668.getClass(), "type", 111);
        term96760 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term96760, term96760.getClass(), "type", 12);
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
        args[1] = term96668;
        args[2] = term96760;
        try {
            callMethod(klass, "visit", argTypes, term96576, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


