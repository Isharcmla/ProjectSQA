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

public class ReferenceCollectingCallback_visit_87227317438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5571;
     Object term5641;
     Object term5811;
     Object term5812;

    public ReferenceCollectingCallback_visit_87227317438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5571 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term5641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5641, term5641.getClass(), "type", -39);
        term5811 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term5811, term5811.getClass(), "referenceMap", null);
        setField(term5811, term5811.getClass(), "blockStack", null);
        setField(term5811, term5811.getClass(), "behavior", null);
        setField(term5811, term5811.getClass(), "compiler", null);
        setField(term5811, term5811.getClass(), "varFilter", null);
        term5812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5812, term5812.getClass(), "type", -39);
        setField(term5812, term5812.getClass(), "next", null);
        setField(term5812, term5812.getClass(), "first", null);
        setField(term5812, term5812.getClass(), "last", null);
        setField(term5812, term5812.getClass(), "propListHead", null);
        setIntField(term5812, term5812.getClass(), "sourcePosition", 0);
        setField(term5812, term5812.getClass(), "jsType", null);
        setField(term5812, term5812.getClass(), "parent", null);
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
        args[1] = term5641;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term5571, args);
        assertTrue(recursiveEquals(term5571, term5811));
        assertTrue(recursiveEquals(term5641, null));
    }

};


