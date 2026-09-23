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

public class ReferenceCollectingCallback_visit_87227317458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11075;
     Object term11167;
     Object term11259;
     Object term11837;
     Object term11838;
     Object term11839;

    public ReferenceCollectingCallback_visit_87227317458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11075 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term11167 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term11167, term11167.getClass(), "type", -39);
        term11259 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term11837 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term11837, term11837.getClass(), "referenceMap", null);
        setField(term11837, term11837.getClass(), "blockStack", null);
        setField(term11837, term11837.getClass(), "behavior", null);
        setField(term11837, term11837.getClass(), "compiler", null);
        setField(term11837, term11837.getClass(), "varFilter", null);
        term11838 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term11838, term11838.getClass(), "str", null);
        setIntField(term11838, term11838.getClass(), "type", -39);
        setField(term11838, term11838.getClass(), "next", null);
        setField(term11838, term11838.getClass(), "first", null);
        setField(term11838, term11838.getClass(), "last", null);
        setField(term11838, term11838.getClass(), "propListHead", null);
        setIntField(term11838, term11838.getClass(), "sourcePosition", 0);
        setField(term11838, term11838.getClass(), "jsType", null);
        setField(term11838, term11838.getClass(), "parent", null);
        term11839 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term11839, term11839.getClass(), "number", 0.0);
        setIntField(term11839, term11839.getClass(), "type", 0);
        setField(term11839, term11839.getClass(), "next", null);
        setField(term11839, term11839.getClass(), "first", null);
        setField(term11839, term11839.getClass(), "last", null);
        setField(term11839, term11839.getClass(), "propListHead", null);
        setIntField(term11839, term11839.getClass(), "sourcePosition", 0);
        setField(term11839, term11839.getClass(), "jsType", null);
        setField(term11839, term11839.getClass(), "parent", null);
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
        args[1] = term11167;
        args[2] = term11259;
        callMethod(klass, "visit", argTypes, term11075, args);
        assertTrue(recursiveEquals(term11075, term11837));
        assertTrue(recursiveEquals(term11167, term11839));
        assertTrue(recursiveEquals(term11259, null));
    }

};


