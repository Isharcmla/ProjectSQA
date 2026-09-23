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

public class ReferenceCollectingCallback_shouldTraverse_422855684671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180226;
     Object term180318;
     Object term180648;
     Object term180649;

    public ReferenceCollectingCallback_shouldTraverse_422855684671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180226 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term180318 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term180318, term180318.getClass(), "type", 100);
        term180648 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term180648, term180648.getClass(), "referenceMap", null);
        setField(term180648, term180648.getClass(), "blockStack", null);
        setField(term180648, term180648.getClass(), "behavior", null);
        setField(term180648, term180648.getClass(), "compiler", null);
        setField(term180648, term180648.getClass(), "varFilter", null);
        term180649 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term180649, term180649.getClass(), "str", null);
        setIntField(term180649, term180649.getClass(), "type", 100);
        setField(term180649, term180649.getClass(), "next", null);
        setField(term180649, term180649.getClass(), "first", null);
        setField(term180649, term180649.getClass(), "last", null);
        setField(term180649, term180649.getClass(), "propListHead", null);
        setIntField(term180649, term180649.getClass(), "sourcePosition", 0);
        setField(term180649, term180649.getClass(), "jsType", null);
        setField(term180649, term180649.getClass(), "parent", null);
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
        args[2] = term180318;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term180226, args);
        assertTrue(recursiveEquals(term180226, term180648));
        assertTrue(recursiveEquals(term180318, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


