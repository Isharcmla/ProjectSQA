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

public class ReferenceCollectingCallback_visit_872273174494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123064;
     Object term123156;
     Object term123248;

    public ReferenceCollectingCallback_visit_872273174494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123064 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term123156 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term123156, term123156.getClass(), "type", 0);
        term123248 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term123248, term123248.getClass(), "type", 100);
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
        args[1] = term123156;
        args[2] = term123248;
        try {
            callMethod(klass, "visit", argTypes, term123064, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


