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
import java.lang.Object;

public class ReferenceCollectingCallback_visit_87227317464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10230;
     Object term10405;
     Object term10370;
     Object term10933;
     Object term10934;
     Object term10935;

    public ReferenceCollectingCallback_visit_87227317464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10230 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term10405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10405, term10405.getClass(), "type", 101);
        term10370 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10370, term10370.getClass(), "type", 101);
        setField(term10370, term10370.getClass(), "first", term10405);
        term10933 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term10933, term10933.getClass(), "referenceMap", null);
        setField(term10933, term10933.getClass(), "blockStack", null);
        setField(term10933, term10933.getClass(), "behavior", null);
        setField(term10933, term10933.getClass(), "compiler", null);
        setField(term10933, term10933.getClass(), "varFilter", null);
        term10934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10934, term10934.getClass(), "type", 101);
        setField(term10934, term10934.getClass(), "next", null);
        setField(term10934, term10934.getClass(), "first", null);
        setField(term10934, term10934.getClass(), "last", null);
        setField(term10934, term10934.getClass(), "propListHead", null);
        setIntField(term10934, term10934.getClass(), "sourcePosition", 0);
        setField(term10934, term10934.getClass(), "jsType", null);
        setField(term10934, term10934.getClass(), "parent", null);
        term10935 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10935, term10935.getClass(), "type", 101);
        setField(term10935, term10935.getClass(), "next", null);
        setIntField(term10936, term10936.getClass(), "type", 101);
        setField(term10936, term10936.getClass(), "next", null);
        setField(term10936, term10936.getClass(), "first", null);
        setField(term10936, term10936.getClass(), "last", null);
        setField(term10936, term10936.getClass(), "propListHead", null);
        setIntField(term10936, term10936.getClass(), "sourcePosition", 0);
        setField(term10936, term10936.getClass(), "jsType", null);
        setField(term10936, term10936.getClass(), "parent", null);
        setField(term10935, term10935.getClass(), "first", term10936);
        setField(term10935, term10935.getClass(), "last", null);
        setField(term10935, term10935.getClass(), "propListHead", null);
        setIntField(term10935, term10935.getClass(), "sourcePosition", 0);
        setField(term10935, term10935.getClass(), "jsType", null);
        setField(term10935, term10935.getClass(), "parent", null);
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
        args[1] = term10405;
        args[2] = term10370;
        callMethod(klass, "visit", argTypes, term10230, args);
        assertTrue(recursiveEquals(term10230, term10933));
        assertTrue(recursiveEquals(term10405, term10935));
        assertTrue(recursiveEquals(term10370, null));
    }

};


