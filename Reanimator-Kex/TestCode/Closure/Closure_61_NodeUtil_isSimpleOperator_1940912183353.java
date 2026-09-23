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

public class NodeUtil_isSimpleOperator_1940912183353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29948;
     Object term30079;

    public NodeUtil_isSimpleOperator_1940912183353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29948, term29948.getClass(), "type", 45);
        term30079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30079, term30079.getClass(), "type", 45);
        setField(term30079, term30079.getClass(), "next", null);
        setField(term30079, term30079.getClass(), "first", null);
        setField(term30079, term30079.getClass(), "last", null);
        setField(term30079, term30079.getClass(), "propListHead", null);
        setIntField(term30079, term30079.getClass(), "sourcePosition", 0);
        setField(term30079, term30079.getClass(), "jsType", null);
        setField(term30079, term30079.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term29948;
        callMethod(klass, "isSimpleOperator", argTypes, null, args);
        assertTrue(recursiveEquals(term29948, term30079));
    }

};


