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

public class ReferenceCollectingCallback_visit_872273174390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102564;
     Object term102650;
     Object term102742;

    public ReferenceCollectingCallback_visit_872273174390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102564 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term102650 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term102650, term102650.getClass(), "type", 0);
        term102742 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term102742, term102742.getClass(), "type", 98);
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
        args[1] = term102650;
        args[2] = term102742;
        try {
            callMethod(klass, "visit", argTypes, term102564, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


