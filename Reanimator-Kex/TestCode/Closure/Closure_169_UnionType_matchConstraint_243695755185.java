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

public class UnionType_matchConstraint_243695755185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37586;
     Object term37729;

    public UnionType_matchConstraint_243695755185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term37638 = new ArrayList();
        term37586 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term37586, term37586.getClass(), "alternates", term37638);
        ArrayList term37730 = new ArrayList();
        term37729 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term37729, term37729.getClass(), "alternates", term37730);
        setIntField(term37729, term37729.getClass(), "hashcode", 0);
        setBooleanField(term37729, term37729.getClass(), "resolved", false);
        setField(term37729, term37729.getClass(), "resolveResult", null);
        setBooleanField(term37729, term37729.getClass(), "inTemplatedCheckVisit", false);
        setField(term37729, term37729.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "matchConstraint", argTypes, term37586, args);
        assertTrue(recursiveEquals(term37586, term37729));
    }

};


