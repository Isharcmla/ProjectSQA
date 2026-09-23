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

public class UnionType_matchesObjectContext_1924179318181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37191;
     Object term37269;

    public UnionType_matchesObjectContext_1924179318181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term37243 = new ArrayList();
        term37191 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term37191, term37191.getClass(), "alternates", term37243);
        ArrayList term37270 = new ArrayList();
        term37269 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term37269, term37269.getClass(), "alternates", term37270);
        setIntField(term37269, term37269.getClass(), "hashcode", 0);
        setBooleanField(term37269, term37269.getClass(), "resolved", false);
        setField(term37269, term37269.getClass(), "resolveResult", null);
        setBooleanField(term37269, term37269.getClass(), "inTemplatedCheckVisit", false);
        setField(term37269, term37269.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesObjectContext", argTypes, term37191, args);
        assertTrue(recursiveEquals(term37191, term37269));
        assertTrue(recursiveEquals(retValue, false));
    }

};


