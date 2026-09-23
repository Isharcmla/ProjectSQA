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

public class NodeUtil_isLiteralValue_918619071497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42507;
     Object term42529;

    public NodeUtil_isLiteralValue_918619071497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42507, term42507.getClass(), "type", 63);
        term42529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42529, term42529.getClass(), "type", 63);
        setField(term42529, term42529.getClass(), "next", null);
        setField(term42529, term42529.getClass(), "first", null);
        setField(term42529, term42529.getClass(), "last", null);
        setField(term42529, term42529.getClass(), "propListHead", null);
        setIntField(term42529, term42529.getClass(), "sourcePosition", 0);
        setField(term42529, term42529.getClass(), "jsType", null);
        setField(term42529, term42529.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term42507;
        args[1] = false;
        Object retValue = callMethod(klass, "isLiteralValue", argTypes, null, args);
        assertTrue(recursiveEquals(term42507, term42529));
        assertTrue(recursiveEquals(retValue, true));
    }

};


