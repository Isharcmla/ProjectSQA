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

public class ReferenceCollectingCallback_shouldTraverse_4228556841043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266335;
     Object term266427;
     Object term266439;
     Object term266440;

    public ReferenceCollectingCallback_shouldTraverse_4228556841043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term266335 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term266427 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term266427, term266427.getClass(), "type", 98);
        term266439 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term266439, term266439.getClass(), "referenceMap", null);
        setField(term266439, term266439.getClass(), "blockStack", null);
        setField(term266439, term266439.getClass(), "behavior", null);
        setField(term266439, term266439.getClass(), "compiler", null);
        setField(term266439, term266439.getClass(), "varFilter", null);
        term266440 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term266440, term266440.getClass(), "number", 0.0);
        setIntField(term266440, term266440.getClass(), "type", 98);
        setField(term266440, term266440.getClass(), "next", null);
        setField(term266440, term266440.getClass(), "first", null);
        setField(term266440, term266440.getClass(), "last", null);
        setField(term266440, term266440.getClass(), "propListHead", null);
        setIntField(term266440, term266440.getClass(), "sourcePosition", 0);
        setField(term266440, term266440.getClass(), "jsType", null);
        setField(term266440, term266440.getClass(), "parent", null);
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
        args[2] = term266427;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term266335, args);
        assertTrue(recursiveEquals(term266335, term266439));
        assertTrue(recursiveEquals(term266427, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


