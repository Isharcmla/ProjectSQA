package org.mockito.internal.invocation;

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
import static org.mockito.internal.invocation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Invocation_isValidException_208846893958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11781;

    public Invocation_isValidException_208846893958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11781 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        setIntField(term11781, term11781.getClass(), "sequenceNumber", 0);
        setField(term11781, term11781.getClass(), "mock", null);
        setField(term11781, term11781.getClass(), "method", null);
        setField(term11781, term11781.getClass(), "arguments", null);
        setField(term11781, term11781.getClass(), "rawArguments", null);
        setField(term11781, term11781.getClass(), "location", null);
        setBooleanField(term11781, term11781.getClass(), "verified", false);
        setBooleanField(term11781, term11781.getClass(), "verifiedInOrder", false);
        setField(term11781, term11781.getClass(), "realMethod", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.Invocation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "isValidException", argTypes, term11781, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


