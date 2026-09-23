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

public class ReferenceCollectingCallback_shouldTraverse_422855684211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39869;
     Object term39939;
     Object term40009;

    public ReferenceCollectingCallback_shouldTraverse_422855684211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39869 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term39939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term40009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40009, term40009.getClass(), "type", 98);
        setField(term40009, term40009.getClass(), "first", term40079);
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
        args[1] = term39939;
        args[2] = term40009;
        try {
            callMethod(klass, "shouldTraverse", argTypes, term39869, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


