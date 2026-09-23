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

public class NodeUtil_isControlStructure_649070953386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44685;
     Object term44771;

    public NodeUtil_isControlStructure_649070953386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44685, term44685.getClass(), "type", 126);
        term44771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44771, term44771.getClass(), "type", 126);
        setField(term44771, term44771.getClass(), "next", null);
        setField(term44771, term44771.getClass(), "first", null);
        setField(term44771, term44771.getClass(), "last", null);
        setField(term44771, term44771.getClass(), "propListHead", null);
        setIntField(term44771, term44771.getClass(), "sourcePosition", 0);
        setField(term44771, term44771.getClass(), "jsType", null);
        setField(term44771, term44771.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term44685;
        Object retValue = callMethod(klass, "isControlStructure", argTypes, null, args);
        assertTrue(recursiveEquals(term44685, term44771));
        assertTrue(recursiveEquals(retValue, true));
    }

};


