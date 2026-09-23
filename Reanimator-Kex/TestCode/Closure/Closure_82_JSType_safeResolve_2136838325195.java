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

public class JSType_safeResolve_2136838325195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24710;
     Object term26362;
     Object term26353;

    public JSType_safeResolve_2136838325195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24710 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        term26362 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term26362, term26362.getClass(), "parameters", null);
        setField(term26362, term26362.getClass(), "returnType", null);
        setBooleanField(term26362, term26362.getClass(), "returnTypeInferred", false);
        setBooleanField(term26362, term26362.getClass(), "resolved", true);
        setField(term26362, term26362.getClass(), "resolveResult", term26362);
        setField(term26362, term26362.getClass(), "registry", null);
        term26353 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term26353, term26353.getClass(), "parameters", null);
        setField(term26353, term26353.getClass(), "returnType", null);
        setBooleanField(term26353, term26353.getClass(), "returnTypeInferred", false);
        setBooleanField(term26353, term26353.getClass(), "resolved", true);
        setField(term26353, term26353.getClass(), "resolveResult", term26353);
        setField(term26353, term26353.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[3];
        args[0] = term24710;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "safeResolve", argTypes, null, args);
        assertTrue(recursiveEquals(term24710, null));
        assertTrue(recursiveEquals(retValue, term26353));
    }

};


