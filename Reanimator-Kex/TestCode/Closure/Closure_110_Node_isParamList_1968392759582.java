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

public class Node_isParamList_1968392759582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50285;
     Object term50292;

    public Node_isParamList_1968392759582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50285, term50285.getClass(), "type", 83);
        term50292 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50292, term50292.getClass(), "type", 83);
        setField(term50292, term50292.getClass(), "next", null);
        setField(term50292, term50292.getClass(), "first", null);
        setField(term50292, term50292.getClass(), "last", null);
        setField(term50292, term50292.getClass(), "propListHead", null);
        setIntField(term50292, term50292.getClass(), "sourcePosition", 0);
        setField(term50292, term50292.getClass(), "jsType", null);
        setField(term50292, term50292.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isParamList", argTypes, term50285, args);
        assertTrue(recursiveEquals(term50285, term50292));
        assertTrue(recursiveEquals(retValue, true));
    }

};


