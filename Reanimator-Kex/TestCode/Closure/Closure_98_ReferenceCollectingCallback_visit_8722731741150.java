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

public class ReferenceCollectingCallback_visit_8722731741150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337137;
     Object term337227;
     Object term337319;

    public ReferenceCollectingCallback_visit_8722731741150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term337137 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term337227 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term337319 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term337319, term337319.getClass(), "type", 38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term337227;
        args[1] = term337319;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term337137, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


