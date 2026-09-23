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

public class DisambiguateProperties_recordInvalidationError_1320724081124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42257;
     Object term42347;
     Object term42743;
     Object term42744;

    public DisambiguateProperties_recordInvalidationError_1320724081124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42257 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        term42347 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term42743 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setField(term42743, term42743.getClass(), "compiler", null);
        setField(term42743, term42743.getClass(), "typeSystem", null);
        setField(term42743, term42743.getClass(), "invalidationMap", null);
        setField(term42743, term42743.getClass(), "propertiesToErrorFor", null);
        setField(term42743, term42743.getClass(), "properties", null);
        term42744 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term42744, term42744.getClass(), "resolved", false);
        setField(term42744, term42744.getClass(), "resolveResult", null);
        setField(term42744, term42744.getClass(), "templateTypeMap", null);
        setBooleanField(term42744, term42744.getClass(), "inTemplatedCheckVisit", false);
        setField(term42744, term42744.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[2];
        args[0] = term42347;
        args[1] = null;
        callMethod(klass, "recordInvalidationError", argTypes, term42257, args);
        assertTrue(recursiveEquals(term42257, term42743));
        assertTrue(recursiveEquals(term42347, term42744));
    }

};


