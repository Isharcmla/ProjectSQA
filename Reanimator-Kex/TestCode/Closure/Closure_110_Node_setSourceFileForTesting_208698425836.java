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

public class Node_setSourceFileForTesting_208698425836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55977;
     Object term96551;

    public Node_setSourceFileForTesting_208698425836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56079 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term55977, term55977.getClass(), "propListHead", term56079);
        term96551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96552 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term96553 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSourceFile"));
        Object term96554 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setIntField(term96551, term96551.getClass(), "type", 0);
        setField(term96551, term96551.getClass(), "next", null);
        setField(term96551, term96551.getClass(), "first", null);
        setField(term96551, term96551.getClass(), "last", null);
        setField(term96553, term96553.getClass(), "name", null);
        setBooleanField(term96553, term96553.getClass(), "extern", false);
        setField(term96552, term96552.getClass(), "objectValue", term96553);
        setIntField(term96554, term96554.getClass(), "intValue", 0);
        setField(term96554, term96554.getClass(), "next", null);
        setIntField(term96554, term96554.getClass(), "propType", 0);
        setField(term96552, term96552.getClass(), "next", term96554);
        setIntField(term96552, term96552.getClass(), "propType", 51);
        setField(term96551, term96551.getClass(), "propListHead", term96552);
        setIntField(term96551, term96551.getClass(), "sourcePosition", 0);
        setField(term96551, term96551.getClass(), "jsType", null);
        setField(term96551, term96551.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSourceFileForTesting", argTypes, term55977, args);
        assertTrue(recursiveEquals(term55977, term96551));
    }

};


