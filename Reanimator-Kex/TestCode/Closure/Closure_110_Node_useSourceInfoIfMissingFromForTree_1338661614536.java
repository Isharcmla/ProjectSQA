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

public class Node_useSourceInfoIfMissingFromForTree_1338661614536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43438;
     Object term43508;
     Object term43942;
     Object term43943;
     Object term43906;

    public Node_useSourceInfoIfMissingFromForTree_1338661614536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term43438, term43438.getClass(), "propListHead", null);
        term43508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43616 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term43508, term43508.getClass(), "propListHead", term43616);
        term43942 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43942, term43942.getClass(), "type", 0);
        setField(term43942, term43942.getClass(), "next", null);
        setField(term43942, term43942.getClass(), "first", null);
        setField(term43942, term43942.getClass(), "last", null);
        setField(term43942, term43942.getClass(), "propListHead", null);
        setIntField(term43942, term43942.getClass(), "sourcePosition", 0);
        setField(term43942, term43942.getClass(), "jsType", null);
        setField(term43942, term43942.getClass(), "parent", null);
        term43943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43944 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setIntField(term43943, term43943.getClass(), "type", 0);
        setField(term43943, term43943.getClass(), "next", null);
        setField(term43943, term43943.getClass(), "first", null);
        setField(term43943, term43943.getClass(), "last", null);
        setField(term43944, term43944.getClass(), "objectValue", null);
        setField(term43944, term43944.getClass(), "next", null);
        setIntField(term43944, term43944.getClass(), "propType", 0);
        setField(term43943, term43943.getClass(), "propListHead", term43944);
        setIntField(term43943, term43943.getClass(), "sourcePosition", 0);
        setField(term43943, term43943.getClass(), "jsType", null);
        setField(term43943, term43943.getClass(), "parent", null);
        term43906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43906, term43906.getClass(), "type", 0);
        setField(term43906, term43906.getClass(), "next", null);
        setField(term43906, term43906.getClass(), "first", null);
        setField(term43906, term43906.getClass(), "last", null);
        setField(term43906, term43906.getClass(), "propListHead", null);
        setIntField(term43906, term43906.getClass(), "sourcePosition", 0);
        setField(term43906, term43906.getClass(), "jsType", null);
        setField(term43906, term43906.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term43508;
        Object retValue = callMethod(klass, "useSourceInfoIfMissingFromForTree", argTypes, term43438, args);
        assertTrue(recursiveEquals(term43438, term43942));
        assertTrue(recursiveEquals(term43508, term43943));
        assertTrue(recursiveEquals(retValue, term43906));
    }

};


