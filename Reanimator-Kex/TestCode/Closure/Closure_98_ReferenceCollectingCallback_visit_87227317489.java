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

public class ReferenceCollectingCallback_visit_87227317489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18606;
     Object term18676;
     Object term18746;

    public ReferenceCollectingCallback_visit_87227317489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18606 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term18676 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18676, term18676.getClass(), "type", 77);
        term18746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18746, term18746.getClass(), "type", 77);
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
        args[1] = term18676;
        args[2] = term18746;
        try {
            callMethod(klass, "visit", argTypes, term18606, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


