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

public class ReferenceCollectingCallback_visit_872273174298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61734;
     Object term61826;
     Object term61918;

    public ReferenceCollectingCallback_visit_872273174298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61734 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term61826 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term61826, term61826.getClass(), "type", 101);
        term61918 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term61918, term61918.getClass(), "type", 101);
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
        args[1] = term61826;
        args[2] = term61918;
        try {
            callMethod(klass, "visit", argTypes, term61734, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


