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

public class NodeUtil_isLoopStructure_1113179246379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30835;
     Object term30843;

    public NodeUtil_isLoopStructure_1113179246379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30835 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30835, term30835.getClass(), "type", 113);
        term30843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30843, term30843.getClass(), "type", 113);
        setField(term30843, term30843.getClass(), "next", null);
        setField(term30843, term30843.getClass(), "first", null);
        setField(term30843, term30843.getClass(), "last", null);
        setField(term30843, term30843.getClass(), "propListHead", null);
        setIntField(term30843, term30843.getClass(), "sourcePosition", 0);
        setField(term30843, term30843.getClass(), "jsType", null);
        setField(term30843, term30843.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term30835;
        Object retValue = callMethod(klass, "isLoopStructure", argTypes, null, args);
        assertTrue(recursiveEquals(term30835, term30843));
        assertTrue(recursiveEquals(retValue, true));
    }

};


