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

public class NodeUtil_isName_1555326690305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26558;
     Object term26565;

    public NodeUtil_isName_1555326690305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26558 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26558, term26558.getClass(), "type", 38);
        term26565 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26565, term26565.getClass(), "type", 38);
        setField(term26565, term26565.getClass(), "next", null);
        setField(term26565, term26565.getClass(), "first", null);
        setField(term26565, term26565.getClass(), "last", null);
        setField(term26565, term26565.getClass(), "propListHead", null);
        setIntField(term26565, term26565.getClass(), "sourcePosition", 0);
        setField(term26565, term26565.getClass(), "jsType", null);
        setField(term26565, term26565.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term26558;
        Object retValue = callMethod(klass, "isName", argTypes, null, args);
        assertTrue(recursiveEquals(term26558, term26565));
        assertTrue(recursiveEquals(retValue, true));
    }

};


