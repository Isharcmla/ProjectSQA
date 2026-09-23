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
import java.lang.String;
import java.lang.Object;

public class UnionType_getPossibleToBooleanOutcomes_130621132093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15332;
     Object term15662;
     Object enum0;

    public UnionType_getPossibleToBooleanOutcomes_130621132093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term15384 = new ArrayList();
        term15332 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term15332, term15332.getClass(), "alternates", term15384);
        ArrayList term15663 = new ArrayList();
        term15662 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term15662, term15662.getClass(), "alternates", term15663);
        setIntField(term15662, term15662.getClass(), "hashcode", 0);
        setBooleanField(term15662, term15662.getClass(), "resolved", false);
        setField(term15662, term15662.getClass(), "resolveResult", null);
        setBooleanField(term15662, term15662.getClass(), "inTemplatedCheckVisit", false);
        setField(term15662, term15662.getClass(), "registry", null);
        Class<? extends Object> term15701 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term15700 = ((Class) term15701).getDeclaredField((String) "EMPTY");
        ((Field) term15700).setAccessible(true);
        enum0 = ((Field) term15700).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPossibleToBooleanOutcomes", argTypes, term15332, args);
        assertTrue(recursiveEquals(term15332, term15662));
        assertTrue(recursiveEquals(retValue, enum0));
    }

};


