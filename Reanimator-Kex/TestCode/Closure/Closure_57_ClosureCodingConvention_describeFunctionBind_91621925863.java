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

public class ClosureCodingConvention_describeFunctionBind_91621925863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43094;
     Object term43186;
     Object term43197;
     Object term43198;

    public ClosureCodingConvention_describeFunctionBind_91621925863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43094 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term43186 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term43197 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term43197, term43197.getClass(), "propertyTestFunctions", null);
        term43198 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term43198, term43198.getClass(), "number", 0.0);
        setIntField(term43198, term43198.getClass(), "type", 0);
        setField(term43198, term43198.getClass(), "next", null);
        setField(term43198, term43198.getClass(), "first", null);
        setField(term43198, term43198.getClass(), "last", null);
        setField(term43198, term43198.getClass(), "propListHead", null);
        setIntField(term43198, term43198.getClass(), "sourcePosition", 0);
        setField(term43198, term43198.getClass(), "jsType", null);
        setField(term43198, term43198.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term43186;
        Object retValue = callMethod(klass, "describeFunctionBind", argTypes, term43094, args);
        assertTrue(recursiveEquals(term43094, term43197));
        assertTrue(recursiveEquals(term43186, term43198));
        assertTrue(recursiveEquals(retValue, null));
    }

};


