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

public class DisambiguateProperties_recordInvalidationError_1320724081211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94795;
     Object term94891;
     Object term94898;
     Object term94899;

    public DisambiguateProperties_recordInvalidationError_1320724081211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94795 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        term94891 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        term94898 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setField(term94898, term94898.getClass(), "compiler", null);
        setField(term94898, term94898.getClass(), "typeSystem", null);
        setField(term94898, term94898.getClass(), "invalidationMap", null);
        setField(term94898, term94898.getClass(), "propertiesToErrorFor", null);
        setField(term94898, term94898.getClass(), "properties", null);
        term94899 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setBooleanField(term94899, term94899.getClass(), "resolved", false);
        setField(term94899, term94899.getClass(), "resolveResult", null);
        setField(term94899, term94899.getClass(), "templateTypeMap", null);
        setBooleanField(term94899, term94899.getClass(), "inTemplatedCheckVisit", false);
        setField(term94899, term94899.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[2];
        args[0] = term94891;
        args[1] = null;
        callMethod(klass, "recordInvalidationError", argTypes, term94795, args);
        assertTrue(recursiveEquals(term94795, term94898));
        assertTrue(recursiveEquals(term94891, term94899));
    }

};


