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

public class ClosureCodingConvention_extractClassNameIfRequire_262514769379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139756;
     Object term139826;
     Object term139857;
     Object term139858;

    public ClosureCodingConvention_extractClassNameIfRequire_262514769379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139756 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term139826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term139826, term139826.getClass(), "type", 130);
        setField(term139826, term139826.getClass(), "first", term139826);
        term139857 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term139857, term139857.getClass(), "propertyTestFunctions", null);
        term139858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term139858, term139858.getClass(), "type", 130);
        setField(term139858, term139858.getClass(), "next", null);
        setField(term139858, term139858.getClass(), "first", term139858);
        setField(term139858, term139858.getClass(), "last", null);
        setField(term139858, term139858.getClass(), "propListHead", null);
        setIntField(term139858, term139858.getClass(), "sourcePosition", 0);
        setField(term139858, term139858.getClass(), "jsType", null);
        setField(term139858, term139858.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term139826;
        Object retValue = callMethod(klass, "extractClassNameIfRequire", argTypes, term139756, args);
        assertTrue(recursiveEquals(term139756, term139857));
        assertTrue(recursiveEquals(term139826, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


