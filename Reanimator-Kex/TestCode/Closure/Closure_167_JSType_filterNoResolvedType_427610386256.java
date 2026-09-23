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

public class JSType_filterNoResolvedType_427610386256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31893;
     Object term32436;
     Object term32414;

    public JSType_filterNoResolvedType_427610386256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term31945 = new ArrayList();
        term31893 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term31893, term31893.getClass(), "alternates", term31945);
        ArrayList term32437 = new ArrayList();
        term32436 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term32436, term32436.getClass(), "alternates", term32437);
        setIntField(term32436, term32436.getClass(), "hashcode", 0);
        setBooleanField(term32436, term32436.getClass(), "resolved", false);
        setField(term32436, term32436.getClass(), "resolveResult", null);
        setBooleanField(term32436, term32436.getClass(), "inTemplatedCheckVisit", false);
        setField(term32436, term32436.getClass(), "registry", null);
        ArrayList term32415 = new ArrayList();
        term32414 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term32414, term32414.getClass(), "alternates", term32415);
        setIntField(term32414, term32414.getClass(), "hashcode", 0);
        setBooleanField(term32414, term32414.getClass(), "resolved", false);
        setField(term32414, term32414.getClass(), "resolveResult", null);
        setBooleanField(term32414, term32414.getClass(), "inTemplatedCheckVisit", false);
        setField(term32414, term32414.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term31893;
        Object retValue = callMethod(klass, "filterNoResolvedType", argTypes, null, args);
        assertTrue(recursiveEquals(term31893, term32436));
        assertTrue(recursiveEquals(retValue, term32414));
    }

};


