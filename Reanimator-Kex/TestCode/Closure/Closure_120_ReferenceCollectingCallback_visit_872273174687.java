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

public class ReferenceCollectingCallback_visit_872273174687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237897;
     Object term237989;
     Object term238081;
     Object term239153;
     Object term239154;
     Object term239155;

    public ReferenceCollectingCallback_visit_872273174687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237897 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term237989 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term237989, term237989.getClass(), "type", -39);
        term238081 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term239153 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term239153, term239153.getClass(), "referenceMap", null);
        setField(term239153, term239153.getClass(), "blockStack", null);
        setField(term239153, term239153.getClass(), "behavior", null);
        setField(term239153, term239153.getClass(), "compiler", null);
        setField(term239153, term239153.getClass(), "varFilter", null);
        term239154 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term239154, term239154.getClass(), "str", null);
        setIntField(term239154, term239154.getClass(), "type", -39);
        setField(term239154, term239154.getClass(), "next", null);
        setField(term239154, term239154.getClass(), "first", null);
        setField(term239154, term239154.getClass(), "last", null);
        setField(term239154, term239154.getClass(), "propListHead", null);
        setIntField(term239154, term239154.getClass(), "sourcePosition", 0);
        setField(term239154, term239154.getClass(), "jsType", null);
        setField(term239154, term239154.getClass(), "parent", null);
        term239155 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term239155, term239155.getClass(), "str", null);
        setIntField(term239155, term239155.getClass(), "type", 0);
        setField(term239155, term239155.getClass(), "next", null);
        setField(term239155, term239155.getClass(), "first", null);
        setField(term239155, term239155.getClass(), "last", null);
        setField(term239155, term239155.getClass(), "propListHead", null);
        setIntField(term239155, term239155.getClass(), "sourcePosition", 0);
        setField(term239155, term239155.getClass(), "jsType", null);
        setField(term239155, term239155.getClass(), "parent", null);
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
        args[1] = term237989;
        args[2] = term238081;
        callMethod(klass, "visit", argTypes, term237897, args);
        assertTrue(recursiveEquals(term237897, term239153));
        assertTrue(recursiveEquals(term237989, term239155));
        assertTrue(recursiveEquals(term238081, null));
    }

};


