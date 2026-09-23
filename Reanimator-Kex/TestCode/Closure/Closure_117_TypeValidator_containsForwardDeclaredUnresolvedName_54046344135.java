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

public class TypeValidator_containsForwardDeclaredUnresolvedName_54046344135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47283;
     Object term47373;
     Object term47642;
     Object term47643;

    public TypeValidator_containsForwardDeclaredUnresolvedName_54046344135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47283 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term47373 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term47642 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term47642, term47642.getClass(), "compiler", null);
        setField(term47642, term47642.getClass(), "typeRegistry", null);
        setField(term47642, term47642.getClass(), "allValueTypes", null);
        setBooleanField(term47642, term47642.getClass(), "shouldReport", false);
        setField(term47642, term47642.getClass(), "nullOrUndefined", null);
        setField(term47642, term47642.getClass(), "mismatches", null);
        term47643 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term47643, term47643.getClass(), "resolved", false);
        setField(term47643, term47643.getClass(), "resolveResult", null);
        setField(term47643, term47643.getClass(), "templateTypeMap", null);
        setBooleanField(term47643, term47643.getClass(), "inTemplatedCheckVisit", false);
        setField(term47643, term47643.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term47373;
        Object retValue = callMethod(klass, "containsForwardDeclaredUnresolvedName", argTypes, term47283, args);
        assertTrue(recursiveEquals(term47283, term47642));
        assertTrue(recursiveEquals(term47373, term47643));
        assertTrue(recursiveEquals(retValue, false));
    }

};


