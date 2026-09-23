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

public class Node_setJSDocInfo_141717196331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5204;
     Object term24020;
     Object term24014;

    public Node_setJSDocInfo_141717196331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5204, term5204.getClass(), "type", 0);
        setField(term5204, term5204.getClass(), "next", null);
        setField(term5204, term5204.getClass(), "first", null);
        setField(term5204, term5204.getClass(), "last", null);
        setField(term5204, term5204.getClass(), "propListHead", null);
        setIntField(term5204, term5204.getClass(), "sourcePosition", 0);
        setField(term5204, term5204.getClass(), "jsType", null);
        setField(term5204, term5204.getClass(), "parent", null);
        term24020 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24020, term24020.getClass(), "type", 0);
        setField(term24020, term24020.getClass(), "next", null);
        setField(term24020, term24020.getClass(), "first", null);
        setField(term24020, term24020.getClass(), "last", null);
        setField(term24020, term24020.getClass(), "propListHead", null);
        setIntField(term24020, term24020.getClass(), "sourcePosition", 0);
        setField(term24020, term24020.getClass(), "jsType", null);
        setField(term24020, term24020.getClass(), "parent", null);
        term24014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24014, term24014.getClass(), "type", 0);
        setField(term24014, term24014.getClass(), "next", null);
        setField(term24014, term24014.getClass(), "first", null);
        setField(term24014, term24014.getClass(), "last", null);
        setField(term24014, term24014.getClass(), "propListHead", null);
        setIntField(term24014, term24014.getClass(), "sourcePosition", 0);
        setField(term24014, term24014.getClass(), "jsType", null);
        setField(term24014, term24014.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "setJSDocInfo", argTypes, term5204, args);
        assertTrue(recursiveEquals(term5204, term24020));
        assertTrue(recursiveEquals(retValue, term24014));
    }

};


