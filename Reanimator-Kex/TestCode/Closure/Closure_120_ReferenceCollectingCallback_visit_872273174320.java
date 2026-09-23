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

public class ReferenceCollectingCallback_visit_872273174320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67944;
     Object term68090;
     Object term68182;

    public ReferenceCollectingCallback_visit_872273174320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term67998 = new ArrayDeque();
        term67944 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term67944, term67944.getClass(), "blockStack", term67998);
        term68090 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term68090, term68090.getClass(), "type", 108);
        term68182 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term68182, term68182.getClass(), "type", 108);
        setField(term68182, term68182.getClass(), "first", null);
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
        args[1] = term68090;
        args[2] = term68182;
        try {
            callMethod(klass, "visit", argTypes, term67944, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


