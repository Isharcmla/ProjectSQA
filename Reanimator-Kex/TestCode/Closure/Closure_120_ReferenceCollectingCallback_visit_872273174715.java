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

public class ReferenceCollectingCallback_visit_872273174715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253630;
     Object term253776;
     Object term253868;

    public ReferenceCollectingCallback_visit_872273174715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term253684 = new ArrayDeque();
        term253630 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term253630, term253630.getClass(), "blockStack", term253684);
        term253776 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term253776, term253776.getClass(), "type", 108);
        term253868 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term253938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term253868, term253868.getClass(), "type", 108);
        setField(term253868, term253868.getClass(), "first", term253938);
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
        args[1] = term253776;
        args[2] = term253868;
        try {
            callMethod(klass, "visit", argTypes, term253630, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


