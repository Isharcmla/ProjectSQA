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

public class ReferenceCollectingCallback_shouldTraverse_422855684605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165138;
     Object term165208;
     Object term165278;

    public ReferenceCollectingCallback_shouldTraverse_422855684605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165138 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term165208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term165278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term165348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term165278, term165278.getClass(), "type", 98);
        setField(term165278, term165278.getClass(), "first", term165348);
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
        args[1] = term165208;
        args[2] = term165278;
        try {
            callMethod(klass, "shouldTraverse", argTypes, term165138, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


