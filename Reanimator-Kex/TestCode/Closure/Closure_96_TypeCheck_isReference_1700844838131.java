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

public class TypeCheck_isReference_1700844838131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69331;
     Object term70088;

    public TypeCheck_isReference_1700844838131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term69331, term69331.getClass(), "type", 33);
        term70088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term70088, term70088.getClass(), "type", 33);
        setField(term70088, term70088.getClass(), "next", null);
        setField(term70088, term70088.getClass(), "first", null);
        setField(term70088, term70088.getClass(), "last", null);
        setField(term70088, term70088.getClass(), "propListHead", null);
        setIntField(term70088, term70088.getClass(), "sourcePosition", 0);
        setField(term70088, term70088.getClass(), "jsType", null);
        setField(term70088, term70088.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term69331;
        Object retValue = callMethod(klass, "isReference", argTypes, null, args);
        assertTrue(recursiveEquals(term69331, term70088));
        assertTrue(recursiveEquals(retValue, true));
    }

};


