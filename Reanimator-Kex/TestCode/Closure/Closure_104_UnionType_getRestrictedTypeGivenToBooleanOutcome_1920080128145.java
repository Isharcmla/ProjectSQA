package com.google.javascript.rhino.jstype;

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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashSet;

public class UnionType_getRestrictedTypeGivenToBooleanOutcome_1920080128145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44250;

    public UnionType_getRestrictedTypeGivenToBooleanOutcome_1920080128145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term44298 = new HashSet();
        term44250 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term44250, term44250.getClass(), "registry", null);
        setField(term44250, term44250.getClass(), "alternates", term44298);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "getRestrictedTypeGivenToBooleanOutcome", argTypes, term44250, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


