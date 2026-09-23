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
import java.lang.Object;
import java.util.ArrayList;

public class UnionType_resolveInternal_1047918091126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22614;
     Object term23090;
     Object term23076;

    public UnionType_resolveInternal_1047918091126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term22770 = new ArrayList();
        term22614 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term22718 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term22614, term22614.getClass(), "resolveResult", term22718);
        setBooleanField(term22614, term22614.getClass(), "resolved", false);
        setField(term22614, term22614.getClass(), "alternates", term22770);
        ArrayList term23091 = new ArrayList();
        term23090 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term23090, term23090.getClass(), "alternates", term23091);
        setIntField(term23090, term23090.getClass(), "hashcode", 0);
        setBooleanField(term23090, term23090.getClass(), "resolved", true);
        setField(term23090, term23090.getClass(), "resolveResult", term23090);
        setBooleanField(term23090, term23090.getClass(), "inTemplatedCheckVisit", false);
        setField(term23090, term23090.getClass(), "registry", null);
        ArrayList term23077 = new ArrayList();
        term23076 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term23076, term23076.getClass(), "alternates", term23077);
        setIntField(term23076, term23076.getClass(), "hashcode", 0);
        setBooleanField(term23076, term23076.getClass(), "resolved", true);
        setField(term23076, term23076.getClass(), "resolveResult", term23076);
        setBooleanField(term23076, term23076.getClass(), "inTemplatedCheckVisit", false);
        setField(term23076, term23076.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "resolveInternal", argTypes, term22614, args);
        assertTrue(recursiveEquals(term22614, term23090));
        assertTrue(recursiveEquals(retValue, term23076));
    }

};


