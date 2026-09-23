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

public class ReferenceCollectingCallback_visit_87227317441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5499;
     Object term5569;
     Object term5593;
     Object term5594;

    public ReferenceCollectingCallback_visit_87227317441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5499 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term5569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term5593 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term5593, term5593.getClass(), "referenceMap", null);
        setField(term5593, term5593.getClass(), "blockStack", null);
        setField(term5593, term5593.getClass(), "behavior", null);
        setField(term5593, term5593.getClass(), "compiler", null);
        setField(term5593, term5593.getClass(), "varFilter", null);
        term5594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5594, term5594.getClass(), "type", 0);
        setField(term5594, term5594.getClass(), "next", null);
        setField(term5594, term5594.getClass(), "first", null);
        setField(term5594, term5594.getClass(), "last", null);
        setField(term5594, term5594.getClass(), "propListHead", null);
        setIntField(term5594, term5594.getClass(), "sourcePosition", 0);
        setField(term5594, term5594.getClass(), "jsType", null);
        setField(term5594, term5594.getClass(), "parent", null);
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
        args[1] = term5569;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term5499, args);
        assertTrue(recursiveEquals(term5499, term5593));
        assertTrue(recursiveEquals(term5569, null));
    }

};


