package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Object;

public class Node_useSourceInfoIfMissingFromForTree_1338661614574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48681;
     Object term48865;
     Object term48926;
     Object term48928;
     Object term48875;

    public Node_useSourceInfoIfMissingFromForTree_1338661614574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48681 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term48773 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term48681, term48681.getClass(), "propListHead", null);
        setIntField(term48681, term48681.getClass(), "sourcePosition", 0);
        setField(term48681, term48681.getClass(), "first", term48773);
        term48865 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term48865, term48865.getClass(), "propListHead", null);
        setIntField(term48865, term48865.getClass(), "sourcePosition", 0);
        term48926 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term48927 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term48926, term48926.getClass(), "str", null);
        setIntField(term48926, term48926.getClass(), "type", 0);
        setField(term48926, term48926.getClass(), "next", null);
        setField(term48927, term48927.getClass(), "str", null);
        setIntField(term48927, term48927.getClass(), "type", 0);
        setField(term48927, term48927.getClass(), "next", null);
        setField(term48927, term48927.getClass(), "first", null);
        setField(term48927, term48927.getClass(), "last", null);
        setField(term48927, term48927.getClass(), "propListHead", null);
        setIntField(term48927, term48927.getClass(), "sourcePosition", 0);
        setField(term48927, term48927.getClass(), "jsType", null);
        setField(term48927, term48927.getClass(), "parent", null);
        setField(term48926, term48926.getClass(), "first", term48927);
        setField(term48926, term48926.getClass(), "last", null);
        setField(term48926, term48926.getClass(), "propListHead", null);
        setIntField(term48926, term48926.getClass(), "sourcePosition", 0);
        setField(term48926, term48926.getClass(), "jsType", null);
        setField(term48926, term48926.getClass(), "parent", null);
        term48928 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term48928, term48928.getClass(), "str", null);
        setIntField(term48928, term48928.getClass(), "type", 0);
        setField(term48928, term48928.getClass(), "next", null);
        setField(term48928, term48928.getClass(), "first", null);
        setField(term48928, term48928.getClass(), "last", null);
        setField(term48928, term48928.getClass(), "propListHead", null);
        setIntField(term48928, term48928.getClass(), "sourcePosition", 0);
        setField(term48928, term48928.getClass(), "jsType", null);
        setField(term48928, term48928.getClass(), "parent", null);
        term48875 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term48877 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term48875, term48875.getClass(), "str", null);
        setIntField(term48875, term48875.getClass(), "type", 0);
        setField(term48875, term48875.getClass(), "next", null);
        setField(term48877, term48877.getClass(), "str", null);
        setIntField(term48877, term48877.getClass(), "type", 0);
        setField(term48877, term48877.getClass(), "next", null);
        setField(term48877, term48877.getClass(), "first", null);
        setField(term48877, term48877.getClass(), "last", null);
        setField(term48877, term48877.getClass(), "propListHead", null);
        setIntField(term48877, term48877.getClass(), "sourcePosition", 0);
        setField(term48877, term48877.getClass(), "jsType", null);
        setField(term48877, term48877.getClass(), "parent", null);
        setField(term48875, term48875.getClass(), "first", term48877);
        setField(term48875, term48875.getClass(), "last", null);
        setField(term48875, term48875.getClass(), "propListHead", null);
        setIntField(term48875, term48875.getClass(), "sourcePosition", 0);
        setField(term48875, term48875.getClass(), "jsType", null);
        setField(term48875, term48875.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term48865;
        Object retValue = callMethod(klass, "useSourceInfoIfMissingFromForTree", argTypes, term48681, args);
        assertTrue(recursiveEquals(term48681, term48926));
        assertTrue(recursiveEquals(term48865, term48928));
        assertTrue(recursiveEquals(retValue, term48875));
    }

};


