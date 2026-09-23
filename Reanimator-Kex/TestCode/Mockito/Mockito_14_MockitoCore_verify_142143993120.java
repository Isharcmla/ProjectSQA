package org.mockito.internal;

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
import org.mockito.exceptions.misusing.NotAMockException;
import static org.mockito.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MockitoCore_verify_142143993120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term28;

    public MockitoCore_verify_142143993120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("org.mockito.internal.MockitoCore"));
        Object term24 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Object term25 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term26 = newInstance(Class.forName("org.mockito.internal.util.MockCreationValidator"));
        Object term27 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        setField(term23, term23.getClass(), "reporter", term24);
        setField(term25, term25.getClass(), "creationValidator", term26);
        setField(term23, term23.getClass(), "mockUtil", term25);
        setField(term23, term23.getClass(), "mockingProgress", term27);
        term28 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.MockitoCore");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("org.mockito.verification.VerificationMode");
        Object[] args = new Object[2];
        args[0] = term28;
        args[1] = null;
        try {
            callMethod(klass, "verify", argTypes, term23, args);
            assertTrue(false);
        }
        catch (NotAMockException e) {
        }

    }

};


