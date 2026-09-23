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

public class ReferenceCollectingCallback_shouldTraverse_42285568450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6944;
     Object term7014;
     Object term7084;

    public ReferenceCollectingCallback_shouldTraverse_42285568450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6944 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term7014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7014, term7014.getClass(), "type", 111);
        term7084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7084, term7084.getClass(), "type", 111);
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
        args[1] = term7014;
        args[2] = term7084;
        try {
            callMethod(klass, "shouldTraverse", argTypes, term6944, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


