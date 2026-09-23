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

public class ClosureCodingConvention_extractClassNameIfProvide_982641011137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64220;
     Object term64312;
     Object term64336;
     Object term64337;

    public ClosureCodingConvention_extractClassNameIfProvide_982641011137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64220 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term64312 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term64336 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term64336, term64336.getClass(), "propertyTestFunctions", null);
        term64337 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term64337, term64337.getClass(), "number", 0.0);
        setIntField(term64337, term64337.getClass(), "type", 0);
        setField(term64337, term64337.getClass(), "next", null);
        setField(term64337, term64337.getClass(), "first", null);
        setField(term64337, term64337.getClass(), "last", null);
        setField(term64337, term64337.getClass(), "propListHead", null);
        setIntField(term64337, term64337.getClass(), "sourcePosition", 0);
        setField(term64337, term64337.getClass(), "jsType", null);
        setField(term64337, term64337.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term64312;
        Object retValue = callMethod(klass, "extractClassNameIfProvide", argTypes, term64220, args);
        assertTrue(recursiveEquals(term64220, term64336));
        assertTrue(recursiveEquals(term64312, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


