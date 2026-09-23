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
import org.mockito.exceptions.misusing.UnfinishedStubbingException;
import static org.mockito.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MockitoCore_validateMockitoUsage_97759895328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92;

    public MockitoCore_validateMockitoUsage_97759895328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92 = newInstance(Class.forName("org.mockito.internal.MockitoCore"));
        Object term93 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Object term94 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term95 = newInstance(Class.forName("org.mockito.internal.util.MockCreationValidator"));
        Object term96 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        setField(term92, term92.getClass(), "reporter", term93);
        setField(term94, term94.getClass(), "creationValidator", term95);
        setField(term92, term92.getClass(), "mockUtil", term94);
        setField(term92, term92.getClass(), "mockingProgress", term96);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.MockitoCore");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "validateMockitoUsage", argTypes, term92, args);
            assertTrue(false);
        }
        catch (UnfinishedStubbingException e) {
        }

    }

};


