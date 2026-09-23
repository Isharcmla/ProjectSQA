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

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77386;
     Object term77478;
     Object term77502;
     Object term77503;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77386 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term77478 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term77478, term77478.getClass(), "first", term77478);
        setIntField(term77478, term77478.getClass(), "type", 42);
        term77502 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term77502, term77502.getClass(), "propertyTestFunctions", null);
        term77503 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term77503, term77503.getClass(), "number", 0.0);
        setIntField(term77503, term77503.getClass(), "type", 42);
        setField(term77503, term77503.getClass(), "next", null);
        setField(term77503, term77503.getClass(), "first", term77503);
        setField(term77503, term77503.getClass(), "last", null);
        setField(term77503, term77503.getClass(), "propListHead", null);
        setIntField(term77503, term77503.getClass(), "sourcePosition", 0);
        setField(term77503, term77503.getClass(), "jsType", null);
        setField(term77503, term77503.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term77478;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term77386, args);
        assertTrue(recursiveEquals(term77386, term77502));
        assertTrue(recursiveEquals(term77478, term77503));
        assertTrue(recursiveEquals(retValue, null));
    }

};


