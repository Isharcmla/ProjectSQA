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

public class NodeUtil_getInfoForNameNode_2009241699433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33902;
     Object term34015;

    public NodeUtil_getInfoForNameNode_2009241699433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33998 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term33998, term33998.getClass(), "type", 29);
        setField(term33902, term33902.getClass(), "propListHead", term33998);
        term34015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34016 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term34015, term34015.getClass(), "type", 0);
        setField(term34015, term34015.getClass(), "next", null);
        setField(term34015, term34015.getClass(), "first", null);
        setField(term34015, term34015.getClass(), "last", null);
        setField(term34016, term34016.getClass(), "next", null);
        setIntField(term34016, term34016.getClass(), "type", 29);
        setIntField(term34016, term34016.getClass(), "intValue", 0);
        setField(term34016, term34016.getClass(), "objectValue", null);
        setField(term34015, term34015.getClass(), "propListHead", term34016);
        setIntField(term34015, term34015.getClass(), "sourcePosition", 0);
        setField(term34015, term34015.getClass(), "jsType", null);
        setField(term34015, term34015.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term33902;
        Object retValue = callMethod(klass, "getInfoForNameNode", argTypes, null, args);
        assertTrue(recursiveEquals(term33902, term34015));
        assertTrue(recursiveEquals(retValue, null));
    }

};


