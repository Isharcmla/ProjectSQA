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
import java.util.ArrayDeque;
import java.lang.Object;

public class ReferenceCollectingCallback_shouldTraverse_422855684768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205148;
     Object term205272;

    public ReferenceCollectingCallback_shouldTraverse_422855684768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term205202 = new ArrayDeque();
        term205148 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term205148, term205148.getClass(), "blockStack", term205202);
        term205272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term205342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term205272, term205272.getClass(), "type", 98);
        setField(term205272, term205272.getClass(), "first", term205342);
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
        args[1] = null;
        args[2] = term205272;
        try {
            callMethod(klass, "shouldTraverse", argTypes, term205148, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


