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

public class ReferenceCollectingCallback_shouldTraverse_422855684674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180783;
     Object term180875;
     Object term180904;
     Object term180905;

    public ReferenceCollectingCallback_shouldTraverse_422855684674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180783 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term180875 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term180875, term180875.getClass(), "type", 98);
        term180904 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term180904, term180904.getClass(), "referenceMap", null);
        setField(term180904, term180904.getClass(), "blockStack", null);
        setField(term180904, term180904.getClass(), "behavior", null);
        setField(term180904, term180904.getClass(), "compiler", null);
        setField(term180904, term180904.getClass(), "varFilter", null);
        term180905 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term180905, term180905.getClass(), "str", null);
        setIntField(term180905, term180905.getClass(), "type", 98);
        setField(term180905, term180905.getClass(), "next", null);
        setField(term180905, term180905.getClass(), "first", null);
        setField(term180905, term180905.getClass(), "last", null);
        setField(term180905, term180905.getClass(), "propListHead", null);
        setIntField(term180905, term180905.getClass(), "sourcePosition", 0);
        setField(term180905, term180905.getClass(), "jsType", null);
        setField(term180905, term180905.getClass(), "parent", null);
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
        args[2] = term180875;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term180783, args);
        assertTrue(recursiveEquals(term180783, term180904));
        assertTrue(recursiveEquals(term180875, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


