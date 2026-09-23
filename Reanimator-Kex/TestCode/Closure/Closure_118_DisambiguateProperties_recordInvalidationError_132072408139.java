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

public class DisambiguateProperties_recordInvalidationError_132072408139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8717;
     Object term8809;
     Object term9084;
     Object term9085;

    public DisambiguateProperties_recordInvalidationError_132072408139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8717 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        term8809 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        term9084 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setField(term9084, term9084.getClass(), "compiler", null);
        setField(term9084, term9084.getClass(), "typeSystem", null);
        setField(term9084, term9084.getClass(), "invalidationMap", null);
        setField(term9084, term9084.getClass(), "propertiesToErrorFor", null);
        setField(term9084, term9084.getClass(), "properties", null);
        term9085 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setBooleanField(term9085, term9085.getClass(), "resolved", false);
        setField(term9085, term9085.getClass(), "resolveResult", null);
        setField(term9085, term9085.getClass(), "templateTypeMap", null);
        setBooleanField(term9085, term9085.getClass(), "inTemplatedCheckVisit", false);
        setField(term9085, term9085.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[2];
        args[0] = term8809;
        args[1] = null;
        callMethod(klass, "recordInvalidationError", argTypes, term8717, args);
        assertTrue(recursiveEquals(term8717, term9084));
        assertTrue(recursiveEquals(term8809, term9085));
    }

};


