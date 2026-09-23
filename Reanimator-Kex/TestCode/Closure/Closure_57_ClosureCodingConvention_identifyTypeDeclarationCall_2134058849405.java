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

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144303;
     Object term144395;
     Object term144505;
     Object term144506;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144303 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term144395 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term144487 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term144395, term144395.getClass(), "first", term144487);
        term144505 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term144505, term144505.getClass(), "propertyTestFunctions", null);
        term144506 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term144507 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term144506, term144506.getClass(), "str", null);
        setIntField(term144506, term144506.getClass(), "type", 0);
        setField(term144506, term144506.getClass(), "next", null);
        setField(term144507, term144507.getClass(), "str", null);
        setIntField(term144507, term144507.getClass(), "type", 0);
        setField(term144507, term144507.getClass(), "next", null);
        setField(term144507, term144507.getClass(), "first", null);
        setField(term144507, term144507.getClass(), "last", null);
        setField(term144507, term144507.getClass(), "propListHead", null);
        setIntField(term144507, term144507.getClass(), "sourcePosition", 0);
        setField(term144507, term144507.getClass(), "jsType", null);
        setField(term144507, term144507.getClass(), "parent", null);
        setField(term144506, term144506.getClass(), "first", term144507);
        setField(term144506, term144506.getClass(), "last", null);
        setField(term144506, term144506.getClass(), "propListHead", null);
        setIntField(term144506, term144506.getClass(), "sourcePosition", 0);
        setField(term144506, term144506.getClass(), "jsType", null);
        setField(term144506, term144506.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term144395;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term144303, args);
        assertTrue(recursiveEquals(term144303, term144505));
        assertTrue(recursiveEquals(term144395, term144506));
        assertTrue(recursiveEquals(retValue, null));
    }

};


