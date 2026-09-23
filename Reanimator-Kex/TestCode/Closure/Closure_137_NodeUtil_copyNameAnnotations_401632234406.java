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

public class NodeUtil_copyNameAnnotations_401632234406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32046;
     Object term32254;

    public NodeUtil_copyNameAnnotations_401632234406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32142 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term32142, term32142.getClass(), "type", 43);
        setField(term32046, term32046.getClass(), "propListHead", term32142);
        term32254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32255 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term32254, term32254.getClass(), "type", 0);
        setField(term32254, term32254.getClass(), "next", null);
        setField(term32254, term32254.getClass(), "first", null);
        setField(term32254, term32254.getClass(), "last", null);
        setField(term32255, term32255.getClass(), "next", null);
        setIntField(term32255, term32255.getClass(), "type", 43);
        setIntField(term32255, term32255.getClass(), "intValue", 0);
        setField(term32255, term32255.getClass(), "objectValue", null);
        setField(term32254, term32254.getClass(), "propListHead", term32255);
        setIntField(term32254, term32254.getClass(), "sourcePosition", 0);
        setField(term32254, term32254.getClass(), "jsType", null);
        setField(term32254, term32254.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term32046;
        args[1] = null;
        callMethod(klass, "copyNameAnnotations", argTypes, null, args);
        assertTrue(recursiveEquals(term32046, term32254));
    }

};


