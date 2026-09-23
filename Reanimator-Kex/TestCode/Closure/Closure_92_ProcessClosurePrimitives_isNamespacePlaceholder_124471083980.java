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

public class ProcessClosurePrimitives_isNamespacePlaceholder_124471083980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36187;
     Object term36199;

    public ProcessClosurePrimitives_isNamespacePlaceholder_124471083980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36187 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term36187, term36187.getClass(), "propListHead", null);
        term36199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36199, term36199.getClass(), "type", 0);
        setField(term36199, term36199.getClass(), "next", null);
        setField(term36199, term36199.getClass(), "first", null);
        setField(term36199, term36199.getClass(), "last", null);
        setField(term36199, term36199.getClass(), "propListHead", null);
        setIntField(term36199, term36199.getClass(), "sourcePosition", 0);
        setField(term36199, term36199.getClass(), "jsType", null);
        setField(term36199, term36199.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term36187;
        Object retValue = callMethod(klass, "isNamespacePlaceholder", argTypes, null, args);
        assertTrue(recursiveEquals(term36187, term36199));
        assertTrue(recursiveEquals(retValue, false));
    }

};


