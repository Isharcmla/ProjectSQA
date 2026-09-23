package com.fasterxml.jackson.databind.introspect;

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
import static com.fasterxml.jackson.databind.introspect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.introspect.EqualityUtils.*;
import java.util.HashMap;

public class AnnotationMap_merge_185607511323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1997;
     Object term2055;

    public AnnotationMap_merge_185607511323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2045 = new HashMap();
        term1997 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term1997, term1997.getClass(), "_annotations", term2045);
        HashMap term2056 = new HashMap();
        term2055 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term2055, term2055.getClass(), "_annotations", term2056);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap");
        Object[] args = new Object[2];
        args[0] = term1997;
        args[1] = null;
        Object retValue = callMethod(klass, "merge", argTypes, null, args);
        assertTrue(recursiveEquals(term1997, term2055));
        assertTrue(recursiveEquals(retValue, null));
    }

};


