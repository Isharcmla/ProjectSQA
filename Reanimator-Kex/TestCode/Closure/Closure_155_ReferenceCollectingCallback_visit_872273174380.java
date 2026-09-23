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

public class ReferenceCollectingCallback_visit_872273174380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89949;
     Object term90089;
     Object term90175;

    public ReferenceCollectingCallback_visit_872273174380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term90003 = new ArrayDeque();
        term89949 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term89949, term89949.getClass(), "blockStack", term90003);
        term90089 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term90089, term90089.getClass(), "type", 108);
        term90175 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term90175, term90175.getClass(), "type", 108);
        setField(term90175, term90175.getClass(), "first", null);
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
        args[1] = term90089;
        args[2] = term90175;
        try {
            callMethod(klass, "visit", argTypes, term89949, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


