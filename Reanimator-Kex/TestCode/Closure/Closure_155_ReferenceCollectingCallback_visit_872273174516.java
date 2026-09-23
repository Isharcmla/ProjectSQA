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

public class ReferenceCollectingCallback_visit_872273174516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129853;
     Object term129999;
     Object term130091;

    public ReferenceCollectingCallback_visit_872273174516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term129907 = new ArrayDeque();
        term129853 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term129853, term129853.getClass(), "blockStack", term129907);
        term129999 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term129999, term129999.getClass(), "type", 108);
        term130091 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term130091, term130091.getClass(), "type", 108);
        setField(term130091, term130091.getClass(), "first", null);
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
        args[1] = term129999;
        args[2] = term130091;
        try {
            callMethod(klass, "visit", argTypes, term129853, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


