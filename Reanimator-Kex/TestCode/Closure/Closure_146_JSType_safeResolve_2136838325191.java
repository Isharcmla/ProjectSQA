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
import java.lang.Object;

public class JSType_safeResolve_2136838325191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25361;
     Object term25476;
     Object term25474;

    public JSType_safeResolve_2136838325191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25361 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        Object term25453 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        setBooleanField(term25361, term25361.getClass(), "resolved", true);
        setField(term25361, term25361.getClass(), "resolveResult", term25453);
        term25476 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        Object term25477 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        setBooleanField(term25476, term25476.getClass(), "resolved", true);
        setBooleanField(term25477, term25477.getClass(), "resolved", false);
        setField(term25477, term25477.getClass(), "resolveResult", null);
        setField(term25477, term25477.getClass(), "registry", null);
        setField(term25476, term25476.getClass(), "resolveResult", term25477);
        setField(term25476, term25476.getClass(), "registry", null);
        term25474 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        setBooleanField(term25474, term25474.getClass(), "resolved", false);
        setField(term25474, term25474.getClass(), "resolveResult", null);
        setField(term25474, term25474.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[3];
        args[0] = term25361;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "safeResolve", argTypes, null, args);
        assertTrue(recursiveEquals(term25361, term25476));
        assertTrue(recursiveEquals(retValue, term25474));
    }

};


