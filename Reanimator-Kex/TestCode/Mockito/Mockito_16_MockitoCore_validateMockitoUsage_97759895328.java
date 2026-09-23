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
     Object term86;

    public MockitoCore_validateMockitoUsage_97759895328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86 = newInstance(Class.forName("org.mockito.internal.MockitoCore"));
        Object term87 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Object term88 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term89 = newInstance(Class.forName("org.mockito.internal.util.CreationValidator"));
        Object term90 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        setField(term86, term86.getClass(), "reporter", term87);
        setField(term88, term88.getClass(), "creationValidator", term89);
        setField(term86, term86.getClass(), "mockUtil", term88);
        setField(term86, term86.getClass(), "mockingProgress", term90);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.MockitoCore");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "validateMockitoUsage", argTypes, term86, args);
            assertTrue(false);
        }
        catch (UnfinishedStubbingException e) {
        }

    }

};


