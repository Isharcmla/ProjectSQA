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

public class ReferenceCollectingCallback_shouldTraverse_422855684862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222795;
     Object term222881;
     Object term222967;

    public ReferenceCollectingCallback_shouldTraverse_422855684862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222795 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term222881 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term222967 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term223053 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term222967, term222967.getClass(), "type", 101);
        setField(term222967, term222967.getClass(), "first", term223053);
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
        args[1] = term222881;
        args[2] = term222967;
        try {
            callMethod(klass, "shouldTraverse", argTypes, term222795, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


