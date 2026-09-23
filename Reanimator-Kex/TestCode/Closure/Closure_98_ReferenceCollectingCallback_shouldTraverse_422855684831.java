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
import java.lang.Object;

public class ReferenceCollectingCallback_shouldTraverse_422855684831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218022;
     Object term218092;
     Object term218162;

    public ReferenceCollectingCallback_shouldTraverse_422855684831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term218022 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term218092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term218162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term218232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term218162, term218162.getClass(), "type", 100);
        setField(term218162, term218162.getClass(), "first", term218232);
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
        args[1] = term218092;
        args[2] = term218162;
        try {
            callMethod(klass, "shouldTraverse", argTypes, term218022, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


