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

public class UnionType_checkUnionEquivalenceHelper_793144974137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24880;
     Object term24974;
     Object term25838;
     Object term25839;

    public UnionType_checkUnionEquivalenceHelper_793144974137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24880 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList term25026 = new ArrayList();
        term24974 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term24974, term24974.getClass(), "alternates", term25026);
        term25838 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term25838, term25838.getClass(), "alternates", null);
        setIntField(term25838, term25838.getClass(), "hashcode", 0);
        setBooleanField(term25838, term25838.getClass(), "resolved", false);
        setField(term25838, term25838.getClass(), "resolveResult", null);
        setBooleanField(term25838, term25838.getClass(), "inTemplatedCheckVisit", false);
        setField(term25838, term25838.getClass(), "registry", null);
        ArrayList term25840 = new ArrayList();
        term25839 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term25839, term25839.getClass(), "alternates", term25840);
        setIntField(term25839, term25839.getClass(), "hashcode", 0);
        setBooleanField(term25839, term25839.getClass(), "resolved", false);
        setField(term25839, term25839.getClass(), "resolveResult", null);
        setBooleanField(term25839, term25839.getClass(), "inTemplatedCheckVisit", false);
        setField(term25839, term25839.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term24974;
        args[1] = true;
        Object retValue = callMethod(klass, "checkUnionEquivalenceHelper", argTypes, term24880, args);
        assertTrue(recursiveEquals(term24880, term25838));
        assertTrue(recursiveEquals(term24974, term25839));
        assertTrue(recursiveEquals(retValue, true));
    }

};


