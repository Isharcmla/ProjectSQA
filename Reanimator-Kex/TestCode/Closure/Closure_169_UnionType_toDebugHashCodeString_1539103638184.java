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

public class UnionType_toDebugHashCodeString_1539103638184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37411;
     Object term37708;

    public UnionType_toDebugHashCodeString_1539103638184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term37463 = new ArrayList();
        term37411 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term37411, term37411.getClass(), "alternates", term37463);
        ArrayList term37709 = new ArrayList();
        term37708 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term37708, term37708.getClass(), "alternates", term37709);
        setIntField(term37708, term37708.getClass(), "hashcode", 0);
        setBooleanField(term37708, term37708.getClass(), "resolved", false);
        setField(term37708, term37708.getClass(), "resolveResult", null);
        setBooleanField(term37708, term37708.getClass(), "inTemplatedCheckVisit", false);
        setField(term37708, term37708.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toDebugHashCodeString", argTypes, term37411, args);
        assertTrue(recursiveEquals(term37411, term37708));
        assertTrue(recursiveEquals(retValue, "{()}"));
    }

};


