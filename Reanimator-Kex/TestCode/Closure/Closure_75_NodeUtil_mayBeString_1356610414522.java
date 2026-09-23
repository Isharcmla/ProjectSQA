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

public class NodeUtil_mayBeString_1356610414522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40331;
     Object term78502;

    public NodeUtil_mayBeString_1356610414522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40331, term40331.getClass(), "type", 13);
        term78502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term78502, term78502.getClass(), "type", 13);
        setField(term78502, term78502.getClass(), "next", null);
        setField(term78502, term78502.getClass(), "first", null);
        setField(term78502, term78502.getClass(), "last", null);
        setField(term78502, term78502.getClass(), "propListHead", null);
        setIntField(term78502, term78502.getClass(), "sourcePosition", 0);
        setField(term78502, term78502.getClass(), "jsType", null);
        setField(term78502, term78502.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term40331;
        args[1] = false;
        callMethod(klass, "mayBeString", argTypes, null, args);
        assertTrue(recursiveEquals(term40331, term78502));
    }

};


