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

public class Node_getJSDocInfo_1643720567626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55312;
     Object term55445;

    public Node_getJSDocInfo_1643720567626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55312 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55420 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term55312, term55312.getClass(), "propListHead", term55420);
        term55445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55446 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setIntField(term55445, term55445.getClass(), "type", 0);
        setField(term55445, term55445.getClass(), "next", null);
        setField(term55445, term55445.getClass(), "first", null);
        setField(term55445, term55445.getClass(), "last", null);
        setField(term55446, term55446.getClass(), "objectValue", null);
        setField(term55446, term55446.getClass(), "next", null);
        setIntField(term55446, term55446.getClass(), "propType", 0);
        setField(term55445, term55445.getClass(), "propListHead", term55446);
        setIntField(term55445, term55445.getClass(), "sourcePosition", 0);
        setField(term55445, term55445.getClass(), "jsType", null);
        setField(term55445, term55445.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getJSDocInfo", argTypes, term55312, args);
        assertTrue(recursiveEquals(term55312, term55445));
        assertTrue(recursiveEquals(retValue, null));
    }

};


