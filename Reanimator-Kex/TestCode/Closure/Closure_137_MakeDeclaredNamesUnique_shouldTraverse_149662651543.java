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
import java.util.ArrayDeque;

public class MakeDeclaredNamesUnique_shouldTraverse_149662651543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7350;
     Object term7474;

    public MakeDeclaredNamesUnique_shouldTraverse_149662651543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term7404 = new ArrayDeque();
        term7350 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        setField(term7350, term7350.getClass(), "nameStack", term7404);
        term7474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7474, term7474.getClass(), "type", 120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term7474;
        args[2] = null;
        try {
            callMethod(klass, "shouldTraverse", argTypes, term7350, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


