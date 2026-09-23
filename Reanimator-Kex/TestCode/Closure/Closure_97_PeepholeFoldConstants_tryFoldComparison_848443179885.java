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

public class PeepholeFoldConstants_tryFoldComparison_848443179885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250227;
     Object term250319;
     Object term250411;
     Object term250503;
     Object term250937;
     Object term250938;
     Object term250939;
     Object term250940;
     Object term250914;

    public PeepholeFoldConstants_tryFoldComparison_848443179885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250227 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term250319 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term250319, term250319.getClass(), "type", 16);
        term250411 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term250411, term250411.getClass(), "type", 42);
        term250503 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term250503, term250503.getClass(), "type", 16);
        term250937 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term250937, term250937.getClass(), "currentTraversal", null);
        term250938 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term250938, term250938.getClass(), "str", null);
        setIntField(term250938, term250938.getClass(), "type", 42);
        setField(term250938, term250938.getClass(), "next", null);
        setField(term250938, term250938.getClass(), "first", null);
        setField(term250938, term250938.getClass(), "last", null);
        setField(term250938, term250938.getClass(), "propListHead", null);
        setIntField(term250938, term250938.getClass(), "sourcePosition", 0);
        setField(term250938, term250938.getClass(), "jsType", null);
        setField(term250938, term250938.getClass(), "parent", null);
        term250939 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term250939, term250939.getClass(), "str", null);
        setIntField(term250939, term250939.getClass(), "type", 16);
        setField(term250939, term250939.getClass(), "next", null);
        setField(term250939, term250939.getClass(), "first", null);
        setField(term250939, term250939.getClass(), "last", null);
        setField(term250939, term250939.getClass(), "propListHead", null);
        setIntField(term250939, term250939.getClass(), "sourcePosition", 0);
        setField(term250939, term250939.getClass(), "jsType", null);
        setField(term250939, term250939.getClass(), "parent", null);
        term250940 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term250940, term250940.getClass(), "str", null);
        setIntField(term250940, term250940.getClass(), "type", 16);
        setField(term250940, term250940.getClass(), "next", null);
        setField(term250940, term250940.getClass(), "first", null);
        setField(term250940, term250940.getClass(), "last", null);
        setField(term250940, term250940.getClass(), "propListHead", null);
        setIntField(term250940, term250940.getClass(), "sourcePosition", 0);
        setField(term250940, term250940.getClass(), "jsType", null);
        setField(term250940, term250940.getClass(), "parent", null);
        term250914 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term250914, term250914.getClass(), "str", null);
        setIntField(term250914, term250914.getClass(), "type", 16);
        setField(term250914, term250914.getClass(), "next", null);
        setField(term250914, term250914.getClass(), "first", null);
        setField(term250914, term250914.getClass(), "last", null);
        setField(term250914, term250914.getClass(), "propListHead", null);
        setIntField(term250914, term250914.getClass(), "sourcePosition", 0);
        setField(term250914, term250914.getClass(), "jsType", null);
        setField(term250914, term250914.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term250319;
        args[1] = term250411;
        args[2] = term250503;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term250227, args);
        assertTrue(recursiveEquals(term250227, term250937));
        assertTrue(recursiveEquals(term250319, term250938));
        assertTrue(recursiveEquals(term250411, term250939));
        assertTrue(recursiveEquals(term250503, term250940));
        assertTrue(recursiveEquals(retValue, term250914));
    }

};


