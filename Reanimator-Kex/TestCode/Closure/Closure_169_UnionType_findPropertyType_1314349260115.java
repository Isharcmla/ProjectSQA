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

public class UnionType_findPropertyType_1314349260115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20493;
     Object term20559;

    public UnionType_findPropertyType_1314349260115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term20545 = new ArrayList();
        term20493 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term20493, term20493.getClass(), "alternates", term20545);
        ArrayList term20560 = new ArrayList();
        term20559 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term20559, term20559.getClass(), "alternates", term20560);
        setIntField(term20559, term20559.getClass(), "hashcode", 0);
        setBooleanField(term20559, term20559.getClass(), "resolved", false);
        setField(term20559, term20559.getClass(), "resolveResult", null);
        setBooleanField(term20559, term20559.getClass(), "inTemplatedCheckVisit", false);
        setField(term20559, term20559.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "findPropertyType", argTypes, term20493, args);
        assertTrue(recursiveEquals(term20493, term20559));
        assertTrue(recursiveEquals(retValue, null));
    }

};


