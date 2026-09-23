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

public class ReferenceCollectingCallback_visit_872273174226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56763;
     Object term56909;
     Object term57001;

    public ReferenceCollectingCallback_visit_872273174226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term56817 = new ArrayDeque();
        term56763 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term56763, term56763.getClass(), "blockStack", term56817);
        term56909 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term56909, term56909.getClass(), "type", 100);
        term57001 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term57001, term57001.getClass(), "type", 100);
        setField(term57001, term57001.getClass(), "first", null);
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
        args[1] = term56909;
        args[2] = term57001;
        try {
            callMethod(klass, "visit", argTypes, term56763, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


