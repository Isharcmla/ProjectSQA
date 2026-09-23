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
import java.lang.Integer;

public class Node_newString_1431840757226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term727;
     Object term741;
     Object term743;
     Object term11917;

    public Node_newString_1431840757226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term727 = new Integer(842904495);
        term741 = new Integer(1008080511);
        term743 = new Integer(1935707624);
        term11917 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term11917, term11917.getClass(), "str", "xxtlPwDYFs");
        setIntField(term11917, term11917.getClass(), "type", 842904495);
        setField(term11917, term11917.getClass(), "next", null);
        setField(term11917, term11917.getClass(), "first", null);
        setField(term11917, term11917.getClass(), "last", null);
        setField(term11917, term11917.getClass(), "propListHead", null);
        setIntField(term11917, term11917.getClass(), "sourcePosition", 1634205695);
        setField(term11917, term11917.getClass(), "jsType", null);
        setField(term11917, term11917.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term727;
        args[1] = "xxtlPwDYFs";
        args[2] = term741;
        args[3] = term743;
        Object retValue = callMethod(klass, "newString", argTypes, null, args);
        assertTrue(recursiveEquals(term727, 1008080511));
        assertTrue(recursiveEquals(term741, 842904495));
        assertTrue(recursiveEquals(term743, "xxtlPwDYFs"));
        assertTrue(recursiveEquals(retValue, term11917));
    }

};


