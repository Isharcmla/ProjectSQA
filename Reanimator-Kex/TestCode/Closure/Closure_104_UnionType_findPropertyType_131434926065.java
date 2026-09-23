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
import java.lang.ClassCastException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashSet;
import java.lang.Object;

public class UnionType_findPropertyType_131434926065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13399;

    public UnionType_findPropertyType_131434926065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13585 = newInstance(Class.forName("java.lang.Object"));
        Object term13623 = newInstance(Class.forName("java.lang.Object"));
        HashSet term13447 = new HashSet();
        ((HashSet) term13447).add(term13585);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        ((HashSet) term13447).add(term13623);
        term13399 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term13399, term13399.getClass(), "alternates", term13447);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "findPropertyType", argTypes, term13399, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


