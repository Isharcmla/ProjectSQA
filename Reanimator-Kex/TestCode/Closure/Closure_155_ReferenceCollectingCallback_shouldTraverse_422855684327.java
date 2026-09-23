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

public class ReferenceCollectingCallback_shouldTraverse_422855684327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75561;
     Object term75631;
     Object term75642;
     Object term75643;

    public ReferenceCollectingCallback_shouldTraverse_422855684327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75561 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term75631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term75631, term75631.getClass(), "type", 108);
        term75642 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term75642, term75642.getClass(), "referenceMap", null);
        setField(term75642, term75642.getClass(), "blockStack", null);
        setField(term75642, term75642.getClass(), "behavior", null);
        setField(term75642, term75642.getClass(), "compiler", null);
        setField(term75642, term75642.getClass(), "varFilter", null);
        term75643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term75643, term75643.getClass(), "type", 108);
        setField(term75643, term75643.getClass(), "next", null);
        setField(term75643, term75643.getClass(), "first", null);
        setField(term75643, term75643.getClass(), "last", null);
        setField(term75643, term75643.getClass(), "propListHead", null);
        setIntField(term75643, term75643.getClass(), "sourcePosition", 0);
        setField(term75643, term75643.getClass(), "jsType", null);
        setField(term75643, term75643.getClass(), "parent", null);
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
        args[1] = null;
        args[2] = term75631;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term75561, args);
        assertTrue(recursiveEquals(term75561, term75642));
        assertTrue(recursiveEquals(term75631, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


