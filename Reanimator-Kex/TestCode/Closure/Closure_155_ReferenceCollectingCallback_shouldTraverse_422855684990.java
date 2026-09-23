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

public class ReferenceCollectingCallback_shouldTraverse_422855684990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252381;
     Object term252473;
     Object term252565;

    public ReferenceCollectingCallback_shouldTraverse_422855684990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term252381 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term252473 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term252565 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term252657 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term252565, term252565.getClass(), "type", 100);
        setField(term252565, term252565.getClass(), "first", term252657);
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
        args[1] = term252473;
        args[2] = term252565;
        try {
            callMethod(klass, "shouldTraverse", argTypes, term252381, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


