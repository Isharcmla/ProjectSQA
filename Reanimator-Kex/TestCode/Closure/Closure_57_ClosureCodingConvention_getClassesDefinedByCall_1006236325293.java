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
import java.lang.Object;

public class ClosureCodingConvention_getClassesDefinedByCall_1006236325293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122578;
     Object term122670;
     Object term123051;
     Object term123052;

    public ClosureCodingConvention_getClassesDefinedByCall_1006236325293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122578 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term122670 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term122762 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term122670, term122670.getClass(), "first", term122762);
        term123051 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term123051, term123051.getClass(), "propertyTestFunctions", null);
        term123052 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term123053 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term123052, term123052.getClass(), "number", 0.0);
        setIntField(term123052, term123052.getClass(), "type", 0);
        setField(term123052, term123052.getClass(), "next", null);
        setDoubleField(term123053, term123053.getClass(), "number", 0.0);
        setIntField(term123053, term123053.getClass(), "type", 0);
        setField(term123053, term123053.getClass(), "next", null);
        setField(term123053, term123053.getClass(), "first", null);
        setField(term123053, term123053.getClass(), "last", null);
        setField(term123053, term123053.getClass(), "propListHead", null);
        setIntField(term123053, term123053.getClass(), "sourcePosition", 0);
        setField(term123053, term123053.getClass(), "jsType", null);
        setField(term123053, term123053.getClass(), "parent", null);
        setField(term123052, term123052.getClass(), "first", term123053);
        setField(term123052, term123052.getClass(), "last", null);
        setField(term123052, term123052.getClass(), "propListHead", null);
        setIntField(term123052, term123052.getClass(), "sourcePosition", 0);
        setField(term123052, term123052.getClass(), "jsType", null);
        setField(term123052, term123052.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term122670;
        Object retValue = callMethod(klass, "getClassesDefinedByCall", argTypes, term122578, args);
        assertTrue(recursiveEquals(term122578, term123051));
        assertTrue(recursiveEquals(term122670, term123052));
        assertTrue(recursiveEquals(retValue, null));
    }

};


