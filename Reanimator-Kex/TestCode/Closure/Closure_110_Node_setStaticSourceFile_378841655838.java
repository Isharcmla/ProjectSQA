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

public class Node_setStaticSourceFile_378841655838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56238;
     Object term96578;

    public Node_setStaticSourceFile_378841655838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56346 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term56238, term56238.getClass(), "propListHead", term56346);
        term96578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96579 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setIntField(term96578, term96578.getClass(), "type", 0);
        setField(term96578, term96578.getClass(), "next", null);
        setField(term96578, term96578.getClass(), "first", null);
        setField(term96578, term96578.getClass(), "last", null);
        setField(term96579, term96579.getClass(), "objectValue", null);
        setField(term96579, term96579.getClass(), "next", null);
        setIntField(term96579, term96579.getClass(), "propType", 0);
        setField(term96578, term96578.getClass(), "propListHead", term96579);
        setIntField(term96578, term96578.getClass(), "sourcePosition", 0);
        setField(term96578, term96578.getClass(), "jsType", null);
        setField(term96578, term96578.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.StaticSourceFile");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setStaticSourceFile", argTypes, term56238, args);
        assertTrue(recursiveEquals(term56238, term96578));
    }

};


