package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;

public class DisambiguateProperties_recordInvalidationError_1320724081195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83240;
     Object term83476;
     Object term83606;
     Object term83609;

    public DisambiguateProperties_recordInvalidationError_1320724081195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term83382 = new HashMap();
        term83240 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term83334 = newInstance(Class.forName("com.google.common.collect.LinkedListMultimap"));
        setField(term83334, term83334.getClass(), "head", null);
        setField(term83334, term83334.getClass(), "tail", null);
        setField(term83334, term83334.getClass(), "keyToKeyList", term83382);
        setField(term83240, term83240.getClass(), "invalidationMap", term83334);
        ArrayList term83528 = new ArrayList();
        term83476 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term83476, term83476.getClass(), "alternates", term83528);
        ArrayList term83607 = new ArrayList();
        term83606 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term83606, term83606.getClass(), "alternates", term83607);
        setIntField(term83606, term83606.getClass(), "hashcode", 0);
        setBooleanField(term83606, term83606.getClass(), "resolved", false);
        setField(term83606, term83606.getClass(), "resolveResult", null);
        setField(term83606, term83606.getClass(), "templateTypeMap", null);
        setBooleanField(term83606, term83606.getClass(), "inTemplatedCheckVisit", false);
        setField(term83606, term83606.getClass(), "registry", null);
        ArrayList term83610 = new ArrayList();
        term83609 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term83609, term83609.getClass(), "alternates", term83610);
        setIntField(term83609, term83609.getClass(), "hashcode", 0);
        setBooleanField(term83609, term83609.getClass(), "resolved", false);
        setField(term83609, term83609.getClass(), "resolveResult", null);
        setField(term83609, term83609.getClass(), "templateTypeMap", null);
        setBooleanField(term83609, term83609.getClass(), "inTemplatedCheckVisit", false);
        setField(term83609, term83609.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[2];
        args[0] = term83476;
        args[1] = null;
        callMethod(klass, "recordInvalidationError", argTypes, term83240, args);
        assertTrue(recursiveEquals(term83240, term83606));
        assertTrue(recursiveEquals(term83476, term83609));
    }

};


