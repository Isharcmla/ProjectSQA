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

public class TypeValidator_expectValidTypeofName_356302988159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38533;
     Object term38623;
     Object term38731;
     Object term39624;
     Object term39625;
     Object term39628;

    public TypeValidator_expectValidTypeofName_356302988159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38533 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term38623 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term38623, term38623.getClass(), "sourceName", "");
        term38731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term39624 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term39624, term39624.getClass(), "compiler", null);
        setField(term39624, term39624.getClass(), "typeRegistry", null);
        setField(term39624, term39624.getClass(), "allValueTypes", null);
        setBooleanField(term39624, term39624.getClass(), "shouldReport", false);
        setField(term39624, term39624.getClass(), "nullOrUndefined", null);
        setField(term39624, term39624.getClass(), "mismatches", null);
        term39625 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term39625, term39625.getClass(), "compiler", null);
        setField(term39625, term39625.getClass(), "callback", null);
        setField(term39625, term39625.getClass(), "curNode", null);
        setField(term39625, term39625.getClass(), "scopes", null);
        setField(term39625, term39625.getClass(), "scopeRoots", null);
        setField(term39625, term39625.getClass(), "cfgs", null);
        setField(term39625, term39625.getClass(), "sourceName", "");
        setField(term39625, term39625.getClass(), "inputId", null);
        setField(term39625, term39625.getClass(), "scopeCreator", null);
        setField(term39625, term39625.getClass(), "scopeCallback", null);
        term39628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39628, term39628.getClass(), "type", 0);
        setField(term39628, term39628.getClass(), "next", null);
        setField(term39628, term39628.getClass(), "first", null);
        setField(term39628, term39628.getClass(), "last", null);
        setField(term39628, term39628.getClass(), "propListHead", null);
        setIntField(term39628, term39628.getClass(), "sourcePosition", 0);
        setField(term39628, term39628.getClass(), "jsType", null);
        setField(term39628, term39628.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term38623;
        args[1] = term38731;
        args[2] = "";
        callMethod(klass, "expectValidTypeofName", argTypes, term38533, args);
        assertTrue(recursiveEquals(term38533, term39624));
        assertTrue(recursiveEquals(term38623, term39625));
        assertTrue(recursiveEquals(term38731, term39628));
    }

};


