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

public class ReferenceCollectingCallback_visit_87227317481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14323;
     Object term14393;
     Object term14463;

    public ReferenceCollectingCallback_visit_87227317481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14323 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term14393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14393, term14393.getClass(), "type", 111);
        term14463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14463, term14463.getClass(), "type", 111);
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
        args[1] = term14393;
        args[2] = term14463;
        try {
            callMethod(klass, "visit", argTypes, term14323, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


