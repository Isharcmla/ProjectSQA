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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class ReferenceCollectingCallback_shouldTraverse_4228556841052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292375;
     Object term292445;
     Object term293185;
     Object term293186;

    public ReferenceCollectingCallback_shouldTraverse_4228556841052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292375 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term292445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term293185 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term293185, term293185.getClass(), "referenceMap", null);
        setField(term293185, term293185.getClass(), "blockStack", null);
        setField(term293185, term293185.getClass(), "behavior", null);
        setField(term293185, term293185.getClass(), "compiler", null);
        setField(term293185, term293185.getClass(), "varFilter", null);
        term293186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term293186, term293186.getClass(), "type", 0);
        setField(term293186, term293186.getClass(), "next", null);
        setField(term293186, term293186.getClass(), "first", null);
        setField(term293186, term293186.getClass(), "last", null);
        setField(term293186, term293186.getClass(), "propListHead", null);
        setIntField(term293186, term293186.getClass(), "sourcePosition", 0);
        setField(term293186, term293186.getClass(), "jsType", null);
        setField(term293186, term293186.getClass(), "parent", null);
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
        args[1] = term292445;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term292375, args);
        assertTrue(recursiveEquals(term292375, term293185));
        assertTrue(recursiveEquals(term292445, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


