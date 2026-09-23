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
import java.lang.Object;

public class ProcessClosurePrimitives_isNamespacePlaceholder_124471083952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26777;
     Object term26892;

    public ProcessClosurePrimitives_isNamespacePlaceholder_124471083952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26873 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term26873, term26873.getClass(), "type", 45);
        setField(term26777, term26777.getClass(), "propListHead", term26873);
        term26892 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26893 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term26892, term26892.getClass(), "type", 0);
        setField(term26892, term26892.getClass(), "next", null);
        setField(term26892, term26892.getClass(), "first", null);
        setField(term26892, term26892.getClass(), "last", null);
        setField(term26893, term26893.getClass(), "next", null);
        setIntField(term26893, term26893.getClass(), "type", 45);
        setIntField(term26893, term26893.getClass(), "intValue", 0);
        setField(term26893, term26893.getClass(), "objectValue", null);
        setField(term26892, term26892.getClass(), "propListHead", term26893);
        setIntField(term26892, term26892.getClass(), "sourcePosition", 0);
        setField(term26892, term26892.getClass(), "jsType", null);
        setField(term26892, term26892.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term26777;
        Object retValue = callMethod(klass, "isNamespacePlaceholder", argTypes, null, args);
        assertTrue(recursiveEquals(term26777, term26892));
        assertTrue(recursiveEquals(retValue, false));
    }

};


