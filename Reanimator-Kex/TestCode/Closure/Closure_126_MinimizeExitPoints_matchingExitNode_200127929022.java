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

public class MinimizeExitPoints_matchingExitNode_200127929022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3029;
     Object term3042;

    public MinimizeExitPoints_matchingExitNode_200127929022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3029, term3029.getClass(), "type", 0);
        term3042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3042, term3042.getClass(), "type", 0);
        setField(term3042, term3042.getClass(), "next", null);
        setField(term3042, term3042.getClass(), "first", null);
        setField(term3042, term3042.getClass(), "last", null);
        setField(term3042, term3042.getClass(), "propListHead", null);
        setIntField(term3042, term3042.getClass(), "sourcePosition", 0);
        setField(term3042, term3042.getClass(), "jsType", null);
        setField(term3042, term3042.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term3029;
        args[1] = 0;
        args[2] = null;
        Object retValue = callMethod(klass, "matchingExitNode", argTypes, null, args);
        assertTrue(recursiveEquals(term3029, term3042));
        assertTrue(recursiveEquals(retValue, true));
    }

};


