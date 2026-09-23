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

public class MockitoCore_stubVoid_168162367927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86;
     Object term91;

    public MockitoCore_stubVoid_168162367927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86 = newInstance(Class.forName("org.mockito.internal.MockitoCore"));
        Object term87 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Object term88 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term89 = newInstance(Class.forName("org.mockito.internal.util.MockCreationValidator"));
        Object term90 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        setField(term86, term86.getClass(), "reporter", term87);
        setField(term88, term88.getClass(), "creationValidator", term89);
        setField(term86, term86.getClass(), "mockUtil", term88);
        setField(term86, term86.getClass(), "mockingProgress", term90);
        term91 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.MockitoCore");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term91;
        try {
            callMethod(klass, "stubVoid", argTypes, term86, args);
            assertTrue(false);
        }
        catch (NotAMockException e) {
        }

    }

};


