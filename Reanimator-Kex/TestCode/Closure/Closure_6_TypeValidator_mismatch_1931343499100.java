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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TypeValidator_mismatch_1931343499100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24041;
     Object term24111;
     Object term24249;
     Object term24359;

    public TypeValidator_mismatch_1931343499100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24041 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setBooleanField(term24041, term24041.getClass(), "shouldReport", false);
        term24111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24111, term24111.getClass(), "sourcePosition", 0);
        term24249 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term24359 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[4] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = term24111;
        args[2] = "{0}\nfound   : {1}\nrequired: {2}";
        args[3] = term24249;
        args[4] = term24359;
        try {
            callMethod(klass, "mismatch", argTypes, term24041, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


