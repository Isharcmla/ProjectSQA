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

public class NodeUtil_nodeTypeMayHaveSideEffects_620236925541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46447;
     Object term46719;

    public NodeUtil_nodeTypeMayHaveSideEffects_620236925541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46447 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term46719 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term46719, term46719.getClass(), "number", 0.0);
        setIntField(term46719, term46719.getClass(), "type", 0);
        setField(term46719, term46719.getClass(), "next", null);
        setField(term46719, term46719.getClass(), "first", null);
        setField(term46719, term46719.getClass(), "last", null);
        setField(term46719, term46719.getClass(), "propListHead", null);
        setIntField(term46719, term46719.getClass(), "sourcePosition", 0);
        setField(term46719, term46719.getClass(), "jsType", null);
        setField(term46719, term46719.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term46447;
        Object retValue = callMethod(klass, "nodeTypeMayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term46447, term46719));
        assertTrue(recursiveEquals(retValue, false));
    }

};


