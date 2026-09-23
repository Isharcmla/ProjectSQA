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

public class TypeCheck_isReference_1700844838151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44437;
     Object term44699;

    public TypeCheck_isReference_1700844838151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44437, term44437.getClass(), "type", 35);
        term44699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44699, term44699.getClass(), "type", 35);
        setField(term44699, term44699.getClass(), "next", null);
        setField(term44699, term44699.getClass(), "first", null);
        setField(term44699, term44699.getClass(), "last", null);
        setField(term44699, term44699.getClass(), "propListHead", null);
        setIntField(term44699, term44699.getClass(), "sourcePosition", 0);
        setField(term44699, term44699.getClass(), "jsType", null);
        setField(term44699, term44699.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term44437;
        Object retValue = callMethod(klass, "isReference", argTypes, null, args);
        assertTrue(recursiveEquals(term44437, term44699));
        assertTrue(recursiveEquals(retValue, true));
    }

};


