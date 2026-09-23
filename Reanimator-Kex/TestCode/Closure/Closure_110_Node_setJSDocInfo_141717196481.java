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

public class Node_setJSDocInfo_141717196481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38080;
     Object term38281;
     Object term38275;

    public Node_setJSDocInfo_141717196481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38080 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term38281 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term38281, term38281.getClass(), "str", null);
        setIntField(term38281, term38281.getClass(), "type", 0);
        setField(term38281, term38281.getClass(), "next", null);
        setField(term38281, term38281.getClass(), "first", null);
        setField(term38281, term38281.getClass(), "last", null);
        setField(term38281, term38281.getClass(), "propListHead", null);
        setIntField(term38281, term38281.getClass(), "sourcePosition", 0);
        setField(term38281, term38281.getClass(), "jsType", null);
        setField(term38281, term38281.getClass(), "parent", null);
        term38275 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term38275, term38275.getClass(), "str", null);
        setIntField(term38275, term38275.getClass(), "type", 0);
        setField(term38275, term38275.getClass(), "next", null);
        setField(term38275, term38275.getClass(), "first", null);
        setField(term38275, term38275.getClass(), "last", null);
        setField(term38275, term38275.getClass(), "propListHead", null);
        setIntField(term38275, term38275.getClass(), "sourcePosition", 0);
        setField(term38275, term38275.getClass(), "jsType", null);
        setField(term38275, term38275.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "setJSDocInfo", argTypes, term38080, args);
        assertTrue(recursiveEquals(term38080, term38281));
        assertTrue(recursiveEquals(retValue, term38275));
    }

};


