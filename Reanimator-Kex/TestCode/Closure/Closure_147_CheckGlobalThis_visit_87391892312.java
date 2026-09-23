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

public class CheckGlobalThis_visit_87391892312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4758;
     Object term4863;
     Object term4972;
     Object term4973;

    public CheckGlobalThis_visit_87391892312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4758 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term4863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4863, term4863.getClass(), "type", -43);
        setField(term4758, term4758.getClass(), "assignLhsChild", term4863);
        term4972 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        setField(term4972, term4972.getClass(), "compiler", null);
        setField(term4972, term4972.getClass(), "level", null);
        setField(term4972, term4972.getClass(), "assignLhsChild", null);
        term4973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4973, term4973.getClass(), "type", -43);
        setField(term4973, term4973.getClass(), "next", null);
        setField(term4973, term4973.getClass(), "first", null);
        setField(term4973, term4973.getClass(), "last", null);
        setField(term4973, term4973.getClass(), "propListHead", null);
        setIntField(term4973, term4973.getClass(), "sourcePosition", 0);
        setField(term4973, term4973.getClass(), "jsType", null);
        setField(term4973, term4973.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term4863;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term4758, args);
        assertTrue(recursiveEquals(term4758, term4972));
        assertTrue(recursiveEquals(term4863, null));
    }

};


