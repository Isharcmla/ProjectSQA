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

public class MockitoCore_verify_11301769821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30;
     Object term35;

    public MockitoCore_verify_11301769821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30 = newInstance(Class.forName("org.mockito.internal.MockitoCore"));
        Object term31 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Object term32 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term33 = newInstance(Class.forName("org.mockito.internal.util.CreationValidator"));
        Object term34 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        setField(term30, term30.getClass(), "reporter", term31);
        setField(term32, term32.getClass(), "creationValidator", term33);
        setField(term30, term30.getClass(), "mockUtil", term32);
        setField(term30, term30.getClass(), "mockingProgress", term34);
        term35 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.MockitoCore");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("org.mockito.internal.verification.api.VerificationMode");
        Object[] args = new Object[2];
        args[0] = term35;
        args[1] = null;
        try {
            callMethod(klass, "verify", argTypes, term30, args);
            assertTrue(false);
        }
        catch (NotAMockException e) {
        }

    }

};


