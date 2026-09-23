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
     Object term13062;
     Object term13132;
     Object term13686;
     Object term13687;

    public ReferenceCollectingCallback_shouldTraverse_42285568467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13062 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term13132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13132, term13132.getClass(), "type", 108);
        term13686 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term13686, term13686.getClass(), "referenceMap", null);
        setField(term13686, term13686.getClass(), "blockStack", null);
        setField(term13686, term13686.getClass(), "behavior", null);
        setField(term13686, term13686.getClass(), "compiler", null);
        setField(term13686, term13686.getClass(), "varFilter", null);
        term13687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13687, term13687.getClass(), "type", 108);
        setField(term13687, term13687.getClass(), "next", null);
        setField(term13687, term13687.getClass(), "first", null);
        setField(term13687, term13687.getClass(), "last", null);
        setField(term13687, term13687.getClass(), "propListHead", null);
        setIntField(term13687, term13687.getClass(), "sourcePosition", 0);
        setField(term13687, term13687.getClass(), "jsType", null);
        setField(term13687, term13687.getClass(), "parent", null);
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
        args[2] = term13132;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term13062, args);
        assertTrue(recursiveEquals(term13062, term13686));
        assertTrue(recursiveEquals(term13132, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


