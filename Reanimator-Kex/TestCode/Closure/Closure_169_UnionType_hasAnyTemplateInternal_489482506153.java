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

public class UnionType_hasAnyTemplateInternal_489482506153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30230;
     Object term30543;

    public UnionType_hasAnyTemplateInternal_489482506153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term30282 = new ArrayList();
        term30230 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term30230, term30230.getClass(), "alternates", term30282);
        ArrayList term30544 = new ArrayList();
        term30543 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term30543, term30543.getClass(), "alternates", term30544);
        setIntField(term30543, term30543.getClass(), "hashcode", 0);
        setBooleanField(term30543, term30543.getClass(), "resolved", false);
        setField(term30543, term30543.getClass(), "resolveResult", null);
        setBooleanField(term30543, term30543.getClass(), "inTemplatedCheckVisit", false);
        setField(term30543, term30543.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasAnyTemplateInternal", argTypes, term30230, args);
        assertTrue(recursiveEquals(term30230, term30543));
        assertTrue(recursiveEquals(retValue, false));
    }

};


