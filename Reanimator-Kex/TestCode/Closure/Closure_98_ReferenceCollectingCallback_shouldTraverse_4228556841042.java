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
import java.lang.Object;

public class ReferenceCollectingCallback_shouldTraverse_4228556841042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289404;
     Object term289474;
     Object term289544;

    public ReferenceCollectingCallback_shouldTraverse_4228556841042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289404 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term289474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term289544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term289614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term289544, term289544.getClass(), "type", 101);
        setField(term289544, term289544.getClass(), "first", term289614);
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
        args[1] = term289474;
        args[2] = term289544;
        try {
            callMethod(klass, "shouldTraverse", argTypes, term289404, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


