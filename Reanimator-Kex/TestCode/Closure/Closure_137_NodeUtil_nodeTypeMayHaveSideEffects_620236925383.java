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

public class NodeUtil_nodeTypeMayHaveSideEffects_620236925383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30718;
     Object term30726;

    public NodeUtil_nodeTypeMayHaveSideEffects_620236925383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30718, term30718.getClass(), "type", 91);
        term30726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30726, term30726.getClass(), "type", 91);
        setField(term30726, term30726.getClass(), "next", null);
        setField(term30726, term30726.getClass(), "first", null);
        setField(term30726, term30726.getClass(), "last", null);
        setField(term30726, term30726.getClass(), "propListHead", null);
        setIntField(term30726, term30726.getClass(), "sourcePosition", 0);
        setField(term30726, term30726.getClass(), "jsType", null);
        setField(term30726, term30726.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term30718;
        Object retValue = callMethod(klass, "nodeTypeMayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term30718, term30726));
        assertTrue(recursiveEquals(retValue, true));
    }

};


