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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NamedType_finishPropertyContinuations_167806891249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77216;

    public NamedType_finishPropertyContinuations_167806891249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77216 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term77316 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term77416 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term77316, term77316.getClass(), "unknown", true);
        setField(term77316, term77316.getClass(), "implicitPrototypeFallback", null);
        setField(term77316, term77316.getClass(), "ownerFunction", term77416);
        setField(term77216, term77216.getClass(), "referencedObjType", term77316);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "finishPropertyContinuations", argTypes, term77216, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


