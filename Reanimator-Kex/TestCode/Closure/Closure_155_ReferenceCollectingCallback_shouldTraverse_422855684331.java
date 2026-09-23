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

public class ReferenceCollectingCallback_shouldTraverse_422855684331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76179;
     Object term76249;
     Object term76319;

    public ReferenceCollectingCallback_shouldTraverse_422855684331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76179 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term76249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term76319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term76319, term76319.getClass(), "type", 100);
        setField(term76319, term76319.getClass(), "first", term76389);
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
        args[1] = term76249;
        args[2] = term76319;
        try {
            callMethod(klass, "shouldTraverse", argTypes, term76179, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


