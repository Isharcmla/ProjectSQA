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
import java.util.ArrayList;

public class DisambiguateProperties_recordInvalidationError_132072408186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24367;
     Object term24461;
     Object term25376;
     Object term25377;

    public DisambiguateProperties_recordInvalidationError_132072408186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24367 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        ArrayList term24513 = new ArrayList();
        term24461 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term24461, term24461.getClass(), "alternates", term24513);
        term25376 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setField(term25376, term25376.getClass(), "compiler", null);
        setField(term25376, term25376.getClass(), "typeSystem", null);
        setField(term25376, term25376.getClass(), "invalidationMap", null);
        setField(term25376, term25376.getClass(), "propertiesToErrorFor", null);
        setField(term25376, term25376.getClass(), "properties", null);
        ArrayList term25378 = new ArrayList();
        term25377 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term25377, term25377.getClass(), "alternates", term25378);
        setIntField(term25377, term25377.getClass(), "hashcode", 0);
        setBooleanField(term25377, term25377.getClass(), "resolved", false);
        setField(term25377, term25377.getClass(), "resolveResult", null);
        setField(term25377, term25377.getClass(), "templateTypeMap", null);
        setBooleanField(term25377, term25377.getClass(), "inTemplatedCheckVisit", false);
        setField(term25377, term25377.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[2];
        args[0] = term24461;
        args[1] = null;
        callMethod(klass, "recordInvalidationError", argTypes, term24367, args);
        assertTrue(recursiveEquals(term24367, term25376));
        assertTrue(recursiveEquals(term24461, term25377));
    }

};


