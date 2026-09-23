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

public class ReferenceCollectingCallback_visit_872273174297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75207;
     Object term75347;
     Object term75439;

    public ReferenceCollectingCallback_visit_872273174297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term75261 = new ArrayDeque();
        term75207 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term75207, term75207.getClass(), "blockStack", term75261);
        term75347 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term75347, term75347.getClass(), "type", 98);
        term75439 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term75509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term75439, term75439.getClass(), "type", 98);
        setField(term75439, term75439.getClass(), "first", term75509);
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
        args[1] = term75347;
        args[2] = term75439;
        try {
            callMethod(klass, "visit", argTypes, term75207, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


