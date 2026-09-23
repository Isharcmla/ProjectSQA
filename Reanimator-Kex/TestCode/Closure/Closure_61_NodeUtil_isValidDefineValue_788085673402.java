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

public class NodeUtil_isValidDefineValue_788085673402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33762;
     Object term33849;

    public NodeUtil_isValidDefineValue_788085673402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33762, term33762.getClass(), "type", 40);
        term33849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33849, term33849.getClass(), "type", 40);
        setField(term33849, term33849.getClass(), "next", null);
        setField(term33849, term33849.getClass(), "first", null);
        setField(term33849, term33849.getClass(), "last", null);
        setField(term33849, term33849.getClass(), "propListHead", null);
        setIntField(term33849, term33849.getClass(), "sourcePosition", 0);
        setField(term33849, term33849.getClass(), "jsType", null);
        setField(term33849, term33849.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term33762;
        args[1] = null;
        Object retValue = callMethod(klass, "isValidDefineValue", argTypes, null, args);
        assertTrue(recursiveEquals(term33762, term33849));
        assertTrue(recursiveEquals(retValue, true));
    }

};


