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

public class TypeCheck_isReference_1700844838566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176157;
     Object term176163;

    public TypeCheck_isReference_1700844838566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term176157, term176157.getClass(), "type", 38);
        term176163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term176163, term176163.getClass(), "type", 38);
        setField(term176163, term176163.getClass(), "next", null);
        setField(term176163, term176163.getClass(), "first", null);
        setField(term176163, term176163.getClass(), "last", null);
        setField(term176163, term176163.getClass(), "propListHead", null);
        setIntField(term176163, term176163.getClass(), "sourcePosition", 0);
        setField(term176163, term176163.getClass(), "jsType", null);
        setField(term176163, term176163.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term176157;
        Object retValue = callMethod(klass, "isReference", argTypes, null, args);
        assertTrue(recursiveEquals(term176157, term176163));
        assertTrue(recursiveEquals(retValue, true));
    }

};


