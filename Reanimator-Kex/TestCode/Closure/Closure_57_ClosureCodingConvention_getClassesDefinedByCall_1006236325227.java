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

public class ClosureCodingConvention_getClassesDefinedByCall_1006236325227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102093;
     Object term102185;
     Object term102205;
     Object term102206;

    public ClosureCodingConvention_getClassesDefinedByCall_1006236325227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102093 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term102185 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term102185, term102185.getClass(), "first", term102185);
        setIntField(term102185, term102185.getClass(), "type", -34);
        term102205 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term102205, term102205.getClass(), "propertyTestFunctions", null);
        term102206 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term102206, term102206.getClass(), "number", 0.0);
        setIntField(term102206, term102206.getClass(), "type", -34);
        setField(term102206, term102206.getClass(), "next", null);
        setField(term102206, term102206.getClass(), "first", term102206);
        setField(term102206, term102206.getClass(), "last", null);
        setField(term102206, term102206.getClass(), "propListHead", null);
        setIntField(term102206, term102206.getClass(), "sourcePosition", 0);
        setField(term102206, term102206.getClass(), "jsType", null);
        setField(term102206, term102206.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term102185;
        Object retValue = callMethod(klass, "getClassesDefinedByCall", argTypes, term102093, args);
        assertTrue(recursiveEquals(term102093, term102205));
        assertTrue(recursiveEquals(term102185, term102206));
        assertTrue(recursiveEquals(retValue, null));
    }

};


