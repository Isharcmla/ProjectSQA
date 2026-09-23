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
import java.lang.StackOverflowError;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NamedType_finishPropertyContinuations_167806891288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89397;

    public NamedType_finishPropertyContinuations_167806891288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89397 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term89505 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setBooleanField(term89505, term89505.getClass(), "unknown", true);
        setField(term89505, term89505.getClass(), "implicitPrototypeFallback", term89505);
        setBooleanField(term89505, term89505.getClass(), "nativeType", false);
        setField(term89397, term89397.getClass(), "referencedObjType", term89505);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "finishPropertyContinuations", argTypes, term89397, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


