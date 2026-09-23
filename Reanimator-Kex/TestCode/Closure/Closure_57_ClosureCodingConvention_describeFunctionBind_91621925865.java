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

public class ClosureCodingConvention_describeFunctionBind_91621925865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43442;
     Object term43534;
     Object term43544;
     Object term43545;

    public ClosureCodingConvention_describeFunctionBind_91621925865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43442 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term43534 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term43544 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term43544, term43544.getClass(), "propertyTestFunctions", null);
        term43545 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term43545, term43545.getClass(), "str", null);
        setIntField(term43545, term43545.getClass(), "type", 0);
        setField(term43545, term43545.getClass(), "next", null);
        setField(term43545, term43545.getClass(), "first", null);
        setField(term43545, term43545.getClass(), "last", null);
        setField(term43545, term43545.getClass(), "propListHead", null);
        setIntField(term43545, term43545.getClass(), "sourcePosition", 0);
        setField(term43545, term43545.getClass(), "jsType", null);
        setField(term43545, term43545.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term43534;
        Object retValue = callMethod(klass, "describeFunctionBind", argTypes, term43442, args);
        assertTrue(recursiveEquals(term43442, term43544));
        assertTrue(recursiveEquals(term43534, term43545));
        assertTrue(recursiveEquals(retValue, null));
    }

};


