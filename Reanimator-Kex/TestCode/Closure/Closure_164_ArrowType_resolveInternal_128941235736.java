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

public class ArrowType_resolveInternal_128941235736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5632;
     Object term5823;
     Object term5820;

    public ArrowType_resolveInternal_128941235736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5632 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term5632, term5632.getClass(), "returnType", null);
        setField(term5632, term5632.getClass(), "parameters", null);
        term5823 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term5823, term5823.getClass(), "parameters", null);
        setField(term5823, term5823.getClass(), "returnType", null);
        setBooleanField(term5823, term5823.getClass(), "returnTypeInferred", false);
        setBooleanField(term5823, term5823.getClass(), "resolved", false);
        setField(term5823, term5823.getClass(), "resolveResult", null);
        setField(term5823, term5823.getClass(), "registry", null);
        term5820 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term5820, term5820.getClass(), "parameters", null);
        setField(term5820, term5820.getClass(), "returnType", null);
        setBooleanField(term5820, term5820.getClass(), "returnTypeInferred", false);
        setBooleanField(term5820, term5820.getClass(), "resolved", false);
        setField(term5820, term5820.getClass(), "resolveResult", null);
        setField(term5820, term5820.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "resolveInternal", argTypes, term5632, args);
        assertTrue(recursiveEquals(term5632, term5823));
        assertTrue(recursiveEquals(retValue, term5820));
    }

};


