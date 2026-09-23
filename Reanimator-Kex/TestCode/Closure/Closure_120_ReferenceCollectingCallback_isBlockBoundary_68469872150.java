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

public class ReferenceCollectingCallback_isBlockBoundary_68469872150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5960;
     Object term6052;
     Object term6273;
     Object term6274;

    public ReferenceCollectingCallback_isBlockBoundary_68469872150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5960 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term6052 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term6052, term6052.getClass(), "type", 12);
        term6273 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term6273, term6273.getClass(), "str", null);
        setIntField(term6273, term6273.getClass(), "type", 12);
        setField(term6273, term6273.getClass(), "next", null);
        setField(term6273, term6273.getClass(), "first", null);
        setField(term6273, term6273.getClass(), "last", null);
        setField(term6273, term6273.getClass(), "propListHead", null);
        setIntField(term6273, term6273.getClass(), "sourcePosition", 0);
        setField(term6273, term6273.getClass(), "jsType", null);
        setField(term6273, term6273.getClass(), "parent", null);
        term6274 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term6274, term6274.getClass(), "str", null);
        setIntField(term6274, term6274.getClass(), "type", 0);
        setField(term6274, term6274.getClass(), "next", null);
        setField(term6274, term6274.getClass(), "first", null);
        setField(term6274, term6274.getClass(), "last", null);
        setField(term6274, term6274.getClass(), "propListHead", null);
        setIntField(term6274, term6274.getClass(), "sourcePosition", 0);
        setField(term6274, term6274.getClass(), "jsType", null);
        setField(term6274, term6274.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term5960;
        args[1] = term6052;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term5960, term6273));
        assertTrue(recursiveEquals(term6052, term6274));
        assertTrue(recursiveEquals(retValue, false));
    }

};


