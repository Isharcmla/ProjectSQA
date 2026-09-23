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

public class NodeUtil_isLhs_985377333569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49315;
     Object term49323;

    public NodeUtil_isLhs_985377333569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49315, term49315.getClass(), "type", 86);
        term49323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49323, term49323.getClass(), "type", 86);
        setField(term49323, term49323.getClass(), "next", null);
        setField(term49323, term49323.getClass(), "first", null);
        setField(term49323, term49323.getClass(), "last", null);
        setField(term49323, term49323.getClass(), "propListHead", null);
        setIntField(term49323, term49323.getClass(), "sourcePosition", 0);
        setField(term49323, term49323.getClass(), "jsType", null);
        setField(term49323, term49323.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term49315;
        Object retValue = callMethod(klass, "isLhs", argTypes, null, args);
        assertTrue(recursiveEquals(term49315, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


