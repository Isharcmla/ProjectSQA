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

public class TypeCheck_isReference_170084483897 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29184;
     Object term29358;

    public TypeCheck_isReference_170084483897() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29184, term29184.getClass(), "type", 33);
        term29358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29358, term29358.getClass(), "type", 33);
        setField(term29358, term29358.getClass(), "next", null);
        setField(term29358, term29358.getClass(), "first", null);
        setField(term29358, term29358.getClass(), "last", null);
        setField(term29358, term29358.getClass(), "propListHead", null);
        setIntField(term29358, term29358.getClass(), "sourcePosition", 0);
        setField(term29358, term29358.getClass(), "jsType", null);
        setField(term29358, term29358.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term29184;
        Object retValue = callMethod(klass, "isReference", argTypes, null, args);
        assertTrue(recursiveEquals(term29184, term29358));
        assertTrue(recursiveEquals(retValue, true));
    }

};


