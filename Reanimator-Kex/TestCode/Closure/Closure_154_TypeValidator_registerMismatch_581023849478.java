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
import java.lang.Object;

public class TypeValidator_registerMismatch_581023849478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246458;
     Object term246556;
     Object term246752;

    public TypeValidator_registerMismatch_581023849478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term246458 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term246556 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term246654 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setField(term246556, term246556.getClass(), "referencedType", term246654);
        term246752 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term246852 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term246752, term246752.getClass(), "referencedType", term246852);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term246556;
        args[1] = term246752;
        try {
            callMethod(klass, "registerMismatch", argTypes, term246458, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


