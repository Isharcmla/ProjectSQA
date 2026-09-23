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

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123492;
     Object term123584;
     Object term123719;
     Object term123720;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123492 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term123584 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term123676 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term123584, term123584.getClass(), "first", term123676);
        term123719 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term123719, term123719.getClass(), "propertyTestFunctions", null);
        term123720 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term123721 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term123720, term123720.getClass(), "number", 0.0);
        setIntField(term123720, term123720.getClass(), "type", 0);
        setField(term123720, term123720.getClass(), "next", null);
        setField(term123721, term123721.getClass(), "str", null);
        setIntField(term123721, term123721.getClass(), "type", 0);
        setField(term123721, term123721.getClass(), "next", null);
        setField(term123721, term123721.getClass(), "first", null);
        setField(term123721, term123721.getClass(), "last", null);
        setField(term123721, term123721.getClass(), "propListHead", null);
        setIntField(term123721, term123721.getClass(), "sourcePosition", 0);
        setField(term123721, term123721.getClass(), "jsType", null);
        setField(term123721, term123721.getClass(), "parent", null);
        setField(term123720, term123720.getClass(), "first", term123721);
        setField(term123720, term123720.getClass(), "last", null);
        setField(term123720, term123720.getClass(), "propListHead", null);
        setIntField(term123720, term123720.getClass(), "sourcePosition", 0);
        setField(term123720, term123720.getClass(), "jsType", null);
        setField(term123720, term123720.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term123584;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term123492, args);
        assertTrue(recursiveEquals(term123492, term123719));
        assertTrue(recursiveEquals(term123584, term123720));
        assertTrue(recursiveEquals(retValue, null));
    }

};


