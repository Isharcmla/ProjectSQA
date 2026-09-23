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

public class NodeUtil_checkForStateChangeHelper_856076007414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49850;
     Object term52198;

    public NodeUtil_checkForStateChangeHelper_856076007414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49850 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49850, term49850.getClass(), "type", 106);
        term52198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term52198, term52198.getClass(), "type", 106);
        setField(term52198, term52198.getClass(), "next", null);
        setField(term52198, term52198.getClass(), "first", null);
        setField(term52198, term52198.getClass(), "last", null);
        setField(term52198, term52198.getClass(), "propListHead", null);
        setIntField(term52198, term52198.getClass(), "sourcePosition", 0);
        setField(term52198, term52198.getClass(), "jsType", null);
        setField(term52198, term52198.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[3];
        args[0] = term49850;
        args[1] = false;
        args[2] = null;
        Object retValue = callMethod(klass, "checkForStateChangeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term49850, term52198));
        assertTrue(recursiveEquals(retValue, true));
    }

};


