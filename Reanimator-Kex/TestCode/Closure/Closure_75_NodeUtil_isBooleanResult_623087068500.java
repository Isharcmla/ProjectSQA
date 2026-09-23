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

public class NodeUtil_isBooleanResult_623087068500 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38706;
     Object term76381;

    public NodeUtil_isBooleanResult_623087068500() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38706, term38706.getClass(), "type", 43);
        term76381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term76381, term76381.getClass(), "type", 43);
        setField(term76381, term76381.getClass(), "next", null);
        setField(term76381, term76381.getClass(), "first", null);
        setField(term76381, term76381.getClass(), "last", null);
        setField(term76381, term76381.getClass(), "propListHead", null);
        setIntField(term76381, term76381.getClass(), "sourcePosition", 0);
        setField(term76381, term76381.getClass(), "jsType", null);
        setField(term76381, term76381.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term38706;
        callMethod(klass, "isBooleanResult", argTypes, null, args);
        assertTrue(recursiveEquals(term38706, term76381));
    }

};


