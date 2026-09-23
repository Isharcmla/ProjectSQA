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
import java.util.ArrayDeque;

public class ReferenceCollectingCallback_shouldTraverse_422855684854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220490;
     Object term220614;
     Object term220684;
     Object term221458;
     Object term221462;
     Object term221463;

    public ReferenceCollectingCallback_shouldTraverse_422855684854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term220544 = new ArrayDeque();
        term220490 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term220490, term220490.getClass(), "blockStack", term220544);
        term220614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term220614, term220614.getClass(), "type", 111);
        term220684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term220684, term220684.getClass(), "type", 111);
        ArrayDeque term221459 = new ArrayDeque();
        term221458 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term221458, term221458.getClass(), "referenceMap", null);
        setField(term221458, term221458.getClass(), "blockStack", term221459);
        setField(term221458, term221458.getClass(), "behavior", null);
        setField(term221458, term221458.getClass(), "compiler", null);
        setField(term221458, term221458.getClass(), "varFilter", null);
        term221462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term221462, term221462.getClass(), "type", 111);
        setField(term221462, term221462.getClass(), "next", null);
        setField(term221462, term221462.getClass(), "first", null);
        setField(term221462, term221462.getClass(), "last", null);
        setField(term221462, term221462.getClass(), "propListHead", null);
        setIntField(term221462, term221462.getClass(), "sourcePosition", 0);
        setField(term221462, term221462.getClass(), "jsType", null);
        setField(term221462, term221462.getClass(), "parent", null);
        term221463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term221463, term221463.getClass(), "type", 111);
        setField(term221463, term221463.getClass(), "next", null);
        setField(term221463, term221463.getClass(), "first", null);
        setField(term221463, term221463.getClass(), "last", null);
        setField(term221463, term221463.getClass(), "propListHead", null);
        setIntField(term221463, term221463.getClass(), "sourcePosition", 0);
        setField(term221463, term221463.getClass(), "jsType", null);
        setField(term221463, term221463.getClass(), "parent", null);
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
        args[1] = term220614;
        args[2] = term220684;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term220490, args);
        assertTrue(recursiveEquals(term220490, term221458));
        assertTrue(recursiveEquals(term220614, term221463));
        assertTrue(recursiveEquals(term220684, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


