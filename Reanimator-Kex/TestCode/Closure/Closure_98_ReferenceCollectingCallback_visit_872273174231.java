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

public class ReferenceCollectingCallback_visit_872273174231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58273;
     Object term58365;
     Object term58457;
     Object term59197;
     Object term59198;
     Object term59199;

    public ReferenceCollectingCallback_visit_872273174231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58273 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term58365 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term58365, term58365.getClass(), "type", -39);
        term58457 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term59197 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term59197, term59197.getClass(), "referenceMap", null);
        setField(term59197, term59197.getClass(), "blockStack", null);
        setField(term59197, term59197.getClass(), "behavior", null);
        setField(term59197, term59197.getClass(), "compiler", null);
        setField(term59197, term59197.getClass(), "varFilter", null);
        term59198 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term59198, term59198.getClass(), "str", null);
        setIntField(term59198, term59198.getClass(), "type", -39);
        setField(term59198, term59198.getClass(), "next", null);
        setField(term59198, term59198.getClass(), "first", null);
        setField(term59198, term59198.getClass(), "last", null);
        setField(term59198, term59198.getClass(), "propListHead", null);
        setIntField(term59198, term59198.getClass(), "sourcePosition", 0);
        setField(term59198, term59198.getClass(), "jsType", null);
        setField(term59198, term59198.getClass(), "parent", null);
        term59199 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term59199, term59199.getClass(), "str", null);
        setIntField(term59199, term59199.getClass(), "type", 0);
        setField(term59199, term59199.getClass(), "next", null);
        setField(term59199, term59199.getClass(), "first", null);
        setField(term59199, term59199.getClass(), "last", null);
        setField(term59199, term59199.getClass(), "propListHead", null);
        setIntField(term59199, term59199.getClass(), "sourcePosition", 0);
        setField(term59199, term59199.getClass(), "jsType", null);
        setField(term59199, term59199.getClass(), "parent", null);
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
        args[1] = term58365;
        args[2] = term58457;
        callMethod(klass, "visit", argTypes, term58273, args);
        assertTrue(recursiveEquals(term58273, term59197));
        assertTrue(recursiveEquals(term58365, term59199));
        assertTrue(recursiveEquals(term58457, null));
    }

};


