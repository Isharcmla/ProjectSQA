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

public class UnionType_collapseUnion_1404703017107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18044;
     Object term18643;

    public UnionType_collapseUnion_1404703017107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18096 = new ArrayList();
        term18044 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term18044, term18044.getClass(), "alternates", term18096);
        ArrayList term18644 = new ArrayList();
        term18643 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term18643, term18643.getClass(), "alternates", term18644);
        setIntField(term18643, term18643.getClass(), "hashcode", 0);
        setBooleanField(term18643, term18643.getClass(), "resolved", false);
        setField(term18643, term18643.getClass(), "resolveResult", null);
        setBooleanField(term18643, term18643.getClass(), "inTemplatedCheckVisit", false);
        setField(term18643, term18643.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "collapseUnion", argTypes, term18044, args);
        assertTrue(recursiveEquals(term18044, term18643));
        assertTrue(recursiveEquals(retValue, null));
    }

};


