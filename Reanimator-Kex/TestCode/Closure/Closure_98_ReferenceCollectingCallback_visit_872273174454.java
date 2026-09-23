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

public class ReferenceCollectingCallback_visit_872273174454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122276;
     Object term122422;
     Object term122514;

    public ReferenceCollectingCallback_visit_872273174454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term122330 = new ArrayDeque();
        term122276 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term122276, term122276.getClass(), "blockStack", term122330);
        term122422 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term122422, term122422.getClass(), "type", 100);
        term122514 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term122514, term122514.getClass(), "type", 100);
        setField(term122514, term122514.getClass(), "first", null);
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
        args[1] = term122422;
        args[2] = term122514;
        try {
            callMethod(klass, "visit", argTypes, term122276, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


