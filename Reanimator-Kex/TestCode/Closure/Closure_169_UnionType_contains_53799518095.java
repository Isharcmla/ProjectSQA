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

public class UnionType_contains_53799518095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16105;
     Object term16168;

    public UnionType_contains_53799518095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term16157 = new ArrayList();
        term16105 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term16105, term16105.getClass(), "alternates", term16157);
        ArrayList term16169 = new ArrayList();
        term16168 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term16168, term16168.getClass(), "alternates", term16169);
        setIntField(term16168, term16168.getClass(), "hashcode", 0);
        setBooleanField(term16168, term16168.getClass(), "resolved", false);
        setField(term16168, term16168.getClass(), "resolveResult", null);
        setBooleanField(term16168, term16168.getClass(), "inTemplatedCheckVisit", false);
        setField(term16168, term16168.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "contains", argTypes, term16105, args);
        assertTrue(recursiveEquals(term16105, term16168));
        assertTrue(recursiveEquals(retValue, false));
    }

};


