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

public class NodeUtil_isControlStructureCodeBlock_763580606227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18157;
     Object term18172;

    public NodeUtil_isControlStructureCodeBlock_763580606227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18157, term18157.getClass(), "type", 111);
        term18172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18172, term18172.getClass(), "type", 111);
        setField(term18172, term18172.getClass(), "next", null);
        setField(term18172, term18172.getClass(), "first", null);
        setField(term18172, term18172.getClass(), "last", null);
        setField(term18172, term18172.getClass(), "propListHead", null);
        setIntField(term18172, term18172.getClass(), "sourcePosition", 0);
        setField(term18172, term18172.getClass(), "jsType", null);
        setField(term18172, term18172.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term18157;
        args[1] = null;
        Object retValue = callMethod(klass, "isControlStructureCodeBlock", argTypes, null, args);
        assertTrue(recursiveEquals(term18157, term18172));
        assertTrue(recursiveEquals(retValue, false));
    }

};


