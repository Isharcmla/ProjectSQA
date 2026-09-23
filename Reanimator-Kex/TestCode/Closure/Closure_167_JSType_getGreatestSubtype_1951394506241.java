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

public class JSType_getGreatestSubtype_1951394506241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30324;
     Object term30699;
     Object term30700;
     Object term30689;

    public JSType_getGreatestSubtype_1951394506241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30324 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term30699 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term30699, term30699.getClass(), "resolved", false);
        setField(term30699, term30699.getClass(), "resolveResult", null);
        setBooleanField(term30699, term30699.getClass(), "inTemplatedCheckVisit", false);
        setField(term30699, term30699.getClass(), "registry", null);
        term30700 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term30700, term30700.getClass(), "resolved", false);
        setField(term30700, term30700.getClass(), "resolveResult", null);
        setBooleanField(term30700, term30700.getClass(), "inTemplatedCheckVisit", false);
        setField(term30700, term30700.getClass(), "registry", null);
        term30689 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term30689, term30689.getClass(), "resolved", false);
        setField(term30689, term30689.getClass(), "resolveResult", null);
        setBooleanField(term30689, term30689.getClass(), "inTemplatedCheckVisit", false);
        setField(term30689, term30689.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term30324;
        args[1] = term30324;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term30324, term30699));
        assertTrue(recursiveEquals(term30324, term30700));
        assertTrue(recursiveEquals(retValue, term30689));
    }

};


