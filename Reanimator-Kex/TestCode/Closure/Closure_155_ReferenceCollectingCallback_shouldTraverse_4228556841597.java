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

public class ReferenceCollectingCallback_shouldTraverse_4228556841597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term485361;
     Object term485447;
     Object term485533;

    public ReferenceCollectingCallback_shouldTraverse_4228556841597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term485361 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term485447 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term485533 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term485619 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term485533, term485533.getClass(), "type", 108);
        setField(term485533, term485533.getClass(), "first", term485619);
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
        args[1] = term485447;
        args[2] = term485533;
        try {
            callMethod(klass, "shouldTraverse", argTypes, term485361, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


