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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.util.ArrayList;

public class UnionType_isNullable_176165855283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12977;
     Object term13056;

    public UnionType_isNullable_176165855283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term13029 = new ArrayList();
        term12977 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term12977, term12977.getClass(), "alternates", term13029);
        ArrayList term13057 = new ArrayList();
        term13056 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term13056, term13056.getClass(), "alternates", term13057);
        setIntField(term13056, term13056.getClass(), "hashcode", 0);
        setBooleanField(term13056, term13056.getClass(), "resolved", false);
        setField(term13056, term13056.getClass(), "resolveResult", null);
        setBooleanField(term13056, term13056.getClass(), "inTemplatedCheckVisit", false);
        setField(term13056, term13056.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isNullable", argTypes, term12977, args);
        assertTrue(recursiveEquals(term12977, term13056));
        assertTrue(recursiveEquals(retValue, false));
    }

};


