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

public class ReferenceCollectingCallback_visit_872273174305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63483;
     Object term63629;
     Object term63721;

    public ReferenceCollectingCallback_visit_872273174305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term63537 = new ArrayDeque();
        term63483 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term63483, term63483.getClass(), "blockStack", term63537);
        term63629 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term63629, term63629.getClass(), "type", 101);
        term63721 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term63721, term63721.getClass(), "type", 101);
        setField(term63721, term63721.getClass(), "first", null);
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
        args[1] = term63629;
        args[2] = term63721;
        try {
            callMethod(klass, "visit", argTypes, term63483, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


