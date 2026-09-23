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

public class ReferenceCollectingCallback_visit_872273174616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168230;
     Object term168322;
     Object term168414;

    public ReferenceCollectingCallback_visit_872273174616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168230 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term168322 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term168322, term168322.getClass(), "type", 0);
        term168414 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term168414, term168414.getClass(), "type", 98);
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
        args[1] = term168322;
        args[2] = term168414;
        try {
            callMethod(klass, "visit", argTypes, term168230, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


