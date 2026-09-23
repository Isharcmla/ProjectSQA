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

public class NodeUtil_isValidDefineValue_788085673447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39175;
     Object term47510;

    public NodeUtil_isValidDefineValue_788085673447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39175, term39175.getClass(), "type", 40);
        term47510 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47510, term47510.getClass(), "type", 40);
        setField(term47510, term47510.getClass(), "next", null);
        setField(term47510, term47510.getClass(), "first", null);
        setField(term47510, term47510.getClass(), "last", null);
        setField(term47510, term47510.getClass(), "propListHead", null);
        setIntField(term47510, term47510.getClass(), "sourcePosition", 0);
        setField(term47510, term47510.getClass(), "jsType", null);
        setField(term47510, term47510.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term39175;
        args[1] = null;
        Object retValue = callMethod(klass, "isValidDefineValue", argTypes, null, args);
        assertTrue(recursiveEquals(term39175, term47510));
        assertTrue(recursiveEquals(retValue, true));
    }

};


