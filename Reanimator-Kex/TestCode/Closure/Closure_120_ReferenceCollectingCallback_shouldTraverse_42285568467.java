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

public class ReferenceCollectingCallback_shouldTraverse_42285568467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7976;
     Object term8046;
     Object term8313;
     Object term8314;

    public ReferenceCollectingCallback_shouldTraverse_42285568467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7976 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term8046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8046, term8046.getClass(), "type", 100);
        term8313 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term8313, term8313.getClass(), "referenceMap", null);
        setField(term8313, term8313.getClass(), "blockStack", null);
        setField(term8313, term8313.getClass(), "behavior", null);
        setField(term8313, term8313.getClass(), "compiler", null);
        setField(term8313, term8313.getClass(), "varFilter", null);
        term8314 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8314, term8314.getClass(), "type", 100);
        setField(term8314, term8314.getClass(), "next", null);
        setField(term8314, term8314.getClass(), "first", null);
        setField(term8314, term8314.getClass(), "last", null);
        setField(term8314, term8314.getClass(), "propListHead", null);
        setIntField(term8314, term8314.getClass(), "sourcePosition", 0);
        setField(term8314, term8314.getClass(), "jsType", null);
        setField(term8314, term8314.getClass(), "parent", null);
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
        args[2] = term8046;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term7976, args);
        assertTrue(recursiveEquals(term7976, term8313));
        assertTrue(recursiveEquals(term8046, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


