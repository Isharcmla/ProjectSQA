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

public class ReferenceCollectingCallback_visit_87227317425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3853;
     Object term3945;
     Object term4037;
     Object term4415;
     Object term4416;
     Object term4417;

    public ReferenceCollectingCallback_visit_87227317425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3853 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term3945 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3945, term3945.getClass(), "type", -39);
        term4037 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term4415 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term4415, term4415.getClass(), "referenceMap", null);
        setField(term4415, term4415.getClass(), "blockStack", null);
        setField(term4415, term4415.getClass(), "behavior", null);
        setField(term4415, term4415.getClass(), "compiler", null);
        setField(term4415, term4415.getClass(), "varFilter", null);
        term4416 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4416, term4416.getClass(), "str", null);
        setIntField(term4416, term4416.getClass(), "type", -39);
        setField(term4416, term4416.getClass(), "next", null);
        setField(term4416, term4416.getClass(), "first", null);
        setField(term4416, term4416.getClass(), "last", null);
        setField(term4416, term4416.getClass(), "propListHead", null);
        setIntField(term4416, term4416.getClass(), "sourcePosition", 0);
        setField(term4416, term4416.getClass(), "jsType", null);
        setField(term4416, term4416.getClass(), "parent", null);
        term4417 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4417, term4417.getClass(), "str", null);
        setIntField(term4417, term4417.getClass(), "type", 0);
        setField(term4417, term4417.getClass(), "next", null);
        setField(term4417, term4417.getClass(), "first", null);
        setField(term4417, term4417.getClass(), "last", null);
        setField(term4417, term4417.getClass(), "propListHead", null);
        setIntField(term4417, term4417.getClass(), "sourcePosition", 0);
        setField(term4417, term4417.getClass(), "jsType", null);
        setField(term4417, term4417.getClass(), "parent", null);
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
        args[1] = term3945;
        args[2] = term4037;
        callMethod(klass, "visit", argTypes, term3853, args);
        assertTrue(recursiveEquals(term3853, term4415));
        assertTrue(recursiveEquals(term3945, term4417));
        assertTrue(recursiveEquals(term4037, null));
    }

};


