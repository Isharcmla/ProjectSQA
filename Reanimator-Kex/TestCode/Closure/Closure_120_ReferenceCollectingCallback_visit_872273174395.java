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

public class ReferenceCollectingCallback_visit_872273174395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91382;
     Object term91472;
     Object term91564;

    public ReferenceCollectingCallback_visit_872273174395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91382 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term91472 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term91564 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term91564, term91564.getClass(), "type", 38);
        setField(term91564, term91564.getClass(), "str", " ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term91472;
        args[1] = term91564;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term91382, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


