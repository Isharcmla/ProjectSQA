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

public class UnionType_isUnknownType_1184405351243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80977;
     Object term85951;

    public UnionType_isUnknownType_1184405351243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term81029 = new ArrayList();
        term80977 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term80977, term80977.getClass(), "alternates", term81029);
        ArrayList term85952 = new ArrayList();
        term85951 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term85951, term85951.getClass(), "alternates", term85952);
        setIntField(term85951, term85951.getClass(), "hashcode", 0);
        setBooleanField(term85951, term85951.getClass(), "resolved", false);
        setField(term85951, term85951.getClass(), "resolveResult", null);
        setBooleanField(term85951, term85951.getClass(), "inTemplatedCheckVisit", false);
        setField(term85951, term85951.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isUnknownType", argTypes, term80977, args);
        assertTrue(recursiveEquals(term80977, term85951));
        assertTrue(recursiveEquals(retValue, false));
    }

};


