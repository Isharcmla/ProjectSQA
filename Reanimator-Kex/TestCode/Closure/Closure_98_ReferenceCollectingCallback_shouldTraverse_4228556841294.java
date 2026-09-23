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

public class ReferenceCollectingCallback_shouldTraverse_4228556841294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term394111;
     Object term394203;
     Object term394289;

    public ReferenceCollectingCallback_shouldTraverse_4228556841294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term394111 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term394203 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term394203, term394203.getClass(), "type", 111);
        term394289 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term394289, term394289.getClass(), "type", 12);
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
        args[1] = term394203;
        args[2] = term394289;
        try {
            callMethod(klass, "shouldTraverse", argTypes, term394111, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


