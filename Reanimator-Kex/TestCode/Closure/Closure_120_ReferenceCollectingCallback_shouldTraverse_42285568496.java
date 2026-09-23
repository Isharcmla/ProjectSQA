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

public class ReferenceCollectingCallback_shouldTraverse_42285568496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12604;
     Object term12674;
     Object term12744;

    public ReferenceCollectingCallback_shouldTraverse_42285568496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12604 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term12674 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term12744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12814 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12744, term12744.getClass(), "type", 100);
        setField(term12744, term12744.getClass(), "first", term12814);
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
        args[1] = term12674;
        args[2] = term12744;
        try {
            callMethod(klass, "shouldTraverse", argTypes, term12604, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


