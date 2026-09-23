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

public class UnionType_isStruct_1713606484147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28821;
     Object term28888;

    public UnionType_isStruct_1713606484147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term28873 = new ArrayList();
        term28821 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term28821, term28821.getClass(), "alternates", term28873);
        ArrayList term28889 = new ArrayList();
        term28888 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term28888, term28888.getClass(), "alternates", term28889);
        setIntField(term28888, term28888.getClass(), "hashcode", 0);
        setBooleanField(term28888, term28888.getClass(), "resolved", false);
        setField(term28888, term28888.getClass(), "resolveResult", null);
        setBooleanField(term28888, term28888.getClass(), "inTemplatedCheckVisit", false);
        setField(term28888, term28888.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isStruct", argTypes, term28821, args);
        assertTrue(recursiveEquals(term28821, term28888));
        assertTrue(recursiveEquals(retValue, false));
    }

};


